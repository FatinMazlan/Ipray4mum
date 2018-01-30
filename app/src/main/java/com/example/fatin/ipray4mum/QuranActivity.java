package com.example.fatin.ipray4mum;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Fatin on 06/12/2017.
 */

public class QuranActivity extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<VerseActivity> arrayList;
    private MediaPlayer mediaPlayer = null;
    private Boolean flag = true;

    public QuranActivity(Context context, int layout, ArrayList<VerseActivity> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView txtVerse, txtEnglish;
        ImageView ivPlay,ivPause, ivStop, ivUnflag;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout, null);
            viewHolder.txtVerse = (TextView) convertView.findViewById(R.id.txtVerse);
            viewHolder.txtEnglish = (TextView) convertView.findViewById(R.id.txtEnglish);
            viewHolder.ivPlay = (ImageView) convertView.findViewById(R.id.ivPlay);
            viewHolder.ivPause = (ImageView) convertView.findViewById(R.id.ivPause);
            /*
            viewHolder.ivStop = (ImageView) convertView.findViewById(R.id.ivStop);
            */
            viewHolder.ivUnflag = (ImageView) convertView.findViewById(R.id.ivUnflag);

            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final VerseActivity verseactivity = arrayList.get(position);

        viewHolder.txtVerse.setText(verseactivity.getVerse());
        viewHolder.txtEnglish.setText(verseactivity.getTrans());

        //play audio
        viewHolder.ivPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(flag){
                    mediaPlayer = MediaPlayer.create(context, verseactivity.getAyat());
                    flag = false;
                }

                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    viewHolder.ivPlay.setImageResource(R.drawable.playicon);
                } else{
                    mediaPlayer.start();
                    viewHolder.ivPlay.setImageResource(R.drawable.pauseicon);
                }

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        flag = true;
                        viewHolder.ivPlay.setImageResource(R.drawable.playicon);
                    }
                });


            }
        });

        //stop audio
        /*
        viewHolder.ivStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(flag) {
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        flag = true;
                    }
                }
                viewHolder.ivPlay.setImageResource(R.drawable.playicon);
            }
        });
        */

        //fav verse
        viewHolder.ivUnflag.setOnClickListener(new View.OnClickListener(){
            private boolean fun = true;
            @Override
            public void onClick(View v) {
                if (fun) {
                    viewHolder.ivUnflag.setImageResource(R.drawable.flagicon);
                    fun = false;

                } else {
                    fun = true;
                    viewHolder.ivUnflag.setImageResource(R.drawable.unflagicon);
                }
            }
        });

        return convertView;
    }


}
