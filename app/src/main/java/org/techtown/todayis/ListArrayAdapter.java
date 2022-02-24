package org.techtown.todayis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//아직 학습이 더 필요한듯 함
public class ListArrayAdapter extends BaseAdapter {

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<ListArrayAdapterData> listArrayList = new ArrayList<ListArrayAdapterData>();

    //생성자
    public ListArrayAdapter(){

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return  listArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return listArrayList.get(position);
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if(convertView == null){//웬지는 모르겠지만 null 처리안해주면 오류걸림 반드시 넣을것
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.my_list_view, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView category = convertView.findViewById(R.id.textView3);
        TextView comment = convertView.findViewById(R.id.textView4);

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        ListArrayAdapterData lad = listArrayList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        category.setText(lad.getCategory());
        comment.setText(lad.getComment());

        return convertView;
    }

    public void addItem(String category, String comment){
        ListArrayAdapterData lad = new ListArrayAdapterData();

        lad.setCategory(category);
        lad.setComment(comment);
        listArrayList.add(lad);
    }
}
