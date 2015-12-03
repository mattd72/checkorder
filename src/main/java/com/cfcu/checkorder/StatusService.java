package com.cfcu.checkorder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/status")
public class StatusService {
	@GET
	@Path("/custId/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderStatus status (@PathParam("id") String custId) {
		return null;
	}
	
	@GET
	@Path("/restCancel/{orderNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderStatus restCancel (@PathParam("orderNo") String orderNo) {
		return null;
	}
	
}
