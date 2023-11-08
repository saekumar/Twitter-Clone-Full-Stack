package com.zosh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="likes")
public class Like {
	
  	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	  
  	@ManyToOne
  	private User user;
  	
  	@ManyToOne
  	private Twit twit;
  	
  	public Like()
  	{
  		
  	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Twit getTwit() {
		return twit;
	}

	public void setTwit(Twit twit) {
		this.twit = twit;
	}
  
	public Like(Long id, User user, Twit twit) {
		super();
		this.id = id;
		this.user = user;
		this.twit = twit;
	}

  	
 
}
