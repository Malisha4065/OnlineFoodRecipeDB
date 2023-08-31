package com.malisha.onlinefoodrecipedb.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String firstName;
   private String lastName;
   private String email;
   private String gender;
   private String password;

   public String getFullName() {
      return firstName + lastName;
   }
}
