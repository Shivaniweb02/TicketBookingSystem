package com.example.ticketbookingsystem;

import com.example.ticketbookingsystem.Model.Role;
import com.example.ticketbookingsystem.Model.User;
import com.example.ticketbookingsystem.Model.UserRole;
import com.example.ticketbookingsystem.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@CrossOrigin("*")
public class TicketBookingSystemApplication implements CommandLineRunner {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(TicketBookingSystemApplication.class, args);

        System.out.println("TICKET BOOKING SYSTEM");

    }

    @Override
    public void run(String... args) throws Exception {

//        private UserServices userServices ;
//        User user =new User();
//        user.setEmailID("02kr@gmail.com");
//        user.setName("Shivanni");
//        user.setAddress("Ratlam");
//        user.setGender("Female");
//        Role role=new Role();
//        user.setPhone_number(21435435);
//
//        user.setAddress("12");
//
//        role.setRoleID(1);
//        role.setRolename("ADMIN");
//        UserRole userRole=new UserRole();
//        userRole.setRole(role);
//        userRole.setUser(user);
//        Set<UserRole> userRoles=new HashSet<>();
//        userRoles.add(userRole);
//        user.setUserRoles(userRoles);
//        userServices.createUser(user,userRoles);
//        User user
    }
}
