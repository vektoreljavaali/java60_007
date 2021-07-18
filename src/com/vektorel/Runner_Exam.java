package com.vektorel;

import java.util.Scanner;

public class Runner_Exam {

	public static void main(String[] args) {
	
		// Temel Parameterler
		// 1- Topla,��kart,Fark,�arp,B�l
		int sayi1=0,sayi2=0;
		String ifade1 = "8 ile 5 in �arp�m� nedir?";
		String ifade2 = "burada ne i�in var 3 �n 8 ile toplam� nedir?";
		Scanner sc = new Scanner(System.in);
		System.out.print("L�tfen soruyu giriniz..: ");
		ifade2 = sc.nextLine();
		// Yukar�da ki gibi ifade edilen bir metinde
		// ilgili parameterler de kullan�larak
		// i�lemin sonucunu bulan kodu yaz�n�z.
		int sayac=0;
		for (int i = 0; i < ifade2.length(); i++) {
			int ic = ifade2.charAt(i);
			if(ic>=48 && ic<=57) {
				if(sayac==0) {
					// ilk say�d�r.
					System.out.println("ilk say�....: "+ ifade2.charAt(i));
					// char -> int
					// Char -> numerik
					// Intger -> string int
					sayi1 = Character.getNumericValue(ifade2.charAt(i));
					//sayi1 = Integer.parseInt(String.valueOf(ifade2.charAt(i)));
					sayac++;
				}else {
					// ikinci say�
					System.out.println("ikinci say�....: "+ ifade2.charAt(i));
					sayi2 = Character.getNumericValue(ifade2.charAt(i));
				}
			}				
		}		
		// 1-> toplama, 2->��kartma, 3-> �arpma, 4->b�lme		
		int islem =1;
		// �arp�m�, �ArP�mI
		if(ifade2.toUpperCase().contains("TOPLA")) islem=1;
		else if(ifade2.toUpperCase().contains("FARK")) islem=2;
		else if(ifade2.toUpperCase().contains("�IKART")) islem=2;
		else if(ifade2.toUpperCase().contains("�ARP")) islem=3;
		else if(ifade2.toUpperCase().contains("B�L")) islem=4;
		
		switch (islem) {
		case 1: System.out.println("�ki say�n�n toplam�..: "+ (sayi1+sayi2));break;
		case 2: System.out.println("�ki say�n�n fark�....: "+ (sayi1-sayi2));break;
		case 3: System.out.println("�ki say�n�n �arp�m�..: "+ (sayi1*sayi2));break;
		case 4: System.out.println("�ki say�n�n b�l�m�...: "+ (sayi1/sayi2));break;
		default:
			System.out.println("Ge�ersiz i�lem");
		}
		
	}//Method Sonu
}// Class Sonu
