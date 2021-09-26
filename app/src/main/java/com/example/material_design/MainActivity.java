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
            //startActivity(new Intent(MainActivity.this, ListEmployeesActivity.class));

            if(!lstEmployees.isEmpty()){
                startActivity(new Intent(MainActivity.this, ListEmployeesActivity.class));
            }else{
                Toast.makeText(this,"Lista vacia.", Toast.LENGTH_SHORT).show();
            }
        });

        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // La actividad está creada.
    }

    //Ver datos
    public void mostrarDatos(View view){
        startActivity(new Intent(MainActivity.this, MostrarActivity.class));

    }@Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
}