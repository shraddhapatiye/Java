package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
//import com.voterapp.exception.LocalityNotFoundException;
//import com.voterapp.exception.NoVoterIdException;
//import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothImpl;

public class Voter {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("Enter Locality:  ");
			String locality=sc.nextLine();
			
			System.out.println("Enter Age:  ");
			int age=sc.nextInt();
			
			
			
			System.out.println("Enter voter id:  ");
			int vid=sc.nextInt();
			
			
			
			ElectionBoothImpl eb = new ElectionBoothImpl();
			
			System.out.println(eb.checkEligibility(age, locality, vid));
		
		} catch (InValidVoterException e) {
			System.out.println(e.getMessage());
		}
			sc.close();
		}
}
