package com.example.demo.dao.CustomRepos;

import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class CustomRepositoryImpl implements CustomRepository{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List findByFirstName(String firstName) {
        //  Đây là JPQL
//        String sql = "select e from Employee e WHERE e.name = :name";
//        final TypedQuery<Employee> query = entityManager.createQuery(sql, Employee.class).setParameter("name", "Lucknow");
        //Native Query
        String sql = "select * from empl e WHERE e.name = :name";
        final Query query = entityManager.createNativeQuery(sql, Employee.class).setParameter("name", "Lucknow");
        return query.getResultList();
    }
}
