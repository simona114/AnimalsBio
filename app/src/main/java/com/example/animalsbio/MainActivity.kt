package com.example.animalsbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle("Animals")

        var cat: ImageView = catId
        var parrot: ImageView = parrotId

        cat.setOnClickListener {
            var intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("animalKind", "cat")
            startActivity(intent)
        }
        parrot.setOnClickListener {
            var intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("animalKind", "parrot")
            startActivity(intent)
        }

    }
}