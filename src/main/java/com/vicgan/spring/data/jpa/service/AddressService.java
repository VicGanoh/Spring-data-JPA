package com.vicgan.spring.data.jpa.service;

import com.vicgan.spring.data.jpa.model.Address;
import com.vicgan.spring.data.jpa.respository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddress(){
        return new ArrayList<>(addressRepository.findAll());
    }

    public Optional<Address> getAddressById(Long id){
        return addressRepository.findById(id);
    }

    public Address updateAddress(Address address, Long id){
        return addressRepository.save(address);
    }
}
