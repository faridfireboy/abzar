package com.example.abzar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class City extends AppCompatActivity {
    ListView CListview;
    String[] CityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        CListview = findViewById(R.id.list_city);


        /* CityName = new String[]{"قشم","کیش","همدان","یزد","ابوموسی","بندر عباس","اراک","ساری","خرم آباد","لنگرود","لاهیجان","بندرانزلی","آستانه اشرفیه","آستارا","رشت","گرگتن","یاسوج","کرمانشاه","جیرفت","سیرجان","بم","رفسنجان","کرمان","بانه","بیجار","سنندج","قزوین","قم","کرج","شیراز","زاهدان","سمنان","زنجان","مسجدسلیمان","خرمهر","آبادان",
            "اندیمشک","اهواز","شیروان","بجنورد","فردوش","قاین","بیرجند","مشهد","شهرکرد","تهران","بوشهر","اصفهان","اردبیل","ایلام","ارومیه","تبریز"};

        ArrayAdapter<String> cAdapter =new ArrayAdapter<String>(this,android.R.layout.list_city,CityName);
        CListview.setAdapter(cAdapter);
*/




    }
}
