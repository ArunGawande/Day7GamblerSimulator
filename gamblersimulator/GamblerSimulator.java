package com.bridgelabz.gamblersimulator;

public class GamblerSimulator
{
    public static final double INITIAL_STAKE = 100;
    public static final double STAKE_BET = 1;
    public static int stake = 0;

    public static void winOrLose() {

        if(Math.random()<0.5) {
            stake++;
            System.out.println("Win");;
        }
        else {
            stake --;
            System.out.println("Lose");

        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome To Gambler Simulation");
        winOrLose();

    }
}
