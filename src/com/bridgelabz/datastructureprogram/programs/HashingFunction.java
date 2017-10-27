package com.bridgelabz.datastructureprogram.programs;

import com.bridgelabz.datastructureprogram.utility.Hashfunction;
import com.bridgelabz.datastructureprogram.utility.Utility;

public class HashingFunction {
	public static void main(String[] args) {
		System.out.println("Program Started.");
		Utility utility=new Utility();
		Hashfunction hashFunction=new Hashfunction();
		String file="/home/bridgeit/Deepak Programs/DataStructureProgram/Hashing Function";
		String string=utility.fileReader(file);
		hashFunction.hashingfunction(string, file);
		System.out.println("Program Ended.");
	}
}
