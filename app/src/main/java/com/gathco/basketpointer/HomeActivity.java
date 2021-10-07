package com.gathco.basketpointer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HomeActivity extends Activity {
    TextView tScoreA, tScoreB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        tScoreA = (TextView) findViewById(R.id.scoreA);
        tScoreB = (TextView) findViewById(R.id.scoreB);

        Intent i = getIntent();
        String teamOne = i.getStringExtra("teamOne");
        String teamTwo = i.getStringExtra("teamTwo");

        TextView tagTeamA = (TextView) findViewById(R.id.aTeam);
        tagTeamA.setText(teamOne);
        TextView tagTeamB = (TextView) findViewById(R.id.bTeam);
        tagTeamB.setText(teamTwo);

        Button button3A = (Button) findViewById(R.id.threePointA);
        button3A.setOnClickListener(__->ThreePointAction());

        Button button2A = (Button) findViewById(R.id.twoPointA);
        button2A.setOnClickListener(__->TwoPointAction());

        Button buttonFreeA = (Button) findViewById(R.id.freePointA);
        buttonFreeA.setOnClickListener(__->FreePointAction());

        Button buttonReset = (Button) findViewById(R.id.resetButton);
        buttonReset.setOnClickListener(__->resetScoreAction());
    }

    public void ThreePointAction() {
        String sScoreA = tScoreA.getText().toString();

        Integer iScoreA = Integer.parseInt(sScoreA);
        int sum = iScoreA + 3;
        tScoreA.setText(String.valueOf(sum));
        tScoreB.setText(String.valueOf(sum));
    }
    public void TwoPointAction() {
        String sScoreA = tScoreA.getText().toString();

        Integer iScoreA = Integer.parseInt(sScoreA);
        int sum = iScoreA + 2;
        tScoreA.setText(String.valueOf(sum));
    }
    public void FreePointAction() {
        String sScoreA = tScoreA.getText().toString();

        Integer iScoreA = Integer.parseInt(sScoreA);
        int sum = iScoreA + 1;
        tScoreA.setText(String.valueOf(sum));
    }

    public void resetScoreAction() {
        String sScoreA = tScoreA.getText().toString();

        Integer iScoreA = Integer.parseInt(sScoreA);
        int sum = 0;
        tScoreA.setText(String.valueOf(sum));
    }
}
