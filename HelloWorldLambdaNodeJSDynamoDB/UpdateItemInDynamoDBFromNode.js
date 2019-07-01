/* jshint esversion : 6 */

/*INPUT TO LAMBDA    ---->      { "firstName":"Pradipta", "lastName":"Basu", "CustomerID":"1", "CustomerType":"RETAIL", "CustomerBalance": 5, "currentBalance":67, "currentData":78, "currentSMS":34  }     */

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
    	    //date attribute was not updated as column name date is a reserved word 
    	    UpdateExpression: "set CustomerBalance=:cb, arrayParams=:a, dynaParams=:d",
    	    ExpressionAttributeValues:{
    	        ":cb":event.CustomerBalance,
    	        ":a":["Larry", "Moe", "Curly"],
    	        ":d":{
    	        		"currentBalance":event.currentBalance,
    	        		"currentData":event.currentData,
    	        		"currentSMS":event.currentSMS
    	        	}
    	    },
    	    ReturnValues:"UPDATED_NEW"
    	};

    console.log("Updating the item...");
    docClient.update(paramsForDynamoDB, function(err, data) {
        if (err) {
            console.error("Unable to update item. Error JSON:", JSON.stringify(err, null, 2));
        } else {
            console.log("UpdateItem succeeded:", JSON.stringify(data, null, 2));
        }
    });

};