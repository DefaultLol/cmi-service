package com.app.services;

import com.app.entity.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "client-service",url = "https://ensaspay-zuul-gateway.herokuapp.com/api/client")
public interface ClientService {
    @PostMapping("/create")
    public Client createClient(@RequestHeader("Authorization") String token,@RequestBody Client client);

    @GetMapping("/cmi/{tel}")
    public Client cmiChecker(@RequestHeader("Authorization") String token,@PathVariable String tel);
}
