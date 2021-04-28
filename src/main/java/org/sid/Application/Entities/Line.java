package org.sid.Application.Entities;

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
public class Line {
   
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String departureCity;
	private String arrivalCity;
	private Station departureStation;
	private Station arrivalStation;
}
