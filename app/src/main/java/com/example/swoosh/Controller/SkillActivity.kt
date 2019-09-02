package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.LEAGUE_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        ///below is the catcher of the putextra thrown from the league activity
        player = intent.getParcelableExtra(LEAGUE_PLAYER)
    }

    fun onSkillFinishClicked(view: View){
        if (player.skill != ""){
            val finishActivity = Intent(this,FinishActivity::class.java )
            /// below line will 2 intent variables fronm this activity and the catched intent from previous activity to be thrown to "Finish Activity"
            finishActivity.putExtra(LEAGUE_PLAYER, player) /// the putExtra type is a Parcelable/String type
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please click any of the skill requirement...",Toast.LENGTH_SHORT).show()
        }


    }

    fun onSkillBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "Beginner"
    }
    fun onSkillBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "Baller"

    }

}
