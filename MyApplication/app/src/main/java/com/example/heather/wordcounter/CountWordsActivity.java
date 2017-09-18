package com.example.heather.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CountWordsActivity extends AppCompatActivity {

    EditText sentenceEditText;
    TextView numberOfWordsText;
    Button countMyWordsButton;
    ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_words);

        sentenceEditText = ( EditText ) findViewById(R.id.enter_sentence_text);
        numberOfWordsText = ( TextView ) findViewById(R.id.word_count_view);
        countMyWordsButton = ( Button ) findViewById(R.id.count_words_button);
        myImageView = ( ImageView ) findViewById(R.id.image);
        myImageView.setImageResource(R.drawable.proffessor);
    }

    public void setCountMyWordsButtonClicked(View button) {
        int answer = WordCounter.countWords(sentenceEditText.getText().toString());
        numberOfWordsText.setText("There are " + answer + " words in this sentence!");
    }
}
