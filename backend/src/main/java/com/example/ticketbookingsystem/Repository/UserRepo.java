package com.example.ticketbookingsystem.Repository;

import com.example.ticketbookingsystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, String> {


//    void delete(Optional<User> byId);
}
