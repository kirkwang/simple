package com.kirkwang.easy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by kewang on 12/29/15.
 */
public class TestClassPrivateAccessTest {

    @BeforeMethod
    public void setUp() throws Exception {

    }
    public void testhereisthetest(){
        new MajorityElement.TestClassPrivateAccess() {};
    }
    @AfterMethod
    public void tearDown() throws Exception {

    }
}