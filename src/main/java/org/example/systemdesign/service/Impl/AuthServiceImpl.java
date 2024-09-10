package org.example.systemdesign.service.Impl;

import org.example.systemdesign.Payload.request.UpdatePasswordRequest;
import org.example.systemdesign.Payload.response.BaseResponse;
import org.example.systemdesign.model.User;
import org.example.systemdesign.repository.UserRepository;
import org.example.systemdesign.service.AuthService;
import org.example.systemdesign.Payload.request.ChangePasswordRequest;
import org.example.systemdesign.Payload.request.LoginRequest;
import org.example.systemdesign.Payload.request.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public BaseResponse<?> login(LoginRequest loginRequest) {
        User user = userRepository.findByUsername(loginRequest.getUsername());
        if (user == null) {
            return new BaseResponse<>(0, "username not found");
        }
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            return new BaseResponse<>(0, "password not match");
        }
        return new BaseResponse<>(1, "login success");
    }

    @Override
    public BaseResponse<?> register(SignUpRequest signUpRequest) {
        User user = userRepository.findByUsername(signUpRequest.getUsername());
        if (user != null) {
            return new BaseResponse<>(0, "username already exist");
        }
        user = new User();
        user.setUsername(signUpRequest.getUsername());
        user.setPassword(signUpRequest.getPassword());
        userRepository.save(user);
        return new BaseResponse<>(1, "register success");
    }


    @Override
    public BaseResponse<?> forgotPassword(ChangePasswordRequest changePasswordRequest) {
        if (changePasswordRequest.getEmail() == null && changePasswordRequest.getPhone() == null) {
            return new BaseResponse<>(0, "email or phone is required");
        }

        //check if email or phone is exist
        User user = userRepository.findByEmailOrPhone(changePasswordRequest.getEmail(), changePasswordRequest.getPhone());
        if (user == null) {
            return new BaseResponse<>(0, "email or phone not found");
        }

        //update password
        return new BaseResponse<>(1, user.getId());
    }

    @Override
    public BaseResponse<?> update(UpdatePasswordRequest updatePasswordRequest) {

        User user = userRepository.findById(updatePasswordRequest.getId()).orElse(null);
        user.setPassword(updatePasswordRequest.getNewPassword());
        userRepository.save(user);
        return new BaseResponse<>(1, "update password success");
    }


}
