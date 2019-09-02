package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.LEAGUE_PLAYER

import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        // catch the intent putextra from previous activity
        var player = intent.getParcelableExtra<Player>(LEAGUE_PLAYER)

        searchLeagueText.text = "Searching for ${player.league} ${player.skill} league near you... "
    }
}
