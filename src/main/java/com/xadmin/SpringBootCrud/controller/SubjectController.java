package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.SubjectService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects()
	{
         return subjectService.getAllSubjects();
     }
	
	@RequestMapping(method=RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/subjects/{eid}")
	public void updateSubject(@PathVariable String eid, @RequestBody Subject subject)
	{
		subjectService.updateSubject(eid,subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/subjects/{eid}")
	public void DeleteSubject(@PathVariable String eid)
	{
		subjectService.deleteSubject(eid);
	}
	
}

