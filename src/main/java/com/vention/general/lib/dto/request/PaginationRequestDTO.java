package com.vention.general.lib.dto.request;

public record PaginationRequestDTO(
        Integer page,
        Integer size
) {
    public PaginationRequestDTO {
        page = page != null ? page : 0;
        size = size != null ? size : 10;
    }
}