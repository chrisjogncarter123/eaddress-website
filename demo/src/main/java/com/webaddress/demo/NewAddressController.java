package com.webaddress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by ChrisJohnCarter on 5/15/17.
 */

@Controller
@RequestMapping(value="/newaddress")
public class NewAddressController {

    @Autowired
    private AddressService addressService;

  //  @RequestMapping(method = RequestMethod.GET)
    public  String newAddress(Model model){


        model.addAttribute("address", new Address());

        return "addressesform";
    }
}
