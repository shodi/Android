package shodi.exercicio_4;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText firstField;
    private EditText secondField;
    private EditText resultField;
    private Button button;
    private RadioButton soma;
    private RadioButton subtracao;
    private RadioButton multiplicacao;
    private RadioButton divisao;

    private void showDialog(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bindForm();
        this.button.setOnClickListener(new View.OnClickListener() {
            private final MainActivity ref = MainActivity.this;

            @Override
            public void onClick(View v) throws ArithmeticException {
                try {
                    Double firstValue = Double.parseDouble(ref.firstField.getText().toString());
                    Double secondValue = Double.parseDouble(ref.secondField.getText().toString());
                    Double result;
                    if (ref.soma.isChecked()) result = firstValue + secondValue;
                    else if (ref.subtracao.isChecked()) result = firstValue - secondValue;
                    else if (ref.multiplicacao.isChecked()) result = firstValue * secondValue;
                    else /**(ref.divisao.isChecked()) */ result = firstValue / secondValue;
                    if (result.isNaN() || result.isInfinite()) throw new ArithmeticException();
                    ref.resultField.setText(result.toString());
                } catch (NumberFormatException err) {
                    ref.showDialog("Erro", "Valor inválido.");
                } catch (ArithmeticException err) {
                    ref.showDialog("Erro", "Divisão por zero.");
                    ref.resultField.setText("Infinito.");
                }
            }
        });
    }

    private void bindForm() {
        this.firstField = findViewById(R.id.firstValue);
        this.secondField = findViewById(R.id.secondValue);
        this.button = findViewById(R.id.button);
        this.soma = findViewById(R.id.soma);
        this.subtracao = findViewById(R.id.subtrair);
        this.multiplicacao = findViewById(R.id.multiplicar);
        this.divisao= findViewById(R.id.dividir);
        this.resultField = findViewById(R.id.resultado);

        this.soma.setChecked(true);
    }
}
