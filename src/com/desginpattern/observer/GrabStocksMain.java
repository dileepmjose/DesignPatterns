package com.desginpattern.observer;

public class GrabStocksMain {

	public static void main(String[] args) {
		
		StockGrabber stockgrabber1 = new StockGrabber();		
		StockObserver observer1 = new StockObserver(stockgrabber1);
		stockgrabber1.setIbmprice(188);
		stockgrabber1.setAalprice(800);
		stockgrabber1.setGoogleprice(499);
		
		
				
		StockGrabber stockgrabber2 = new StockGrabber();		
		StockObserver observer2 = new StockObserver(stockgrabber2);
		stockgrabber2.setIbmprice(200);
		stockgrabber2.setAalprice(100);
		stockgrabber2.setGoogleprice(100);
		
		
		stockgrabber1.setIbmprice(19283);		
		stockgrabber2.setAalprice(1000);		
		stockgrabber1.unregister(observer1);		
		stockgrabber1.setGoogleprice(19283);		
		stockgrabber2.setGoogleprice(900);
	
		
		
	}

}
