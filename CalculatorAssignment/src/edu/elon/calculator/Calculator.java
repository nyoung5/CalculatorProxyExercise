package edu.elon.calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

//TODO change calculate to methods we need
public interface Calculator {

	public interface Product extends Remote {

		  String calculate(String toCalculate) throws RemoteException;

		}
	
}
