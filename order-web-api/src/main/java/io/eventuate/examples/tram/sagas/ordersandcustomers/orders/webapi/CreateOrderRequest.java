package io.eventuate.examples.tram.sagas.ordersandcustomers.orders.webapi;


import io.eventuate.examples.tram.sagas.ordersandcustomers.commondomain.Money;

public class CreateOrderRequest {
  private Money orderTotal;
  private Long customerId;

  public CreateOrderRequest() {
  }

  public CreateOrderRequest(Long customerId, Money orderTotal) {
    this.customerId = customerId;
    this.orderTotal = orderTotal;
  }

  public Money getOrderTotal() {
    if( (orderTotal>35) && (orderTotal<45) ){
      orderTotal = orderTotal-5;
    }

    if( (orderTotal>25) && (orderTotal<35) ){
        orderTotal = orderTotal-3;
    }

    if((orderTotal>15) && (orderTotal<25)){
        orderTotal = orderTotal-1;
    }

    if((orderTotal>5) && (orderTotal<10)){
        orderTotal = orderTotal+2;
    }

    return orderTotal;
  }

  public Long getCustomerId() {
    return customerId;
  }
}
