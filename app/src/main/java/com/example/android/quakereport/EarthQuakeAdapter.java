package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {

    public EarthQuakeAdapter(@NonNull Activity context, List<EarthQuake> earthQuakeList) {
        super(context, 0, earthQuakeList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fortextviews, parent, false);
        }

        EarthQuake currentearthQuake = getItem(position);

        TextView magnitude = (TextView) view.findViewById(R.id.magnitude);
        magnitude.setText(currentearthQuake.getMagnitude());

        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(currentearthQuake.getName());


        Date dateObject = new Date(currentearthQuake.getTimeinmillisecond());

        TextView dateView = (TextView) view.findViewById(R.id.date);

        String formattedDate = formatDate(dateObject);

        dateView.setText(formattedDate);


        TextView timeView = (TextView) view.findViewById(R.id.time);

        String formattedTime = formatTime(dateObject);

        timeView.setText(formattedTime);


        return view;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
