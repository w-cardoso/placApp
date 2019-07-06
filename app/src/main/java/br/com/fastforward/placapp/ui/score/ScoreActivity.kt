package br.com.fastforward.placapp.ui.score

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import br.com.fastforward.placapp.R
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {

    private lateinit var scoreViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        tvEventName.text = intent.getStringExtra("event_name")
        tvHome.text = intent.getStringExtra("home_team_name")
        tvAway.text = intent.getStringExtra("away_team_name")

        btGoalHome.setOnClickListener {
            scoreViewModel.markGoalHome()
        }

        btGolAway.setOnClickListener {
            scoreViewModel.markGoalAway()
        }

        btRestart.setOnClickListener {
            scoreViewModel.restart()
        }

        btEndGame.setOnClickListener {
            finish()
        }

        scoreViewModel.goalHome.observe(this, Observer {
            tvGoalHome.text = it.toString()
        })

        scoreViewModel.goalAway.observe(this, Observer {
            tvGolAway.text = it.toString()
        })
    }
}
