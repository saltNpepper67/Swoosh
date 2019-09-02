package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.LEAGUE_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueBtnClicked(view: View) {
        if(player.league!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            ///below code is an extra code which passes the variable that we selected
            /// from toggle button
            skillActivity.putExtra(LEAGUE_PLAYER, player)///the putExtra type is a String/Parcelable combination
            startActivity(skillActivity)
        } else{
            Toast.makeText(this, "Please click any of the League above", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "Mens"

    }
    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "Womens"
    }
    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "Coed"
    }
}
