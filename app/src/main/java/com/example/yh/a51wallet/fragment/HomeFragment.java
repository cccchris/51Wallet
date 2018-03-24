package com.example.yh.a51wallet.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yh.a51wallet.R;

/**
 * Created by wangyong on 2018/3/24.
 */

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);
        TextView tv_home = view.findViewById(R.id.tv_content);

        return view;
    }

}
