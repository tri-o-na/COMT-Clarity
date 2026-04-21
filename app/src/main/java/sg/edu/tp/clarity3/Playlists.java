package sg.edu.tp.clarity3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Playlists extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ImageButton playlist1 = (ImageButton) findViewById(R.id.playlist1);
        ImageButton playlist2 = (ImageButton) findViewById(R.id.playlist2);
        ImageButton playlist3 = (ImageButton) findViewById(R.id.playlist3);
        ImageButton playlist4 = (ImageButton) findViewById(R.id.playlist4);
        ImageButton playlist5 = (ImageButton) findViewById(R.id.playlist5);

        playlist1.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
        playlist2.setOnClickListener(v -> {
            Intent i = new Intent(this, AlbumDivide4.class);
            startActivity(i);
        });
        playlist3.setOnClickListener(v -> {
            Intent i = new Intent(this, AlbumGloryDays2.class);
            startActivity(i);
        });
        playlist4.setOnClickListener(v -> {
            Intent i = new Intent(this, AlbumHeavenHell3.class);
            startActivity(i);
        });
        playlist5.setOnClickListener(v -> {
            Intent i = new Intent(this, AlbumGloryDays2.class);
            startActivity(i);
        });

    }
}