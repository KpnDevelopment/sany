package com.example.sant_pvt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView view_card,filter_card,update_card,insert_card,settings_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view_card=findViewById(R.id.view_btn);
        filter_card=findViewById(R.id.filter_btn);
        update_card=findViewById(R.id.update_btn);
        insert_card=findViewById(R.id.insert_btn);
        settings_card=findViewById(R.id.settings_btn);

        //operate card view

        view_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),View_page.class));
                filter_card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),Filter_page.class));
                        update_card.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(getApplicationContext(),Update_page.class));
                                insert_card.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(),Insert_page.class));
                                        settings_card.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                startActivity(new Intent(getApplicationContext(),Settings_page.class));
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });

    }
}
