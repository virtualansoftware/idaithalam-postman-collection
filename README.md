# Idaithalam

[![Build Status](https://travis-ci.com/virtualansoftware/idaithalam-contract-testing-demo.svg?branch=master)](https://travis-ci.com/virtualansoftware/idaithalam-contract-testing-demo)

# What is Idaithalam:

Idaithalam is a NoCode/LowCode Api test Automation Framework.

As a user: You need to export the POSTMAN Collection and pass to Idaithalam. **NO CODING required** 

Currently It supports generate Feature files for **POSTMAN Collection** and Virtualan Collection and Excel format. 
This will covert REST APIs based on POST, GET, PUT, DELETE and PATCH action as respective domain specific language which helps you to describe API/business behavior without the need to go into detail of implementation. 

## Steps to create POSTMAN Collection
* Create a collection
* Under the created collection, create a API request
* Add the GET URL for the API testing
* After providing the input information for the API, run the API by clicking 'SEND'
* Save the API request via 'save example' in the postman
* Repeat the above steps to create all the API request
* Export the created API request/response as Postman collection

### Demo POSTMAN Collection: 

### Auto Generated Feature file: 
[https://github.com/virtualansoftware/idaithalam-api-postman-collection-testing/blob/master/src/test/resources/idaithalan.postman_collection.json](https://github.com/virtualansoftware/idaithalam-api-postman-collection-testing/blob/master/src/test/resources/idaithalan.postman_collection.json) 

### Demo Code Base:
[https://github.com/virtualansoftware/idaithalam-api-postman-collection-testing](https://github.com/virtualansoftware/idaithalam-api-postman-collection-testing)

### How to Integrate: 

1. cucumblan.properties  - Should be added in classpath

```
service.api=https://live.virtualandemo.com                 # Service Endpoint URL
virtualan.data.load=idaithalan.postman_collection.json     # Collection file should be in CLASSPATH. added POSTMAN Collection  
virtualan.data.heading=API testing                         # heading
virtualan.data.type=POSTMAN                                # Collection Type.  POSTMAN, VIRTUALAN, EXCEL

```
2.  "conf" directory: 

``` 
1. Should be created in the project root folder. 
2. Feature file will be Auto generated here. 
3. You can keep cucumblan.properties and Collection files in this location.

Example: 
https://github.com/virtualansoftware/idaithalam-api-postman-collection-testing/tree/master/conf 
```
3. Code to Invoke the Auto Generation:
```
//Initiate the contract testing
//Generate feature file from POSTMAN Collection
//Execute and Generate the HTML Cucumber report
IdaithalamExecutor.validateContract("REPORT HEADING");

```

## Used for API testing.
* Most of the common use case, You can execute as Regression test suite for the test case executed manually via POSTMAN.
* Run the testcase via POSTMAN and store the response as Example with response data in the POSTMAN for all the test cases that you had executed. 
* Export all the API request and Response as POSTMAN collection.
* POSTMAN Collection can be passed as Input as Idaithalam.
* Idaithalam can be integrated along Continuous Integration and Continuous Delivery(CI/CD) with Pipeline.
* Idaithalam take the POSTMAN Collection as Input and Covert as Cucumber Feature file. 
* Cucumblan-API another product will execute the feature file and Produce the Cucumber Report with BDD style.
## Used for Contract testing.
* Support for Contract testing. 
## Used for Production Checkout.
* Utilized to run against selected use case that needs to validated against Production Checkout(Validation during the production release).   
## Used for Agile sprint-end Regression testing.
* During the sprint, You can run all the test cases Manually and then save the response via POSTMAN. Using Idaithalam, Export the POSTMAN Collection and Pass Collection to Idaithalam and will execute and produce the Excellent cucumber HTML Report with all the charts.   
