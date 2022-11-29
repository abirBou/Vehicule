package com.abir.vehicule.restcontrollers;

import org.springframework.web.bind.annotation.RestController;

import com.abir.vehicule.entities.Vehicule;
import com.abir.vehicule.service.VehiculeService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class VehiculeRESTController {
	@Autowired
	VehiculeService vehiculeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List <Vehicule> getAllVehicules() {
		return vehiculeService.getAllVehicules();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Vehicule getVehiculeById(@PathVariable("id") Long id) {
	return vehiculeService.getVehicule(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
	return vehiculeService.saveVehicule(vehicule);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
	return vehiculeService.updateVehicule(vehicule);
	}
	
	@RequestMapping(value="/vehiTy/{idType}",method = RequestMethod.GET)
	public List<Vehicule> getVehiculeByTypeId(@PathVariable("idType") Long idType) {
	return vehiculeService.findByTypeIdType(idType);
	}

}
