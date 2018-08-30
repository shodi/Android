package shodi.exercicio_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected EditText firstField;
    protected EditText secondField;
    protected EditText resultField;

    protected Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstField = findViewById(R.id.firstField);
        secondField = findViewById(R.id.secondField);
        resultField = findViewById(R.id.resultField);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity ref = MainActivity.this;
                Double a = new Double(ref.firstField.getText().toString());
                Double b = new Double(ref.secondField.getText().toString());
                ref.resultField.setText(new Double(a + b).toString());
            }
        });
    }
}