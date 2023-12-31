package com.vention.general.lib.enums;

public enum OrderStatus {
    CREATED,
    PICKED_UP,
    IN_PROGRESS,
    REJECTED_BY_COURIER,
    REJECTED_BY_CUSTOMER,
    DISPUTE_OPENED,
    DISPUTE_CLOSED_BY_CUSTOMER,
    UNDER_CONSIDERATION,
    DISPUTE_CLOSED_CUSTOMER_WIN,
    DISPUTE_CLOSED_COURIER_WIN,
    DONE;

    public static OrderStatus getByName(String status) {
        for (OrderStatus orderStatus : values()) {
            if (orderStatus.name().equals(status)) {
                return orderStatus;
            }
        }
        return null;
    }
}
