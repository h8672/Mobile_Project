package fi.jamk.h8672.ccalender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.ImageCreateCalender);
        img.setImageResource(android.R.drawable.ic_input_add);
        img = (ImageView) findViewById(R.id.ImageLoadCalender);
        img.setImageResource(android.R.drawable.stat_sys_download);
        //Set color from near white to darker one
        img.setColorFilter(R.color.colorPrimary);
        img = (ImageView) findViewById(R.id.CalenderDayImage);
        img.setImageResource(android.R.drawable.ic_menu_my_calendar);
        img.setMinimumHeight(800);
    }

    public void createCalender(View view){
        //TODO Create calender views
        ToastMessage("Hello, creating new calender");
    }
    public void loadCalender(View view){
        //TODO Load calender from xml
        ToastMessage("Hello, loading a calender");
    }
    private void ToastMessage(String str){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
