package com.example.fatin.ipray4mum;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fatin on 06/12/2017.
 */

public class DoaActivity extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<DoaVerse> arrayList2;
    private MediaPlayer mediaPlayer = null;
    private Boolean flag = true;

    public DoaActivity(Context context, int layout, ArrayList<DoaVerse> arrayList2) {
        this.context = context;
        this.layout = layout;
        this.arrayList2 = arrayList2;
    }

    @Override
    public int getCount() {
        return arrayList2.size();
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
        TextView txtVerse, txtEnglish, txtMalay;
        ImageView ivPlay,ivPause, ivStop, ivUnfav, ivFav;
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
            viewHolder.txtMalay = (TextView) convertView.findViewById(R.id.txtMalay);
            viewHolder.ivPlay = (ImageView) convertView.findViewById(R.id.ivPlay);
            viewHolder.ivPause = (ImageView) convertView.findViewById(R.id.ivPause);
            /*
            viewHolder.ivStop = (ImageView) convertView.findViewById(R.id.ivStop);
            */
            viewHolder.ivUnfav = (ImageView) convertView.findViewById(R.id.ivUnfav);

            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final DoaVerse doaVerse = arrayList2.get(position);

        viewHolder.txtVerse.setText(doaVerse.getVerse());
        viewHolder.txtEnglish.setText(doaVerse.getTransE());
        viewHolder.txtMalay.setText(doaVerse.getTransM());

        //play audio
        viewHolder.ivPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(flag){
                    mediaPlayer = MediaPlayer.create(context, doaVerse.getAyat());
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

        /*
        //stop audio
        viewHolder.ivStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(flag){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    flag = true;
                }
                viewHolder.ivPlay.setImageResource(R.drawable.playicon);
            }
        });
        */

        //fav verse
        viewHolder.ivUnfav.setOnClickListener(new View.OnClickListener(){
            private boolean fun = true;

            @Override
            public void onClick(View v) {
                if (fun) {
                    viewHolder.ivUnfav.setImageResource(R.drawable.favicon);
                    fun = false;
                } else {
                    fun = true;
                    viewHolder.ivUnfav.setImageResource(R.drawable.unfavicon);
                }
            }
        });

        return convertView;
    }
}
