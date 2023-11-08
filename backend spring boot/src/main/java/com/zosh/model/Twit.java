package com.zosh.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Twit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String content;

    @OneToMany(mappedBy = "twit", cascade = CascadeType.ALL)
    private List<Like> likes =new ArrayList<>();

    @OneToMany
    private List<Twit> replyTwits= new ArrayList<>();

    @ManyToMany
    private List<User> retwitUser = new ArrayList<>();
    
    @ManyToOne
    private Twit replyFor;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private String image; 
    private String video;

    private boolean isReply;
    private boolean isTwit;
    private boolean is_liked = false;
    public Twit()
    {
    	
    }
    public Twit(Long id, User user, String content, List<Like> likes, List<Twit> replyTwits, List<User> retwitUser,
			Twit replyFor, LocalDateTime createdAt, String image, String video, boolean isReply, boolean isTwit,
			boolean is_liked, boolean is_retwit) {
		super();
		this.id = id;
		this.user = user;
		this.content = content;
		this.likes = likes;
		this.replyTwits = replyTwits;
		this.retwitUser = retwitUser;
		this.replyFor = replyFor;
		this.createdAt = createdAt;
		this.image = image;
		this.video = video;
		this.isReply = isReply;
		this.isTwit = isTwit;
		this.is_liked = is_liked;
		this.is_retwit = is_retwit;
	}
	private boolean is_retwit=false;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<Like> getLikes() {
		return likes;
	}
	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}
	public List<Twit> getReplyTwits() {
		return replyTwits;
	}
	public void setReplyTwits(List<Twit> replyTwits) {
		this.replyTwits = replyTwits;
	}
	public List<User> getRetwitUser() {
		return retwitUser;
	}
	public void setRetwitUser(List<User> retwitUser) {
		this.retwitUser = retwitUser;
	}
	public Twit getReplyFor() {
		return replyFor;
	}
	public void setReplyFor(Twit replyFor) {
		this.replyFor = replyFor;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public boolean isReply() {
		return isReply;
	}
	public void setReply(boolean isReply) {
		this.isReply = isReply;
	}
	public boolean isTwit() {
		return isTwit;
	}
	public void setTwit(boolean isTwit) {
		this.isTwit = isTwit;
	}
	public boolean isIs_liked() {
		return is_liked;
	}
	public void setIs_liked(boolean is_liked) {
		this.is_liked = is_liked;
	}
	public boolean isIs_retwit() {
		return is_retwit;
	}
	public void setIs_retwit(boolean is_retwit) {
		this.is_retwit = is_retwit;
	}
	
    

    


}
