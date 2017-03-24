package com.example.mankirat.tiktaktoe;

import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mankirat on 15-01-2017.
 */
public class checkForGame {

    public static boolean checkForWin(Button B11, Button B12, Button B13, Button B21, Button B22, Button B23, Button B31, Button B32, Button B33, TextView playerchance,int n){
        boolean player1won=false,player2won=false;
        if (B11.getText().equals("X")) {
            if (B21.getText().equals("X")) {
                if (B31.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B11,B21,B31);
                    return true;

                }
            }
        }

        if (B11.getText().equals("X")) {
            if (B22.getText().equals("X")) {
                if (B33.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B11,B22,B33);
                    return true;
                }
            }
        }

        if (B11.getText().equals("X")) {
            if (B12.getText().equals("X")) {
                if (B13.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B11,B12,B13);
                    return true;
                }
            }
        }

        if (B13.getText().equals("X")) {
            if (B22.getText().equals("X")) {
                if (B31.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B13,B22,B31);
                    return true;
                }
            }
        }

        if (B13.getText().equals("X")) {
            if (B23.getText().equals("X")) {
                if (B33.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B13,B23,B33);
                    return true;
                }
            }
        }

        if (B31.getText().equals("X")) {
            if (B32.getText().equals("X")) {
                if (B33.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B31,B32,B33);
                    return true;
                }
            }
        }

        if (B21.getText().equals("X")) {
            if (B22.getText().equals("X")) {
                if (B23.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B21,B22,B23);
                    return true;
                }
            }
        }
        if (B12.getText().equals("X")) {
            if (B22.getText().equals("X")) {
                if (B32.getText().equals("X")) {
                    player1won = true;
                    player2won = false;
                    playerchance.setText("PLAYER 1 HAS WON!!");
                    changeButtonColor(B12,B22,B32);
                    return true;
                }
            }
        }
        if (B11.getText().equals("O")) {
            if (B21.getText().equals("O")) {
                if (B31.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B11,B21,B31);
                    return true;
                }
            }
        }

        if (B11.getText().equals("O")) {
            if (B22.getText().equals("O")) {
                if (B33.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B11,B22,B33);
                    return true;
                }
            }
        }

        if (B11.getText().equals("O")) {
            if (B12.getText().equals("O")) {
                if (B13.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B11,B12,B13);
                    return true;
                }
            }
        }

        if (B13.getText().equals("O")) {
            if (B22.getText().equals("O")) {
                if (B31.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B13,B22,B31);
                    return true;
                }
            }
        }

        if (B13.getText().equals("O")) {
            if (B23.getText().equals("O")) {
                if (B33.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B13,B23,B33);
                    return true;
                }
            }
        }

        if (B31.getText().equals("O")) {
            if (B32.getText().equals("O")) {
                if (B33.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B31,B32,B33);
                    return true;
                }
            }
        }

        if (B21.getText().equals("O")) {
            if (B22.getText().equals("O")) {
                if (B23.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B21,B22,B23);
                    return true;
                }
            }
        }
        if (B12.getText().equals("O")) {
            if (B22.getText().equals("O")) {
                if (B32.getText().equals("O")) {
                    player1won = false;
                    player2won = true;
                    playerchance.setText("PLAYER 2 HAS WON!!");
                    changeButtonColor(B12,B22,B32);
                    return true;
                }
            }
        }

        if(player1won==false && player2won==false){
            return false;
        }

        if(n>=9 && player1won==false && player2won==false){
            playerchance.setText("GAME DRAW");
            return true;
        }

        return false;
    }

    public static void changeButtonColor(Button B1,Button B2,Button B3){
        B1.setBackgroundColor(Color.parseColor("black"));
        B2.setBackgroundColor(Color.parseColor("black"));
        B3.setBackgroundColor(Color.parseColor("black"));
    }

    }

