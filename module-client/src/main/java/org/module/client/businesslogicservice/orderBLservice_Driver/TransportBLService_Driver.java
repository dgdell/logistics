package org.module.client.businesslogicservice.orderBLservice_Driver;

import org.module.client.businesslogicservice.orderBLservice.TransportBLService;
import org.module.client.vo.TransportListVO;


public class TransportBLService_Driver {
	public void drive(TransportBLService transportBLService){
		boolean result=transportBLService.creat("car", "loadingDate","transId",
				"carId", "origin",  "arrival", "counterId",
				"supervision", "shippingId","price");
		if(result)
			System.out.println("creat suuccessfully!");
	}
}