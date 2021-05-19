package com.example.b10809003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class B10809003_3 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b10809003_3);

        button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToB10809003_2();
            }
        });
    }

    public void backToB10809003_2() {
        Intent intent = new Intent(this, B10809003_2.class);
        startActivity(intent);
    }
}