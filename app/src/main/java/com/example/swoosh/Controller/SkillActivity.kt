package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.LEAGUE_CHOSEN
import com.example.swoosh.R
import com.example.swoosh.Utilities.LEAGUE_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var leagueChosen = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        ///below is the catcher of the putextra thrown from the league activity
        leagueChosen = intent.getStringExtra(LEAGUE_CHOSEN)
        Toast.makeText(this, "${leagueChosen}", Toast.LENGTH_SHORT).show()
    }

    fun onSkillFinishClicked(view: View){
        if (skill != ""){
            val finishActivity = Intent(this,FinishActivity::class.java )
            /// below line will 2 intent variables fronm this activity and the catched intent from previous activity to be thrown to "Finish Activity"
            finishActivity.putExtra(LEAGUE_SKILL, skill)
            finishActivity.putExtra(LEAGUE_CHOSEN, leagueChosen)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please click any of the skill requirement...",Toast.LENGTH_SHORT).show()
        }


    }

    fun onSkillBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "Beginner"
    }
    fun onSkillBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "Baller"

    }

}
