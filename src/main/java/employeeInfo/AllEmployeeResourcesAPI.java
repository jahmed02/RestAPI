package employeeInfo;

import org.testng.Assert;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class AllEmployeeResourcesAPI {

    String baseUrl = "http://info.venturepulse.org:8080/service-webapp/";

    // http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/5ff7b9652fc21306c59859d6
    //http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources

    public void getAllEmployeeResources(){
        Response response = given().when().get(baseUrl+"api/AllEmployeeResources").then().statusCode(200).extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode,200);

    }
}
