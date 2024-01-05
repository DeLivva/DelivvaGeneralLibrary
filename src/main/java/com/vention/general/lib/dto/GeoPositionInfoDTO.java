package com.vention.general.lib.dto;

import com.vention.general.lib.dto.response.GeolocationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeoPositionInfoDTO {
    private Long userId;
    private String trackNumber;
    private GeolocationDTO latitudeAndLongitude;
}
