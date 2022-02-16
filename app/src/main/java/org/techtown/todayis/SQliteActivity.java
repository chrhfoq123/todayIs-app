package org.techtown.todayis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SQliteActivity {
    SQLiteDatabase db;
    Context context;


    public SQliteActivity(Context context){
        this.context = context;
        this.db = this.context.openOrCreateDatabase("listDB", 0, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS " + "listTable"
                + " (proverb VARCHAR(256));");
    }

    public void insertDB(){
        db.execSQL("INSERT INTO " + "listTable" + "(proverb)" + "VALUES ('')");
    }
}
