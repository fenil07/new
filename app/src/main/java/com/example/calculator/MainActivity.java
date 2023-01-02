package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    int edttxt1,edttxt2;
    int result;
    Button add,sub,mul,div,c;
    TextView texttans2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.editTextNumberDecimal);
        edit2 = findViewById(R.id.editTextNumberDecimal2);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        c   = findViewById(R.id.button5);
        texttans2= findViewById(R.id.textView);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")&&edit2.getText().toString().equals("")&&edit1.getText().toString().equals("")||edit2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "enter the values.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    edttxt1=Integer.parseInt(edit1.getText().toString());
                    edttxt2=Integer.parseInt(edit2.getText().toString());
                    result = edttxt1+edttxt2;
                    texttans2.setText("total value:"+result);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")&&edit2.getText().toString().equals("")&&edit1.getText().toString().equals("")||edit2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "enter the values.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    edttxt1=Integer.parseInt(edit1.getText().toString());
                    edttxt2=Integer.parseInt(edit2.getText().toString());
                    result = edttxt1-edttxt2;
                    texttans2.setText("total value:"+result);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")&&edit2.getText().toString().equals("")&&edit1.getText().toString().equals("")||edit2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "enter the values.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    edttxt1=Integer.parseInt(edit1.getText().toString());
                    edttxt2=Integer.parseInt(edit2.getText().toString());
                    result = edttxt1*edttxt2;
                    texttans2.setText("total value:"+result);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")&&edit2.getText().toString().equals("")&&edit1.getText().toString().equals("")||edit2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "enter the values.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    edttxt1=Integer.parseInt(edit1.getText().toString());
                    edttxt2=Integer.parseInt(edit2.getText().toString());
                    result = edttxt1/edttxt2;
                    texttans2.setText("total value:"+result);
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.getText().clear();
                edit2.getText().clear();
                result = 0;
                texttans2.setText("total value:"+result);
            }
        });
    }
}