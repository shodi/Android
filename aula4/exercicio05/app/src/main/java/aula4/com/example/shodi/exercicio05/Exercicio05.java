package aula4.com.example.shodi.exercicio05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercicio05 extends AppCompatActivity {

    public Button exercicio3Btn;
    public Button exercicio4Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio05);

        this.exercicio3Btn = findViewById(R.id.exercicio3btn);
        this.exercicio4Btn = findViewById(R.id.exercicio4btn);

        this.exercicio3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercicio05.this, Exercicio03.class);
                startActivity(intent);
            }
        });

        this.exercicio4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercicio05.this, Exercicio04.class);
                startActivity(intent);
            }
        });
    }
}
