package com.example.mobileapp_timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var worktv: TextView
    private var canAddSymbol = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        worktv = findViewById(R.id.worktv)

    }

    fun numberAction(view: View) {
        if (view is Button) {
            if (view.text == ".") {
                if (canAddSymbol)
                    worktv.append(view.text)

                canAddSymbol = false
            } else
                worktv.append(view.text)

            canAddSymbol = true
        }

    }
    fun allClearAction(view: View) {
        worktv.text = ""

    }
    fun backSpaceAction(view: View) {
        val length = worktv.length()
        if (length > 0)
            worktv.text = worktv.text.subSequence(0, length - 1)

    }
}