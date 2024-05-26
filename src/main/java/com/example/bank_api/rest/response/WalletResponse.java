package com.example.bank_api.rest.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class WalletResponse implements Serializable {
    BigDecimal amount;
    String uuid;
}
