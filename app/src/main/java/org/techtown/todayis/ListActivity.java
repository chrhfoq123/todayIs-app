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
    String dbName = "listDB";
    String tableName = "listTable";
    String sql;
    SQLiteDatabase db;
    Cursor cs;
    ListView listView;
    ArrayList<String> proverbList;
    String[] proverb;

    private String[] proverbString;
    {
        proverbString = new String[]{"*가는 날이 장날이다*", "*가는 말이 고와야 오는 말이 곱다*", "*가랑비에 옷 젖는 줄 모른다*", "*가랑잎이 솔잎더러 바스락거린다고 한다*", "*가재는 게 편이라*",
                "*가지 많은 나무에 바람 잘 날 없다*", "*강건너 불구경*", "*계란으로 바위치기*", "*엎친데 덮친격*", "*싼 게 비지떡*",
                "*개천에서 용 난다*", "*고래 싸움에 새우등 터진다*", "*그림의 떡*", "*꿩 먹고 알 먹기*", "*내 코가 석자*",
                "*누워서 침 뱉기*", "*도둑이 제 발 저리다*", "*등잔 밑이 어둡다*", "*마른 하늘에 날벼락*", "*말 한마디에 천냥 빚 갚는다*",
                "*믿는 도끼에 발등 찍힌다*", "*밑 빠진 독에 물 붓기*", "*백지장도 맛들면 낫다*", "*병 주고 약 준다*", "*사공이 많으면 배가 산으로 간다*",
                "*소 잃고 외양간 고친다*", "*아니 땐 굴뚝에 연기 나랴*", "*열 번 찍어 아니 넘어가는 나무 없다*", "*원수는 외나무 다리에서 만난다*", "*작은 고추가 더 맵다*",
                "*천리 길도 한 걸음부터*", "*하늘이 무너져도 솟아날 구멍이 있다*", "*호랑이도 제 말 하면 온다*"};
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        /*listView = findViewById(R.id.list);
        proverbList = new ArrayList<>();

        try{
            db = this.openOrCreateDatabase(dbName, 0, null);

            db.execSQL("CREATE TABLE IF NOT EXISTS " + tableName
            + " (category VARCHAR(50), proverb VARCHAR(256));");

            for(int i=0; i<proverbString.length; i++){
                db.execSQL("INSERT INTO " + tableName
                        + "(categroy, proverb) Values ('" + proverbString[i] + "');");
            }

        }catch(SQLiteException se){
            Toast.makeText(this, se.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("", se.getMessage());
        }

        try{
            sql = "SELECT * FROM " + tableName;
            cs = db.rawQuery(sql, null);

            int count = cs.getCount();
            proverb = new String[count];

            for(int i=0; i<count; i++) {
                cs.moveToNext();
                String pro = cs.getString(0);
                proverb[i] = pro;
            }
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, proverb);
            listView.setAdapter(adapter);
        }catch (Exception e){
            System.out.println("Select Error: " + e);
        }*/
    }
}