package com.mob.adatperprac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data = arrayListOf<TestModel>(
        TestModel("a","b","c"),
        TestModel("d","e","f"),
        TestModel("h","i","g")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testAdapter = testAdapter(this, data)
        listView.adapter = testAdapter
    }
}
