package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		String ifade = "bug�n s�n�f�m�z de�i�ti, �ok mutluyuz :)";
		// Bir String ifadeye di�er bir String ifadeyi eklemek i�in
		// kullan�l�r.
		System.out.println(ifade.concat("bug�n 1254"));
		System.out.println(ifade + " *** yeni eklenen");
		ifade = ifade.concat("ekledim");
		System.out.println(ifade);
		
		// kullaniciadi= "admin";
		// sifre = "123";
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("****   LOGIN PAGE   ***");
		System.out.println("***********************");
		System.out.println();
		System.out.print("UserName...: ");
		String username = sc.nextLine();
		System.out.print("Password...: ");
		String password = sc.nextLine();
		// equals
		// if(username=="admin" && password=="123") HATALI
		if(username.equals("admin") && password.equals("123"))
			System.out.println("Giri� Yap�ld�");
		else
			System.err.println("Kullan�c� Ad� ya da �ifre Hatal�");
		ifade = "Arkada�lar Teneff�s olacak birazdan";
		System.out.println(ifade);
		// Bir String ifade de ki t�m harfleri b�y�k harf yapar
		System.out.println(ifade.toUpperCase());
		// bir String ifade de ki t�m harflari k���k harf yapar.
		System.out.println(ifade.toLowerCase());
		// tr -> i = � // en i = I
		//ifade.toLowerCase(locale)
	    String kullaniciadi = "  Muhammet Hoca   ";
	    // Bir String ifade i�inde ba��ndaki ve sonundaki bo�luklar�
	    // k�rpmak i�in kullan�l�r.
		if(kullaniciadi.trim().equals("Muhammet Hoca"))
			System.out.println("Giri� Yap�ld�");    
		
	}//Method Sonu
}//Class Sonu
