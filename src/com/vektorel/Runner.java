package com.vektorel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		String ifade = "bugün sýnýfýmýz deðiþti, çok mutluyuz :)";
		// Bir String ifadeye diðer bir String ifadeyi eklemek için
		// kullanýlýr.
		System.out.println(ifade.concat("bugün 1254"));
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
			System.out.println("Giriþ Yapýldý");
		else
			System.err.println("Kullanýcý Adý ya da þifre Hatalý");
		ifade = "Arkadaþlar Teneffüs olacak birazdan";
		System.out.println(ifade);
		// Bir String ifade de ki tüm harfleri büyük harf yapar
		System.out.println(ifade.toUpperCase());
		// bir String ifade de ki tüm harflari küçük harf yapar.
		System.out.println(ifade.toLowerCase());
		// tr -> i = Ý // en i = I
		//ifade.toLowerCase(locale)
	    String kullaniciadi = "  Muhammet Hoca   ";
	    // Bir String ifade içinde baþýndaki ve sonundaki boþluklarý
	    // kýrpmak için kullanýlýr.
		if(kullaniciadi.trim().equals("Muhammet Hoca"))
			System.out.println("Giriþ Yapýldý");    
		
	}//Method Sonu
}//Class Sonu
