package com.bchetty.flyingSaucer.model;

/**
 *
 * @author Babji Prashanth, Chetty
 */
public class TestData {
    private long index;
    private String randomData;

    public TestData() {}

    public TestData(long index, String randomData) {
        this.index = index;
        this.randomData = randomData;
    }

    /**
     * @return the data1
     */
    public long getIndex() {
        return index;
    }

    /**
     * @param data1 the data1 to set
     */
    public void setIndex(long index) {
        this.index = index;
    }

    /**
     * @return the data2
     */
    public String getRandomData() {
        return randomData;
    }

    /**
     * @param data2 the data2 to set
     */
    public void setRandomData(String randomData) {
        this.randomData = randomData;
    }
}
