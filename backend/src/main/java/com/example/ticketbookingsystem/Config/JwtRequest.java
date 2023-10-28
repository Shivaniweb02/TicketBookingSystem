package com.example.ticketbookingsystem.Config;


import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest  {
   private String email;
   private String password;
}
