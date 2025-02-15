package learn.Student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	//@RequestMapping(value = "getEmp" , method = RequestMethod.GET)
	@GetMapping("getEmp")
	public Employee getEmployee() {
		Employee e = new Employee();
		e.setId(1);
		e.setName("niraj");
		e.setSal(27654);
		
		return e;
	}
	
	//@RequestMapping(value = "emp" ,method = RequestMethod.POST)
	@PostMapping("emp")
	public Employee postmappingEmp(@RequestBody Employee e ) {
		return e;
	}
	
	

}
