package sg.edu.tp.clarity3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Albums extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ImageButton littlemix = (ImageButton) findViewById(R.id.GloryDays);
        ImageButton avavmax = (ImageButton) findViewById(R.id.HeavenHell);
        ImageButton edsheeran = (ImageButton) findViewById(R.id.Divide);
        Button latest5songs = (Button) findViewById(R.id.latest5songs);
        Button playlists = (Button) findViewById(R.id.playlists);
        Button favourites = (Button) findViewById(R.id.favourites);

        littlemix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Albums.this, AlbumGloryDays2.class);
                startActivity(i);
            }
        });
        avavmax.setOnClickListener(v -> {
            Intent i = new Intent(Albums.this, AlbumHeavenHell3.class);
            startActivity(i);
        });
        edsheeran.setOnClickListener(v -> {
            Intent i = new Intent(Albums.this, AlbumDivide4.class);
            startActivity(i);
        });
        latest5songs.setOnClickListener(v -> {
            Intent i = new Intent(Albums.this, MainActivity.class);
            startActivity(i);
         });
        playlists.setOnClickListener(v -> {
            Intent i = new Intent(Albums.this, Playlists.class);
            startActivity(i);
        });
        favourites.setOnClickListener(v -> {
            Intent i = new Intent(Albums.this, Favourites.class);
            startActivity(i);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.playlist_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int id = item.getItemId();

       if (id == R.id.item1) {

           Intent intent = new Intent(Albums.this, AllSongs.class);
           startActivity(intent);

           return true;
       }
       else
       if (id == R.id.item2) {
           Intent intent = new Intent(Albums.this, LatestAlbum.class);
           startActivity(intent);
           return true;
       }
       else
       if (id == R.id.item3) {
           Intent intent = new Intent(Albums.this, UserGuide.class);
           startActivity(intent);
           return true;
       }
           return super.onOptionsItemSelected(item);
    }
}