package com.example.baikiemtra1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button btSign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.tx1);
        password = (EditText) findViewById(R.id.tx2);
        btSign=(Button)findViewById(R.id.btSign) ;
        btSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                    Bundle bundle= new Bundle();
                    String a= username.getText().toString();
                    String b=password.getText().toString();
                    bundle.putString("username",a);
                    bundle.putString("pass",b);
                    intent.putExtra("Du Lieu",bundle);
                    startActivity(intent);

                }else{
                    password.setError("Fail sign");
                }
            }
        });
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
}