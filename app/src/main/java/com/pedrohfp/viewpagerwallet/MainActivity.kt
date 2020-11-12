package com.pedrohfp.viewpagerwallet

import android.gesture.GestureOverlayView.ORIENTATION_HORIZONTAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import java.time.Clock.offset

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.pager)
        viewPager.adapter = ScreenSlidePagerAdapter(supportFragmentManager)
        viewPager.clipToPadding = false
        viewPager.pageMargin = 30
        viewPager.setPadding(60, 0, 60, 0);
    }
}