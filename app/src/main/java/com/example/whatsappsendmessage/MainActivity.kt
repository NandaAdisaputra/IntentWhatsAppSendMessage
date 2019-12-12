package com.example.whatsappsendmessage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_whatsApp.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val message = "https://api.whatsapp.com/send?phone=6282141730797&text=Permisi,%20Perkenalan%20nama%20saya"

        val i = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(message)
        )
        startActivity(i)
    }
}
