package id.co.bubui.responsi249.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.co.bubui.responsi249.ActivityDetail
import id.co.bubui.responsi249.R
import id.co.bubui.responsi249.model.Program

class ListProgramAdapter (
    private val context: Context,
    private val daftarprogram: ArrayList<Program>,
    private val listener: (Program) -> Unit) : RecyclerView.Adapter<ListProgramAdapter.ProgramViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListProgramAdapter.ProgramViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_program, parent, false)
        return ProgramViewHolder(view)
    }

    override fun getItemCount(): Int {
        return daftarprogram.size
    }

    override fun onBindViewHolder(holder: ProgramViewHolder, position: Int) {
        holder.onBind(daftarprogram[position], listener)



        /*holder.itemView.setOnClickListener{
            val pindahDetailActivity = Intent(holder.mContext, ActivityDetail::class.java)
            pindahDetailActivity.putExtra(ActivityDetail.EXTRA_NAMA, program.nama)
            pindahDetailActivity.putExtra(ActivityDetail.EXTRA_DETAIL, program.deskripsi)
            pindahDetailActivity.putExtra(ActivityDetail.EXTRA_PHOTO, program.gambar)
            holder.mContext.startActivity(pindahDetailActivity)
        }*/

    }

    inner class ProgramViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_item_deskripsi)
        var imgGambar: ImageView = itemView.findViewById(R.id.img_item_gambar)

        fun onBind(
            programs: Program,
            listener: (Program) -> Unit
        ){
            tvNama.text = programs.nama
            tvDeskripsi.text = programs.deskripsi
            Glide.with(itemView.context)
                .load(programs.gambar)
                .into(imgGambar)
        }
    }
}