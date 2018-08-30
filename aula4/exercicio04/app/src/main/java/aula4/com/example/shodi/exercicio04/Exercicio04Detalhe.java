package aula4.com.example.shodi.exercicio04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercicio04Detalhe extends AppCompatActivity {

    public Button soma;
    public Button subtrair;
    public Button multiplicar;
    public Button dividir;

    protected Double firstVal;
    protected Double secondVal;

    public void setIntentReturn(Double value) {
        Intent returnIntent = new Intent();
        if (value != null) {
            returnIntent.putExtra(Operation.RESULT, value);
            setResult(RESULT_OK, returnIntent);
        }
        else {
            setResult(RESULT_CANCELED, returnIntent);
        }
        finish();
    }

    private void initButtons() {
        this.soma = findViewById(R.id.somaBtn);
        this.subtrair = findViewById(R.id.subtractBtn);
        this.multiplicar = findViewById(R.id.multiplicaBtn);
        this.dividir = findViewById(R.id.divideBtn);

        this.soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exercicio04Detalhe ref = Exercicio04Detalhe.this;
                ref.setIntentReturn(ref.firstVal + ref.secondVal);
            }
        });

        this.subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exercicio04Detalhe ref = Exercicio04Detalhe.this;
                ref.setIntentReturn(ref.firstVal - ref.secondVal);
            }
        });

        this.multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exercicio04Detalhe ref = Exercicio04Detalhe.this;
                ref.setIntentReturn(ref.firstVal * ref.secondVal);
            }
        });

        this.dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exercicio04Detalhe ref = Exercicio04Detalhe.this;
                Double result = ref.secondVal == 0 ? null : ref.firstVal / ref.secondVal;
                ref.setIntentReturn(result);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio04_detalhe);

        Intent intent = getIntent();
        this.firstVal = intent.getDoubleExtra(Field.FIRST, 0);
        this.secondVal = intent.getDoubleExtra(Field.SECOND, 0);

        this.initButtons();
    }
}
