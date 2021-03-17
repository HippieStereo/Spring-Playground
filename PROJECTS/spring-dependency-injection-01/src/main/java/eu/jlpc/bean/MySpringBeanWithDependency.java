package eu.jlpc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.jlpc.dev.model.IWriter;

@Service
public class MySpringBeanWithDependency {

	private IWriter writer;
	
	@Autowired
	public void setWriter(IWriter writer) {
		this.writer = writer;
	}
	
	public void run() {
		
		String s = "This is my test";
		
		System.out.println("From \"MySpringBeanWithDependency\" : " + s);
		
	}
	
}
