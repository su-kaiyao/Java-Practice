package com.susu.designpatterns.guanchazhe;

public interface Subject {

	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObserver(String str);

}
