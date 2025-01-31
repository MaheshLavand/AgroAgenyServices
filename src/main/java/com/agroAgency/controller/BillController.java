package com.agroAgency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agroAgency.entity.Bill;
import com.agroAgency.service.BillService;

@RestController
@RequestMapping("/bill")
@CrossOrigin("http://localhost:4200")
public class BillController {

	@Autowired
	BillService billService;

//	@PostMapping("/add")
//    public ResponseEntity<String> addBill(
//            @RequestBody Bill bill,
//            @RequestParam("customerId") int customerId) {
//        try {
//            billService.insertBill(bill, customerId);
//            return new ResponseEntity<>("Bill added successfully", HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//	
//	@PostMapping("/create_bill")
//    public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
//        Bill savedBill = billService.saveBill(bill);
//        return ResponseEntity.ok(savedBill);
//    }

}
