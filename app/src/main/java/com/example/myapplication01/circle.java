package com.example.myapplication01;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication01.databinding.ActivityCircleBinding;

public class circle extends AppCompatActivity {
    TextView text_1,text_2,txt_ans;
    EditText inputr;
    Button btn_circle,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        inputr=findViewById(R.id.inputr);
        btn_circle=findViewById(R.id.btn_circle);
        btn1=findViewById(R.id.btn1);
        txt_ans=findViewById(R.id.txt_ans);

        btn_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float con1= Float.parseFloat(inputr.getText().toString());
                float answer=2*22*con1/7;
                txt_ans.setText("Answewr is "+answer);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }


}