package example.com.toastex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;
    Button b,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        tv=(TextView)findViewById(R.id.textView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = getLayoutInflater();
                View custToast=li.inflate(R.layout.ctoast, (ViewGroup) findViewById(R.id.custom_toast_container));
                TextView tv1=(TextView)custToast.findViewById(R.id.textView2);
                tv1.setText("This is custom Toast");
                ImageView im1=(ImageView)custToast.findViewById(R.id.img1);
                im1.setImageResource(R.drawable.andro1);
                Toast t=new Toast(getApplicationContext());
                t.setGravity(Gravity.CENTER_VERTICAL, 20, 80);
                t.setDuration(Toast.LENGTH_LONG);
                t.setView(custToast);
                t.show();
            }
        });

        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i1=new Intent(MainActivity.this,DialogActivity.class);
        startActivity(i1);
    }
}
