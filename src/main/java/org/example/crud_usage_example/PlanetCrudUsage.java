package org.example.crud_usage_example;

import org.example.entity.Planet;
import org.example.hibernate_util.HibernateUtil;
import org.example.service.PlanetCrudService;

public class PlanetCrudUsage {
    public static void main(String[] args) {
        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet newPlanet = new Planet();
        newPlanet.setId("DEFIS");
        newPlanet.setName("Argus6I");
        planetCrudService.create(newPlanet);

        Planet planet = planetCrudService.read("MARS");
        System.out.println("Planet name: " + planet.getId());

        planet.setName("Gerasius");
        planetCrudService.update(planet);

        planetCrudService.delete(newPlanet);
        HibernateUtil.getInstance().close();
    }
}
