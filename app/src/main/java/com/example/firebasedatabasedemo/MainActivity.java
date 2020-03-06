package com.example.firebasedatabasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText studentId;
    EditText name;
    Spinner faculty;
    RadioGroup gender;
    RadioButton checkedButton;
    Button register,viewAll;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentId=(EditText) findViewById(R.id.etextId);
        name=(EditText) findViewById(R.id.etextName);
        faculty=(Spinner) findViewById(R.id.etextFaculties);
        gender=(RadioGroup) findViewById(R.id.rgGender);
        register=(Button) findViewById(R.id.buttonRegister);
        viewAll=(Button) findViewById(R.id.buttonView);
        reference=FirebaseDatabase.getInstance().getReference("Students");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }
        });
        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ViewAllActivity.class));
            }
        });

    }

    private void create() {
        checkedButton=(RadioButton)findViewById(gender.getCheckedRadioButtonId());
        Student student=new Student();
        if(studentId.getText().toString().trim()!=null && name.getText().toString().trim()!=null && faculty.getSelectedItem().toString()!=null){
            student.setId(studentId.getText().toString().trim());
            student.setName(name.getText().toString().trim());
            student.setFaculty(faculty.getSelectedItem().toString());
            student.setGender(checkedButton.getText().toString());
            reference.push().setValue(student);
        }else{
            Toast.makeText(MainActivity.this,"please fill missing values!",Toast.LENGTH_LONG).show();
        }
    }
}
