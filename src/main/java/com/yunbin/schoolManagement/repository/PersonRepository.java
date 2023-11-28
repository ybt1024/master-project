package com.yunbin.schoolManagement.repository;

import com.yunbin.schoolManagement.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person readByEmail(String email);

    @Query("SELECT p FROM Person p JOIN p.roles r WHERE r.roleName = 'TEACHER'")
    List<Person> getAllTeachers();
}
