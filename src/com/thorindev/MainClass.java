package com.thorindev;

public class MainClass {
	
	ElectronConfig ec = new ElectronConfig();

	public static void main(String[] args) {
		for(int i = 1; i <= 50; i++) { //This will cycle through the first 50 atoms and return their electronic config
			System.out.println(ec.electronicConfig(i));
		}
	}

}
