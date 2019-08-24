package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var leagueSelect = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueBtnClicked(view: View) {
        if(leagueSelect!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            ///below code is an extra code which passes the variable that we selected
            /// from toggle button
            skillActivity.putExtra(LEAGUE_CHOSEN, leagueSelect)///LEAGUE_CHOSEN is a constant , can be named random
            startActivity(skillActivity)
        } else{
            Toast.makeText(this, "Please click any of the League above", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        leagueSelect = "Mens"

    }
    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        leagueSelect = "Womens"
    }
    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        leagueSelect = "Coed"
    }
}
