package br.com.fastforward.placapp.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fastforward.placapp.R
import br.com.fastforward.placapp.ui.game.GameActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn_new_game.setOnClickListener {
            startActivity<GameActivity>()
        }

        main_btn_exit.setOnClickListener {
            finish()
        }

    }
}
