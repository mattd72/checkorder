package com.cfcu.checkorder;

public interface OrderService {
	
    public OrderOutput apply(OrderInput input);
    public OrderStatus cancel(String OrderNo);

}
