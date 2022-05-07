package com.tlz.springbootmicroservice3apigateway.service;

import com.tlz.springbootmicroservice3apigateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
