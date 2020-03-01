package edu.fsmvu.sbworkshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.29
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Long id) {
        super("Resource not found with given id: " + id);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
