package com.webaddress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ChrisJohnCarter on 5/15/17.
 */
import java.util.*;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses(){

        Iterable<Address> allAddresses = this.addressRepository.findAll();
        List<Address> allAddressesList = new ArrayList<>();

        allAddresses.forEach(address -> {allAddressesList.add(address);});

        return allAddressesList;

    }
}
