package com.example.bank_api.rest.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class WalletRequest implements Serializable {
    String walletId;
    String operationType;
    BigDecimal amount;
}
