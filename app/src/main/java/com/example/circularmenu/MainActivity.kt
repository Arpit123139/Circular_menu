package com.example.circularmenu

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.hitomi.cmlibrary.CircleMenu
import com.hitomi.cmlibrary.OnMenuSelectedListener

class MainActivity : AppCompatActivity() {

    private lateinit var circleMenu: CircleMenu
    private lateinit var constraintLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circleMenu = findViewById(R.id.circle_menu)
        constraintLayout = findViewById(R.id.constraint_layout)

        circleMenu.setMainMenu(
            Color.parseColor("#CDCDCD"),
            R.drawable.icon_menu,
            R.drawable.icon_cancel
        )
            .addSubMenu(Color.parseColor("#258CFF"), R.drawable.icon_home)
            .addSubMenu(Color.parseColor("#30A400"), R.drawable.icon_search)
            .addSubMenu(Color.parseColor("#FF4B32"), R.drawable.icon_notify)
            .addSubMenu(Color.parseColor("#8A39FF"), R.drawable.icon_setting)
            .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.icon_gps)
            .setOnMenuSelectedListener(OnMenuSelectedListener { index ->
                when (index) {
                    0 -> {
                        Toast.makeText(this@MainActivity, "home", Toast.LENGTH_SHORT).show()
                        constraintLayout.setBackgroundColor(Color.parseColor("#ecffb"))
                    }
                    1 -> {
                        Toast.makeText(this@MainActivity, "Search", Toast.LENGTH_SHORT).show()
                        constraintLayout.setBackgroundColor(Color.parseColor("#96f7d2"))
                    }
                    2 -> {
                        Toast.makeText(this@MainActivity, "Notification", Toast.LENGTH_SHORT).show()
                        constraintLayout.setBackgroundColor(Color.parseColor("#fac4a2"))
                    }
                    3 -> {
                        Toast.makeText(this@MainActivity, "gps", Toast.LENGTH_SHORT).show()
                        constraintLayout.setBackgroundColor(Color.parseColor("#fff591"))
                    }
                }
            })
    }
}