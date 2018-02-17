package suzu_code.simplequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, question;

    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get Random Number
        r = new Random();

        // Set TextViews
        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);
        score.setText("Score: " + mScore);

        // Set Buttons
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        // Count Next Questions Number
        updateQuestion(r.nextInt(mQuestionLength));

        // Button Actions
        answer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (answer1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else{
                    gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else{
                    gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else{
                    gameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (answer4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                } else{
                    gameOver();
                }
            }
        });
    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestions(num));
        answer1.setText(mQuestions.getChoices1(num));
        answer2.setText(mQuestions.getChoices2(num));
        answer3.setText(mQuestions.getChoices3(num));
        answer4.setText(mQuestions.getChoices4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your Score is " + mScore + " points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i){
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i){
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
