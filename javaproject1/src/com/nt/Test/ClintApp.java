package com.nt.Test;

import java.util.Scanner;

import com.nt.target.Vehicle;
import com.nt.vehiclefactory.VehicleFactory;

public class ClintApp {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("which engine u start ");
		System.out.println("1 cng");
		System.out.println("2 petrol");
		System.out.println("3 diesel");
		Vehicle vic=VehicleFactory.getInstance(scr.nextLine());
		vic.move("Bhopal","Patna");

	}

}
