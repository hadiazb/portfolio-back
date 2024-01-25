package com.hadiazb.portfolio.controllers.profile;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    Map<String, Object> response = new HashMap<>();

    @GetMapping({ "", "/" })
    public ResponseEntity<Map<String, Object>> findAll() {
        try {
            response.put("error", false);
            response.put("message", "GetAll Results");
            response.put("statue", HttpStatus.OK.value());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping({ "/{id}", "/{id}/" })
    public ResponseEntity<Map<String, Object>> find(@PathVariable Integer id) {
        try {
            response.put("error", false);
            response.put("message", "GetOne Result");
            response.put("statue", HttpStatus.OK.value());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping({ "", "/" })
    public ResponseEntity<Map<String, Object>> create() {
        try {
            response.put("error", false);
            response.put("message", "Create Result\"");
            response.put("statue", HttpStatus.OK.value());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping({ "", "/" })
    public ResponseEntity<Map<String, Object>> update() {
        try {
            response.put("error", false);
            response.put("message", "Update Result");
            response.put("statue", HttpStatus.OK.value());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping({ "/{id}", "/{id}/" })
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Integer id) {
        try {
            response.put("error", false);
            response.put("message", "Destroy Result");
            response.put("statue", HttpStatus.OK.value());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
