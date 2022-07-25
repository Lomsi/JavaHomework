package Lessons;

import java.util.Scanner;

public class L2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your year of birth: ");
        Float yob = sc.nextFloat();
        Float cy = (float) (2022.6);
        Float age = (float) (cy - yob);

        System.out.println(name + "'s age is" + " " + age);

    }

}
