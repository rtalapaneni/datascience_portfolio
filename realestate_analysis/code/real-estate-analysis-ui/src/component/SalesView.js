import { useState, useEffect } from 'react';
import SalesTableV1 from './SalesTableV1';
import SalesTableV2 from './SalesTableV2';

const SalesView = () => {

    const [salesData, setSalesData] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/real-estate-data')
            .then((response) => response.json())
            .then((data) => {
                setSalesData(data);
            })
            .catch((error) => {
                console.error('Error:', error);
            });
    }, []); 

    return (
        <div>
            {<SalesTableV2 salesData={salesData}/>}
        </div>
    );
}

export default SalesView;