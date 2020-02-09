package de.byteinspace.diecastcollector.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private boolean favorite;
	@OneToMany(mappedBy = "company")
	private List<Car> cars;
	
	private String logoThumb;
	
	protected Company() { }
	
	public Company(String name) {
		this.name = name;
	}

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

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	public String getLogoThumb() {
		return logoThumb;
	}

	public void setLogoThumb(String logoThumb) {
		this.logoThumb = logoThumb;
	}
	
	
	
}
