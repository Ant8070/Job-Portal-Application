package com.example.madprojectfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.widget.*;



public class GoogleApply extends AppCompatActivity {



    EditText firstName;
    EditText lastName;
    EditText age;
    EditText userName;
    FirebaseDatabase db;
    DatabaseReference reference;
    Button registerbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_apply);
        final Button sendButton = findViewById(R.id.uploadBtn);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GoogleApply.this, pdfupload.class);
                startActivity(intent);
            }
        });
        registerbtn = findViewById(R.id.registerBtn);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        age = findViewById(R.id.age);
        userName = findViewById(R.id.userName);

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstName1 = firstName.getText().toString();
                String lastName1 = lastName.getText().toString();
                String age1 = age.getText().toString();
                String userName1 = userName.getText().toString();

                if (!firstName1.isEmpty() && !lastName1.isEmpty() && !age1.isEmpty() && !userName1.isEmpty()){

                    users users = new users(firstName1,lastName1,age1,userName1);
                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("users");
                    reference.child(userName1).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            firstName.setText("");
                            lastName.setText("");
                            age.setText("");
                            userName.setText("");
                            Toast.makeText(GoogleApply.this,"Successfuly Updated",Toast.LENGTH_SHORT).show();

                        }
                    });

                }

            }
        });
    }
}