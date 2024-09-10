package org.example.systemdesign.controller;


import jakarta.validation.Valid;
import org.example.systemdesign.Payload.request.ChangePasswordRequest;
import org.example.systemdesign.Payload.request.LoginRequest;
import org.example.systemdesign.Payload.request.SignUpRequest;
import org.example.systemdesign.Payload.request.UpdatePasswordRequest;
import org.example.systemdesign.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authService.register(signUpRequest));
    }



    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
        return ResponseEntity.ok(authService.forgotPassword(changePasswordRequest));
    }

    @PostMapping("/change-password")
    public ResponseEntity<?> update(@Valid @RequestBody UpdatePasswordRequest updatePasswordRequest) {
        return ResponseEntity.ok(authService.update(updatePasswordRequest));
    }
    /*
    Json for example:


     */


}
