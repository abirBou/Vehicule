package com.abir.vehicule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abir.vehicule.entities.Type;
import com.abir.vehicule.entities.Vehicule;
import com.abir.vehicule.repos.VehiculeRepository;
@Service
public class VehiculeServiceImpl implements VehiculeService {

	
	@Autowired
	VehiculeRepository vehiculeRepository;
	
	@Override
	public List<Vehicule> findByMarqueVehicule(String marque)
	{
		return vehiculeRepository.findByMarqueVehicule(marque);
	}
	
	@Override
	public List<Vehicule> findByMarqueVehiculeContains(String marque)
	{
		return vehiculeRepository.findByMarqueVehiculeContains(marque);
	}
	
	@Override
	public List<Vehicule> findByMarquePrix (String marque, Double prix)
	{
		return vehiculeRepository.findByMarquePrix (marque, prix);
	}
	
	@Override
    public List<Vehicule> findByType (Type type)
    {
		return vehiculeRepository.findByType (type);
    }
	
	@Override
	public List<Vehicule> findByTypeIdType(Long id)
	{
		return vehiculeRepository.findByTypeIdType(id);
	}
	
	@Override
	public List<Vehicule> findByOrderByMarqueVehiculeAsc()
	{
		return vehiculeRepository.findByOrderByMarqueVehiculeAsc();
	}
	
	@Override
	public List<Vehicule> trierVehiculesMarquesPrix ()
	{
		return vehiculeRepository.trierVehiculesMarquesPrix ();
	}

	@Override
	public Vehicule saveVehicule(Vehicule v) 
	{
		return vehiculeRepository.save(v);
	}

	@Override
	public Vehicule updateVehicule(Vehicule v)
	{
		return vehiculeRepository.save(v);
	}

	@Override
	public void deleteVehicule(Vehicule v) 
	{
		vehiculeRepository.delete(v);
	}

	@Override
	public Vehicule getVehicule(Long id) 
	{
		return vehiculeRepository.findById(id).get();
	}

	@Override
	public List<Vehicule> getAllVehicules() 
	{
		return vehiculeRepository.findAll();
	}

	
}
