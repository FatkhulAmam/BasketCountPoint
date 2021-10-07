package com.gathco.basketpointer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.start);
        startButton.setOnClickListener(__->setStartButton());
    }

    public void setStartButton() {
        EditText eTeamOne = (EditText) findViewById(R.id.timOne);
        EditText eTeamTwo = (EditText) findViewById(R.id.timTwo);

        String sTeamOne = eTeamOne.getText().toString();
        String sTeamTwo = eTeamTwo.getText().toString();

        final Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("teamOne", sTeamOne);
        intent.putExtra("teamTwo", sTeamTwo);
        startActivity(intent);
    }
}