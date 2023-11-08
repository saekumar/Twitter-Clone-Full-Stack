package com.zosh.request;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.zosh.model.Like;
import com.zosh.model.Twit;
import com.zosh.model.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TwitReplyRequest {

	  
	    private String content;
	    
	    private Long twitId;

	    private LocalDateTime createdAt;

	    private String image;
	    
	    
	    public TwitReplyRequest()
	    {
	    	
	    }

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getTwitId() {
			return twitId;
		}

		public void setTwitId(Long twitId) {
			this.twitId = twitId;
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

		public TwitReplyRequest(String content, Long twitId, LocalDateTime createdAt, String image) {
			super();
			this.content = content;
			this.twitId = twitId;
			this.createdAt = createdAt;
			this.image = image;
		}

		 


}
