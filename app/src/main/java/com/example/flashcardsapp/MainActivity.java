package com.example.flashcardsapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean isShowingAnswers=false;

        // TextViews for questions and answers
        TextView flashcardQuestion = findViewById(R.id.flashcard_question);
        TextView flashcardAnswer = findViewById(R.id.flashcard_answer);

        // TextViews for the multiple choice answers
        TextView multipleChoiceAnswer1 = findViewById(R.id.multiple_choice1);
        TextView multipleChoiceAnswer2 = findViewById(R.id.multiple_choice2);
        TextView multipleChoiceAnswer3 = findViewById(R.id.multiple_choice3);
        TextView multipleChoiceAnswer4 = findViewById(R.id.multiple_choice4);

        // OnClickListeners to alternate the question and answer on screen.
        flashcardQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(View.INVISIBLE);
                flashcardAnswer.setVisibility(View.VISIBLE);
            }
        });
        flashcardAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardAnswer.setVisibility(View.INVISIBLE);
                flashcardQuestion.setVisibility(View.VISIBLE);
                multipleChoiceAnswer1.setBackground(getResources().getDrawable(R.drawable.card_background1));
                multipleChoiceAnswer2.setBackground(getResources().getDrawable(R.drawable.card_background1));
                multipleChoiceAnswer3.setBackground(getResources().getDrawable(R.drawable.card_background1));
                multipleChoiceAnswer4.setBackground(getResources().getDrawable(R.drawable.card_background1));
            }
        });

        // OnClickListeners for the multiple choice answers
        multipleChoiceAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(INVISIBLE);
                flashcardAnswer.setVisibility(VISIBLE);
                multipleChoiceAnswer1.setBackground(getResources().getDrawable(R.drawable.card_background3));
                multipleChoiceAnswer2.setBackground(getResources().getDrawable(R.drawable.card_background2));
            }
        });
        multipleChoiceAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(INVISIBLE);
                flashcardAnswer.setVisibility(VISIBLE);
                multipleChoiceAnswer2.setBackground(getResources().getDrawable(R.drawable.card_background2));
            }
        });
        multipleChoiceAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(INVISIBLE);
                flashcardAnswer.setVisibility(VISIBLE);
                multipleChoiceAnswer3.setBackground(getResources().getDrawable(R.drawable.card_background3));
                multipleChoiceAnswer2.setBackground(getResources().getDrawable(R.drawable.card_background2));
            }
        });
        multipleChoiceAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardQuestion.setVisibility(INVISIBLE);
                flashcardAnswer.setVisibility(VISIBLE);
                multipleChoiceAnswer4.setBackground(getResources().getDrawable(R.drawable.card_background3));
                multipleChoiceAnswer2.setBackground(getResources().getDrawable(R.drawable.card_background2));
            }
        });
    }
}