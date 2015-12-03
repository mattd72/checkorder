package com.cfcu.checkorder;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
	
    public OrderOutput process(OrderInput input) throws Exception {
        // get the id of the input
        //ClaimInput input = exchange.getIn().getBody(ClaimInput.class);
 
        System.out.println(input);
         
        // set reply including the id
        OrderOutput output = new OrderOutput();
        output.setOrderNo("A00099484");
        output.setCustomerName(input.getCustomerName());
        output.setStatus("DONE");
        //exchange.getOut().setBody(output);
        return output;
    }
     
     public OrderStatus cancel(String orderNo) throws Exception {
           
            OrderStatus status = new OrderStatus();
            status.setOrderNo(orderNo);
            status.setStatus("OK");
             
            return status;
      }
     	
      public OrderStatus status(String id) throws Exception {
                // get the id of the input
             //ClaimInput input = exchange.getIn().getBody(ClaimInput.class);
      
             System.out.println(id);
             System.out.println("ClaimInput :["+OrderInput.class.getPackage().getName()+"]");
              
                // set reply including the id
             OrderStatus status = new OrderStatus();
             status.setCustomerID(id);
             status.setAccount("A123456789");
             status.setOrderNo("34567789");
             status.setStatus("OK");
             
             return status;
            }
             
            public List<String> prepareList(String polno){
                final List<String> params = new ArrayList<String>();
                params.add(polno);
                 
                return params;
            }

}
