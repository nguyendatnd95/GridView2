package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //khai báo list danh sách các bộ phim
        val list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.banghoa, "Băng hỏa"))
        list.add(OutData(R.drawable.hoanhon, "Hoàn Hồn"))
        list.add(OutData(R.drawable.rong, "Rông 2022"))
        list.add(OutData(R.drawable.thanlan, "Thân lan 2022"))
        list.add(OutData(R.drawable.banghoa, "Băng hỏa"))
        list.add(OutData(R.drawable.hoanhon, "Hoàn Hồn"))
        list.add(OutData(R.drawable.rong, "Rông 2022"))
        list.add(OutData(R.drawable.thanlan, "Thân lan 2022"))
        list.add(OutData(R.drawable.banghoa, "Băng hỏa"))
        list.add(OutData(R.drawable.hoanhon, "Hoàn Hồn"))
        list.add(OutData(R.drawable.rong, "Rông 2022"))
        list.add(OutData(R.drawable.thanlan, "Thân lan 2022"))

        val customGv = CustomGridView(this, list)
        gvPhim.adapter = customGv

        //bắt sự kiện
        gvPhim.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"Bạn chọn phim "+ list[i].tenPhim,Toast.LENGTH_SHORT).show()

        }
    }
}