package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.Utilities.LEAGUE_CHOSEN
import com.example.swoosh.Utilities.LEAGUE_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league_chosen = ""
    var skill_chosen = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        // catch the intent putextra from previous activity
        league_chosen = intent.getStringExtra(LEAGUE_CHOSEN)
        skill_chosen = intent.getStringExtra(LEAGUE_SKILL)

        searchLeagueText.text = "Searching for $league_chosen $skill_chosen league near you... "
    }
}
