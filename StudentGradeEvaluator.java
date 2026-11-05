/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.live_coding;

import java.util.Scanner;

/**
 *
 * @author Arellano_CPE113
 */
public class StudentGradeEvaluator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter prelim grade: ");
        double grade1 = input.nextDouble();

        System.out.println("Enter midterm grade: ");
        double grade2 = input.nextDouble();

        System.out.println("Enter final grade: ");
        double grade3 = input.nextDouble();

        double average = calculateAverage(grade1, grade2, grade3);

        char grade = getGradeEquivalent(average);

        boolean passed = isPassed(average);

        System.out.println(" ====== STUDENT GRADE RESULT ====== ");
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        if (passed) {
            System.out.println("Status: PASSED ");
        } else {
            System.out.println("Status: FAILED ");
        }
        input.close();
    }

    static double calculateAverage(double prelim, double midterm, double finals) {
        return (prelim + midterm + finals) / 3;
    }

    static char getGradeEquivalent(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 85) {
            return 'B';
        } else if (average >= 80) {
            return 'C';
        } else if (average >= 75) {
            return 'D';
        } else {
            return 'F';
        }
    }

    static boolean isPassed(double average) {
        return average >= 75;
    }

}
