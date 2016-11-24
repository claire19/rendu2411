package org.formation.Rendu2411;

public class TirageAuSort implements ITirageAuSort {

	public boolean tirageAuSort() {

		double tirage = Math.random();
		if (tirage <= 0.5) {
			return false;
		} else
			return true;

	}

}
