package net.penguincoders.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class listgerakan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listgerakan)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var Bintang = findViewById<CardView>(R.id.video1)
        var Situp = findViewById<CardView>(R.id.video2)
        var Pullup = findViewById<CardView>(R.id.video3)
        var Squat = findViewById<CardView>(R.id.video4)
        var Plank = findViewById<CardView>(R.id.video5)
        var Pushup = findViewById<CardView>(R.id.video6)
        
        Pushup.setOnClickListener(){
            intent = Intent(this, pushup::class.java)
            startActivity(intent)
        }
        Bintang.setOnClickListener(){
            intent = Intent(this, bintang::class.java)
            startActivity(intent)
        }
        Situp.setOnClickListener(){
            intent = Intent(this, situp::class.java)
            startActivity(intent)
        }
        Pullup.setOnClickListener(){
            intent = Intent(this, pullup::class.java)
            startActivity(intent)
        }
        Plank.setOnClickListener(){
            intent = Intent(this, plank::class.java)
            startActivity(intent)
        }
        Squat.setOnClickListener(){
            intent = Intent(this, squat::class.java)
            startActivity(intent)
        }
    }
}