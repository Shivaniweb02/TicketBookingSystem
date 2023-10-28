package com.example.ticketbookingsystem.Service;

import com.example.ticketbookingsystem.Model.User;
import com.example.ticketbookingsystem.Model.UserRole;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserServices {
    //creating user
    public User createUser(User user, Set<UserRole> role) throws Exception;
    //set of user roles
     // project can have more than one role
    public Optional<User> getUser(String emailID);

    public List<User> getAllUser();
    public User updateUser(User user,String email);
    public void DeleteUser(String email);

}
