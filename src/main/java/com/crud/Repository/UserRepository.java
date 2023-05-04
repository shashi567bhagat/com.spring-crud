package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Controller.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
