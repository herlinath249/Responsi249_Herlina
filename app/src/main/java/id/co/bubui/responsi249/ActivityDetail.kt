package id.co.bubui.responsi249

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ActivityDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetailPhoto: ImageView = findViewById(R.id.imgdet)
        val tvDetailNama: TextView = findViewById(R.id.tv_nama_det)
        val tvDetailDetail: TextView = findViewById(R.id.tv_detail)

        val namaPres = intent.getStringExtra(EXTRA_NAMA)
        val detailPres = intent.getStringExtra(EXTRA_DETAIL)
        val photoPres = intent.getStringExtra(EXTRA_PHOTO)

        Glide.with(baseContext)
            .load(photoPres)
            .apply(RequestOptions().override(200, 300))
            .into(imgDetailPhoto)
        tvDetailNama.text = namaPres
        tvDetailDetail.text = detailPres
    }

    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }
}
