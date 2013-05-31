package com.bchetty.flyingSaucer.controller;

import com.bchetty.flyingSaucer.model.TestData;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Controller class for exporting JSF datatable data, into pdf, svg and other formats.
 *
 * @author Babji Prashanth, Chetty
 */
public class FlyingSaucerController {
    private List<TestData> testDataList;
    
    /**
     * 
     * @return countryList
     */
    public List<TestData> getTestDataList() {
        if(testDataList == null) {
            testDataList = new ArrayList<TestData>();
            
            for(int i=0;i<10;i++) {
                TestData testData = new TestData();
                
                testData.setIndex(i);
                testData.setRandomData(UUID.randomUUID().toString());
                
                testDataList.add(testData);
            }
        }
        
        return testDataList;
    }
}
