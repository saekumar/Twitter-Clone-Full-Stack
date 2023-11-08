package com.zosh.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zosh.model.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	

	private List<UserDto>followers=new ArrayList<>();
    
    private List<UserDto>followings=new ArrayList<>();
    
    private boolean followed;
    
    private boolean isVerified;

	
	private Long id;
	private String fullName;
	private String email;
	private String image;
	
    private String location;

    private String website;

    private String birthDate;

    private String mobile;

    private String backgroundImage;
    
    private String bio;
    
    private boolean req_user;
    
    private boolean login_with_google;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public boolean isReq_user() {
		return req_user;
	}

	public void setReq_user(boolean req_user) {
		this.req_user = req_user;
	}

	public boolean isLogin_with_google() {
		return login_with_google;
	}

	public void setLogin_with_google(boolean login_with_google) {
		this.login_with_google = login_with_google;
	}

	public List<UserDto> getFollowers() {
		return followers;
	}

	public void setFollowers(List<UserDto> followers) {
		this.followers = followers;
	}

	public List<UserDto> getFollowings() {
		return followings;
	}

	public void setFollowings(List<UserDto> followings) {
		this.followings = followings;
	}

	public boolean isFollowed() {
		return followed;
	}

	public void setFollowed(boolean followed) {
		this.followed = followed;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}


	

}
