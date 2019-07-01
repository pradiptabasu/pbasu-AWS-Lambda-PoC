/* jshint esversion : 6 */

/*INPUT TO LAMBDA    ---->      {"CustomerID":"1", "CustomerType":"RETAIL"}     */

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
    	    Key:{
    	    	"CustomerType": event.CustomerType,
   			 	"CustomerID": event.CustomerID,
    	    },
    	    ConditionExpression:"CustomerBalance <= :custBalVal",
    	    ExpressionAttributeValues: {
    	        ":custBalVal": 10.0
    	    }
    	};
    
    console.log("Attempting a conditional delete...");
    docClient.delete(paramsForDynamoDB, function(err, data) {
        if (err) {
            console.error("Unable to delete item. Error JSON:", JSON.stringify(err, null, 2));
        } else {
            console.log("DeleteItem succeeded:", JSON.stringify(data, null, 2));
        }
    });
};