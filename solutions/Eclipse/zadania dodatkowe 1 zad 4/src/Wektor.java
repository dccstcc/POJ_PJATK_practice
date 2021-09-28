package wektor;

import java.util.*;

public class Wektor {
	 
	public ArrayList <Double> wektor  = new ArrayList<Double>();
	 
	 Wektor (int n) {
		 for(int i = 0; i<n; i++) {
			 wektor.add(0.0);
		 }
	 }
	 
	 Wektor (double tab[]) {
		 for(int i = 0; i<tab.length; i++) {
			 wektor.add(tab[i]);
		 }
	 }
	 
	 public double get(int i) {
		 return wektor.get(i);
	 }
	 
	 public void set(int i, double wartosc) {
		 wektor.add(i, wartosc);
	 }
	 
	 public double max() {
		 Object tabAsc[] = wektor.toArray();
		 Arrays.sort(tabAsc);
		 return (double) tabAsc[tabAsc.length-1];
	}
	 
	 public double min() {
		 Object tabAsc[] = wektor.toArray();
		 Arrays.sort(tabAsc);
		 return (double) tabAsc[0];
	 }
	 
	 public void add2v (ArrayList <Double> wektor2) {
		 int indeks;
		 if (wektor.size() > wektor2.size()) {
			 indeks =  wektor2.size();
		 }
		 else {
			 indeks =  wektor.size();
		 }
		 ArrayList <Double> wektorTemp = new ArrayList <Double> () ;
		 for (int i = 0; i<indeks; i++) {
			 wektorTemp.add((wektor.get(i)+(wektor2.get(i))));
		 }
		 wektor = wektorTemp;
	 }
	 
	 public int size() {
		 return wektor.size();
	 }
	 
	 public String toString() {
		 String string = "";
		 for (int i = 0; i<wektor.size(); i++) {
			string += wektor.get(i) + ", "; 			 
		 }
		 return string;
	 }
	 
	 public static void show (ArrayList <Double> array) {
		 for (int i = 0; i<array.size(); i++) {
			 System.out.print(array.get(i)+", ");
		 }
	 }
	 
	 public ArrayList <Double> sort (char plusminus) {
		 ArrayList <Double> arrayTemp = new ArrayList<Double>();
		 if (plusminus == '+') {
			 Object tabAsc[] = wektor.toArray();
			 Arrays.sort(tabAsc);
			 for (int i=0; i<tabAsc.length; i++) {
				 arrayTemp.add((double)tabAsc[i]);
			 }
		 }
		 else if(plusminus == '-') {
			 Object tabAsc[] = wektor.toArray();
			 Arrays.sort(tabAsc);
			 for (int i=tabAsc.length-1; i>=0; i--) {
				 arrayTemp.add((double)tabAsc[i]);
			 }
			 
		 }
		 return arrayTemp;
	 }
	 
	 
}

