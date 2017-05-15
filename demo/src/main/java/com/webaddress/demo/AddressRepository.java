package com.webaddress.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ChrisJohnCarter on 5/15/17.
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
    Address findByFullAddress(String fullAddress);
}