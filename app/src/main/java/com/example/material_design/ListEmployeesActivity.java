package com.example.material_design;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.material_design.adapters.EmployeesAdapter;
import com.example.material_design.models.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class ListEmployeesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    EmployeesAdapter employeesAdapter;
    public static List<EmployeeModel> lstEmployees;
    LinearLayoutManager linearLayoutManager;
    String name, lastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_employees);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        name = getIntent().getExtras().getString("NAME");
        lastname = getIntent().getExtras().getString("LASTNAME");

        if(lstEmployees == null){
            lstEmployees = new ArrayList<EmployeeModel>();
        }

        lstEmployees.add(new EmployeeModel(R.drawable.android_kotlin, name, lastname));

        Toast.makeText(ListEmployeesActivity.this,
                "Registro añadido: " + name +" "+ lastname,
                Toast.LENGTH_SHORT).show();
        /*
        lstEmployees.add(new EmployeeModel(R.drawable.android_kotlin, "Juan", "Pedro"));
        lstEmployees.add(new EmployeeModel(R.drawable.android_kotlin, "Juan", "Pedro"));
        lstEmployees.add(new EmployeeModel(R.drawable.android_kotlin, "Juan", "Pedro"));
        lstEmployees.add(new EmployeeModel(R.drawable.android_kotlin, "Juan", "Pedro"));
        lstEmployees.add(new EmployeeModel(R.drawable.android_kotlin, "Juan", "Pedro"));
*/
        setRecyclerView(lstEmployees);
        Intent intent = new Intent(ListEmployeesActivity.this, MainActivity.class);
        startActivity(intent);
    }

    private void setRecyclerView(List<EmployeeModel> lstEmployees) {
        recyclerView = (RecyclerView) findViewById(R.id.rvEmployees);
        linearLayoutManager = new LinearLayoutManager(ListEmployeesActivity.this,
                RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        employeesAdapter = new EmployeesAdapter(lstEmployees);
        recyclerView.setAdapter(employeesAdapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Toast.makeText(ListEmployeesActivity.this, "SE destruyó", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}