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
public class Reservation {
   
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String reservationNumber;
	private Date reservationDate;
	private Trip trip;
	private reservationStatus reservationSattus;
}
