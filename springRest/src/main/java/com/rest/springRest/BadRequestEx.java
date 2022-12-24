package com.rest.springRest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.ws.rs.BadRequestException;
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestEx extends BadRequestException {

}
