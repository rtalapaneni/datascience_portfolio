const SalesTableV1 = ({salesData}) => {
    return (
        <div>
            <h1>Sales Table : {salesData.length}</h1>
            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Street</th>
                        <th>Building Type</th>
                        <th>House Style</th>
                        <th>Year Built</th>
                    </tr>
                </thead>
                <tbody>
                    {salesData.map((sale, index) => (
                        <tr key={index}>
                            <td>{sale.id}</td>
                            <td>{sale.street}</td>
                            <td>{sale.bldgType}</td>
                            <td>{sale.houseStyle}</td>
                            <td>{sale.yearBuilt}</td>
                        </tr>
                    ))}
                </tbody>
            </table>    
        </div>
    )
}

export default SalesTableV1;