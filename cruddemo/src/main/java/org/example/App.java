package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.engine.spi.Managed;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager manager = factory.createEntityManager();

        try{
            manager.getTransaction().begin();

            studentdetails std_details = new studentdetails();
            std_details.setCollege("IIT");
            std_details.setMajors("Computer Science");


            student std = new student();
            std.setFname("Rahul");
            std.setLname("Kumar");
            std.setEmail("rahulk@gmail.com");
            std.setStudentdetails(std_details);

            manager.persist(std);



            // Find cities using HQL
//            TypedQuery<City> query = manager.createQuery("From City c Where c.population > 1000000", City.class);
//            List<City> result = query.getResultList();
//            manager.getTransaction().commit();
//            for (City city : result) {
//                System.out.println(city.getName() + " | " + city.getPopulation() + " | " + city.getCountrycode());
//            }

            // Insert a new city WITHOUT USING HQL
//         City city = new City();
//         city.setName("Ratlamn");
//         city.setCountrycode("IND");
//         city.setDistrict("Madhya Pradesh");
//         city.setPopulation(124000);
//            manager.persist(city);
//            manager.getTransaction().commit();
//            System.out.println("Record Inserted...");

            // REMOVING CITY WIHTOUT USING HQL

//            City city_a = manager.find(City.class, 4080);
//            City city_b = manager.find(City.class, 4081);
//            City city_c = manager.find(City.class, 4082);
//
//            manager.remove(city_a);
//            manager.remove(city_b);
//            manager.remove(city_c);

            manager.getTransaction().commit();

            manager.close();
            factory.close();

        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
