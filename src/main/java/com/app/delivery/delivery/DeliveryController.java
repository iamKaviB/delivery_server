package com.app.delivery.delivery;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delivery")
@AllArgsConstructor
public class DeliveryController {

    private final DeliveryService deliveryService;

    @PostMapping("/dispatch")
    public ResponseEntity<DeliveryEntity> createNewClient(@RequestBody DeliveryEntity request){
        return new ResponseEntity<>(deliveryService.dispatchDeliver(request), HttpStatus.CREATED);
    }

    @PostMapping("/confirm")
    public ResponseEntity<String> deliveryConfimed(@RequestBody DeliveryEntity request){

        return new ResponseEntity<>(deliveryService.confirmed(request), HttpStatus.CREATED);
    }
}
