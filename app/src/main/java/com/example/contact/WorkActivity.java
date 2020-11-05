package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> work=new ArrayList<>();
        work.add(new ContactModel("Ajay", "ajay@gamil.com", "9988776655"));
        work.add(new ContactModel("Anusha", "anusha@gamil.com", "9876543219"));
        work.add(new ContactModel("Bhavana", "bhavana@gamil.com", "9743556111"));
        work.add(new ContactModel("Bhoomika", "bhoomika@gamil.com", "9542110021"));
        work.add(new ContactModel("Chethan", "chethan@gamil.com", "9865432771"));
        work.add(new ContactModel("Darshan", "darhan@gamil.com", "9964215800"));
        work.add(new ContactModel("Ganavi", "ganavi@gamil.com", "9567328564"));
        work.add(new ContactModel("Harsh", "harsh@gamil.com", "9924536544"));
        work.add(new ContactModel("Mamatha", "mamatha@gamil.com", "9888652013"));
        work.add(new ContactModel("Neha", "neha@gamil.com", "9902158355"));

        RecyclerView work_recyclerView=findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,work,R.color.category_work);
        work_recyclerView.setAdapter(contactAdapter);
    }
}