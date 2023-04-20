package com.otus.homework.task3.oop;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Exercise question1 = new Exercise(new String("If the special operation is still on, we`ll have to ... our country."), new String[] {"leave","stay","relax"},1);
        Exercise question2 = new Exercise("I wish i would stop doomscrolling and ... with my homework.",new String[] {"get down","get on", "come on"},2);
        Exercise question3 = new Exercise("We ... take care of your mental health. ",new String[]{"must" , "forget" , "should"},3);
    Exercise[] exercises = new Exercise[]{
            question1,question2, question3

    };
       int wrongCount = 0;
       int correctCount =0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<exercises.length;i++){
            System.out.println(exercises[i].question);
            for (int j = 0; j < exercises[i].answers.length; j++) {
                System.out.println((j + 1) + " " +exercises[i].answers[j]);
            }
            System.out.println("Your answer: ");

            int answer = scanner.nextInt();
           if (answer == exercises[i].correctAnswers) {
               correctCount = correctCount + 1;
           }else {
           wrongCount = wrongCount+1;
           }
            System.out.println();
        }
        System.out.println(  "Result: " + "\n"+ "correct " + correctCount + "\n"+ "incorrect " + wrongCount);

    }
}
