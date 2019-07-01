/* jshint esversion : 6 */

/*INPUT TO LAMBDA    ---->      { "firstName":"Pradipta", "lastName":"Basu" }     */

var AWS = require('aws-sdk');
AWS.config.region = 'us-east-1';
var lambda = new AWS.Lambda();

exports.handler = (event, context, callback) => {
    console.log(event.firstName);
    console.log(event.lastName);
    console.log(event);
//    console.log(JSON.parse(event));     //operation not possible 
    console.log(JSON.stringify(event));
    
	var payload = '{ "firstName" : "' + event.firstName + '" , "lastName" : "' + event.lastName + '" }';
	console.log(JSON.stringify(payload));
	
	var params = {
			FunctionName: 'HelloWorldLambdaNodeJS', // the lambda function we are going to invoke
			InvocationType: 'RequestResponse',
			LogType: 'Tail',
			Payload: JSON.stringify(event)    //  also this works --->>>>   Payload: payload
	};

	lambda.invoke(params, function(err, data) {
		if (err) {
			context.fail(err,null);
		} else {
//			callback(null, data.Payload); JSON.parse(data.Payload)
			callback(null, data); 
		}
	});
};