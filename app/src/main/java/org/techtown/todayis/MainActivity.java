package org.techtown.todayis;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//MainActivity에서 랜덤하게 뽑아오는걸 db에서 뽑아오게 수정
public class MainActivity extends Activity {
    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String proverb = proverbString();
                Intent intent = new Intent(getApplicationContext(), ProverbActivity.class);
                intent.putExtra("proverbString", proverb);
                startActivity(intent);
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lion = lionString();
                Intent intent = new Intent(getApplicationContext(), LionActivity.class);
                intent.putExtra("lionString", lion);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListAddActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void showMessage1(){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("오늘의 속담");
//        builder.setMessage(proverbString());
//        builder.setIcon(android.R.drawable.ic_dialog_info);
//
//        builder.setNeutralButton("닫기", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
//        AlertDialog dialog = builder.create();
//        dialog.show();
//    }
//
//    private void showMessage2(){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("오늘의 사자성어");
//        builder.setMessage(lionString());
//        builder.setIcon(android.R.drawable.ic_dialog_info);
//
//        builder.setNeutralButton("닫기", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
//        AlertDialog dialog = builder.create();
//        dialog.show();
//    }

    //SQlite로 옮길것
    //클래스화 하고 코드 간결하게 바꿀것
    public String proverbString(){
        String[] proverb = {"*가는 날이 장날이다*", "*가는 말이 고와야 오는 말이 곱다*", "*가랑비에 옷 젖는 줄 모른다*", "*가랑잎이 솔잎더러 바스락거린다고 한다*", "*가재는 게 편이라*",
                            "*가지 많은 나무에 바람 잘 날 없다*", "*강건너 불구경*", "*계란으로 바위치기*", "*엎친데 덮친격*", "*싼 게 비지떡*",
                            "*개천에서 용 난다*", "*고래 싸움에 새우등 터진다*", "*그림의 떡*", "*꿩 먹고 알 먹기*", "*내 코가 석자*",
                            "*누워서 침 뱉기*", "*도둑이 제 발 저리다*", "*등잔 밑이 어둡다*", "*마른 하늘에 날벼락*", "*말 한마디에 천냥 빚 갚는다*",
                            "*믿는 도끼에 발등 찍힌다*", "*밑 빠진 독에 물 붓기*", "*백지장도 맛들면 낫다*", "*병 주고 약 준다*", "*사공이 많으면 배가 산으로 간다*",
                            "*소 잃고 외양간 고친다*", "*아니 땐 굴뚝에 연기 나랴*", "*열 번 찍어 아니 넘어가는 나무 없다*", "*원수는 외나무 다리에서 만난다*", "*작은 고추가 더 맵다*",
                            "*천리 길도 한 걸음부터*", "*하늘이 무너져도 솟아날 구멍이 있다*", "*호랑이도 제 말 하면 온다*"};

        int random = (int)(Math.random()*30+3);
        return proverb[random];
    }

    public String lionString(){
        String[] lion = {"*고진감래*", "*과유불급*", "*금상첨화*", "*낙장불입*", "*다다익선*",
                        "*비일비제*", "*박장대소*", "*삼고초려*", "*사면초가*", "*십중팔구*",
                        "*산전수전*", "*삼십육계*", "*사필귀정*", "*살신성인*", "*시기상조*",
                        "*십시일반*", "*설상가상*", "*심사숙고*", "*어부지리*", "*일석이조*",
                        "*일촉즉발*", "*자업자득*", "*자포자기*", "*적반하장*", "*청천벽력*",
                        "*희로애락*", "*감탄고토*", "*개과천선*", "*경거망동*", "*과대망상*"};

        int random = (int)(Math.random()*30);
        return lion[random];
    }
}