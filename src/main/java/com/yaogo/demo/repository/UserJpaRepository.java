package com.yaogo.demo.repository;


import com.yaogo.demo.entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
//@Transactional
public class UserJpaRepository {

    //connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public User findById(int ID){
        return entityManager.find(User.class, ID);
    }

    public User update(User user){
        return entityManager.merge(user);
    }

    public User insert(User user){
        return entityManager.merge(user);
    }

    public void deleteById(int id){
        User user = findById(id);
        entityManager.remove(user);
    }

    //JPQL
    public List<User> findAll(){
        TypedQuery<User> namedQuery = entityManager.createNamedQuery("find_all_users", User.class);
        return namedQuery.getResultList();
    }
}

