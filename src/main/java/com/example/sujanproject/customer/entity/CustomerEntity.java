package com.example.sujanproject.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private Long contactNumber;
    private Date orderDate;
    private Date trialDate;
    private Date deliveryDate;
    private String coatLength;
    private String coatChest;
    private String coatWaist;
    private String coatHip;
    private String coatShoulder;
    private String coatSleeveLength;
    private String coatHalfBack;
    private String coatNeck;
    private String pantLength;
    private String pantWaist;
    private String pantHip;
    private String pantThigh;
    private String pantKnee;
    private String pantBottom;
    private String pantCrouch;
    private String shirtLength;
    private String shirtChest;
    private String shirtWaist;
    private String shirtHip;
    private String shirtShoulder;
    private String shirtSleeveLength;
    private String shirtNeck;
    private String note;
    private String particular;
    private Long totalAmount;
    private Long advanceAmount;
    private Long balanceAmount;
    private String statusOfBalance;
    private String statusOfProduct;



}
