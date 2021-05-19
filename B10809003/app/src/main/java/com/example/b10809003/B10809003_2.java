package com.example.b10809003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class B10809003_2 extends AppCompatActivity {

    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b10809003_2);
    }

    public void onClick(View view) {
        button = (Button)findViewById(R.id.button3);
        button1 = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("關閉掃描");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openB10809003_3();
            }
        });
    }
    public void openB10809003_3(){
        Intent intent = new Intent(this, B10809003_3.class);
        startActivity(intent);
    }
}