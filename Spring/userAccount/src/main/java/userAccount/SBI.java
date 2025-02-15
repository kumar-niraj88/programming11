package userAccount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sbi")
public class SBI implements Bank {

	@Override
	public void blance() {
		System.out.println("100000");
		
	}

}
