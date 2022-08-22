package com.application.application.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="User")
@Data
public class User {

@Id
long id;
	
String userName;
String password;
}
