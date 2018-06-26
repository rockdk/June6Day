package com.champ.web.june6day;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView_custom extends AppCompatActivity {

    ListView listView;
    String Course[] = {"Android", "Java", "PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);

        listView = findViewById(R.id.list);


        ArrayAdapter arrayAdapter = new ArrayAdapter(
                getApplicationContext(),
                R.layout.custom,
                Course);
        listView.setAdapter(arrayAdapter);
    }
}
