package com.abir.vehicule.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Type {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idType;
private String nomType;
private String descriptionTy;
@JsonIgnore
@OneToMany(mappedBy = "type")
private List<Vehicule> vehicules;


public Type() {
	super();
}
public Type(Long idType, String nomType, String descriptionTy, List<Vehicule> vehicules) {
	super();
	this.idType = idType;
	this.nomType = nomType;
	this.descriptionTy = descriptionTy;
	this.vehicules = vehicules;
}
public Long getIdType() {
	return idType;
}
public void setIdType(Long idType) {
	this.idType = idType;
}
public String getNomType() {
	return nomType;
}
public void setNomType(String nomType) {
	this.nomType = nomType;
}
public String getDescriptionTy() {
	return descriptionTy;
}
public void setDescriptionTy(String descriptionTy) {
	this.descriptionTy = descriptionTy;
}
public List<Vehicule> getVehicules() {
	return vehicules;
}
public void setVehicules(List<Vehicule> vehicules) {
	this.vehicules = vehicules;
}


}