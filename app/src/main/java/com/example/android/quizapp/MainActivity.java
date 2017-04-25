package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void correctQuiz(View view){
        int score; // The score aquired by the player

        // Boolean for the correct answer of the first question
        boolean answer1 = ((RadioButton) findViewById(R.id.q1)).isChecked();

        // Boolean for the correct answer of the second question
        boolean answer2 = ((RadioButton) findViewById(R.id.q2)).isChecked();

        // Booleans for the checkboxes of third question
        boolean checkBox1 = ((CheckBox) findViewById(R.id.q3_1)).isChecked();
        boolean checkBox2 = ((CheckBox) findViewById(R.id.q3_2)).isChecked();
        boolean checkBox3 = ((CheckBox) findViewById(R.id.q3_3)).isChecked();
        boolean checkBox4 = ((CheckBox) findViewById(R.id.q3_4)).isChecked();
        boolean checkBox5 = ((CheckBox) findViewById(R.id.q3_5)).isChecked();

        // Boolean for the correct answer of the third question
        boolean answer3 = checkBox1 && checkBox2 && !checkBox3 && checkBox4 && !checkBox5;

        // Assign the string countryName with the content of the EditBox.
        String countryName = ((EditText) findViewById(R.id.country_name)).getText().toString().trim();

        // Boolean for the correct answer of the fourth question
        boolean answer4 = countryName.equalsIgnoreCase("Spain");

        // Boolean for the correct answer of the fifth question
        boolean answer5 = ((RadioButton) findViewById(R.id.q5)).isChecked();


        // Sum of correct answers
        score = (answer1?1:0) + (answer2?1:0) + (answer3?1:0) + (answer4?1:0) + (answer5?1:0);

        Toast.makeText(this, "Your score is: " + score + "/5", Toast.LENGTH_SHORT).show();

    }
}
