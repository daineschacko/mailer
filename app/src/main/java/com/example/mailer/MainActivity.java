package com.example.mailer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnng=findViewById(R.id.button);
        btnng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.setData(Uri.parse("mailto:techsaysjaisal@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "asunto de prueba");
                intent.putExtra(Intent.EXTRA_TEXT, "probando el envio");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"jaisal1010sabu@gmail.com"});
                startActivity(intent);
            }
        });
    }
}
