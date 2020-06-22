package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

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

        tabHost.setCurrentTab(1);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                switch (tabId){
                    case "t1":
                        Toast.makeText(getApplicationContext(),"bonjour tab1",Toast.LENGTH_SHORT).show();
                        break;
                    case "t2":
                        Toast.makeText(getApplicationContext(),"bonjour tab2",Toast.LENGTH_SHORT).show();
                        break;
                    case "t3":
                        Toast.makeText(getApplicationContext(),"bonjour tab3",Toast.LENGTH_SHORT).show();
                        break;
                    case "t4":
                        Toast.makeText(getApplicationContext(),"bonjour tab4",Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });

    }
}
