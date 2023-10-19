package _00_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestUser {
    static String name = "John";

    @Test(description = "Verify admin can create new user")
    public void createNewUserTest(){
        System.out.println("Create new user ");
        Assert.fail();
    }

    @Test(dependsOnMethods = "createNewUserTest")//dependsOnMethods -зависмость от результата теста "createNewUserTest"
    public void checkCreatedUser(){
        System.out.println("Checking created user");
    }

    @Test
    public void test1(){
        String str = "Hello";
        String str2 = null;
        assertEquals(1,2);
        assertEquals("Hello","Hello");

    }
}
