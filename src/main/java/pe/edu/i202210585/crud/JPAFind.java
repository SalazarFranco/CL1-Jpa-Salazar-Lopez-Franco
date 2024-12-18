package pe.edu.i202210585.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202210585.model.city;
import pe.edu.i202210585.model.country;

import java.util.List;

public class JPAFind {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("examen");
        EntityManager em=emf.createEntityManager();

        try {
            country country = em.find(country.class, "PER");

            if (country != null) {
                // Obtener la lista de ciudades asociadas
                List<city> cities = country.getCitys();
                // Filtrar e imprimir ciudades con población > 700k usando lambda
                cities.stream()
                        .filter(city -> city.getPopulation() > 700_000)
                        .forEach(city -> System.out.println(city.getName())); // Imprimir nombre
            } else {
                System.out.println("El país con código 'PER' no fue encontrado.");
            }
        } finally {
            // Cerrar el EntityManager y el EntityManagerFactory
            em.close();
            emf.close();
        }
    }

}
