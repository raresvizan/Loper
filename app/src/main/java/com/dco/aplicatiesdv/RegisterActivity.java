package com.dco.aplicatiesdv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;


public class RegisterActivity extends AppCompatActivity {

    TextView txtGoLogin;
    Button btnRegister;
    ProgressBar progressBar;
    private EditText edtUsername, edtEmail, edtPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        txtGoLogin = findViewById(R.id.txtGoLogin);
        btnRegister = findViewById(R.id.btnRegister);
        edtUsername = findViewById(R.id.edtUsername);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        txtGoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void registerUser() {
        String username = edtUsername.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (username.isEmpty()) {
            edtUsername.setError("Username required");
            edtUsername.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            edtEmail.setError("Email required");
            edtEmail.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            edtPassword.setError("Password required");
            edtPassword.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(RegisterActivity.this, "Account created", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        } else {
                            Toast.makeText(RegisterActivity.this, "Failed. Try again", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
    }
}