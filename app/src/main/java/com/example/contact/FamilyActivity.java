package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> family=new ArrayList<>();
        family.add(new ContactModel("Ajay", "ajay@gamil.com", "9988776655"));
        family.add(new ContactModel("Anusha", "anusha@gamil.com", "9876543219"));
        family.add(new ContactModel("Bhavana", "bhavana@gamil.com", "9743556111"));
        family.add(new ContactModel("Bhoomika", "bhoomika@gamil.com", "9542110021"));
        family.add(new ContactModel("Chethan", "chethan@gamil.com", "9865432771"));
        family.add(new ContactModel("Darshan", "darhan@gamil.com", "9964215800"));
        family.add(new ContactModel("Ganavi", "ganavi@gamil.com", "9567328564"));
        family.add(new ContactModel("Harsh", "harsh@gamil.com", "9924536544"));
        family.add(new ContactModel("Mamatha", "mamatha@gamil.com", "9888652013"));
        family.add(new ContactModel("Neha", "neha@gamil.com", "9902158355"));

        RecyclerView family_recyclerView=findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,family,R.color.category_family);
        family_recyclerView.setAdapter(contactAdapter);
    }
}