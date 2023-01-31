package com.example.whogoesfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var team1Text: EditText
    private lateinit var team2Text: EditText
    private lateinit var selectButton: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        team1Text = findViewById(R.id.team_1_input)
        team2Text = findViewById(R.id.team_2_input)
        selectButton = findViewById(R.id.select_button)
        resultText = findViewById(R.id.results_text)

        selectButton.setOnClickListener {
            randomTeam()
        }
    }

    private fun randomTeam() {
        val teams = listOf("Team 1", "Team 2").random()
        if (teams == "Team 1") {
            resultText.text = team1Text.text
        } else {
            resultText.text = team2Text.text
        }
    }
}