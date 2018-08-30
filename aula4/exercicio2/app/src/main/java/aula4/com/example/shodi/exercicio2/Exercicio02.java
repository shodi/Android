package aula4.com.example.shodi.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio02 extends AppCompatActivity {

    public Button btn;
    public EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio02);

        btn = findViewById(R.id.button);
        text = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = Exercicio02.this.text.getText().toString();
                Intent intent = new Intent(Exercicio02.this, Exercicio02Detalhe.class);
                intent.putExtra("text", text.toString());
                startActivity(intent);
            }
        });
    }
}
