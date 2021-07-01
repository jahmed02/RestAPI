package getEmployeeInfoTest;

import employeeInfo.SingleEmployeeResources;
import org.testng.annotations.Test;

public class GetSingleEmployeeResources extends SingleEmployeeResources {

    @Test
    public void getSingleEmployee(){
        getSingleEmployeeResources();
    }

    @Test
    public void getSingleEmployeeInvalid(){
        singleEmployeeInvalid();
    }
}
