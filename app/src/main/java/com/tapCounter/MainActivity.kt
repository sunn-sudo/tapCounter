package com.tapCounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0;
        var counterView = findViewById<TextView>(R.id.textView)
        counterView.setText(count.toString())

        // ボタンイベント
        var button1 = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener(){count++;counterView.setText(count.toString());};
        button2.setOnClickListener(){count++;counterView.setText(count.toString());};
        button3.setOnClickListener(){count++;counterView.setText(count.toString());};
        button4.setOnClickListener(){count++;counterView.setText(count.toString());};

    }
}