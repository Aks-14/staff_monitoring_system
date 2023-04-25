package com.example.staff_monitoring_system;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Student_details extends AppCompatActivity {
    Button fy,sy,ty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        fy=findViewById(R.id.fys);
        sy=findViewById(R.id.sys);
        ty=findViewById(R.id.tys);

    }
}