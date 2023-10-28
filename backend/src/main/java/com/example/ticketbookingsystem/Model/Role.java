package com.example.ticketbookingsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int roleID;
  private   String rolename;
  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  private Set<UserRole> userRoles=new HashSet<>();
}
