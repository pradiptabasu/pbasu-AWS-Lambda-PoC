/* jshint esversion : 6 */

/*INPUT TO LAMBDA    ---->      { "CustomerID":"1", "CustomerType":"RETAIL"}     */

var AWS = require('aws-sdk');

//Set the region
AWS.config.region = 'us-east-1';
	//AWS.config.update({region: 'REGION'});

// Create DynamoDB document client
var docClient = new AWS.DynamoDB.DocumentClient({apiVersion: '2012-08-10'});

var lambda = new AWS.Lambda();

exports.handler = (event, context, callback) => {
    console.log(event);
//  console.log(JSON.parse(event));     	//operation not possible 
    console.log(JSON.stringify(event));
    
    var paramsForDynamoDB = {
    		 TableName: 'CustomerDetails',
    		 Key: {
    			 "CustomerType":event.CustomerType,
    			 "CustomerID": event.CustomerID
      		 }
    	};
   
    docClient.get(paramsForDynamoDB, function(err, data) {
        if (err) {
        	console.error("Unable to read item. Error JSON:", JSON.stringify(err, null, 2));
            callback(err,null);
        } else {
        	console.log("GetItem succeeded:", JSON.stringify(data, null, 2));
            callback(null,data);
        }
     });
};