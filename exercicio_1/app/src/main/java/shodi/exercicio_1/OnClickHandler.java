package shodi.exercicio_1;

import android.app.AlertDialog;
import android.view.View;

public class OnClickHandler implements View.OnClickListener {
    MainActivity mainActivity;

    public OnClickHandler(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void showDialog(String message, String title) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onClick(View v) {
        String name = mainActivity.nameField.getText().toString();
        String lastName = mainActivity.lastNameField.getText().toString();
        showDialog("Olá, " + name + " " + lastName, "Boas Vindas");
    }
}
