package pe.edu.i202210585.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202210585.model.city;
import pe.edu.i202210585.model.country;
import pe.edu.i202210585.model.countrylanguage;

import java.util.Arrays;



public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("examen");
        EntityManager em=emf.createEntityManager();
       // city city=new city(null,"Hugo","Hugo",100,new country("ABW","Aruba", North_America,"Caribbean",193.00,0,103000,78.4,828.00,793.00,"Aruba","Nonmetropolitan Territory of The Netherlands","Beatrix",129,"AW"));


        try {
            // Crear un país imaginario
            country fictionalCountry = new country();
            fictionalCountry.setCode("IMA");
            fictionalCountry.setName("Imaginaria");
            fictionalCountry.setContinent("Asia");
            fictionalCountry.setRegion("Región Imaginaria");
            fictionalCountry.setPopulation(1_000_000);
            fictionalCountry.setSurfaceArea(50000.0);
            fictionalCountry.setLocalName("Imaginario");
            fictionalCountry.setGovernmentForm("Monarquía");
            fictionalCountry.setIndepYear(null);
            fictionalCountry.setCode2("IM");

            // Crear 3 ciudades para el país
            city city1 = new city();
            city1.setName("Ciudad Ficticia 1");
            city1.setDistrict("Kabol1");
            city1.setPopulation(500_000);
            city1.setCountry(fictionalCountry);

            city city2 = new city();
            city2.setName("Ciudad Ficticia 2");
            city2.setDistrict("Kabol2");
            city2.setPopulation(300_000);
            city2.setCountry(fictionalCountry);

            city city3 = new city();
            city3.setName("Ciudad Ficticia 3");
            city3.setDistrict("Kabol3");
            city3.setPopulation(200_000);
            city3.setCountry(fictionalCountry);

            // Crear 2 lenguajes nativos
            countrylanguage language1 = new countrylanguage();
            language1.setLanguage("Ficticio");
            language1.setIsOfficial("T");
            language1.setPercentage(5.5);
            language1.setCountry(fictionalCountry);

            countrylanguage language2 = new countrylanguage();
            language2.setLanguage("Imaginario");
            language2.setIsOfficial("F");
            language2.setPercentage(5.5);
            language2.setCountry(fictionalCountry);

            // Asociar las ciudades y los lenguajes al país
            fictionalCountry.setCitys(Arrays.asList(city1, city2, city3));
            fictionalCountry.setLanguages(Arrays.asList(language1, language2));
            //guarda en pais
            em.getTransaction().begin();
            em.persist(fictionalCountry);
            em.getTransaction().commit();

            System.out.println("País imaginario, ciudades y lenguajes registrados exitosamente.");

        } catch (Exception e) {
            // Revertir en caso de error
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            // Cerrar el EntityManager
            em.close();
            emf.close();
        }
    }

}
