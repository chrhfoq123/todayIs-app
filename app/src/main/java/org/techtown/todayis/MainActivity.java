package org.techtown.todayis;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage1();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage2();
            }
        });
    }

    private void showMessage1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("오늘의 속담");
        builder.setMessage("속담");
        builder.setIcon(android.R.drawable.ic_dialog_info);

        builder.setNeutralButton("닫기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showMessage2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("오늘의 사자성어");
        builder.setMessage("사자성어");
        builder.setIcon(android.R.drawable.ic_dialog_info);

        builder.setNeutralButton("닫기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}