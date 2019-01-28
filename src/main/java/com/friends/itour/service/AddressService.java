package com.friends.itour.service;

import com.friends.itour.core.universal.Service;
import com.friends.itour.model.AddressEntity;

public interface AddressService extends Service<AddressEntity> {
    public AddressEntity addAddress(AddressEntity addressEntity);
}
