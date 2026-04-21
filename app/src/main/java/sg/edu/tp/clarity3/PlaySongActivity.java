package sg.edu.tp.clarity3;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PlaySongActivity extends AppCompatActivity {
    //attributes -- 5 attributes are for the song info
    private String title = "";
    private String fileLink = "";
    private int currentIndex = -1;


    private final MediaPlayer player = new MediaPlayer();

    private Button btnPlayPause = null;
    //useful to retrieve the song object when you have the index
    private SongCollection songCollection = new SongCollection();
    SeekBar seekbar;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        //-----
        btnPlayPause = findViewById(R.id.btnPlayPause);
        Bundle songData = this.getIntent().getExtras();
        currentIndex = songData.getInt("index");//get the index of the song
        Log.d("temasek", "Retrieved position is :" + currentIndex);
        displaySongBasedOnIndex();
        playSong(fileLink);


        seekbar = findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                player.seekTo(seekBar.getProgress());

            }
        });

    }//end of onCreate

    Runnable bar = new Runnable() {
        @Override
        public void run() {
            seekbar.setProgress(player.getCurrentPosition());
            handler.postDelayed(this,1000);
        }
    };

    public void displaySongBasedOnIndex() {
        Song song = songCollection.getCurrentSong(currentIndex);
        title = song.getTitle();
        String artiste = song.getArtiste();
        fileLink = song.getFileLink();
        int drawable = song.getDrawable();
        TextView txtTitle = findViewById(R.id.txtSongTitle);
        txtTitle.setText(title);
        TextView txtArtiste = findViewById(R.id.txtArtist);
        txtArtiste.setText(artiste);
        ImageView iCoverArt = findViewById(R.id.imgCoverArt);
        iCoverArt.setImageResource(drawable);
    }//end of displaySongBasedOnIndex

    public void playSong(String songUrl) {
        try {
            player.reset();
            player.setDataSource(songUrl);
            player.prepare();
            player.start();


            gracefullyStopsWhenMusicEnds();


            btnPlayPause.setText("PAUSE");
            setTitle(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//end of playSong
    //onClick event for Play button

    public void playOrPauseMusic(View view) {
        if (player.isPlaying()) { //if player is playing
            player.pause();
            btnPlayPause.setText("PLAY");
        } else {
            player.start();
            btnPlayPause.setText("PAUSE");
        }
    }//end of playOrPauseMusic


    private void gracefullyStopsWhenMusicEnds() {
        player.setOnCompletionListener(mp -> {
            Toast.makeText(getBaseContext(), "The song had ended and the onCompleteListener is activated\nThe button text is changed to 'PLAY'" , Toast.LENGTH_LONG).show();
            btnPlayPause.setText("PLAY");
        });
    }// end of gracefullyStopsWhenMusicEnds
    public void playPrevious(View view) {
        currentIndex = songCollection.getPrevSong(currentIndex);
        Toast.makeText(this, "After clicking playPrevious,\nthe current index of this song\nin the SongCollection array is now :" + currentIndex, Toast.LENGTH_LONG).show();
        Log.d("temasek", "After playPrevious, the index is now :" + currentIndex);
        displaySongBasedOnIndex();
        playSong(fileLink);
    }
    public void playNext(View view) {
        currentIndex = songCollection.getNextSong(currentIndex);
        Toast.makeText(this, "After clicking playNext,\nthe current index of this song\nin the SongCollection array is now :" + currentIndex, Toast.LENGTH_LONG).show();
        Log.d("temasek", "After playNext, the index is now :" + currentIndex);
        displaySongBasedOnIndex();
        playSong(fileLink);
    }

}//end of class