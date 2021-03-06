package com.omer.service;

import java.util.List;

import com.omer.domain.Kurs;
import com.omer.domain.Ogrenci;

public interface OgrenciServisi {
	
	public List<Ogrenci> getOgrenciler();

	public void saveOgrenci(Ogrenci ogr);

	public Ogrenci getOgrenci(int ogrId);

	public void deleteOgrenci(int ogrId);
	
	public List<Kurs> getKursList();

}
