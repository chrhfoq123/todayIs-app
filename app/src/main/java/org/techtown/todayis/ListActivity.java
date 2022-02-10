package org.techtown.todayis;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends Activity {
    String dbname = "listDB";
    String tablename = "listtable";
    String sql;
    SQLiteDatabase db;
    Cursor cs;
    ListView listview;
    String[] result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        db = openOrCreateDatabase(dbname, 0, null);
        listview = findViewById(R.id.list);

        try{
            sql = "select * from " + tablename;
            cs = db.rawQuery(sql, null);

            int count = cs.getCount(); //행개수
            result = new String[count]; //저장된 행개수만큼 배열생성

            //이부분 잘 모르겟음
            for (int i = 0; i < count; i++) {
                cs.moveToNext();
                String proverb = cs.getString(0);
                result[i] = proverb + " ";
            }

            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, result);
            listview.setAdapter(adapter);
        }catch(Exception e){
            System.out.println("select Error : " + e);
        }
    }
}