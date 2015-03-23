package com.demos.tabhost;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jay on 15/3/23.
 */
public class IndexTabFragment extends Fragment {

    private static final String TAG="IndexTabFragment";
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("fangjie",TAG+"onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fangjie",TAG+"onCreate");
        Log.i("fangjie","IndexTabFragment："+this.toString());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.tab01,container,false);
        Log.i("fangjie",TAG+"onCreateView");
        return v;
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.i("fangjie",TAG+"onResume");
        Log.i("fangjie","IndexTabFragment："+this.toString());

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("fangjie",TAG+"onStart");
        Log.i("fangjie","IndexTabFragment："+this.toString());

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("fangjie",TAG+"onStop");
        Log.i("fangjie","IndexTabFragment："+this.toString());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("fangjie",TAG+"onActivityCreated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("fangjie",TAG+"onPause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("fangjie",TAG+"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("fangjie",TAG+"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("fangjie",TAG+"onDetach");
    }
}
