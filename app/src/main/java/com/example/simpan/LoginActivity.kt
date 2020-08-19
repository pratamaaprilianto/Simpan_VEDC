package com.example.simpan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import android.view.View
import android.widget.*
import android.app.ProgressDialog
import android.content.Intent

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

            bt_login.setOnClickListener {
                val username = username_et.text.toString()
                val password = password_et.text.toString()
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(this, "Please Insert NIP and Password", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if(username.equals("12345") && password.equals("1")){
                val progressDialog = ProgressDialog(this,
                    R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                val intent = Intent (this,MainActivity::class.java)
                startActivity(intent)
                finish()
                }
                else{
                 Toast.makeText(this, "Incorrect NIP and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
                }
            }
        }
    }
