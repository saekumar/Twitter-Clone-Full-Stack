package com.zosh.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LikeDto {

	private Long id;
	private UserDto user;
	private TwitDto twit;
	
	public LikeDto()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public TwitDto getTwit() {
		return twit;
	}
	public void setTwit(TwitDto twit) {
		this.twit = twit;
	}
	public LikeDto(Long id, UserDto user, TwitDto twit) {
		super();
		this.id = id;
		this.user = user;
		this.twit = twit;
	}
	
}
