package com.app;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return this.topicservice.getAllTopics();
		
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public  HashMap<String, String> add(@RequestBody Topic t){
		
		System.out.println("=======add==="+t);
		System.out.println(" >>>:  "+t.getDescription());
		
		//Topic t=new Topic("1","geo","good");
		 this.topicservice.add(new Topic(t.getId(),t.getName(),t.getDescription()));
		 HashMap<String, String> rt = new HashMap<>();
		    rt.put("result", "OK");
		 
		 return rt;
		
	}

}
