package com.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic{// implements Serializable{
	//private static final long serivalVersionUID = -1764970284520387975L;
	
	@Id
	private String id;
	private String description;
	private String name;
	public String getId() {
		return id;
	}
	Topic(){
		
	}
	
	 Topic(String id, String name,String description) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", description=" + description + ", name=" + name + "]";
	}
	
	

}
