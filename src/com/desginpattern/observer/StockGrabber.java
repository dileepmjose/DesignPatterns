package com.desginpattern.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmprice;
	private double aalprice;
	private double googleprice;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println(".....deleted observer..." + observerIndex + 1);
		observers.remove(observerIndex);
	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmprice, aalprice, googleprice);
		}
	}

	public void setIbmprice(double newibmprice) {
		this.ibmprice = newibmprice;
		notifyObserver();
	}

	public void setAalprice(double newaalprice) {
		this.aalprice = newaalprice;
		notifyObserver();
	}

	public void setGoogleprice(double newgoogleprice) {
		this.googleprice = newgoogleprice;
		notifyObserver();
	}

}
