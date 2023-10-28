package com.example.ticketbookingsystem.Repository;

import com.example.ticketbookingsystem.Model.Role;
import com.example.ticketbookingsystem.Model.User;
import com.example.ticketbookingsystem.Model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {
}
