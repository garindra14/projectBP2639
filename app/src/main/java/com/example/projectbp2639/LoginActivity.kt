package com.example.projectbp2639

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)

        val  btnLogin:Button= findViewById(R.id.buttonLogin)
        val txtUsername: EditText = findViewById(R.id.editTextUsername)
        val txtPassword: EditText = findViewById(R.id.editTextPassword)
        val LoginModel = LoginModel()

        //event btn login click
        btnLogin.setOnClickListener{
            // input
            logModel.Username = txtUsername.text.toString()
            logModel.Password = txtPassword.text.toString()

            //validate
            if(LogModel.LoginCheck() == true){
                //call home activity
                val intentHome= Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this, "Username/Password salah!!!",
                    Toast.LENGTH_SHORT).show()
            }

        }

    }

}

