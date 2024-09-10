package org.example.systemdesign.Payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.example.systemdesign.validation.ValidPassword;

@Data
public class UpdatePasswordRequest {
    private Long id;
    private String newPassword;
    private String confirmPassword;

}
