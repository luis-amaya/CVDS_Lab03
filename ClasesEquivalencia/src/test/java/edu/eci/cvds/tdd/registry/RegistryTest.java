package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Luis Amaya", 4, 20, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateDuplicatedResult() {
    	Person person = new Person("Sebastian Mina", 1, 20, Gender.MALE, true);
    	
    	RegisterResult result = registry.registerVoter(person);
    	RegisterResult result2 = registry.registerVoter(person);
    	
    	Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }
    
    @Test
    public void validateDeadResult() {
    	Person person = new Person("Luis Amaya", 1, 20, Gender.MALE, false);
    	
    	RegisterResult result = registry.registerVoter(person);
    	
    	Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateInvalidAgeResult() {
    	Person person = new Person("Sebastian Mina",1,-20,Gender.MALE,true);
    	
    	RegisterResult result = registry.registerVoter(person);
    	
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validateUnderAgeResult() {
    	Person person = new Person("Luis Amaya",1,16,Gender.MALE,true);
    	
    	RegisterResult result = registry.registerVoter(person);
    	
    	Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    

    // TODO Complete with more test cases
}
