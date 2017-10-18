package com.bridgelabz.datastructureprogram.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.datastructureprogram.utility.Hashfunction;
import com.bridgelabz.datastructureprogram.utility.Utility;

public class HashingFunction {
	public static void main(String[] args) {
		System.out.println("Program Started.");
		Utility u=new Utility();
		Hashfunction hashFun=new Hashfunction();
		Scanner scan=new Scanner(System.in);
		String file="/home/bridgeit/Deepak Programs/DataStructureProgram/Hashing Function";
		String string=u.fileReader(file);
		hashFun.hashingfunction(string, file);
		System.out.println("Program Ended.");
	}
}
