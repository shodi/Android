package shodi.exercicio_3;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;

public final class OnButtonClickHandler implements View.OnClickListener {

    private MainActivity mainActivity;

    public OnButtonClickHandler(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    private void showDialog(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mainActivity);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onClick(View v) {
        String message = "";
        String nome;
        boolean isFemale = this.mainActivity.radioFem.isChecked();
        if (isFemale) message += "Sra. ";
        else message += "Sr. ";
        nome = this.mainActivity.textNome.getText().toString();
        if(nome.trim().equals("")) {
            this.showDialog("Erro", "Digite um nome.");
            return;
        }
        message += nome;
        if (this.mainActivity.casado.isChecked()) message += " é casad";
        else if (this.mainActivity.solteiro.isChecked()) message += " é solteir";
        else message += " é viuv";
        message += (isFemale ? "a." : "o.");

        this.showDialog("Boas Vindas", message);
    }
}