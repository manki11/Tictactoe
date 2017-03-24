package com.example.mankirat.tiktaktoe;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button B11, B12, B13, B21, B22, B23, B31, B32, B33,restartgame;
    Boolean player1;
    Boolean b11, b12, b13, b21, b22, b23, b31, b32, b33;
    Boolean player1won, player2won;
    TextView playerchance;

    int n;

    Drawable bg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B11 = (Button) findViewById(R.id.B11);
        B12 = (Button) findViewById(R.id.B12);
        B13 = (Button) findViewById(R.id.B13);
        B21 = (Button) findViewById(R.id.B21);
        B22 = (Button) findViewById(R.id.B22);
        B23 = (Button) findViewById(R.id.B23);
        B31 = (Button) findViewById(R.id.B31);
        B32 = (Button) findViewById(R.id.B32);
        B33 = (Button) findViewById(R.id.B33);
        restartgame=(Button) findViewById(R.id.startgame) ;

        player1 = true;

        b11 = true;
        b12 = true;
        b13 = true;
        b21 = true;
        b22 = true;
        b23 = true;
        b31 = true;
        b32 = true;
        b33 = true;

        player1won = false;
        player2won = false;

        playerchance=(TextView) findViewById(R.id.playerchance);

        bg=B11.getBackground();

        n=0;

    }

    public void chance(){
        if(player1){
            playerchance.setText("CHANCE OF PLAYER 1(X)");
        }else{
            playerchance.setText("CHANCE OF PLAYER 2(O)");
        }
    }

    public void B11(View view) {
        if (b11) {
            if (player1) {
                B11.setTextColor(Color.parseColor("red"));
                B11.setText("X");
                player1 = false;
            } else {
                B11.setTextColor(Color.parseColor("blue"));
                B11.setText("O");
                player1 = true;
            }
            b11 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B12(View view) {
        if (b12) {
            if (player1) {
                B12.setTextColor(Color.parseColor("red"));
                B12.setText("X");
                player1 = false;
            } else {
                B12.setTextColor(Color.parseColor("blue"));
                B12.setText("O");
                player1 = true;
            }
            b12 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B13(View view) {
        if (b13) {
            if (player1) {
                B13.setTextColor(Color.parseColor("red"));
                B13.setText("X");
                player1 = false;
            } else {
                B13.setTextColor(Color.parseColor("blue"));
                B13.setText("O");
                player1 = true;
            }
            b13 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B21(View view) {
        if (b21) {
            if (player1) {
                B21.setTextColor(Color.parseColor("red"));
                B21.setText("X");
                player1 = false;
            } else {
                B21.setTextColor(Color.parseColor("blue"));
                B21.setText("O");
                player1 = true;
            }
            b21 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B22(View view) {
        if (b22) {
            if (player1) {
                B22.setTextColor(Color.parseColor("red"));
                B22.setText("X");
                player1 = false;
            } else {
                B22.setTextColor(Color.parseColor("blue"));
                B22.setText("O");
                player1 = true;
            }
            b22 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B23(View view) {
        if (b23) {
            if (player1) {
                B23.setTextColor(Color.parseColor("red"));
                B23.setText("X");
                player1 = false;
            } else {
                B23.setTextColor(Color.parseColor("blue"));
                B23.setText("O");
                player1 = true;
            }
            b23 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B31(View view) {
        if (b31) {
            if (player1) {
                B31.setTextColor(Color.parseColor("red"));
                B31.setText("X");
                player1 = false;
            } else {
                B31.setTextColor(Color.parseColor("blue"));
                B31.setText("O");
                player1 = true;
            }
            b31 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B32(View view) {
        if (b32) {
            if (player1) {
                B32.setTextColor(Color.parseColor("red"));
                B32.setText("X");
                player1 = false;
            } else {
                B32.setTextColor(Color.parseColor("blue"));
                B32.setText("O");
                player1 = true;
            }
            b32 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }

    public void B33(View view) {
        if (b33) {
            if (player1) {
                B33.setTextColor(Color.parseColor("red"));
                B33.setText("X");
                player1 = false;
            } else {
                B33.setTextColor(Color.parseColor("blue"));
                B33.setText("O");
                player1 = true;
            }
            b33 = false;
            n++;
            boolean b=checkForGame.checkForWin(B11,B12,B13,B21,B22,B23,B31,B32,B33,playerchance,n);
            if(b){
                endgame();
            }else{
                chance();
            }
        }

    }




    public void endgame(){
        b11 = false;
        b12 = false;
        b13 = false;
        b21 = false;
        b22 = false;
        b23 = false;
        b31 = false;
        b32 = false;
        b33 = false;





    }

    public void startgame(View view){
        b11 = true;
        b12 = true;
        b13 = true;
        b21 = true;
        b22 = true;
        b23 = true;
        b31 = true;
        b32 = true;
        b33 = true;

        player1won = false;
        player2won = false;

        player1 = true;

        chance();

        B11.setText("");
        B12.setText("");
        B13.setText("");
        B21.setText("");
        B22.setText("");
        B23.setText("");
        B31.setText("");
        B32.setText("");
        B33.setText("");

        B12.setBackground(bg);
        B11.setBackground(bg);
        B13.setBackground(bg);

        B22.setBackground(bg);
        B21.setBackground(bg);
        B23.setBackground(bg);

        B31.setBackground(bg);
        B32.setBackground(bg);
        B33.setBackground(bg);

        n=0;


    }


}

