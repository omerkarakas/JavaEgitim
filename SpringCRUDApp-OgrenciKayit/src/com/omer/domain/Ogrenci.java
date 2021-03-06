package com.omer.domain;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name="OGRENCI")
public class Ogrenci {

	@Id
	@Column(name="Id")
	@SequenceGenerator(name="ogrenci_seq",sequenceName="seq_ogrenci", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ogrenci_seq")
	private int id;
	
	@Column(name="isim")
	private String isim;
	
	@Column(name="soyisim")
	private String soyisim;
	
	@Column(name="ogrenci_no")
	private int ogrenciNo;

	
	@Column(name="mezuniyet_tarihi")
	private Date mezuniyetTarihi;
	
	@OneToOne
	@JoinColumn(name="kurs_id")
	private Kurs kurs;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public Ogrenci(String isim, String soyisim, int ogrenciNo) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.ogrenciNo = ogrenciNo;
	}

	public Ogrenci() {
		super();
	}

	public Date getMezuniyetTarihi() {
		return mezuniyetTarihi;
	}

	public void setMezuniyetTarihi(Date mezuniyetTarihi) {
		this.mezuniyetTarihi = mezuniyetTarihi;
	}

	public Kurs getKurs() {
		return kurs;
	}

	public void setKurs(Kurs kurs) {
		this.kurs = kurs;
	}

	
	
}
