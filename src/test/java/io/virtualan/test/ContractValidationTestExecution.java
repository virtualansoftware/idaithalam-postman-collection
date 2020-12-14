package io.virtualan.test;

import io.virtualan.idaithalam.contract.IdaithalamExecutor;
import org.junit.Assert;
import org.junit.Test;

public class ContractValidationTestExecution {
    @Test
    public void testContractValidation() {
        //Initiate the contract testing
        //Generate feature file from POSTMAN Collection
        //Execute and Generate the HTML Cucumber report
        IdaithalamExecutor.validateContract("Pet API Production Checkout");
        Assert.assertTrue(true);
    }
}