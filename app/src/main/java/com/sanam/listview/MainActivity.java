package com.sanam.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView list;

    String[] title = {"Prabesh",
            "Dev Dai",
            "Sagar",
            "Rohit",
            "Dhiraj",
            "Tulsi",
    };
    int[] image = {R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this,title,image);
        list.setAdapter(adapter);

    }
}
