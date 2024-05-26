package com.example.bank_api.rest.contollers;

import com.example.bank_api.rest.request.WalletRequest;
import com.example.bank_api.rest.response.WalletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1")
public class WalletController {
    @GetMapping("/test")
    public String test() {
        return "test Hello";
    }
    @PostMapping(value = "/wallet", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void walletResponse(WalletRequest walletRequest){
    }

    @GetMapping("/wallets/{uuid}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public WalletResponse getWalletByUUID(@PathVariable String uuid) {
        WalletResponse walletResponse = new WalletResponse();
        //Получаю через базу
        walletResponse.setUuid(uuid);
        walletResponse.setAmount(new BigDecimal("1000.01"));
        return walletResponse;
    }
}
