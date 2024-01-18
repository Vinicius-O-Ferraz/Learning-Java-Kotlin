package com.example.virtual_fortune_cookie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributes


    String[] phrases = {
            "All for one and one for all -end ",
            "That which does not kill us makes us stronger -end",
            "Become who you are -end",
            "Quality is not an act, it is a habit -end",
            "There are always four sides to a story: your side, their side, the truth and what really happened. -end",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateQuote(View view){
        TextView text = findViewById(R.id.textResult);
        int randomInt = new Random().nextInt(5);
        String phrase = phrases[randomInt];

        text.setText(phrase);
    }

    String textResult = "";
    public void showAllQuotes(View view){

        TextView text = findViewById(R.id.textResult);  //find ui component from id

        for( String phrase : phrases ){

            textResult = textResult + phrase + '\n';
        }
        text.setText(textResult);
    }
}