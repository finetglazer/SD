package org.example.systemdesign.service;

import org.example.systemdesign.Payload.request.ChangePasswordRequest;
import org.example.systemdesign.Payload.request.LoginRequest;
import org.example.systemdesign.Payload.request.SignUpRequest;
import org.example.systemdesign.Payload.request.UpdatePasswordRequest;
import org.example.systemdesign.Payload.response.BaseResponse;


public interface AuthService {
    BaseResponse<?> login(LoginRequest loginRequest);
    BaseResponse<?> register(SignUpRequest signUpRequest);
    BaseResponse<?> forgotPassword(ChangePasswordRequest changePasswordRequest);
    BaseResponse<?> update(UpdatePasswordRequest updatePasswordRequest);
}
