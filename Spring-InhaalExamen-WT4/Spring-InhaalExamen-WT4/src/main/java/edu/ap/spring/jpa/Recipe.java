package edu.ap.spring.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Recipe {
	@Id
    @GeneratedValue
    private Long id;

    @Column
    private String naam;
    
    @Column
    private String ingredienten;

	@Column
    private Date datum;

    public Recipe() {}
    
    public Recipe(String naam, String ingredienten, Date datum) {
	    	this.naam = naam;
	    	this.ingredienten = ingredienten;
	    	this.datum = datum;
    }
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
