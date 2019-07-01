/* jshint esversion : 6 */

/*INPUT TO LAMBDA    ---->      { "firstName":"Pradipta", "lastName":"Basu", "CustomerID":"1", "CustomerType":"RETAIL", "CustomerBalance": 45  }     */

var AWS = require('aws-sdk');

//Set the region
AWS.config.region = 'us-east-1';
	//AWS.config.update({region: 'REGION'});

// Create DynamoDB document client
var docClient = new AWS.DynamoDB.DocumentClient({apiVersion: '2012-08-10'});

var lambda = new AWS.Lambda();

exports.handler = (event, context, callback) => {
    console.log(event.firstName);
    console.log(event.lastName);
    console.log(event);
//    console.log(JSON.parse(event));     //operation not possible 
    console.log(JSON.stringify(event));
    
    var paramsForDynamoDB = {
    		 TableName: 'CustomerDetails',
    		 Item: {
    			 "date": Date.now(),
    			 "CustomerType": event.CustomerType,
    			 "CustomerID": event.CustomerID,
    			 "CustomerBalance": event.CustomerBalance
    		 }
    	};
    
    docClient.put(paramsForDynamoDB, function(err, data) {
        if (err) {
            callback(err,null);
        } else {
            callback(null,data);
        }
     });

};