package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.dao.CustomRepos.CustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, CustomRepository {
    // Đây là JPQL
//    @Query("SELECT u FROM Employee u WHERE u.name = :name and u.city = :city")
//    Employee findByLastname(@Param("name") String name, @Param("city") String city);
    //Native query
    @Query(value = "SELECT * FROM empl u WHERE u.name = :name and u.city = :city", nativeQuery = true)
    Employee findByLastname(@Param("name") String name, @Param("city") String city);
}
