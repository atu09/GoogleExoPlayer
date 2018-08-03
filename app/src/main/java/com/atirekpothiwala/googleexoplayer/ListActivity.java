package com.atirekpothiwala.googleexoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                intent.putExtra("raw", R.raw.bg_video1);
                break;
            case R.id.btn2:
                intent.putExtra("raw", R.raw.bg_video2);
                break;
            case R.id.btn3:
                intent.putExtra("raw", R.raw.first_video);
                break;
            case R.id.btn4:
                intent.putExtra("raw", R.raw.intro_video);
                break;
            case R.id.btn5:
                intent.putExtra("raw", R.raw.result_video);
                break;
            default:
                return;
        }
        startActivity(intent);

    }
}
