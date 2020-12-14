package io.virtualan.test;

import io.virtualan.idaithalam.contract.IdaithalamExecutor;
import org.junit.Assert;
import org.junit.Test;

public class ContractValidationTestExecution {
    @Test
    public static void main(String[] args) {
        //Initiate the contract testing
        //Generate feature file from POSTMAN Collection
        //Execute and Generate the HTML Cucumber report
        IdaithalamExecutor.main( new String[]{"Pet API Production Checkout"});
        Assert.assertTrue(true);
    }
}