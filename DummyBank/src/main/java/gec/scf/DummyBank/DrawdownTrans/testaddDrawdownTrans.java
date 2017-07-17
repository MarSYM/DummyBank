package gec.scf.DummyBank.DrawdownTrans;


import gec.scf.DummyBank.DrawdownTrans.*;
import org.junit.Test;

public class testaddDrawdownTrans {
	
	public void test() {
		DrawdownTrans data = new DrawdownTrans();
		data.setDelayResponseTime("1");
		data.setTradeNavigatorTransactionNo("T111132323");
		data.setTradeNavigatorTransactionTimeStamp("20160717104300");
		data.setInterestAmount("500");
		data.setRepaymentFee("20");
		data.setReturnStatus("BE");
		data.setReturnCode("0000");
		data.setReturnMessage("test");
	}

}
