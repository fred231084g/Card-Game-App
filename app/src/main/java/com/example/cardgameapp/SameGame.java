package com.example.cardgameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cardgameapp.gamesCategorys.Games;
import com.example.cardgameapp.gamesCategorys.SameGameObj;

import java.util.HashMap;

public class SameGame extends AppCompatActivity {

    private Games games;
    private static int level=0;
    private HashMap<Integer,TextView> letters;
    private StringBuilder answer;
    private GridLayout gridAnswer;
    private HashMap<Integer,SameGameObj>  sameGames;
    private ImageView imageView1,imageView2,imageView3,imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_same_game);
        //games= Games.getInstance();
        letters=new HashMap<Integer, TextView>();
        answer=new StringBuilder();
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        gridAnswer=findViewById(R.id.gridAnswer);
        //games.GetSameGameFromDb();
        //CreateGames();
        //TaggingLetters();
        //Init();
    }

    public void CreateGames()
    {
        games.CreateSameGame(new SameGameObj(R.drawable.bucket,R.drawable.sandcastle,R.drawable.shell,R.drawable.sunglasses,"Beach",0));
        games.CreateSameGame(new SameGameObj(R.drawable.fins,R.drawable.mask,R.drawable.seahorse,R.drawable.turtle,"Diving",1));
        games.CreateSameGame(new SameGameObj(R.drawable.grapefruit,R.drawable.kiwi,R.drawable.strawberry,R.drawable.watermelon,"fruits",2));
        games.CreateSameGame(new SameGameObj(R.drawable.aeroplane,R.drawable.camera,R.drawable.palm,R.drawable.passport,"Holiday",3));
        games.CreateSameGame(new SameGameObj(R.drawable.alien,R.drawable.astronaut,R.drawable.galaxy,R.drawable.ship,"space",4));
        games.CreateSameGame(new SameGameObj(R.drawable.bigben,R.drawable.egypt,R.drawable.eiffel,R.drawable.liberty,"Tourism",5));
        games.WriteSameGames();
    }
/*
    public void TaggingLetters()
    {
        letters.put(11,findViewById(R.id.letter11));
        letters.put(12,findViewById(R.id.letter12));
        letters.put(13,findViewById(R.id.letter13));
        letters.put(14,findViewById(R.id.letter14));
        letters.put(15,findViewById(R.id.letter15));
        letters.put(16,findViewById(R.id.letter16));
        letters.put(21,findViewById(R.id.letter21));
        letters.put(22,findViewById(R.id.letter22));
        letters.put(23,findViewById(R.id.letter23));
        letters.put(24,findViewById(R.id.letter24));
        letters.put(25,findViewById(R.id.letter25));
        letters.put(26,findViewById(R.id.letter26));
    }


    public void Init()
    {
        switch (level)
        {
            case 0:
                SameGameObj game=games.GetSameGames().get(0);
                imageView1.setImageResource(game.getPiq1());
                imageView2.setImageResource(game.getPiq2());
                imageView3.setImageResource(game.getPiq3());
                imageView4.setImageResource(game.getPiq4());
                for(int i=0;i<game.getAnswer().length();i++)
                {
                    EditText editText=new EditText(this);
                    gridAnswer.addView(editText);
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }

*/


}