package com.tgc.rea.dto;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {
    private int id;
    private String street;
    private String bldgType;
    private String houseStyle;
    private int yearBuilt;
}
