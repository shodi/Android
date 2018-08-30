package shodi.exercicio_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    protected Button button;
    protected EditText nameField;
    protected EditText lastNameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        nameField = findViewById(R.id.nameField);
        lastNameField = findViewById(R.id.lastName);
        button.setOnClickListener(new OnClickHandler(this));
    }
}