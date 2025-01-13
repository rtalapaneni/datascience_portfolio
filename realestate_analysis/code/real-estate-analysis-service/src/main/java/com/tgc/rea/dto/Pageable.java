package com.tgc.rea.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pageable {
    private int pageSize = 10;
    private int pageNumber = 1;
    private int totalPages;
}
