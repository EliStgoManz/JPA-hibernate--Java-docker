import empty.EspeciesExtincion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();

        try{
            transaction.begin();

            EspeciesExtincion especie=new EspeciesExtincion();
            especie.setIdEspecie(5);
            especie.setNombreEspecie("Lobo Marino");
            especie.setIdEspecie(6);
            especie.setNombreEspecie("ballena azul");

            entityManager.persist(especie);

            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
