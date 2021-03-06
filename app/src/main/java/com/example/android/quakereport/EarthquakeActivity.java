
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<EarthQuake> earthQuakes = QueryList.extractEarthquakes();

        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this, earthQuakes);

        earthquakeListView.setAdapter(adapter);
    }


}
