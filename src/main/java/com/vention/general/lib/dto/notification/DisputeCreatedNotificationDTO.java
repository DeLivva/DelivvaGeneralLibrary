package com.vention.general.lib.dto.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisputeCreatedNotificationDTO {
    private Long disputeId;
    private Long orderId;
    private String ownerName;
    private String driverName;
    private String description;
}
