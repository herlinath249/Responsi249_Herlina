package id.co.bubui.responsi249

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*

class ActivityRegister : AppCompatActivity() {
    private lateinit var user: EditText
    private lateinit var pass: EditText
    private lateinit var
            regis: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        user=findViewById(R.id.user_anda)
        pass=findViewById(R.id.password_anda)
        regis=findViewById(R.id.btn_register)


        btn_register.setOnClickListener(){
            intent= Intent(this, ActifityAkun::class.java)
            intent.putExtra("Username",user.text)
            intent.putExtra("Password",pass.text).putExtra("Email",email_anda.text)
            startActivity(intent)
        }

    }
}

