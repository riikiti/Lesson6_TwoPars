package com.example.lesson6_twopars;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public Board board ;
    public ImageView card0, card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        board=new Board();
        card0 = (ImageView) findViewById(R.id.imageView1);
        card1 = (ImageView) findViewById(R.id.imageView2);
        card2 = (ImageView) findViewById(R.id.imageView3);
        card3 = (ImageView) findViewById(R.id.imageView4);
        card4 = (ImageView) findViewById(R.id.imageView5);
        card5 = (ImageView) findViewById(R.id.imageView6);
        card6 = (ImageView) findViewById(R.id.imageView7);
        card7 = (ImageView) findViewById(R.id.imageView8);
        card8 = (ImageView) findViewById(R.id.imageView9);
        card9 = (ImageView) findViewById(R.id.imageView10);
        card10 = (ImageView) findViewById(R.id.imageView11);
        card11 = (ImageView) findViewById(R.id.imageView12);

        card0.setOnClickListener((View.OnClickListener) this);
        card1.setOnClickListener((View.OnClickListener) this);
        card2.setOnClickListener((View.OnClickListener) this);
        card3.setOnClickListener((View.OnClickListener) this);
        card4.setOnClickListener((View.OnClickListener) this);
        card5.setOnClickListener((View.OnClickListener) this);
        card6.setOnClickListener((View.OnClickListener) this);
        card7.setOnClickListener((View.OnClickListener) this);
        card8.setOnClickListener((View.OnClickListener) this);
        card9.setOnClickListener((View.OnClickListener) this);
        card10.setOnClickListener((View.OnClickListener) this);
        card11.setOnClickListener((View.OnClickListener) this);

    }

    public void Check(View view) {
        int[][] desk = board.getBoard();
        Drawable card;
        switch (view.getId()) {
            case R.id.imageView1:
                card = GetImg(desk, 0, 0);
                card0.setImageDrawable(card);
                break;
            case R.id.imageView2:
                card = GetImg(desk, 0, 1);
                card1.setImageDrawable(card);
                break;
            case R.id.imageView3:
                card = GetImg(desk, 0, 2);
                card2.setImageDrawable(card);
                break;
            case R.id.imageView4:
                card = GetImg(desk, 1, 0);
                card3.setImageDrawable(card);
                break;
            case R.id.imageView5:
                card = GetImg(desk, 1, 1);
                card4.setImageDrawable(card);
                break;
            case R.id.imageView6:
                card = GetImg(desk, 1, 2);
                card5.setImageDrawable(card);
                break;
            case R.id.imageView7:
                card = GetImg(desk, 2, 0);
                card6.setImageDrawable(card);
                break;
            case R.id.imageView8:
                card = GetImg(desk, 2, 1);
                card7.setImageDrawable(card);
                break;
            case R.id.imageView9:
                card = GetImg(desk, 2, 2);
                card8.setImageDrawable(card);
                break;
            case R.id.imageView10:
                card = GetImg(desk, 3, 0);
                card9.setImageDrawable(card);
                break;
            case R.id.imageView11:
                card = GetImg(desk, 3, 1);
                card10.setImageDrawable(card);
                break;
            case R.id.imageView12:
                card = GetImg(desk, 3, 2);
                card11.setImageDrawable(card);
                break;
        }
    }

    public Drawable GetImg(int[][] board, int i, int j) {
        Drawable drawableCard = getDrawable(R.drawable.card);
        switch (board[i][j]) {
            case 0:
                drawableCard = getDrawable(R.drawable.ace);
                return drawableCard;
            case 1:
                drawableCard = getDrawable(R.drawable.king);
                return drawableCard;
            case 2:
                drawableCard = getDrawable(R.drawable.queen);
                return drawableCard;
            case 3:
                drawableCard = getDrawable(R.drawable.jack);
                return drawableCard;
            case 4:
                drawableCard = getDrawable(R.drawable.ten);
                return drawableCard;
            case 5:
                drawableCard = getDrawable(R.drawable.joker);
                return drawableCard;
        }
        return drawableCard;
    }
}