package org.techtown.todayis;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class SQliteActivity extends Activity {
    private SQLiteDatabase db;

    public SQliteActivity(Context context){
        db = context.openOrCreateDatabase("listDB", 0, null);
    }

    public SQLiteDatabase getDB(){
        return this.db;
    }
}