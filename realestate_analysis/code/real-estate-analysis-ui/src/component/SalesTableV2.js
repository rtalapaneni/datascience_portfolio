import Table from 'antd/lib/table';

const SalesTableV2 = ({salesData}) => {
    const columns = [
        {
            title: 'Id',
            dataIndex: 'id',
            key: 'id',
        },
        {
            title: 'Street',
            dataIndex: 'street',
            key: 'street',
        },
        {
            title: 'Building Type',
            dataIndex: 'buildingType',
            key: 'buildingType',
        },
        {
            title: 'House Style',
            dataIndex: 'houseStyle',
            key: 'houseStyle',
        },
        {
            title: 'Year Built',
            dataIndex: 'yearBuilt',
            key: 'yearBuilt',
        }
    ];

    return (
        <div>
            <Table dataSource={salesData} columns={columns}/> 
        </div>
    )
}

export default SalesTableV2;