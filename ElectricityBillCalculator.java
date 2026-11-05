/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electricitybillcalculator;
import java.util.Scanner;
/**
 *
 * @author Arellano_CPE113
 */
public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Electricity Consumption (kWh): ");
        double consumption = input.nextDouble();
        
        System.out.println("Enter rate per kWh: ");
        double rate = input.nextDouble();
        
        System.out.println("Enter addtional charge percentage: ");
        double percentage = input.nextDouble();
        
        double consumptionCharge = calculateConsumptionCharge(consumption, rate);
        double additionalCharge = calculateAdditionalCharge(consumptionCharge, percentage);
        double totalBill =  calculateTotalBill(consumptionCharge, additionalCharge);
        
        System.out.println("Consumption Charge: Php " + consumptionCharge );
        System.out.println("Additional Charge: Php " + additionalCharge);
        System.out.println("Total bill: Php " + totalBill);
    }
    
    static double calculateConsumptionCharge(double consumption, double rate){
        return consumption * rate;
    }
    
    static double calculateAdditionalCharge(double consumptionCharge, double percentage ){
        return consumptionCharge * (percentage / 100);
    }
    
    static double calculateTotalBill(double consumptionCharge, double additionalCharge){
        return consumptionCharge + additionalCharge;
    }
    
}
