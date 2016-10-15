package com.thorindev;

public class ElectronConfig {
	
	/**
	 * @author thorindev
	 * @since 2016
	 * @param electron The amount of electrons in the atom that you want to find the electronic configuration for.
	 * @return A String that will looks like "2.8.8" if your amount of electrons is 18
	 */
	public String electronicConfig(int electron) {
		StringBuilder sb = new StringBuilder();
		if(isNeg(electron) == false) {
			int fsr = electron - 2;
			if(isNeg(fsr)) { // this will be only equal for H and He
				sb.append(electron);
			} else {
				sb.append(2);
				if(fsr % 8 == 0) { //electron - 2 is a multiple of 8
					int y = fsr/8;
					for(int i = 0; i < y; i++) {
						sb.append(".8");
					}
				} else {
					int a = fsr/8;
					int b = fsr % 8;
					for(int i = 0; i < a; i++) {
						sb.append(".8");
					}
					sb.append("." + b);
				}
			}
		} else {
			sb.append("Please don't use negative numbers, they make the program sad. :(");
		}
		return sb.toString();
	}
	
	public boolean isNeg(int n) {
		return (n < 0 || n == 0 ) ? true : false;
	}

}
