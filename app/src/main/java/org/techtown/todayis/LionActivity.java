package org.techtown.todayis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//MainActivity에서 랜덤하게 뽑아오는걸 db에서 뽑아오게 수정
public class LionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lion);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String lion = intent.getStringExtra("lionString");
        textView.setText(lion);

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}