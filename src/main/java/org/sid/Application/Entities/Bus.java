package org.sid.Application.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bus {
   
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String busName;
	private String registrationNumber;
	private int numberOfSeats;
	private Date dateOfRegistration;
	private String busModel;
	private int busNumber;
	
}
