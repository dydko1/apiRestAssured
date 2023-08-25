package pl.card.service.test;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class FirstTest {
    @Test
    public void test1() {
        assertThat(RestAssured.config(), instanceOf(RestAssuredConfig.class));
    }
}
