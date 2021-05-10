package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English marks: ");
        int eng = sc.nextInt();
        System.out.println("Enter Maths marks: ");
        int math = sc.nextInt();
        System.out.println("Enter Science marks: ");
        int sci = sc.nextInt();
        System.out.println("Enter History marks: ");
        int his = sc.nextInt();
        System.out.println("Enter Geography marks: ");
        int geo = sc.nextInt();

        int total = eng + math + sci + his + geo;
        System.out.println(total);

        float percent = (total / 500.0f) * 100;
        System.out.println(percent);
    }
}
