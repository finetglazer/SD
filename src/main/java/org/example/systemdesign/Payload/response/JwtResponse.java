package org.example.systemdesign.Payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {
    private Integer status;
    private String token;
}
