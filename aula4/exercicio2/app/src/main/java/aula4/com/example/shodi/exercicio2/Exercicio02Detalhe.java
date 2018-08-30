package aula4.com.example.shodi.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Exercicio02Detalhe extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio02_detalhe);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        this.textView = findViewById(R.id.textView);
        this.textView.setText(text == null ? "Nenhum valor" : text);
    }
}
