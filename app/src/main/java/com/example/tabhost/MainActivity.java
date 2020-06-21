package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    TabHost.TabSpec spec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost=findViewById(R.id.tabHost);
        tabHost.setup();

        spec=tabHost.newTabSpec("t1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("TAB 1");
        tabHost.addTab(spec);

        spec= tabHost.newTabSpec("t2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab 2");
        tabHost.addTab(spec);

        spec= tabHost.newTabSpec("t3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab 3");
        tabHost.addTab(spec);

        spec= tabHost.newTabSpec("t4");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Tab 4");
        tabHost.addTab(spec);

        tabHost.setCurrentTab(3);


    }
}
