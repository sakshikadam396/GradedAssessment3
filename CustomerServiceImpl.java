package com.greatlearning.customer.service;

import.java.util.list;

import javax.transaction.transactional;

import org.hibernate.sessionfactory;
import org.springframeworkStereotype.repository;

import com.greatlearning.customer.entity;

@Repository
public class CustomerServiceimpl implements CustomerService {
     
	private sessionfactory sessionfactory;
	
	private Session session;
	
	public CustomerService Impl(Sessionfactory sessionfactory){
		this.sessionfactory=sessionfactory;
		try
		{
		session=this.sessionfactory.getcurrentsession();
	    }
		catch(HibernateException e) {
	      session=this.sessionfactory.opensession();
		}
	
	
	@Transactional
	public String findAll(Model,model)
	{
	{ list<student> studentlist=session.createQuery("from Student").list();
	for(Student s:studentlist)
	{
		System.out.println(s);
	}
	return "Students"
  }
	
	@Transactional
	public void save(Student student)
	{
		Transaction tr=session.begintransaction();
		session.saveOrUpdate(student);
		tr.commit();
	}
}

