package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Billy", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Joe", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("John", position);

    }

    public static void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int score){
//        if (score >= 1000){
//            return 1;
//        } else if (score >= 500){
//            return 2;
//        } else if (score >= 100){
//            return 3;
//        }
//            return 4;

        int position = 4; // assuming pos 4 will be returned

        if (score >= 1000){
            position = 1;
        } else if (score >= 500){
            position =  2;
        } else if (score >= 100){
            position = 3;
        }
            return position;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;
    }
}
