package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "JobFind")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Accountant", "kingston", "up to 7 miles", "60000", "800000", "Per annum", "Permanent", "Permanent Accountant jobs in Kingston upon Thames"},
                {"Tester", "London", "up to 25 miles", "45000", "70000", "Per month", "Any","Tester jobs in London"},
                {"Driver", "Harrow Green, Suffolk", "up to 35 miles", "25000", "45000", "Per month", "Any","Driver jobs in Harrow Green"},
                {"Recruitment Administrator", "Norfolk", "up to 75 miles", "25000", "50000", "Per month", "Any","Recruitment Administrator jobs in Norfolk"},
                {"Nurse", "Glasgow, Glasgow City", "up to 15 miles", "45000", "70000", "Per month", "Any","Nurse jobs in Glasgow"},
                {"Internal Sales Executive", "Edmonton, Greater London", "up to 25 miles", "35000", "70000", "Per month", "Any","Internal Sales Executive jobs in Edmonton"}
        };
        return data;
    }
}

