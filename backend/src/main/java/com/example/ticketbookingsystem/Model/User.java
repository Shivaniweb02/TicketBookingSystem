package com.example.ticketbookingsystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User  {
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private String emailID;
private String password;
private String name;
private int phone_number;
private String Address;
private String Gender;
private int age;

@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JsonIgnore
private Set<UserRole> userRoles=new HashSet<>();
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//       Set<Authority> set =new HashSet<>();
//       this.userRoles.forEach(userRole -> {
//           set.add(new Authority(userRole.getRole().getRolename()));
//       });
//       return set;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override //not expired
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }

//
//@OneToOne
//    private Booking booking;


}
