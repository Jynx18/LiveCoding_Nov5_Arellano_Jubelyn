/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraystatisticsanalyzer;
import java.util.Scanner;
/**
 *
 * @author Arellano_CPE113
 */
public class ArrayStatisticsAnalyzer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of scores: ");
        int size = input.nextInt();
        
        if(size <= 0){
            System.out.println("Invalid array size.");
        } else{
            int[] scores = new int[size];
            
            for (int i = 0; i < scores.length; i++) {
                System.out.println("Enter Score" + (i + 1) + ": ");
                scores[i] = input.nextInt();
            }
            
            int sum = calculateSum(scores);
            double average = calculateAverage(scores);
            int highest = findHighest(scores);
            int lowest = findLowest(scores);
            int passing = countPassing(scores);
            
            System.out.println("====== ARRAY STATISTICS ======");
            
            System.out.println("Total number of scores: " + scores.length);
            System.out.println("Sum of scores: " + sum);
            System.out.println("Average score: " + average);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
            System.out.println("Number of Passing students: " + passing);
        }
        input.close();
    }
    static int calculateSum(int[] scores){
         int sum = 0;
         
         for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i]; 
        }
         return sum;
    }
    
    static double calculateAverage(int[] scores){
        int sum = calculateSum (scores);
        
        return (double) sum / scores.length;
    }
    
    static int findHighest(int[] scores){
        int highest = scores[0];
        
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > highest ){
                highest = scores[i];
            }
        }
        return highest;
    }
    
    static int findLowest(int[] scores){
        int lowest = scores[0];
        
        for (int i = 1; i < scores.length; i++) {
             if(scores[i] < lowest ){
                 lowest = scores[i];
             }
        }
        return lowest;
    }
    
    static int countPassing(int[] scores){
        int count = 0;
        
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= 75){
                count++;
            }
        }
        return count;
    }
}
