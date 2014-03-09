package com.tabhost;

import com.tabhost.R;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("NewApi")
public class ContentFrame extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content, null);
        TextView textView = (TextView) view.findViewById(R.id.content);
        textView.setText("Hello world");
        return view;
    }
   
}
