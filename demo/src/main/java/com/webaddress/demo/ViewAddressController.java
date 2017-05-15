package com.webaddress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by ChrisJohnCarter on 5/15/17.
 */
@Controller
@RequestMapping(value="/viewaddress")
public class ViewAddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(method = RequestMethod.GET)
    public  String getAddress(Model model){

        List<Address> allAddressesList = this.addressService.getAllAddresses();
        model.addAttribute("allAddresses", allAddressesList);

        return "addresses";
    }
}
