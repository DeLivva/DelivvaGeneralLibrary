package com.vention.general.lib.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

/**
 * @author Abbos_Akramov
 * This class is returned when unexpected exception occurs
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalResponseDTO {
    private int status;
    private String message;
    private ZonedDateTime time;
}
