package com.example.myapplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mock;

public class LoginUnitTest3 {

    private static final String INVALID_STRING = "Invalid login!";
    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_ANdTEST() {

        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        String result = myObjectUnderTest.validate("notadmin", "notadmin");
        assertThat(result, is(INVALID_STRING));
    }

}
