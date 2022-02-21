package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {
	@Id
	private String id;
	private String ename;
	private String edept;
	
    
	
    
    public Subject() {
    	
	}

	public Subject(String id, String ename, String edept) {
		super();
		this.id = id;
		this.ename = ename;
		this.edept = edept;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	


	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	

}
