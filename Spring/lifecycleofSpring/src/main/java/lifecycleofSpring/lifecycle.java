package lifecycleofSpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("l")
public class lifecycle {
	
	public void save() {
		System.out.println("data save");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("hi from init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("hi from destroy method");
	}

}
