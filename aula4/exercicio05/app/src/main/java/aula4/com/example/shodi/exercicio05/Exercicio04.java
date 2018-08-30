package aula4.com.example.shodi.exercicio05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio04 extends AppCompatActivity {

    public EditText firstField;
    public EditText secondField;
    public EditText thirdField;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio04);

        this.btn = findViewById(R.id.button);
        this.firstField = findViewById(R.id.editText5);
        this.secondField = findViewById(R.id.editText7);
        this.thirdField = findViewById(R.id.editText8);

        this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstVal = new Double(Exercicio04.this.firstField.getText().toString());
                Double secondVal = new Double(Exercicio04.this.secondField.getText().toString());
                Intent intent = new Intent(Exercicio04.this, Exercicio04Detalhe.class);
                intent.putExtra(Field.FIRST, firstVal);
                intent.putExtra(Field.SECOND, secondVal);
                startActivityForResult(intent, RequestCode.MATH_OPERATION);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCode.MATH_OPERATION) {
            if (resultCode == RESULT_OK) {
                Double result = data.getDoubleExtra(Operation.RESULT, 0);
                this.thirdField.setText(result.toString());
                return;
            }
            this.thirdField.setText("Erro na operação");
        }
    }
}
