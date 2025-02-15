package userAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("b")
public class BanksManage {
	
	@Autowired
	@Qualifier("pnb")
	private Bank bank1;
	
	@Autowired
	@Qualifier("sbi")
	private Bank bank2;
	
	public void getAccountBlance() {
		bank1.blance();
		bank2.blance();
	}

}
