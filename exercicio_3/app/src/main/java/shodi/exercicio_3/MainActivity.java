package shodi.exercicio_3;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    protected EditText textNome;
    protected RadioButton radioMasc;
    protected RadioButton radioFem;
    protected Button buttonMensagem;

    protected RadioButton casado;
    protected RadioButton solteiro;
    protected RadioButton viuvo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textNome = findViewById(R.id.textNome);
        this.radioMasc = findViewById(R.id.radioMasc);
        this.radioFem = findViewById(R.id.radioFem);
        this.buttonMensagem = findViewById(R.id.buttonMensagem);
        this.casado = findViewById(R.id.casado);
        this.solteiro = findViewById(R.id.solteiro);
        this.viuvo = findViewById(R.id.viuvo);

        this.buttonMensagem.setOnClickListener(new OnButtonClickHandler(this));

        this.casado.setChecked(true);
        this.radioMasc.setChecked(true);
    }
}