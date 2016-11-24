package org.formation.Rendu2411;

import static org.junit.Assert.*;

import org.junit.Test;

public class TirageAuSortTest {

	@Test
	public void TirageAuSort_Should_Return_False_When_Tirage_Is_0() {

		TirageAuSort tir = new TirageAuSort();
		Boolean u = false;
		Boolean result = tir.tirageAuSort();
		
		if (result) {
			u = true;
		}
		assertSame(u, result);

	}
}
