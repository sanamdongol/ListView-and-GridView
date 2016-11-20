package com.sanam.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

/**
 * Created by sanam on 11/19/16.
 */

public class GridActivity extends AppCompatActivity {


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
        setContentView(R.layout.activity_grid);


        GridView gridView = (GridView) findViewById(R.id.grid);

        GridAdapter adapter = new GridAdapter(this, title, image);
        gridView.setAdapter(adapter);
    }

}
