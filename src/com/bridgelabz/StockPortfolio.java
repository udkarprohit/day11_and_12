package com.bridgelabz;

import java.util.*;

public class StockPortfolio {

    //Instance variables
    int numberOfStock = 0;
    String stockName = null;
    double numberOfShares = 0.0;
    double sharePrice = 0.0;
    double total = 0.0;
    double totalStock = 0.0;
    //Hasp Map
    HashMap<String, Double> hashMap = new HashMap<>();

    //Taking Stock Details
    void stockDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the Number Of Stocks : ");
        numberOfStock = scan.nextInt();
        for (int i = 1; i <= numberOfStock; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter The Stock Name : ");
            stockName = scanner.nextLine();
            System.out.print("No.of Shares : ");
            numberOfShares = scanner.nextDouble();
            System.out.print("Share Price : ");
            sharePrice = scanner.nextDouble();
            eachStockCalculate(stockName, numberOfStock, sharePrice);
//            System.out.println(totalStock);
//            System.out.println(totalStock);
//            System.out.println(totalStock);

        }
    }

    //Calculating each stock total
    void eachStockCalculate(String stockName, int numberOfStock, double sharePrice) {
//        System.out.println("Entered eachStockCalculate");
        total = numberOfStock * sharePrice;
        hashMap.put(stockName, total);
        System.out.println(total);
        totalStockCalculate(total);
    }

    //Calculating of total stock
    void totalStockCalculate(double total) {
//        System.out.println("entered  totalStockCalculate");
        totalStock += total;
        System.out.println(totalStock);

    }
}
