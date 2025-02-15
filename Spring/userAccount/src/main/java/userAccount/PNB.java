package userAccount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pnb")
public class PNB implements Bank {

	@Override
	public void blance() {
		System.out.println("50000");
		
	}

}
