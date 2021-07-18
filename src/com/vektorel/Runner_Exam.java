package com.vektorel;

import java.util.Scanner;

public class Runner_Exam {

	public static void main(String[] args) {
	
		// Temel Parameterler
		// 1- Topla,Çýkart,Fark,Çarp,Böl
		int sayi1=0,sayi2=0;
		String ifade1 = "8 ile 5 in çarpýmý nedir?";
		String ifade2 = "burada ne iþin var 3 ün 8 ile toplamý nedir?";
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen soruyu giriniz..: ");
		ifade2 = sc.nextLine();
		// Yukarýda ki gibi ifade edilen bir metinde
		// ilgili parameterler de kullanýlarak
		// iþlemin sonucunu bulan kodu yazýnýz.
		int sayac=0;
		for (int i = 0; i < ifade2.length(); i++) {
			int ic = ifade2.charAt(i);
			if(ic>=48 && ic<=57) {
				if(sayac==0) {
					// ilk sayýdýr.
					System.out.println("ilk sayý....: "+ ifade2.charAt(i));
					// char -> int
					// Char -> numerik
					// Intger -> string int
					sayi1 = Character.getNumericValue(ifade2.charAt(i));
					//sayi1 = Integer.parseInt(String.valueOf(ifade2.charAt(i)));
					sayac++;
				}else {
					// ikinci sayý
					System.out.println("ikinci sayý....: "+ ifade2.charAt(i));
					sayi2 = Character.getNumericValue(ifade2.charAt(i));
				}
			}				
		}		
		// 1-> toplama, 2->çýkartma, 3-> çarpma, 4->bölme		
		int islem =1;
		// Çarpýmý, çArPýmI
		if(ifade2.toUpperCase().contains("TOPLA")) islem=1;
		else if(ifade2.toUpperCase().contains("FARK")) islem=2;
		else if(ifade2.toUpperCase().contains("ÇIKART")) islem=2;
		else if(ifade2.toUpperCase().contains("ÇARP")) islem=3;
		else if(ifade2.toUpperCase().contains("BÖL")) islem=4;
		
		switch (islem) {
		case 1: System.out.println("Ýki sayýnýn toplamý..: "+ (sayi1+sayi2));break;
		case 2: System.out.println("Ýki sayýnýn farký....: "+ (sayi1-sayi2));break;
		case 3: System.out.println("Ýki sayýnýn çarpýmý..: "+ (sayi1*sayi2));break;
		case 4: System.out.println("Ýki sayýnýn bölümü...: "+ (sayi1/sayi2));break;
		default:
			System.out.println("Geçersiz iþlem");
		}
		
	}//Method Sonu
}// Class Sonu
