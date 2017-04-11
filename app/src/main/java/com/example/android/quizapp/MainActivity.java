package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;
    int questionsAnswered = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void correctQuiz(View view){

        // Boolean for the correct answer of the first question
        boolean answer1 = ((RadioButton) findViewById(R.id.q1)).isChecked();
        boolean answer2 = ((RadioButton) findViewById(R.id.q2)).isChecked();

        // Sum of correct answers
        score = (answer1?1:0) + (answer2?1:0);

        Toast.makeText(this, "Your score is: " + score + "/2", Toast.LENGTH_SHORT).show();


    }
}
