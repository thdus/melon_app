package com.example.melon

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MelonDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_melon_detail)

        val melonItemList = intent.getSerializableExtra("melon_item_list") as ArrayList<MelonItem>
        melonItemList.forEach{
        Log.d("melonn", it.song)}

    }
}