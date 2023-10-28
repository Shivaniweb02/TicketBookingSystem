package com.example.ticketbookingsystem.Controller;

import com.example.ticketbookingsystem.Model.Role;

import com.example.ticketbookingsystem.Model.User;
import com.example.ticketbookingsystem.Model.UserRole;
import com.example.ticketbookingsystem.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController()
@RequestMapping("/")
@CrossOrigin("*")
//When there is any error in sending the data try to add this in the file
public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping("/register")
    public com.example.ticketbookingsystem.Model.User createuser(@RequestBody com.example.ticketbookingsystem.Model.User user) throws Exception {
        Role role = new Role();
//      role.setRoleID(2);
        role.setRolename("General");
        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        Set<UserRole> roles = new HashSet<>();
        roles.add(userRole);
        return this.userServices.createUser(user, roles);
    }

    @GetMapping("/getuser/{emailID}")
    public Optional<com.example.ticketbookingsystem.Model.User> getUser(@PathVariable("emailID") String email) {
        return this.userServices.getUser(email);
    }

    @GetMapping("/GetAllUser")
    public List<com.example.ticketbookingsystem.Model.User> getAllUser(User user) {
        return this.userServices.getAllUser();
    }

    @PutMapping("/UpdateUser/{emailID}")
    public User updateUser(@PathVariable("emailID") String emailID, @RequestBody User user) {
        User user1 = new User();
        user1.setAddress(user.getAddress());
        user1.setGender(user.getGender());
        user1.setPhone_number(user.getPhone_number());
        user1.setAge(user.getAge());
        user1.setName(user.getName());
        return this.userServices.updateUser(user, emailID);
    }

    @DeleteMapping("/DeleteAccount/{emailID}")
    public String DeleteUser(@PathVariable("emailID") String emailID) {
        HttpStatus accepted = HttpStatus.ACCEPTED;
        System.out.println(accepted);
        this.userServices.DeleteUser(emailID);
        return emailID + " is Deleted from the Database!";
    }

//currentUser
}

