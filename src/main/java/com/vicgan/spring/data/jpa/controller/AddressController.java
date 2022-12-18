package com.vicgan.spring.data.jpa.controller;

import com.vicgan.spring.data.jpa.model.Address;
import com.vicgan.spring.data.jpa.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    public AddressService addressService;

    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable("id") Long id){
        return addressService.getAddressById(id);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@RequestBody Address address, @PathVariable("id") Long id){
        return addressService.updateAddress(address, id);
    }

}
