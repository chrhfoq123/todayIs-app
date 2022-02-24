package org.techtown.todayis;

import android.app.Activity;

public class ListArrayAdapterData extends Activity {
    private String category, comment;

    public void setCategory(String category) {
        this.category = category;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public String getCategory(){
        return category;
    }

    public String getComment(){
        return comment;
    }
}
