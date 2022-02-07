package org.techtown.todayis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends Activity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<String> list= new ArrayList<>();

        for(int i=0; i<50; i++){
            list.add("테스트 입니다 " + i);
        }

        Intent intent = getIntent();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list) ;

        listview = findViewById(R.id.list) ;
        listview.setAdapter(adapter) ;
    }
}
