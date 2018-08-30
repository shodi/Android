package aula4.com.example.shodi.exercicio03;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio03 extends AppCompatActivity {

    public Button btn;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio03);

        this.btn = findViewById(R.id.button);
        this.editText = findViewById(R.id.editText);

        this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rawUrl = Exercicio03.this.editText.getText().toString();
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(rawUrl));
                    startActivity(intent);
                } catch (Exception e) {
                    Exercicio03.this.editText.setText("Url inválida");
                }
            }
        });
    }
}
