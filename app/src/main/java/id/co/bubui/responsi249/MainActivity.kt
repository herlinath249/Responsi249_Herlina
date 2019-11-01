package id.co.bubui.responsi249

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var userAnda : EditText
    private lateinit var passwordAnda : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnRegis : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userAnda=findViewById(R.id.user_anda)
        passwordAnda=findViewById(R.id.password_anda)
        btnLogin=findViewById(R.id.btn_login)
        btnRegis=findViewById(R.id.btn_regis)

        btn_login.setOnClickListener(){
            val user_anda=user_anda.text.toString()
            val password_anda=password_anda.text.toString()

            val username = intent.getStringExtra("username")
            val email=intent.getStringExtra("email")
            val password=intent.getStringExtra("password")



            if (user_anda.isEmpty() || password_anda.isEmpty()){
                Toast.makeText(this, "Mohon Masukkan Username yang benar", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (user_anda!="herlina"){
                Toast.makeText(this, "Username Anda Salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else
                if (password_anda!="herlina12"){
                    Toast.makeText(this, "Password Anda Salah", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

            intent= Intent(this, ActivityHome::class.java)
            intent.putExtra("username",username)
            intent.putExtra("email",email)
            intent.putExtra("password",password)

            intent.putExtra("Username",user_anda)
            intent.putExtra("Password",password_anda)
            startActivity(intent)
        }

        btn_regis.setOnClickListener(){
            intent= Intent(this,ActivityRegister::class.java)
            startActivity(intent)
        }
    }
}
