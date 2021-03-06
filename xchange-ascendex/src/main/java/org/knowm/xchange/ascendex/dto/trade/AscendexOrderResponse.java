package org.knowm.xchange.ascendex.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.Date;

public class AscendexOrderResponse {

  private final String ac;

  private final String accountId;

  private final String action;

  private final AscendexPlaceOrderInfo info;

  private final String status;

  public AscendexOrderResponse(
      @JsonProperty("ac") String ac,
      @JsonProperty("accountId") String accountId,
      @JsonProperty("action") String action,
      @JsonProperty("info") AscendexPlaceOrderInfo info,
      @JsonProperty("status") String status) {
    this.ac = ac;
    this.accountId = accountId;
    this.action = action;
    this.info = info;
    this.status = status;
  }

  public String getAc() {
    return ac;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getAction() {
    return action;
  }

  public AscendexPlaceOrderInfo getInfo() {
    return info;
  }

  public String getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "AscendexPlaceOrderResponse{"
        + "ac='"
        + ac
        + '\''
        + ", accountId='"
        + accountId
        + '\''
        + ", action='"
        + action
        + '\''
        + ", info="
        + info
        + ", status='"
        + status
        + '\''
        + '}';
  }

  public static class AscendexPlaceOrderInfo {
    private final String id;

    private final String orderId;

    private final String orderType;

    private final String symbol;

    private final Date timestamp;

    public AscendexPlaceOrderInfo(
        @JsonProperty("id") String id,
        @JsonProperty("orderId") String orderId,
        @JsonProperty("orderType") String orderType,
        @JsonProperty("symbol") String symbol,
        @JsonProperty("timestamp") Long timestamp) {
      this.id = id;
      this.orderId = orderId;
      this.orderType = orderType;
      this.symbol = symbol;
      this.timestamp = Date.from(Instant.ofEpochMilli(timestamp));
    }

    public String getId() {
      return id;
    }

    public String getOrderId() {
      return orderId;
    }

    public String getOrderType() {
      return orderType;
    }

    public String getSymbol() {
      return symbol;
    }

    public Date getTimestamp() {
      return timestamp;
    }

    @Override
    public String toString() {
      return "{"
          + "id='"
          + id
          + '\''
          + ", orderId='"
          + orderId
          + '\''
          + ", orderType='"
          + orderType
          + '\''
          + ", symbol='"
          + symbol
          + '\''
          + ", timestamp="
          + timestamp
          + '}';
    }
  }
}
