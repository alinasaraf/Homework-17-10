package com.otus.homework.task2.arrays;
import java.util.Scanner;
public class Test {

    // переписать в стиле ООП (классы)
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        String[] questions = new String[3];
        questions[0] = "If the special operation is still on, we`ll have to ... our country.";
        questions[1] = "I wish i would stop doomscrolling and ... with my homework.";
        questions[2] = "We ... take care of your mental health. ";

        String[][] answerOptions = new String[3][];

        String[] answer1 = new String[3];
        answer1[0] = "leave";
        answer1[1] = "stay";
        answer1[2] = "relax";

        answerOptions[0] = answer1;


        String[] answer2 = new String[3];
        answer2[0] = "get down";
        answer2[1] = "get on";
        answer2[2] = "come on";

        answerOptions[1] = answer2;

        answerOptions[2] = new String[]{
                "must" , "forget" , "should"

        };

        int[] correctAnswers = new int[]{
                1,2,3
        };

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions.length; j++) {
                System.out.println((j + 1) + " " + answerOptions[i][j]);
            }

            System.out.println("Your answer: ");
            int answer = scanner.nextInt();
            if (correctAnswers[i] == answer) {
                correctCount = correctCount + 1;
            } else {
                wrongCount += 1;
            }

            System.out.println();
        }

        System.out.println("Result: correct " + correctCount + "\n"+ "incorrect " + wrongCount);
    }
}
