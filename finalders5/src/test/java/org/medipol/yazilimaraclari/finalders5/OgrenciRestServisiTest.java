package org.medipol.yazilimaraclari.finalders5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.medipol.yazilimaraclari.finalders5.OgrenciRestServisi.Ogrenci;

class OgrenciRestServisiTest {

	@Test
	void testAll() {
		
	}

	@Test
	void testNewEmployee() {
		// Given
		OgrenciRestServisi servis1=new OgrenciRestServisi();
		String adSoyad="adSoyad1";
		// When
		Ogrenci sonuc=servis1.newEmployee(adSoyad);
		
		//Then
		assertNotNull(sonuc);
		assertEquals(adSoyad,sonuc.getAdSoyad());
	}

	@Test
	void testNewEmployee2() {
		
	}

}
