package com.example.staff_monitoring_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Teacher_map_list extends AppCompatActivity {

    ImageView iv1,iv2,iv3,iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_map_list);
        iv1=findViewById(R.id.staff1);
        iv2=findViewById(R.id.staff2);
        iv3=findViewById(R.id.staff3);
        iv4=findViewById(R.id.staff4);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teacher_map_list.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Teacher_map_list.this, MapsActivity.class);
                startActivity(intent2);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Teacher_map_list.this, MapsActivity.class);
                startActivity(intent3);
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Teacher_map_list.this, MapsActivity.class);
                startActivity(intent4);
            }
        });

    }
}