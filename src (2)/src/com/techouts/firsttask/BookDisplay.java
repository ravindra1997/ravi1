package com.techouts.firsttask;

public class BookDisplay {
	public void displayBook() {

		BookStore bookStore = new BookStore();
		bookStore.horror.put(1, "Mummy");
		bookStore.horror.put(2, "Annabelle");
		bookStore.horror.put(3, "TheNun");
		bookStore.horror.put(4, "It");

		bookStore.sup.put(1, "CivilWar");
		bookStore.sup.put(2, "Avengers");
		bookStore.sup.put(3, "EndGame");
		bookStore.sup.put(4, "Marvel comics");
		bookStore.sup.put(5, "Thonos rage");

		bookStore.thr.put(1, "Inception");
		bookStore.thr.put(2, "intersteller");
		bookStore.thr.put(3, "GoneGirl");

		bookStore.genre();

	}

}
