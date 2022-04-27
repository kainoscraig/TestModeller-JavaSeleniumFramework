package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://kainosqaacademy.cloud.testinsights.io/app/#!/model-engine/guid/80891057-e9e4-48d1-9739-d2ad6f9ba22a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 6, profileId = 100007)
public class homepage_UserStories extends TestBase
{
    

    
    @Test  (groups= {"home_page","home_page - User Stories"})
    @TestModellerPath(guid = "ffb720bb-7b82-4b37-9477-a3a9564cad72")
    public void homepageGotopageClickAddnewemployeeClickAddnewemployee()
    {
        
        pages.home_page _home_page = new pages.home_page(driver);
    TestModellerLogger.SetLastNodeGuid("9f30aa6e-bba1-4453-89c7-2dfadded3a11");
    _home_page.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("32237135-7d11-40c4-8777-4fb1c3917dca");
    _home_page.Click__Add_new_employee_();

    }


}