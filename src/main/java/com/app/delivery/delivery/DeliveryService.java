package com.app.delivery.delivery;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryEntity dispatchDeliver(DeliveryEntity request){


        if(request.getFname().isEmpty()){
            throw new RuntimeException(" First name is required");
        }

        if(request.getLname().isEmpty()){
            throw new RuntimeException(" Last name is required");
        }



       return deliveryRepository.save(request);




    }

    public String confirmed(DeliveryEntity request){

       DeliveryEntity saveTobe = deliveryRepository.findById(request.getId()).orElseThrow();
       saveTobe.setStatus("DELIVERED");
       deliveryRepository.save(saveTobe);

       return saveTobe.getFname()+" recieved the item";
    }
}
