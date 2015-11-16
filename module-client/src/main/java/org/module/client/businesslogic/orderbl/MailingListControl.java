package org.module.client.businesslogic.orderbl;

import org.module.client.businesslogicservice.order.CalculateDriverCostService;
import org.module.client.businesslogicservice.order.CalculateTimeService;
import org.module.client.businesslogicservice.order.MailingService;
import org.module.client.businesslogicservice.orderBLservice.MailingBLService;
import org.module.client.vo.MailingListVO;


public class MailingListControl implements MailingBLService{
	private MailingService mailingBLImpl;
	private CalculateTimeService time;
	private CalculateDriverCostService driverCost;
	
	public MailingListControl( ) {
		super();
		this.mailingBLImpl = new MailingBLImpl();
		this.time = new CalculateTime();
		this.driverCost = new CalculateDriverCost();
	}
	public MailingListControl(MailingService mailingBLImpl, CalculateTimeService time,
	 CalculateDriverCostService driverCost) {
		super();
		this.mailingBLImpl = mailingBLImpl;
		this.time = time;
		this.driverCost = driverCost;
	}



	public boolean handleMailingList(String senderName, String senderCompany,
			String senderMobile, String senderPhone, String senderCity,
			String senderPosition, String receiveName, String receiveCompany,
			String receiveMobile, String receivePhone, String receiveCity,
			String receivePosition, String nameOfGood, String counts,
			String weight, String volume, String costOfDecoration, String type,
			String id) {

		MailingListVO mailingListVO = new MailingListVO( senderName,  senderCompany,
				 senderMobile,  senderPhone,  senderCity,
				 senderPosition,  receiveName,  receiveCompany,
				 receiveMobile,  receivePhone,  receiveCity,
				 receivePosition,  nameOfGood,  counts,
				 weight,  volume,  costOfDecoration,type,
				 id);
		String[] info =  { senderName,  senderCompany,
				 senderMobile,  senderPhone,  senderCity,
				 senderPosition,  receiveName,  receiveCompany,
				 receiveMobile,  receivePhone,  receiveCity,
				 receivePosition,  nameOfGood,  counts,
				 weight,  volume,  costOfDecoration,type};
		for (String string : info) {
			if(string.isEmpty()) return false;
		}
		return mailingBLImpl.creat(mailingListVO);
	}

	

	public int time(String senderCity, String receiveCity) {
		
		return mailingBLImpl.calculateTime(senderCity, receiveCity);
	}



	public double price(String senderCity, String receiveCity, String counts,
			String weight, String volume, String costOfDecoration, String type) {
		
		return (int)mailingBLImpl.calculatePrice(senderCity, receiveCity, counts, 
				weight, volume, costOfDecoration, type);
	}



	

}