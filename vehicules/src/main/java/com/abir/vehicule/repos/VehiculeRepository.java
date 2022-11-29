package com.abir.vehicule.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.abir.vehicule.entities.Type;
import com.abir.vehicule.entities.Vehicule;
@RepositoryRestResource(path = "rest")
public interface VehiculeRepository extends JpaRepository <Vehicule , Long> {

	List<Vehicule> findByMarqueVehicule(String marque);
	List<Vehicule> findByMarqueVehiculeContains(String marque);

	@Query("select v from Vehicule v where v.marqueVehicule like %?1 and v.prixVehicule > ?2")
	List<Vehicule> findByMarquePrix (String marque, Double prix);

	
	@Query("select v from Vehicule v where v.type = ?1")
	List<Vehicule> findByType (Type type);
	
	List<Vehicule> findByTypeIdType(Long id);
	
	List<Vehicule> findByOrderByMarqueVehiculeAsc();
	
	@Query("select v from Vehicule v order by v.marqueVehicule ASC, v.prixVehicule DESC")
	List<Vehicule> trierVehiculesMarquesPrix ();
}
