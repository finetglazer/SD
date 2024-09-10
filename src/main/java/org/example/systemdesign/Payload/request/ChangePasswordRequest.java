package org.example.systemdesign.Payload.request;

import org.example.systemdesign.validation.ValidPassword;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;



@Data
public class ChangePasswordRequest {

    private String email;
    private String phone;


}
