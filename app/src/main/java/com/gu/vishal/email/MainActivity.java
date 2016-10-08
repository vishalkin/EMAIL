package com.gu.vishal.email;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button sendemail;
    private EditText enteremail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

             sendemail=(Button) findViewById(R.id.sendEmail);
            enteremail=(EditText) findViewById(R.id.emailid);

            sendemail.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent email_sending=new Intent(Intent.ACTION_SENDTO);
                    email_sending.setData(Uri.parse("mailto:"+enteremail.getText().toString()));
                    email_sending.putExtra(Intent.EXTRA_SUBJECT,"hello email");
                    email_sending.putExtra(Intent.EXTRA_TEXT,"hiii this is just a test message");
                    startActivity(email_sending);
                }
            });
        }
    }
