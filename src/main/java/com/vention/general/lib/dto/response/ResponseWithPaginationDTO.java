package com.vention.general.lib.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @param <T> is a type of list including T type elements
 * @author Abbos_Akramov
 * This response class is used when pagination neeeded
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseWithPaginationDTO<T> {
    private Integer currentPage;
    private Integer totalPages;
    private Long totalItems;
    private Integer pageSize;
    private List<T> data;
}
