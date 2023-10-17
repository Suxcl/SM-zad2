package com.example.zad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PromptActivity extends AppCompatActivity {
    public static final String KEY_EXTRA_ANSWER_SHOWN = "answerShown";
    private boolean correctAnswer;
    private Button showHint;
    private Button get_home;
    private TextView hint;

    private void setAnswerShownResult(boolean answerWasShown){
        Intent resultintent = new Intent();
        resultintent.putExtra(KEY_EXTRA_ANSWER_SHOWN, answerWasShown);
        setResult(RESULT_OK, resultintent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);




        correctAnswer = getIntent().getBooleanExtra("answer", true);
        showHint = findViewById(R.id.hint_button);
        hint = findViewById(R.id.hint_textView);
        get_home = findViewById(R.id.button_get_home);
        showHint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int answer = correctAnswer ? R.string.button_true : R.string.button_false;
                hint.setText(answer);
                setAnswerShownResult(true);
            }
        });

        get_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });


    }
}