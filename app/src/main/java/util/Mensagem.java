package util;


import android.app.Activity;
import android.app.AlertDialog;
import android.widget.Toast;

public class Mensagem {
    public static void Msg(Activity activity, String msg){
        Toast.makeText(activity, msg, Toast.LENGTH_LONG).show();
    }

    public static void addMsgOk(Activity activity, String titulo, String msg, int icone){
        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        alert.setTitle(titulo);
        alert.setMessage(msg);
        alert.setNeutralButton("ok", null);
        alert.setIcon(icone);
        alert.show();
    }
}
