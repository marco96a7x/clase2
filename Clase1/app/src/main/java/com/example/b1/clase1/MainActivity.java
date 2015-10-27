package com.example.b1.clase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,password;// cajas de texto en el xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText)findViewById(R.id.button2);
        password =(EditText)findViewById(R.id.button3);

    }

    public void Login (View view){
    if (user. getText() == ''final ''
                && password.getText().toString()=="12345")
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);  
        }
    }
     else
    {
        Toast.makeText(this,"Datos Invalidos",Toast.LENGTH_LONG).show();
    }
}
