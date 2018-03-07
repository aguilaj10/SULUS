package com.mbn.sulus.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.mbn.sulus.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val items = arrayListOf<Data>()

        (0..20).map {
            items.add(Data("Titulo $it", "Desc $it times", "$200.00"))
        }
        rcView.adapter = CarAdapter(items)
    }
}
