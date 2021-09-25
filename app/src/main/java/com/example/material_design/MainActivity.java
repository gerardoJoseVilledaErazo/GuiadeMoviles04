package com.example.material_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import static com.example.material_design.ListEmployeesActivity.lstEmployees;

public class MainActivity extends AppCompatActivity {

    private Button btnAddEmployee, btnLstEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddEmployee  = (Button) findViewById(R.id.btnAddEmployee);
        btnLstEmployees = (Button) findViewById(R.id.btnLstEmployees);


        btnAddEmployee.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddEmployeeActivity.class));
        });

        btnLstEmployees.setOnClickListener( v -> {
            if(!lstEmployees.isEmpty()){
                startActivity(new Intent(MainActivity.this, ListEmployeesActivity.class));
            }else{
                Toast.makeText(this,"Lista vacia.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Ver datos
    public void mostrarDatos(View view){
        startActivity(new Intent(MainActivity.this, MostrarActivity.class));

    }
}