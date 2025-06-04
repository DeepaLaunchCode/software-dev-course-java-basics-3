package org.example;

public class Main {
    public static void main(String[] args) {
     //   JavaCafe javaCafe = new JavaCafe();
      //  javaCafe.run();
    ConditionalExercises conditional= new ConditionalExercises();
    System.out.println("Is 7 number less than 5 :"+conditional.lessThanFive(7));
        System.out.println("Your age is 38 , you are :"+conditional.getAgeGroup(38));
        System.out.println("Is  MyPassword1 is valid password :"+conditional.isValidPassword("MyPassword1"));
        LoopExercises loopExercises= new LoopExercises();
        System.out.println("Sum of number till 7  :"+loopExercises.sum(7));

        System.out.println("Sum of number till   :"+loopExercises.sumUntilEven(7));



    }
}
