import Table from 'antd/lib/table';

const SalesTableV2 = ({salesData}) => {
    const columns = [
        {
            title: 'Id',
            dataIndex: 'id',
            key: 'id',
        },
        {
            title: 'MS SubClass',
            dataIndex: 'msSubClass',
            key: 'msSubClass',
        },
        {
            title: 'MS Zoning',
            dataIndex: 'msZoning',
            key: 'msZoning',
        },
        {
            title: 'Lot Frontage',
            dataIndex: 'lotFrontage',
            key: 'lotFrontage',
        },
        {
            title: 'Lot Area',
            dataIndex: 'lotArea',
            key: 'lotArea',
        },
        {
            title: 'Street',
            dataIndex: 'street',
            key: 'street',
        },
        {
            title: 'Alley',
            dataIndex: 'alley',
            key: 'alley',
        },
        {
            title: 'Lot Shape',
            dataIndex: 'lotShape',
            key: 'lotShape',
        },
        {
            title: 'Land Contour',
            dataIndex: 'landContour',
            key: 'landContour',
        },
        {
            title: 'Utilities',
            dataIndex: 'utilities',
            key: 'utilities',
        },
        {
            title: 'Lot Config',
            dataIndex: 'lotConfig',
            key: 'lotConfig',
        },
        {
            title: 'Land Slope',
            dataIndex: 'landSlope',
            key: 'landSlope',
        },
        {
            title: 'Neighborhood',
            dataIndex: 'neighborhood',
            key: 'neighborhood',
        },
        {
            title: 'Condition 1',
            dataIndex: 'condition1',
            key: 'condition1',
        },
        {
            title: 'Condition 2',
            dataIndex: 'condition2',
            key: 'condition2',
        },
        {
            title: 'Building Type',
            dataIndex: 'bldgType',
            key: 'bldgType',
        },
        {
            title: 'House Style',
            dataIndex: 'houseStyle',
            key: 'houseStyle',
        },
        {
            title: 'Overall Quality',
            dataIndex: 'overallQual',
            key: 'overallQual',
        },
        {
            title: 'Overall Condition',
            dataIndex: 'overallCond',
            key: 'overallCond',
        },
        {
            title: 'Year Built',
            dataIndex: 'yearBuilt',
            key: 'yearBuilt',
            sorter: (a, b) => a.yearBuilt - b.yearBuilt,
            filters: [
                { text: 'Before 2000', value: 'before2000' },
                { text: '2000 and After', value: '2000andAfter' }
            ],
            onFilter: (value, record) => {
                if (value === 'before2000') return record.yearBuilt < 2000;
                if (value === '2000andAfter') return record.yearBuilt >= 2000;
                return true;
            },
        },
        {
            title: 'Year Remodeled',
            dataIndex: 'yearRemodAdd',
            key: 'yearRemodAdd',
        },
        {
            title: 'Roof Style',
            dataIndex: 'roofStyle',
            key: 'roofStyle',
        },
        {
            title: 'Roof Material',
            dataIndex: 'roofMatl',
            key: 'roofMatl',
        },
        {
            title: 'Exterior 1st',
            dataIndex: 'exterior1st',
            key: 'exterior1st',
        },
        {
            title: 'Exterior 2nd',
            dataIndex: 'exterior2nd',
            key: 'exterior2nd',
        },
        {
            title: 'Masonry Veneer Type',
            dataIndex: 'masVnrType',
            key: 'masVnrType',
        },
        {
            title: 'Masonry Veneer Area',
            dataIndex: 'masVnrArea',
            key: 'masVnrArea',
        },
        {
            title: 'Exterior Quality',
            dataIndex: 'exterQual',
            key: 'exterQual',
        },
        {
            title: 'Exterior Condition',
            dataIndex: 'exterCond',
            key: 'exterCond',
        },
        {
            title: 'Foundation',
            dataIndex: 'foundation',
            key: 'foundation',
        },
        {
            title: 'Basement Quality',
            dataIndex: 'bsmtQual',
            key: 'bsmtQual',
        },
        {
            title: 'Basement Condition',
            dataIndex: 'bsmtCond',
            key: 'bsmtCond',
        },
        {
            title: 'Basement Exposure',
            dataIndex: 'bsmtExposure',
            key: 'bsmtExposure',
        },
        {
            title: 'Basement Finished Type 1',
            dataIndex: 'bsmtFinType1',
            key: 'bsmtFinType1',
        },
        {
            title: 'Basement Finished Area 1',
            dataIndex: 'bsmtFinSF1',
            key: 'bsmtFinSF1',
        },
        {
            title: 'Basement Finished Type 2',
            dataIndex: 'bsmtFinType2',
            key: 'bsmtFinType2',
        },
        {
            title: 'Basement Finished Area 2',
            dataIndex: 'bsmtFinSF2',
            key: 'bsmtFinSF2',
        },
        {
            title: 'Basement Unfinished Area',
            dataIndex: 'bsmtUnfSF',
            key: 'bsmtUnfSF',
        },
        {
            title: 'Total Basement Area',
            dataIndex: 'totalBsmtSF',
            key: 'totalBsmtSF',
        },
        {
            title: 'Heating',
            dataIndex: 'heating',
            key: 'heating',
        },
        {
            title: 'Heating Quality',
            dataIndex: 'heatingQC',
            key: 'heatingQC',
        },
        {
            title: 'Central Air',
            dataIndex: 'centralAir',
            key: 'centralAir',
        },
        {
            title: 'Electrical System',
            dataIndex: 'electrical',
            key: 'electrical',
        },
        {
            title: 'First Floor Area',
            dataIndex: 'firstFlrSF',
            key: 'firstFlrSF',
        },
        {
            title: 'Second Floor Area',
            dataIndex: 'secondFlrSF',
            key: 'secondFlrSF',
        },
        {
            title: 'Low Quality Finished Area',
            dataIndex: 'lowQualFinSF',
            key: 'lowQualFinSF',
        },
        {
            title: 'Above Grade Living Area',
            dataIndex: 'grLivArea',
            key: 'grLivArea',
        },
        {
            title: 'Basement Full Bathrooms',
            dataIndex: 'bsmtFullBath',
            key: 'bsmtFullBath',
        },
        {
            title: 'Basement Half Bathrooms',
            dataIndex: 'bsmtHalfBath',
            key: 'bsmtHalfBath',
        },
        {
            title: 'Full Bathrooms',
            dataIndex: 'fullBath',
            key: 'fullBath',
        },
        {
            title: 'Half Bathrooms',
            dataIndex: 'halfBath',
            key: 'halfBath',
        },
        {
            title: 'Bedrooms Above Grade',
            dataIndex: 'bedroomAbvGr',
            key: 'bedroomAbvGr',
        },
        {
            title: 'Kitchens Above Grade',
            dataIndex: 'kitchenAbvGr',
            key: 'kitchenAbvGr',
        },
        {
            title: 'Kitchen Quality',
            dataIndex: 'kitchenQual',
            key: 'kitchenQual',
        },
        {
            title: 'Total Rooms Above Grade',
            dataIndex: 'totRmsAbvGrd',
            key: 'totRmsAbvGrd',
        },
        {
            title: 'Functional Condition',
            dataIndex: 'functional',
            key: 'functional',
        },
        {
            title: 'Fireplaces',
            dataIndex: 'fireplaces',
            key: 'fireplaces',
        },
        {
            title: 'Fireplace Quality',
            dataIndex: 'fireplaceQu',
            key: 'fireplaceQu',
        },
        {
            title: 'Garage Type',
            dataIndex: 'garageType',
            key: 'garageType',
        },
        {
            title: 'Garage Year Built',
            dataIndex: 'garageYrBlt',
            key: 'garageYrBlt',
        },
        {
            title: 'Garage Finish',
            dataIndex: 'garageFinish',
            key: 'garageFinish',
        },
        {
            title: 'Garage Cars Capacity',
            dataIndex: 'garageCars',
            key: 'garageCars',
        },
        {
            title: 'Garage Area',
            dataIndex: 'garageArea',
            key: 'garageArea',
        },
        {
            title: 'Garage Quality',
            dataIndex: 'garageQual',
            key: 'garageQual',
        },
        {
            title: 'Garage Condition',
            dataIndex: 'garageCond',
            key: 'garageCond',
        },
        {
            title: 'Paved Drive',
            dataIndex: 'pavedDrive',
            key: 'pavedDrive',
        },
        {
            title: 'Wood Deck Area',
            dataIndex: 'woodDeckSF',
            key: 'woodDeckSF',
        },
        {
            title: 'Open Porch Area',
            dataIndex: 'openPorchSF',
            key: 'openPorchSF',
        },
        {
            title: 'Enclosed Porch Area',
            dataIndex: 'enclosedPorch',
            key: 'enclosedPorch',
        },
        {
            title: 'Three Season Porch Area',
            dataIndex: 'threeSsnPorch',
            key: 'threeSsnPorch',
        },
        {
            title: 'Screen Porch Area',
            dataIndex: 'screenPorch',
            key: 'screenPorch',
        },
        {
            title: 'Pool Area',
            dataIndex: 'poolArea',
            key: 'poolArea',
        },
        {
            title: 'Pool Quality',
            dataIndex: 'poolQC',
            key: 'poolQC',
        },
        {
            title: 'Fence Quality',
            dataIndex: 'fence',
            key: 'fence',
        },
        {
            title: 'Miscellaneous Features',
            dataIndex: 'miscFeature',
            key: 'miscFeature',
        },
        {
            title: 'Miscellaneous Value',
            dataIndex: 'miscVal',
            key: 'miscVal',
        },
        {
            title: 'Month Sold',
            dataIndex: 'moSold',
            key: 'moSold',
        },
        {
            title: 'Year Sold',
            dataIndex: 'yrSold',
            key: 'yrSold',
        },
        {
            title: 'Sale Type',
            dataIndex: 'saleType',
            key: 'saleType',
        },
        {
            title: 'Sale Condition',
            dataIndex: 'saleCondition',
            key: 'saleCondition',
        },
        {
            title: 'Sale Price',
            dataIndex: 'salePrice',
            key: 'salePrice',
        }
    ];

    return (
        <div>
            <Table dataSource={salesData} columns={columns}/> 
        </div>
    )
}

export default SalesTableV2;