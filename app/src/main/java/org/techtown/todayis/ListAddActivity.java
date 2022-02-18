package org.techtown.todayis;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

//디비 인서트 클래스(리스트로 보내기만 하면될듯)
public class ListAddActivity extends Activity {
    SQliteActivity sql;
    Button sent, back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_add);

        sql = new SQliteActivity(getApplicationContext());

        sent = findViewById(R.id.button5);
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton proverb = findViewById(R.id.radioButton);
                RadioButton lion = findViewById(R.id.radioButton2);

                String value = null;

                if(proverb.isChecked()){
                    value = "속담";

                }else if(lion.isChecked()){
                    value = "사자성어";
                }

                EditText comment = findViewById(R.id.editText);
                String textComment =comment.getText().toString();

                sql.getDB().execSQL("Create table if not exists listTable (category VARCHAR(50), comment VARCHAR(255))");
                sql.getDB().execSQL("insert into listTable (category, comment) values ('"+value+"','"+textComment+"')");
                Toast.makeText(getApplicationContext(), "리스트에 저장하였습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        back = findViewById(R.id.button6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
