package id.co.bubui.responsi249

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_akun.*

class ActifityAkun : AppCompatActivity() {
    private lateinit var txtProses: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        txtProses = findViewById(R.id.txt_proses)

        val bundle: Bundle? = intent.extras
        var username = bundle?.get("Username").toString()
        val email = bundle?.get("Email").toString()
        var password = bundle?.get("Password").toString()

        txtProses.text = """
            Username : ${username}
            Email    : ${email}
            Password : ${password}
        """.trimIndent()

        btn_back.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
