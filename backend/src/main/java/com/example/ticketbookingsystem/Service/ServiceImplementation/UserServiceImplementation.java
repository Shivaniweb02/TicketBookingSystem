package com.example.ticketbookingsystem.Service.ServiceImplementation;

import com.example.ticketbookingsystem.ExceptionsAhead.UserNotPresentException;
import com.example.ticketbookingsystem.Model.User;
import com.example.ticketbookingsystem.Model.UserRole;
import com.example.ticketbookingsystem.Repository.RoleRepo;
import com.example.ticketbookingsystem.Repository.UserRepo;
import com.example.ticketbookingsystem.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImplementation implements UserServices {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;
    @Override
    public User createUser(User user, Set<UserRole> role) throws UserNotPresentException {
        Optional<User> local=this.userRepo.findById(user.getEmailID());
        if(!local.isEmpty())
        {
            System.out.println("User is already present in the database");
            throw new UserNotPresentException("User already present");
        }
        else {
            for(UserRole ur:role) {
                roleRepo.save(ur.getRole());
            }
            user.getUserRoles().addAll(role);
        }
        return this.userRepo.save(user);
    }

    @Override
    public Optional<User> getUser(String emailID) {
//        Optional<User> user1=this.userRepo.findById(user.getEmailID());
//        if(!user1.isPresent())
//        {
        return this.userRepo.findById(emailID);
//        }

    }

    @Override
    public List<User> getAllUser() {
        return  this.userRepo.findAll();
    }

    @Override
    public User updateUser(User user,String email) {
        Optional<User> user1=this.userRepo.findById(email);
        if(user1.isPresent())
        return this.userRepo.save(user);
        else {
            return null;
        }

    }

    @Override
    public void DeleteUser(String email) {
//        Optional<User> user1=this.userRepo.findById(email);
        this.userRepo.deleteById(email);
    }
}
