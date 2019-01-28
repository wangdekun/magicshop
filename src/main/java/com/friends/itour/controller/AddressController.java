package com.friends.itour.controller;

import com.friends.itour.model.AddressEntity;
import com.friends.itour.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    public AddressEntity appengAddress(@RequestBody AddressEntity addressEntity){
        return addressService.addAddress(addressEntity);
    }

}
