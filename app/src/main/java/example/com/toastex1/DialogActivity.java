package example.com.toastex1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DialogActivity extends AppCompatActivity {

    Button bd;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
       bd=findViewById(R.id.button3);
        tv1=findViewById(R.id.textView3);

    }

    public void showDialog(View v){

       final  AlertDialog.Builder br=new AlertDialog.Builder(DialogActivity.this);
        br.setTitle("Dialog ");
        br.setMessage("Do you want to exit");
        br.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv1.setText("You clicked No");
            }
        });
        br.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv1.setText("You clicked Yes");
            }
        });
        br.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                br.create().dismiss();
            }
        });
        br.show();
    }
}
