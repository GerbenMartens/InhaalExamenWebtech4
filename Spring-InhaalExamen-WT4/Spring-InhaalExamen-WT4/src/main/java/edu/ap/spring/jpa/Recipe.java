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
    
    public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getIngredienten() {
		return ingredienten;
	}

	public void setIngredienten(String ingredienten) {
		this.ingredienten = ingredienten;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

}
