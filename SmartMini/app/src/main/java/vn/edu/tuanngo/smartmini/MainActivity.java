package vn.edu.tuanngo.smartmini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
Button bt1on,bt1off,bt2on,bt2off,btok;
ImageView image1,image2 ;
WebView loadad;
EditText Editnumber;
String ip,temp;//temp ="192.168.0.121"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Editnumber = (EditText)findViewById(R.id.editNumber);
        bt1on = (Button) findViewById(R.id.bt1on);
       // bt1on.setOnClickListener(this);
        bt1off = (Button) findViewById(R.id.bt1off);
       // bt1off.setOnClickListener(this);
        bt2on = (Button) findViewById(R.id.bt2on);
       // bt2on.setOnClickListener(this);
        bt2off = (Button) findViewById(R.id.bt2off);
        //bt2off.setOnClickListener(this);
        btok =(Button)findViewById(R.id.btok) ;

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);

        loadad = (WebView)findViewById(R.id.loadad);
        bt1on.setOnClickListener(new View.OnClickListener()
                 {
                     public void onClick(View v) {
                                 image1.setImageResource(R.drawable.ledbat);
                                 ip="http://"+temp+"/socket1On";
                                 loadad.loadUrl(ip);
                         }
                 }
        );
        bt1off.setOnClickListener(new View.OnClickListener()
                                 {
                                     public void onClick(View v) {
                                         image1.setImageResource(R.drawable.ledtatt);
                                         ip="http://"+temp+"/socket1Off";
                                         loadad.loadUrl(ip);
                                     }
                                 }
        );
        bt2on.setOnClickListener(new View.OnClickListener()
                                 {
                                     public void onClick(View v) {
                                         image2.setImageResource(R.drawable.ledbat);
                                         ip="http://"+temp+"/socket2On";
                                         loadad.loadUrl(ip);
                                     }
                                 }
        );
        bt2off.setOnClickListener(new View.OnClickListener()
                                 {
                                     public void onClick(View v) {
                                         image2.setImageResource(R.drawable.ledtatt);
                                         ip="http://"+temp+"/socket2Off";
                                         loadad.loadUrl(ip);
                                     }
                                 }
        );

        btok.setOnClickListener(new View.OnClickListener()
                                {
                                      public void onClick(View v) {
                                          temp = Editnumber.getText().toString();
                                      }
                                  }
        );
    }



   /*public void onClick(View v) {
        //int id=v.getId();
        switch (v.getId()){
            case R.id.bt1on:
                image1.setImageResource(R.drawable.ledbat);
                ip="http://"+temp+"/socket1On";
                loadad.loadUrl(ip);
                break;
            case R.id.bt1off:
                image1.setImageResource(R.drawable.ledtatt);
                ip="http://"+temp+"/socket1Off";
                loadad.loadUrl(ip);
                break;
            case R.id.bt2on:
                image2.setImageResource(R.drawable.ledbat);
                ip="http://"+temp+"/socket2On";
                loadad.loadUrl(ip);
                break;
            case R.id.bt2off:
                image2.setImageResource(R.drawable.ledtatt);
                ip="http://"+temp+"/socket2Off";
                loadad.loadUrl(ip);
                break;


        }
*/

}

