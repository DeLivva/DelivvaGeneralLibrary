package com.vention.general.lib.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationRequestDTO {
    {
        this.page = this.page != null ? this.page : 0;
        this.size = this.size != null ? this.size : 10;
    }

    private Integer page;
    private Integer size;
}