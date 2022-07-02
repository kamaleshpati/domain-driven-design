package com.way2learnonline.booking.application.internal.outboundservices;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.way2learnonline.shareddomain.model.TransitPath;


//TODO -2 uncomment the below annotation so that a proxy implementing this interface can be generated. 
//That proxy will have logic to make restful calls based on the @RequestMapping annotation



//@FeignClient(name = "routing-service",fallback = CargoRoutingServiceFallback.class)
public interface CargoRoutingService {
	
	
	@GetMapping(path = "/cargorouting/optimalRoute")
	    
	public TransitPath findOptimalRoute(
	             @RequestParam("origin") String originUnLocode,
	             @RequestParam("destination") String destinationUnLocode,
	             @RequestParam("deadline") String deadline);
	
	// public TransitPath findOptimalRoute(String originUnLocode, String destinationUnLocode, String deadline) ;

}
