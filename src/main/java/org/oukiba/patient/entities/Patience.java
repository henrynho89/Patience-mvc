package org.oukiba.patient.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Patience implements Serializable{
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(name = "DateNaissance")
	@Temporal(TemporalType.DATE)
	private Date DateNaissance;
	private boolean malade;
	private int score;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateaissance) {
		DateNaissance = dateaissance;
	}
	public boolean isMalade() {
		return malade;
	}
	public void setMalade(boolean malade) {
		this.malade = malade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	private static final long serialVersionUID = 1L;
}
