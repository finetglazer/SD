package org.example.systemdesign.Payload.request;


import org.example.systemdesign.validation.ValidPassword;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class SignUpRequest {

    @NotBlank
    private String name;

    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(min = 6, max = 40)
    @ValidPassword
    private String password;

    // phone, email, etc.
    @Min(10)
    @NotBlank
    private String phoneNumber;

    @NotBlank
    private String email;
}
