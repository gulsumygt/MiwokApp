package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("one","lutti",R.raw.phrase_are_you_coming));
        words.add(new Word("two","otiiko",R.raw.phrase_are_you_coming));
        words.add(new Word("three","tolookosu",R.raw.phrase_are_you_coming));
        words.add(new Word("four","oyyisa",R.raw.phrase_are_you_coming));
        words.add(new Word("five","massokka",R.raw.phrase_are_you_coming));
        words.add(new Word("six","temmokka",R.raw.phrase_are_you_coming));
        words.add(new Word("seven","kenekaku",R.raw.phrase_are_you_coming));
        words.add(new Word("eight","kawinta",R.raw.phrase_are_you_coming));
        words.add(new Word("nine","wo'e",R.raw.phrase_are_you_coming));
        words.add(new Word("ten","na'aacha",R.raw.phrase_are_you_coming));

        WordAdapter adapter=new WordAdapter(this,words,R.color.category_phrases);

        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                mediaPlayer= MediaPlayer.create(PhrasesActivity.this,word.getSoundResourceId());
                mediaPlayer.start();
            }
        });

    }
}
