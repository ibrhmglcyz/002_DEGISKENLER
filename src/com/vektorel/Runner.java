package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		int sayi1,sayi2,sayi3,toplam;
		
		int sayi4 = 5;
		int sayi5;
		
		sayi5 = 1212;
	 
		int sayi6=45,sayi7=55;
				
		
		// Tam Sayi Degiskenleri
		
		// -128  127 deger 
		byte sayi_byte=127;
		
		// -32,768 : 32,767
		short sayi_short = 25;
		
		// -2,147,483,648 : 2,147,483,647
		int sayi_int = 129;
		
		// L
		long sayi_long = 129L;
		
		//sayi_int = sayi_byte;
		sayi_byte = (byte)sayi_int;
		
		// 32 Bit deger alir. F - f
		float deger_float = 12548.445f;
		
		// 64 bit deger
		double deger_double = 234242324.4233;
		
		// 1 bit deger alir -> true & false
		boolean durum = false;
		
		durum = true;
		
		char karakter = '?';
		
		karakter = '?';
		
		String ad = "5455545465";
		
		//int sayi = (int)ad;
		System.out.print("Karakter Degeri...: ");
		System.out.println(karakter);
		

	}

}
