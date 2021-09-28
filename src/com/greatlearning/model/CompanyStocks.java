package com.greatlearning.model;


public class CompanyStocks {

	private int noOfCompanies;
	private double stockPrice[];
	private boolean stockPriceIncr[];
	
	public int getNoOfCompanies() {
		return noOfCompanies;
	}
	public void setNoOfCompanies(int noOfCompanies) {
		this.noOfCompanies = noOfCompanies;
	}
	public double[] getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double[] stockPrice) {
		this.stockPrice = stockPrice;
	}
	public boolean[] getStockPriceIncr() {
		return stockPriceIncr;
	}
	public void setStockPriceIncr(boolean[] stockPriceIncr) {
		this.stockPriceIncr = stockPriceIncr;
	}
	
	public CompanyStocks() {
		
	}
	public CompanyStocks(int noOfCompanies, double[] stockPrice, boolean[] stockPriceIncr) {
		super();
		this.noOfCompanies = noOfCompanies;
		this.stockPrice = stockPrice;
		this.stockPriceIncr = stockPriceIncr;
	}
	
	
	
}
