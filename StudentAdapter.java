package com.example.kif.kyrsu_2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kif on 19.12.2016.
 */

public class StudentAdapter extends ArrayAdapter<Stud> {

    private int mResourceId;
    private List<Stud> mStud;
    private LayoutInflater mInflater;

    public StudentAdapter(Context context, int resource, List<Stud> objects) {
        super(context, resource, objects);

    mResourceId =resource;
        mStud = objects;
        mInflater =LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mInflater.inflate(mResourceId, null);
        final Stud stud = mStud.get(position);
        ((TextView)convertView.findViewById(R.id.textViewFirstName)).setText(stud.FirstName);
        ((TextView)convertView.findViewById(R.id.textViewLastName)).setText(stud.LastName);
        ((TextView)convertView.findViewById(R.id.textViewAge)).setText(String.valueOf(stud.Age));

        convertView.findViewById(R.id.buttonDelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener !=null) {
                    mListener.onDelete(stud);
                }
            }
        });

        return convertView;
    }

    private StudListener mListener;
     public void setStudListener (StudListener listener){
         mListener = listener;
     }

    public interface StudListener {
        void onDelete (Stud stud);
    }
}
