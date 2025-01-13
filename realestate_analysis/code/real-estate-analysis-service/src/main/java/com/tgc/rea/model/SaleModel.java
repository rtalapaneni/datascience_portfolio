package com.tgc.rea.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import com.tgc.rea.converter.DoubleConverter;
import lombok.Data;

@Data
public class SaleModel {
    @CsvBindByName(column = "Id")
    private int id;

    @CsvBindByName(column = "MSSubClass")
    private int msSubClass;

    @CsvBindByName(column = "MSZoning")
    private String msZoning;

    @CsvCustomBindByName(column = "LotFrontage", converter = DoubleConverter.class)
    private Double lotFrontage;

    @CsvBindByName(column = "LotArea")
    private int lotArea;

    @CsvBindByName(column = "Street")
    private String street;

    @CsvBindByName(column = "Alley")
    private String alley;

    @CsvBindByName(column = "LotShape")
    private String lotShape;

    @CsvBindByName(column = "LandContour")
    private String landContour;

    @CsvBindByName(column = "Utilities")
    private String utilities;

    @CsvBindByName(column = "LotConfig")
    private String lotConfig;

    @CsvBindByName(column = "LandSlope")
    private String landSlope;

    @CsvBindByName(column = "Neighborhood")
    private String neighborhood;

    @CsvBindByName(column = "Condition1")
    private String condition1;

    @CsvBindByName(column = "Condition2")
    private String condition2;

    @CsvBindByName(column = "BldgType")
    private String bldgType;

    @CsvBindByName(column = "HouseStyle")
    private String houseStyle;

    @CsvBindByName(column = "OverallQual")
    private int overallQual;

    @CsvBindByName(column = "OverallCond")
    private int overallCond;

    @CsvBindByName(column = "YearBuilt")
    private int yearBuilt;

    @CsvBindByName(column = "YearRemodAdd")
    private int yearRemodAdd;

    @CsvBindByName(column = "RoofStyle")
    private String roofStyle;

    @CsvBindByName(column = "RoofMatl")
    private String roofMatl;

    @CsvBindByName(column = "Exterior1st")
    private String exterior1st;

    @CsvBindByName(column = "Exterior2nd")
    private String exterior2nd;

    @CsvBindByName(column = "MasVnrType")
    private String masVnrType;

    @CsvCustomBindByName(column = "MasVnrArea", converter = DoubleConverter.class)
    private Double masVnrArea;

    @CsvBindByName(column = "ExterQual")
    private String exterQual;

    @CsvBindByName(column = "ExterCond")
    private String exterCond;

    @CsvBindByName(column = "Foundation")
    private String foundation;

    @CsvBindByName(column = "BsmtQual")
    private String bsmtQual;

    @CsvBindByName(column = "BsmtCond")
    private String bsmtCond;

    @CsvBindByName(column = "BsmtExposure")
    private String bsmtExposure;

    @CsvBindByName(column = "BsmtFinType1")
    private String bsmtFinType1;

    @CsvCustomBindByName(column = "BsmtFinSF1", converter = DoubleConverter.class)
    private Double bsmtFinSF1;

    @CsvBindByName(column = "BsmtFinType2")
    private String bsmtFinType2;

    @CsvCustomBindByName(column = "BsmtFinSF2", converter = DoubleConverter.class)
    private Double bsmtFinSF2;

    @CsvCustomBindByName(column = "BsmtUnfSF", converter = DoubleConverter.class)
    private Double bsmtUnfSF;

    @CsvCustomBindByName(column = "TotalBsmtSF", converter = DoubleConverter.class)
    private Double totalBsmtSF;

    @CsvBindByName(column = "Heating")
    private String heating;

    @CsvBindByName(column = "HeatingQC")
    private String heatingQC;

    @CsvBindByName(column = "CentralAir")
    private String centralAir;

    @CsvBindByName(column = "Electrical")
    private String electrical;

    @CsvBindByName(column = "1stFlrSF")
    private int firstFlrSF;

    @CsvBindByName(column = "2ndFlrSF")
    private int secondFlrSF;

    @CsvBindByName(column = "LowQualFinSF")
    private int lowQualFinSF;

    @CsvBindByName(column = "GrLivArea")
    private int grLivArea;

    @CsvBindByName(column = "BsmtFullBath")
    private int bsmtFullBath;

    @CsvBindByName(column = "BsmtHalfBath")
    private int bsmtHalfBath;

    @CsvBindByName(column = "FullBath")
    private int fullBath;

    @CsvBindByName(column = "HalfBath")
    private int halfBath;

    @CsvBindByName(column = "BedroomAbvGr")
    private int bedroomAbvGr;

    @CsvBindByName(column = "KitchenAbvGr")
    private int kitchenAbvGr;

    @CsvBindByName(column = "KitchenQual")
    private String kitchenQual;

    @CsvBindByName(column = "TotRmsAbvGrd")
    private int totRmsAbvGrd;

    @CsvBindByName(column = "Functional")
    private String functional;

    @CsvBindByName(column = "Fireplaces")
    private int fireplaces;

    @CsvBindByName(column = "FireplaceQu")
    private String fireplaceQu;

    @CsvBindByName(column = "GarageType")
    private String garageType;

    @CsvCustomBindByName(column = "GarageYrBlt", converter = DoubleConverter.class)
    private Double garageYrBlt;

    @CsvBindByName(column = "GarageFinish")
    private String garageFinish;

    @CsvBindByName(column = "GarageCars")
    private int garageCars;

    @CsvBindByName(column = "GarageArea")
    private int garageArea;

    @CsvBindByName(column = "GarageQual")
    private String garageQual;

    @CsvBindByName(column = "GarageCond")
    private String garageCond;

    @CsvBindByName(column = "PavedDrive")
    private String pavedDrive;

    @CsvBindByName(column = "WoodDeckSF")
    private int woodDeckSF;

    @CsvBindByName(column = "OpenPorchSF")
    private int openPorchSF;

    @CsvBindByName(column = "EnclosedPorch")
    private int enclosedPorch;

    @CsvBindByName(column = "3SsnPorch")
    private int threeSsnPorch;

    @CsvBindByName(column = "ScreenPorch")
    private int screenPorch;

    @CsvBindByName(column = "PoolArea")
    private int poolArea;

    @CsvBindByName(column = "PoolQC")
    private String poolQC;

    @CsvBindByName(column = "Fence")
    private String fence;

    @CsvBindByName(column = "MiscFeature")
    private String miscFeature;

    @CsvBindByName(column = "MiscVal")
    private int miscVal;

    @CsvBindByName(column = "MoSold")
    private int moSold;

    @CsvBindByName(column = "YrSold")
    private int yrSold;

    @CsvBindByName(column = "SaleType")
    private String saleType;

    @CsvBindByName(column = "SaleCondition")
    private String saleCondition;

    @CsvBindByName(column = "SalePrice")
    private int salePrice;

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return "SaleRecord{" +
                "id=" + id +
                ", msSubClass=" + msSubClass +
                ", msZoning='" + msZoning + '\'' +
                ", lotFrontage=" + lotFrontage +
                ", lotArea=" + lotArea +
                // Add other fields here for debugging
                '}';
    }
}
