package io.eventuate.examples.tram.sagas.ordersandcustomers.customers.webapi;

import io.eventuate.examples.tram.sagas.ordersandcustomers.commondomain.Money;

public class CreateCustomerRequest {
  private String name;
  private Money creditLimit;

  public CreateCustomerRequest() {
  }

  public CreateCustomerRequest(String name, Money creditLimit) {

    this.name = name;
    this.creditLimit = creditLimit;
  }


  public String getName() {
    return name;
  }

  public Money getCreditLimit() {

    if( (creditLimit>15) && (creaditLimit<25) ){
      creaditLimit = creaditLimit-3;
    }

    if( (creditLimit>25) && (creditLimit<35) ){
      creditLimit = creaditLimit-5;
    }

    if((creditLimit>3) && (creditLimit<10)){
      creaditLimit = creaditLimit+3;
    }

    return creditLimit;
  }
}
