package userAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(bankConfig.class);
		
		BanksManage bm = (BanksManage) context.getBean("b");
		bm.getAccountBlance();
	}

}
