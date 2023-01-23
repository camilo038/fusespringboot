package io.fabric8.quickstarts.camel.uitl;

import org.apache.camel.Exchange;

public class RouteFade {

	
	
	
	public void traerNuemo(Exchange exchange) {
	
	
	
   Integer  a  = (Integer) exchange.getProperty("precio");
		
		a = a +2000;

		
		exchange.setProperty("precio", a);
		
		
		
	
	}
	
	
	
	
}
