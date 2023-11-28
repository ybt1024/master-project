package com.yunbin.schoolManagement.service;

import com.yunbin.schoolManagement.constants.EazySchoolConstants;
import com.yunbin.schoolManagement.model.Person;
import com.yunbin.schoolManagement.model.Roles;
import com.yunbin.schoolManagement.repository.PersonRepository;
import com.yunbin.schoolManagement.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person,String roleValue) {
        boolean isSaved = false;
        Roles role = null;
        if(roleValue.equals(EazySchoolConstants.STUDENT_ROLE)){
            role = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
        }else{
            role = rolesRepository.getByRoleName(EazySchoolConstants.TEACHER_ROLE);
        }

        person.setRoles(role);
        person.setPwd(passwordEncoder.encode(person.getPwd()));
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }

    public List<Person> getAllTeachers() {
        return personRepository.getAllTeachers();
    }
}
