package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> friends=new ArrayList<>();
        friends.add(new ContactModel("Ajay", "ajay@gamil.com", "9988776655"));
        friends.add(new ContactModel("Anusha", "anusha@gamil.com", "9876543219"));
        friends.add(new ContactModel("Bhavana", "bhavana@gamil.com", "9743556111"));
        friends.add(new ContactModel("Bhoomika", "bhoomika@gamil.com", "9542110021"));
        friends.add(new ContactModel("Chethan", "chethan@gamil.com", "9865432771"));
        friends.add(new ContactModel("Darshan", "darhan@gamil.com", "9964215800"));
        friends.add(new ContactModel("Ganavi", "ganavi@gamil.com", "9567328564"));
        friends.add(new ContactModel("Harsh", "harsh@gamil.com", "9924536544"));
        friends.add(new ContactModel("Mamatha", "mamatha@gamil.com", "9888652013"));
        friends.add(new ContactModel("Neha", "neha@gamil.com", "9902158355"));

        RecyclerView friends_recyclerView=findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,friends,R.color.category_friends);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}