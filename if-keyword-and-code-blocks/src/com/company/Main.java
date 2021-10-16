package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int positionA = calculateHighScorePosition(1500);
        int positionB = calculateHighScorePosition(900);
        int positionC = calculateHighScorePosition(400);
        int positionD = calculateHighScorePosition(50);

        displayHighScorePosition("Jogador A", positionA);
        displayHighScorePosition("Jogador B", positionB);
        displayHighScorePosition("Jogador C", positionC);
        displayHighScorePosition("Jogador D", positionD);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("The player " + playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) return 1;
        if (score >= 500) return 2;
        if (score >= 100) return 3;
        return 4;

    }
}
