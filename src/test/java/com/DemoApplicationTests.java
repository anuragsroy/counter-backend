package com.example;

import org.junit.jupiter.api.Test;
import org.testng.ITest;

class DemoApplicationTests {

    @Test
    void shouldFailForCiCheck() {
        throw new RuntimeException("Intentional failure to verify mvn test");
    }
}
