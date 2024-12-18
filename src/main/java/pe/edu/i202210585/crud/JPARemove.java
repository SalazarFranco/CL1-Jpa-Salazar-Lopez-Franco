package pe.edu.i202210585.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202210585.model.country;

public class JPARemove {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("examen");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        try {
            // Buscar el país imaginario usando su código (clave primaria)
            country fictionalCountry = em.find(country.class, "IMA");
            // Verificar si el país existe antes de eliminarlo
            if (fictionalCountry != null) {
                em.remove(fictionalCountry);
                System.out.println("País con Code IMA y sus datos asociados eliminados correctamente.");
            } else {
                System.out.println("El país con code IMA no existe en la base de datos.");
            }
            em.getTransaction().commit();
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
