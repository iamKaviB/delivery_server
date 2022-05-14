package com.app.delivery.delivery;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "delivery_details")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeliveryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "customer_fname")
    private String fname;

    @Column(name = "customer_lname")
    private String lname;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone")
    private String phone;

    @Column(name = "status")
    private String status = "PENDING";

}
