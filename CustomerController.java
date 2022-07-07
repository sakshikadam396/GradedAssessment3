package com.greatlearning.customer.controller;

import org.springframwork.beans.factory.annotation.Autowired;
import org.springframeworkstereotype.Controller;
import org.springframework.ui.model;
import org

import com.greatlearning.customer.entity.Customer;
import com.greatlearning.student.service.StudentService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
 
	@Autowired
	private customerService customerService;
	
	@RequestMapping("\list")
	public Sring find all(Model model)
	
	{
		list<customer>customerList=CustomerService.findAll();
		model.addAttribute(bookList,bookList);
		{
			System.out.println(s);
		}
		Return "Students";
		@Requestmapping("/save")
		public String save(@Requestparam("firstname")String firstname,@Requestparam(lastname)String lastname,
				@requestparam("Email")String email)
		customer s=new Customer(firstname ,lastname, email);
		{
			Customer c = null;
			if(id!=-1)
			{
				c=customerService.findby(id);
				c.setfirstName(firstname);
				c.setLastname(lastname);
				c.setEmail(email)
			}
			else
				c=new Customer(firstname,lastname,email)
		}
		customerservice.save(c);
		return"redirect:customer/list";
	   }
       @RequestMapping("/addcustomer")
       public String addcustomer(@Requestparam("id")integer id,Model model)
       {
    	   if(id!=-1)
    		   Customer c=customerService.findbyEmail(email)
    		   model.addAttribute("book",c);
    	   
       }
         return "customerform";
		
		@Transactional
		public void save(Customer customer)
		{
			Transaction tr= session.beginTransaction;
			tr. commit();
		}
	}

