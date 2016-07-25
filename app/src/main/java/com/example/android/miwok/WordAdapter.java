package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by glsmy on 25.07.2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words){
        super(context,0,words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWordList=getItem(position);

        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWordList.getDefaultTranslation());

        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWordList.getMiwokTranslation());

        return listItemView;
    }
}
