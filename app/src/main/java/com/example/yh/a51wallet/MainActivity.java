package com.example.yh.a51wallet;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yh.a51wallet.fragment.HomeFragment;
import com.example.yh.a51wallet.fragment.MineFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_home;
    private TextView tv_mine;
    private HomeFragment homeFragment;
    private MineFragment mineFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        tv_home.performClick();
    }

    private void initView() {
        tv_home = findViewById(R.id.tv_home);
        tv_mine = findViewById(R.id.tv_mine);

        homeFragment = new HomeFragment();
        mineFragment = new MineFragment();

        getFragmentManager().beginTransaction()
                .add(R.id.fg_content,mineFragment)
                .add(R.id.fg_content,homeFragment)
                .hide(homeFragment)
                .hide(mineFragment)
                .commitAllowingStateLoss();

        tv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSelected();
                tv_home.setSelected(true);

                FragmentTransaction fTransaction = getFragmentManager().beginTransaction();
                fTransaction.hide(mineFragment);
                fTransaction.show(homeFragment);
                fTransaction.commitAllowingStateLoss();
            }
        });

        tv_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSelected();
                tv_mine.setSelected(true);

                FragmentTransaction fTransaction = getFragmentManager().beginTransaction();
                fTransaction.hide(homeFragment);
                fTransaction.show(mineFragment);
                fTransaction.commitAllowingStateLoss();
            }
        });
    }


    private void setSelected() {
        tv_home.setSelected(false);
        tv_mine.setSelected(false);
    }


}
