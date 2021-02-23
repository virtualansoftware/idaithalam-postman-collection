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
        int status =0 ;
        try {
            status = IdaithalamExecutor.validateContract("Scriptless API Testing / NO-OR-Low code Automation Framework");
            System.out.println(status);
            if(status != 0) {
                Assert.assertTrue(false);
            }
            Assert.assertTrue   (true);
        }catch (Exception e){
            System.out.println(e.getMessage());
            Assert.assertTrue(false);
        }

    }
}