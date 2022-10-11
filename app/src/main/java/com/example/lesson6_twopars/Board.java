package com.example.lesson6_twopars;

import java.util.Stack;

public class Board {
    private int stepsCount;
    private int stepsFinish;
    private boolean winOrLose;
    private Couples[] openCouples;
    private int[][] board = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private int[] cards = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};

    public Board() {
        int tempNumber;
        int add = 0;
        int i = 0, j = 0;
        int finish =0;
        while (this.board[i][j] == 0) {
            tempNumber = (int) (Math.random() * 12);
            if (cards[tempNumber] != 0) {
                this.board[i][j] = cards[tempNumber];
                cards[tempNumber] = 0;
            } else {
                tempNumber = 0;
              while (cards[add]==0){
                  add++;
              }
                tempNumber = add;
                this.board[i][j] = cards[tempNumber];
                cards[tempNumber] = 0;
            }
            j++;
            if (j>3){
                i++;
                j=0;
            }
            if (i>3){
                break;
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }
}
