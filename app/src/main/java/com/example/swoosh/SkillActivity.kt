package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : BaseActivity() {

    var leagueChosen = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        ///below is the catcher of the putextra thrown from the league activity
        leagueChosen = intent.getStringExtra(LEAGUE_CHOSEN)
        Toast.makeText(this, "${leagueChosen}", Toast.LENGTH_SHORT).show()
    }
}
