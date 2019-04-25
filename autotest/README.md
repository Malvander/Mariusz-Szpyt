# BestBuy Store Api test

The project contains automation tests for BestBuy Store Api.

## List Of Cases
I decided to automate store related endpoints the cases will only test its functionalities.

0. Finding store by Id
0. Finding store by Id negative
0. Deleting store by Id
0. Deleting store by Id negative
0. Updating the store by Id
0. Finding stores by Name
0. Adding a store


## Getting Started

To run properly on your local machine compile it first to generate code from 
swagger. Once you compiled it - it stores in `generated-sources` folder.

## Prerequisites

What things you need to install to run from IntelliJ:

`Lombok plugin`

 Link to install: https://plugins.jetbrains.com/plugin/6317-lombok-plugin


## Running the tests

You can run tests using command:

`mvn test`

## Explanation of solution
I wanted to create tool that will suffice limited testing needs I have right now but also one that is easy to extend and update. Used swagger 
codegen to quikly generate api clients and models based on provided swagger documentation. Feign as convenient Java to HTTP client binder. TestNG to manage
test cases. Whole app is spring boot application as its easy to configure and also easy to start with spring initializr.

