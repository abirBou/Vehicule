package com.abir.vehicule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abir.vehicule.entities.Type;
import com.abir.vehicule.entities.Vehicule;
@Service
public interface VehiculeService {
	Vehicule saveVehicule(Vehicule v);
	Vehicule updateVehicule(Vehicule v);
	void deleteVehicule(Vehicule v);
	Vehicule getVehicule(Long id);
	List<Vehicule> getAllVehicules();
	List<Vehicule> findByMarqueVehicule(String marque);
	List<Vehicule> findByMarqueVehiculeContains(String marque);
	List<Vehicule> findByMarquePrix (String marque, Double prix);
    List<Vehicule> findByType (Type type);	
	List<Vehicule> findByTypeIdType(Long id);	
	List<Vehicule> findByOrderByMarqueVehiculeAsc();
	List<Vehicule> trierVehiculesMarquesPrix ();

	
	

}
