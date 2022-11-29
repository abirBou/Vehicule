package com.abir.vehicule.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVehicule;
	private String marqueVehicule;
	private Double prixVehicule;
	private Double kilométrage;
	@ManyToOne
	private Type type;
	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Vehicule(Long idVehicule, String marqueVehicule, Double prixVehicule, Double kilométrage, Type type) {
		super();
		this.idVehicule = idVehicule;
		this.marqueVehicule = marqueVehicule;
		this.prixVehicule = prixVehicule;
		this.kilométrage = kilométrage;
		this.type = type;
	}

	public Long getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(Long idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getMarqueVehicule() {
		return marqueVehicule;
	}

	public void setMarqueVehicule(String marqueVehicule) {
		this.marqueVehicule = marqueVehicule;
	}

	public Double getPrixVehicule() {
		return prixVehicule;
	}

	public void setPrixVehicule(Double prixVehicule) {
		this.prixVehicule = prixVehicule;
	}

	public Double getKilométrage() {
		return kilométrage;
	}

	public void setKilométrage(Double kilométrage) {
		this.kilométrage = kilométrage;
	}

	@Override
	public String toString() {
		return "vehicule [idVehicule=" + idVehicule + ", marqueVehicule=" + marqueVehicule + ", prixVehicule="
				+ prixVehicule + ", kilométrage=" + kilométrage + "]";
	}
	
	

}
