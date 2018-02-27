package com.desginpattern.observer;

public class StockObserver implements Observer {

	private double ibmprice;
	private double aalprice;
	private double googleprice;
	private static int observerTrackerId;
	private int observerid;
	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerid = ++observerTrackerId;
		System.out.println("...new Observor......" + observerid);
		stockGrabber.register(this);
	}

	public void update(double ibmprice, double aalprice, double googleprice) {
		this.ibmprice = ibmprice;
		this.aalprice = aalprice;
		this.googleprice = googleprice;
		printPrice();
	}

	private void printPrice() {
		System.out.println("====>Obsever" + observerid + "----ibmprice----"
				+ ibmprice + "----aalprice----" + aalprice
				+ "----googleprice----" + googleprice);
	}

}
