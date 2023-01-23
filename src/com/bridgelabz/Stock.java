package com.bridgelabz;

    /*Create Stock and Stock Portfolio Class holding the list of Stocks read
    from the input file. Have functions in the Class to calculate the value of each
    stock and the value of total stocks.*/
public class Stock {

    public static void main(String[] args) {
        //Creating object
        StockPortfolio stockPortfolio = new StockPortfolio();
        //Calling non-static method using object
        stockPortfolio.stockDetails();
    }
}
