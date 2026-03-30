package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String...args) throws Exception{
		Employee e=new Employee();
		e.setEno(104);e.setEname("Lokesh");e.setEadd("delhi");e.setSalary(9000.0);e.setIsVaccinated(true);
		System.out.println(service.saveEmployee(e));
	}

}
