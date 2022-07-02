package com.way2learnonline.booking.application.internal.outboundservices;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.way2learnonline.shareddomain.model.TransitPath;

@Service
public class CargoRoutingServiceImpl implements CargoRoutingService {
	
	

	@Autowired
	private RestTemplate restTemplate;
	
	
	

	// TODO -3 Annotate this method so that if this method thows an exception, findOptimalRouteFallback should be executed.
			// Also, Configure  execution.timeout.enabled property to false. can you tell why this is required?
			
		/*	@HystrixCommand(fallbackMethod = "findOptimalRouteFallback",commandKey = "rskey",threadPoolKey = "rstpkey",
		            commandProperties = {@HystrixProperty(name="execution.timeout.enabled", value="false")})
		*/
			
			
	public TransitPath findOptimalRoute(String originUnLocode, String destinationUnLocode, String deadline) {
		 final String REST_URI
         = "http://routing-service/cargorouting/optimalRoute?origin={origin}&destination={destination}&deadline={deadline}";
 

 
    	 System.err.println("CargoRoutingServiceImpl.findOptimalRoute()======hitting cargorouting service=========");
 
    	 TransitPath transitPath =restTemplate.getForObject( REST_URI, TransitPath.class,  originUnLocode,   destinationUnLocode,deadline);
		return transitPath;
	}
	
	public TransitPath findOptimalRouteFallback(String originUnLocode, String destinationUnLocode, String deadline) {
		
		System.err.println("CargoRoutingServiceImpl.findOptimalRouteFallback()******");
		return new TransitPath();
		
	}

}
