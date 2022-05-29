package com.example.yoyoyomgaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var image_iv:ImageView

    lateinit var bhujang_btn:ImageButton
    lateinit var parvatasan_btn:ImageButton
    lateinit var padmasan_btn:ImageButton

    lateinit var title_tv: TextView
    lateinit var detail_tv: TextView

    var current_mode = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_iv = findViewById(R.id.image_iv)
        bhujang_btn = findViewById(R.id.bhujang_btn)
        parvatasan_btn = findViewById(R.id.parvatasan_btn)
        padmasan_btn = findViewById(R.id.padmasan_btn)
        title_tv = findViewById(R.id.title_tv)
        detail_tv = findViewById(R.id.detail_tv)

        bhujang_btn.setOnClickListener(){
            current_mode=1;
            title_tv.text="Bhujang asana"
            detail_tv.text="Bhujangasana (Sanskrit:; IAST: ) or Cobra Pose[1] is a reclining back-bending asana in hatha yoga and modern yoga as exercise.[2] It is commonly performed in a cycle of asanas in Surya Namaskar (Salute to the Sun) as an alternative to Urdhva Mukha Svanasana (Upwards Dog Pose)."
            image_iv.setImageResource(R.drawable.bhujang_asan)
        }

        parvatasan_btn.setOnClickListener(){
            current_mode=2;
            title_tv.text="Parvatasana"
            detail_tv.text="The position is intended to stretch the back and fortify the arms.Starting from the sitting position, padmasana type with crossed legs and back straight, inhaling, stretch the arms upwards above the head as an extension of the spine, joining the hands on the back"
            image_iv.setImageResource(R.drawable.qtb_minar)
        }

        padmasan_btn.setOnClickListener(){
            current_mode=3
            title_tv.text="Padmasana"
            detail_tv.text="Lotus position or Padmasana[1] is a cross-legged sitting meditation pose from ancient India, in which each foot is placed on the opposite thigh."
            image_iv.setImageResource(R.drawable.padmasana)
        }
    }
}