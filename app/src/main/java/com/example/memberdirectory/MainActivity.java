package com.example.memberdirectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button mLoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginBtn=findViewById(R.id.LoginBtn);
        mLoginBtn.setOnClickListener(this);
    }

    public void onClick (View view) {
        Intent intent = new Intent(this, homeActivity.class);
        Toast.makeText(this,"Login success",Toast.LENGTH_LONG).show();
        {
            
        }
        startActivity(intent);
    }
    public void register (View View){
    Intent in=new Intent( this,RegistationActivity.class);
    startActivity(in);
    }//public void performLogin (View v){
     //if (v.getId()==R.id.LoginBtn){
       //
    //  }
//}
}