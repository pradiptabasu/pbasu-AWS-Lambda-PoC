/* jshint esversion : 6 */

/*INPUT TO LAMBDA    ---->      { "firstName":"Pradipta", "lastName":"Basu" }     */

'use strict';

console.log('Loading function');

exports.handler = (event, context, callback) => {
    //console.log('Received event:', JSON.stringify(event, null, 2));
    console.log('value1 =', event.firstName);
    console.log('value2 =', event.lastName);
    var returnResponse = {};
    returnResponse.greetings = 'Hello  ' + event.firstName + ' ' + event.lastName + ' !!!'; 
    returnResponse.greetingsV2 = 'HelloV2  ' + event.firstName + ' ' + event.lastName + ' !!!'; 
    callback(null, returnResponse);  // Echo back the first key value
    //callback('Something went wrong');
};