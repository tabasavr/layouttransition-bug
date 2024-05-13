package com.example.animatelayoutchanges

import android.animation.LayoutTransition
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val icon = findViewById<View>(R.id.icon)
        findViewById<View>(R.id.btn).setOnClickListener {
            icon.visibility = if (icon.visibility == View.VISIBLE) {
                View.GONE
            } else {
                View.VISIBLE
            }
        }

        val container = findViewById<ViewGroup>(R.id.container)
        container.layoutTransition.setStartDelay(LayoutTransition.APPEARING, 5000)
        container.layoutTransition.setStartDelay(LayoutTransition.CHANGE_DISAPPEARING, 5000)

        container.layoutTransition.setDuration(LayoutTransition.CHANGE_APPEARING, 2000)
        container.layoutTransition.setDuration(LayoutTransition.DISAPPEARING, 2000)
    }
}
