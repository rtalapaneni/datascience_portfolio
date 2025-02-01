package com.tgc.rea.dto;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {
    private int id;
    private int msSubClass;
    private String msZoning;
    private Double lotFrontage;
    private int lotArea;
    private String street;
    private String alley;
    private String lotShape;
    private String landContour;
    private String utilities;
    private String lotConfig;
    private String landSlope;
    private String neighborhood;
    private String condition1;
    private String condition2;
    private String bldgType;
    private String houseStyle;
    private int overallQual;
    private int overallCond;
    private int yearBuilt;
    private int yearRemodAdd;
    private String roofStyle;
    private String roofMatl;
    private String exterior1st;
    private String exterior2nd;
    private String masVnrType;
    private Double masVnrArea;
    private String exterQual;
    private String exterCond;
    private String foundation;
    private String bsmtQual;
    private String bsmtCond;
    private String bsmtExposure;
    private String bsmtFinType1;
    private Double bsmtFinSF1;
    private String bsmtFinType2;
    private Double bsmtFinSF2;
    private Double bsmtUnfSF;
    private Double totalBsmtSF;
    private String heating;
    private String heatingQC;
    private String centralAir;
    private String electrical;
    private int firstFlrSF;
    private int secondFlrSF;
    private int lowQualFinSF;
    private int grLivArea;
    private int bsmtFullBath;
    private int bsmtHalfBath;
    private int fullBath;
    private int halfBath;
    private int bedroomAbvGr;
    private int kitchenAbvGr;
    private String kitchenQual;
    private int totRmsAbvGrd;
    private String functional;
    private int fireplaces;
    private String fireplaceQu;
    private String garageType;
    private Double garageYrBlt;
    private String garageFinish;
    private int garageCars;
    private int garageArea;
    private String garageQual;
    private String garageCond;
    private String pavedDrive;
    private int woodDeckSF;
    private int openPorchSF;
    private int enclosedPorch;
    private int threeSsnPorch;
    private int screenPorch;
    private int poolArea;
    private String poolQC;
    private String fence;
    private String miscFeature;
    private int miscVal;
    private int moSold;
    private int yrSold;
    private String saleType;
    private String saleCondition;
    private int salePrice;
}
