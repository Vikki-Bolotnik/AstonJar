package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PostmanTest {

  @BeforeAll
  static void setup() {
    RestAssured.baseURI = "https://postman-echo.com";
  }

  @Test
  void testGetRequest() {
    given()
        .param("foo1", "bar1")
        .param("foo2", "bar2")
        .when()
        .get("/get")
        .then()
        .log().body()
        .statusCode(200)
        .body("args.foo1", equalTo("bar1"))
        .body("args.foo2", equalTo("bar2"));
  }

  @Test
  public void postRawText() {
    String jsonText = "{\"test\":\"value\"}";

    given()
        .header("Content-Type", "text/plain")
        .body(jsonText)
        .when()
        .post("/post")
        .then()
        .statusCode(200)
        .body("data", equalTo(jsonText));
  }

  @Test
  public void postFormData() {
    given()
        .contentType("application/x-www-form-urlencoded; charset=UTF-8")
        .formParam("foo1", "bar1")
        .formParam("foo2", "bar2")
        .when()
        .post("/post")
        .then()
        .statusCode(200)
        .body("form.foo1", equalTo("bar1"))
        .body("form.foo2", equalTo("bar2"))
        .body("url", equalTo("https://postman-echo.com/post"));
  }

  @Test
  public void testPutRequest() {
    String requestText = "This is expected to be sent back as part of response body.";

    given()
        .log().all()
        .body(requestText)
        .when()
        .put("/put")
        .then()
        .log().all()
        .statusCode(200)
        .body("data", equalTo(requestText))
        .body("url", equalTo("https://postman-echo.com/put"));
  }

  @Test
  public void testPatchRequest() {
    String requestText = "This is expected to be sent back as part of response body.";

    Response response = given()
        .log().all()
        .contentType("text/plain")
        .body(requestText)
        .when()
        .patch("/patch")
        .then()
        .log().all()
        .extract().response();

    assertEquals(200, response.getStatusCode());
    assertEquals("{}", response.path("args").toString());
    assertEquals(requestText, response.path("data"));
    assertEquals("{}", response.path("files").toString());
    assertEquals("{}", response.path("form").toString());
    assertNull(response.path("json"));
    assertEquals("https://postman-echo.com/patch", response.path("url"));

  }

  @Test
  public void testDeleteRequestResponse() {
    String requestText = "This is expected to be sent back as part of response body.";

    Response response = given()
        .contentType("text/plain")
        .body(requestText)
        .when()
        .delete("/delete")
        .then()
        .extract().response();

    assertEquals(200, response.getStatusCode());
    assertEquals("{}", response.path("args").toString());
    assertEquals(requestText, response.path("data"));
    assertEquals("{}", response.path("files").toString());
    assertEquals("{}", response.path("form").toString());
    assertEquals("https://postman-echo.com/delete", response.path("url"));
  }
}