package com.abir.vehicule.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "marqueVehicule", types = { Vehicule.class })
public interface VehiculeProjection {

	public String getMarqueVehicule();
}
