package io.eventuate.examples.tram.sagas.ordersandcustomers.orders.commandsandreplies;

import io.eventuate.tram.commands.common.Command;

public class ApproveOrderCommand implements Command {
  private long orderId;

  private ApproveOrderCommand() {
  }


  public ApproveOrderCommand(long orderId) {
    if((orderId >= 2) && (orderId <= 4)){
      this.orderId = 1;
    }

    else{
      this.orderId = orderId;
    }

  }

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }
}
