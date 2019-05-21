package com.vektorel;

public class Runner3 {

	public static void main(String[] args) {
		
		int sayi1=34,sayi2=454;
		
		int toplam,fark,carpim;
		double bolum;
		toplam = sayi1 + sayi2;
		fark = sayi1 - sayi2 ;
		carpim = sayi1 * sayi2;
		bolum = (double)sayi2 / sayi1;
		
		System.out.println("***** ISLEMLER *******");
		System.out.println("Toplam....: "+ toplam);
		System.out.println("Fark......: "+ fark);
		System.out.println("Carpim....: "+ carpim);
		System.out.println("Bolum.....: "+ bolum);

	}

}
