package com.vention.general.lib.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleResponseDTO {
    private Long id;
    private String model;
    private String registrationNumber;
    private String color;
    private String type;
}
