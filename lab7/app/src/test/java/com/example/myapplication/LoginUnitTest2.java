package com.example.myapplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mock;

public class LoginUnitTest2 {

    private static final String VALID_STRING = "Login was successful";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        LoginActivity myObjectUnderTest = new LoginActivity(mMockContext);

        String result = myObjectUnderTest.validate("admin", "admin");
        assertThat(result, is(VALID_STRING));
    }
}
