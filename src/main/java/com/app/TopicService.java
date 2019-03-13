package com.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository repository;
	

	
	public List<Topic> getAllTopics(){
		List<Topic> rs=new ArrayList<Topic>();
//		rs.add(new Topic("1","g","CIO") );
//		rs.add(new Topic("2","jeremy","CEO") );
		this.repository.findAll().forEach(rs::add);;
		
		return rs;
		
	}
	
	public void add(Topic t) {
		
		this.repository.save(t);
		
	}
}
