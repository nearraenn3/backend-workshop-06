package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//public interface UserRepository extends CrudRepository<User, Integer> {
//
//}

public interface UserRepository extends JpaRepository<User,Integer> {

}
