package com.abir.vehicule;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abir.vehicule.entities.Type;
import com.abir.vehicule.entities.Vehicule;
import com.abir.vehicule.repos.VehiculeRepository;

@SpringBootTest
class VehiculeApplicationTests {
@Autowired
private VehiculeRepository vehiculeRepository;
/*@Test
public void testCreateVehicule() {
Vehicule vehi = new Vehicule("BMW",80.500,100.000);
vehiculeRepository.save(vehi);
}

@Test
public void testFindVehicule()
{
Vehicule v = vehiculeRepository.findById(1L).get();

System.out.println(v);
}

@Test
public void testUpdateVehicule()
{
Vehicule v = vehiculeRepository.findById(1L).get();
v.setPrixVehicule(90.0);
vehiculeRepository.save(v);
}

@Test
public void testDeleteVehicule()
{
vehiculeRepository.deleteById(1L);;
}

@Test
public void testListerTousVehicules()
{
List<Vehicule> vehis = vehiculeRepository.findAll();
for (Vehicule v : vehis)
{
System.out.println(v);
}

}

@Test
public void testfindByMarqueVehicule()
{
List<Vehicule> vehis = vehiculeRepository.findByMarqueVehicule("BMW");

for (Vehicule v : vehis)
{
System.out.println(v);
}

}

public void testFindByMarqueVehiculeContains()
{
List<Vehicule> vehis = vehiculeRepository.findByMarqueVehiculeContains("BMW");

for (Vehicule v : vehis)
{
System.out.println(v);
}

}

@Test
public void testfindByMarquePrix()
{
List<Vehicule> vehis = vehiculeRepository.findByMarquePrix("BMW", 80.5);
for (Vehicule v : vehis)
{
System.out.println(v);
}
}

@Test
public void testfindByType() 
{

Type ty = new Type();
ty.setIdType(1L);
List<Vehicule> vehis = vehiculeRepository.findByType(ty);
for (Vehicule v : vehis)
{
System.out.println(v);
}
}

@Test
public void findByTypeIdType()
{
	List<Vehicule> vehis = vehiculeRepository.findByTypeIdType(1L);
	for (Vehicule v : vehis)
{
System.out.println(v);
}
}

@Test
public void findByOrderByMarqueVehiculeAsc()
{
	List<Vehicule> vehis = vehiculeRepository.findByOrderByMarqueVehiculeAsc();
	for (Vehicule v : vehis)
{
System.out.println(v);
}
}


@Test
public void trierVehiculesMarquesPrix()
{
	List<Vehicule> vehis = vehiculeRepository.trierVehiculesMarquesPrix();
	for (Vehicule v : vehis)
{
System.out.println(v);
}
}*/



}
