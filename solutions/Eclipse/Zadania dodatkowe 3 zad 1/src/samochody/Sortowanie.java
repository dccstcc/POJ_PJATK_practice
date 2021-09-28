package samochody;

public class Sortowanie  {
	private String sortowaniePo;
	ZbiorAut ogloszeniaSort;
	
	Sortowanie() {
		
	}
	
	Sortowanie (ZbiorAut ogloszenia, String ASC_DESC, String sortowaniePo) {
		ogloszeniaSort = ogloszenia;
		this.sortowaniePo = sortowaniePo;
		if (ASC_DESC == "ASC") {
			sortujRosnaco(sortowaniePo);
		}
		else if (ASC_DESC == "DESC") {
			sortujMalejaco(sortowaniePo);
		}
	}
	
	public void sortujRosnaco( String sortowaniePo ) {
		switch (sortowaniePo) {
		case "cena" : {
			// sortowanie babelkowe po atrybucie: cena
			Samochod samochodCenaTemp;
			for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
				for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
					if (ogloszeniaSort.getAuta().get(j).getCena() > ogloszeniaSort.getAuta().get(j+1).getCena()) {
						//zamiana miejscami obiektów typu Samochod
						samochodCenaTemp = ogloszeniaSort.getAuta().get(j);
						ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
						ogloszeniaSort.getAuta().set(j+1, samochodCenaTemp);
					}
				}
			}
			System.out.println("<><><>SORTOWANIE OGLOSZEN PO CENIE ROSNACO<><><>");
			System.out.println("");
			ogloszeniaSort.wyswietlWszystkie();
			break;
		}
		case "rocznik" : {
			//sortowanie babelkowe po atrybucie : rocznik
			Samochod samochodRocznikTemp;
			for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
				for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
					//uzycie funkcji after() aby porownac daty
					if (ogloszeniaSort.getAuta().get(j).getRocznikDate().after(ogloszeniaSort.getAuta().get(j+1).getRocznikDate())) {
						//zamiana miejscami obiektów typu Samochod
						samochodRocznikTemp = ogloszeniaSort.getAuta().get(j);
						ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
						ogloszeniaSort.getAuta().set(j+1, samochodRocznikTemp);
					}
				}
			}
			System.out.println("<><><>SORTOWANIE OGLOSZEN PO DACIE PRODUKCJI ROSNACO<><><>");
			System.out.println("");
			ogloszeniaSort.wyswietlWszystkie();
			break;
		}
		case "data ogloszenia" : {
			//sortowanie babelkowe po atrybucie : dataOgloszenia
			Samochod samochodDataOgloszeniaTemp;
			for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
				for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
					//uzycie funkcji after() aby porownac daty
					if (ogloszeniaSort.getAuta().get(j).getDataOgloszeniaDate().after(ogloszeniaSort.getAuta().get(j+1).getDataOgloszeniaDate())) {
						//zamiana miejscami obiektów typu Samochod
						samochodDataOgloszeniaTemp = ogloszeniaSort.getAuta().get(j);
						ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
						ogloszeniaSort.getAuta().set(j+1, samochodDataOgloszeniaTemp);
					}
				}
			}
			System.out.println("<><><>SORTOWANIE OGLOSZEN PO DACIE DODANIA OGLOSZENIA ROSNACO<><><>");
			System.out.println("");
			ogloszeniaSort.wyswietlWszystkie();
			break;
		}
		case "przebieg" : {
			//sortowanie babelkowe po atrybucie : przebieg
			Samochod samochodPrzebiegTemp;
			for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
				for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
					//uzycie funkcji after() aby porownac daty
					if (ogloszeniaSort.getAuta().get(j).getPrzebieg() > ogloszeniaSort.getAuta().get(j+1).getPrzebieg()) {
						//zamiana miejscami obiektów typu Samochod
						samochodPrzebiegTemp = ogloszeniaSort.getAuta().get(j);
						ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
						ogloszeniaSort.getAuta().set(j+1, samochodPrzebiegTemp);
					}
				}
			}
			System.out.println("<><><>SORTOWANIE OGLOSZEN PO PRZEBIEGU AUTA ROSNACO<><><>");
			System.out.println("");
			ogloszeniaSort.wyswietlWszystkie();
			break;
		}
		}
	}
		
		public void sortujMalejaco (String sortowaniePo) {
			switch (sortowaniePo) {
			case "cena" : {
				// sortowanie babelkowe po atrybucie: cena
				Samochod samochodCenaTemp;
				for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
					for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
						if (ogloszeniaSort.getAuta().get(j).getCena() < ogloszeniaSort.getAuta().get(j+1).getCena()) {
							//zamiana miejscami obiektów typu Samochod
							samochodCenaTemp = ogloszeniaSort.getAuta().get(j);
							ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
							ogloszeniaSort.getAuta().set(j+1, samochodCenaTemp);
						}
					}
				}
				System.out.println("<><><>SORTOWANIE OGLOSZEN PO CENIE MALEJACO<><><>");
				System.out.println("");
				ogloszeniaSort.wyswietlWszystkie();
				break;
			}
			case "rocznik" : {
				//sortowanie babelkowe po atrybucie : rocznik
				Samochod samochodRocznikTemp;
				for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
					for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
						//uzycie funkcji before() aby porownac daty
						if (ogloszeniaSort.getAuta().get(j).getRocznikDate().before(ogloszeniaSort.getAuta().get(j+1).getRocznikDate())) {
							//zamiana miejscami obiektów typu Samochod
							samochodRocznikTemp = ogloszeniaSort.getAuta().get(j);
							ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
							ogloszeniaSort.getAuta().set(j+1, samochodRocznikTemp);
						}
					}
				}
				System.out.println("<><><>SORTOWANIE OGLOSZEN PO DACIE PRODUKCJI MALEJACO<><><>");
				System.out.println("");
				ogloszeniaSort.wyswietlWszystkie();
				break;
			}
			case "data ogloszenia" : {
				//sortowanie babelkowe po atrybucie : dataOgloszenia
				Samochod samochodDataOgloszeniaTemp;
				for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
					for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
						//uzycie funkcji before() aby porownac daty
						if (ogloszeniaSort.getAuta().get(j).getDataOgloszeniaDate().before(ogloszeniaSort.getAuta().get(j+1).getDataOgloszeniaDate())) {
							//zamiana miejscami obiektów typu Samochod
							samochodDataOgloszeniaTemp = ogloszeniaSort.getAuta().get(j);
							ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
							ogloszeniaSort.getAuta().set(j+1, samochodDataOgloszeniaTemp);
						}
					}
				}
				System.out.println("<><><>SORTOWANIE OGLOSZEN PO DACIE DODANIA OGLOSZENIA MALEJACO<><><>");
				System.out.println("");
				ogloszeniaSort.wyswietlWszystkie();
				break;
			}
			case "przebieg" : {
				//sortowanie babelkowe po atrybucie : przebieg
				Samochod samochodPrzebiegTemp;
				for (int i = 0; i < ogloszeniaSort.getAuta().size() -1; i++) {
					for (int j = 0; j < ogloszeniaSort.getAuta().size() -1; j++) {
						//uzycie funkcji after() aby porownac daty
						if (ogloszeniaSort.getAuta().get(j).getPrzebieg() < ogloszeniaSort.getAuta().get(j+1).getPrzebieg()) {
							//zamiana miejscami obiektów typu Samochod
							samochodPrzebiegTemp = ogloszeniaSort.getAuta().get(j);
							ogloszeniaSort.getAuta().set(j, ogloszeniaSort.getAuta().get(j+1));
							ogloszeniaSort.getAuta().set(j+1, samochodPrzebiegTemp);
						}
					}
				}
				System.out.println("<><><>SORTOWANIE OGLOSZEN PO PRZEBIEGU AUTA MALEJACO<><><>");
				System.out.println("");
				ogloszeniaSort.wyswietlWszystkie();
				break;
			}
			}
		
		}
		
	}
	

