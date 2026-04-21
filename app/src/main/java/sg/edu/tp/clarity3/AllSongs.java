package sg.edu.tp.clarity3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class AllSongs extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "Hero","So Am I", "Tequila", "Castle On The Hill", "I'm so tired...",
            "Not Your Barbie Girl","Happier","Double Take", "Build A Bit*h",
            "Shout Out To My Ex", "Touch", "Reggaeton Lento", "Power", "No More Sad Songs",
            "Oops", "My Head And My Heart", "Kings And Queens", "OMG What's Happening", "Salt",
            "Shape Of You", "Galway Girl", "Perfect", "Hearts Don't Break Around Here",
    };

    String[] subtitle ={
            "Faouzia", "Ava Max", "Dan + Shay", "Ed Sheeran", "Lauv", "Ava Max",
            "Ed Sheeran", "dhruv","Bella Poarch", "Little Mix", "Little Mix", "Little Mix",
            "Little Mix", "Little Mix", "Little Mix", "Ava Max", "Ava Max", "Ava Max", "Ava Max",
            "Ed Sheeran", "Ed Sheeran", "Ed Sheeran", "Ed Sheeran",
    };

    Integer[] imgid={
            R.drawable.hero,R.drawable.so_am_i,R.drawable.tequila, R.drawable.castle_on_the_hill,
            R.drawable.im_so_tired_lauv, R.drawable.not_your_barbie_girl, R.drawable.happier,
            R.drawable.double_take_dhruv, R.drawable.build_a_bitch, R.drawable.shout_out_to_my_ex,
            R.drawable.reggaeton_lento, R.drawable.power, R.drawable.touch, R.drawable.oops,
            R.drawable.my_head_n_my_heart, R.drawable.kings_n_queens, R.drawable.omg_whats_happening,
            R.drawable.salt, R.drawable.shape_of_you, R.drawable.galway_girl, R.drawable.perfect,
            R.drawable.hearts_dont_break_around_here,
    };


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        MyListView adapter=new MyListView(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener((parent, view, position, id) -> {
            // TODO Auto-generated method stub
            if(position == 0) {
                //code specific to first list item
                Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
            }
            else if(position == 1) {
                //code specific to 2nd list item
                Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
            }

            else if(position == 2) {

                Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
            }
            else if(position == 3) {

                Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
            }
            else if(position == 5) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 6) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 7) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 8) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 9) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 10) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 11) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 12) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 13) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 14) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 15) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 16) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 17) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 18) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 19) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 20) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 21) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 22) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }
            else if(position == 23) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
            }

        });

    }

}