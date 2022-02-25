package org.techtown.todayis;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

//listadd클래스에서 add한것을 보여주기만 하게 수정
public class ListActivity extends Activity {
    Cursor cs;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.list);

        SQliteActivity sql = new SQliteActivity(getApplicationContext());
        cs = sql.getDB().rawQuery("SELECT * FROM listTable",null);
        ArrayList<ListArrayAdapterData> list = new ArrayList<ListArrayAdapterData>();

        while(cs.moveToNext()){
            ListArrayAdapterData lad = new ListArrayAdapterData();
            lad.setCategory(cs.getString(0));
            lad.setComment(cs.getString(1));
            list.add(lad);
        }

        ListArrayAdapter adapter = new ListArrayAdapter();

        for(ListArrayAdapterData lad : list){
            adapter.addItem(lad.getCategory(), lad.getComment());
        }

        listView.setAdapter(adapter);
    }
}