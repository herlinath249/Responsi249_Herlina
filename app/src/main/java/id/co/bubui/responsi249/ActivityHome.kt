package id.co.bubui.responsi249

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.co.bubui.responsi249.adapter.ListProgramAdapter
import id.co.bubui.responsi249.model.DataProgram
import id.co.bubui.responsi249.model.Program

class ActivityHome : AppCompatActivity() {
    private lateinit var rvProgram: RecyclerView
    private var daftar: ArrayList<Program> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val intent = intent
        val user = intent.getStringExtra("username")
        val pw = intent.getStringExtra("pswrd")


        rvProgram = findViewById(R.id.rv_program)
        //rvProgram.setHasFixedSize(true)
        daftar.addAll(DataProgram.daftarProgram)

        rvProgram.layoutManager = LinearLayoutManager(this)
        rvProgram.adapter = ListProgramAdapter(this, daftar) {
            Toast.makeText(this, it.detail, Toast.LENGTH_SHORT).show()
            println("HEHEHHEHE")

        }
    }
}

