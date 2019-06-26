package com.test.model;

public class TestTable {
    private Integer testId;

    private String testName;

    private String testGender;

    private String testAddr;

    public TestTable(Integer testId, String testName, String testGender, String testAddr) {
        this.testId = testId;
        this.testName = testName;
        this.testGender = testGender;
        this.testAddr = testAddr;
    }

    public TestTable() {
        super();
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }

    public String getTestGender() {
        return testGender;
    }

    public void setTestGender(String testGender) {
        this.testGender = testGender == null ? null : testGender.trim();
    }

    public String getTestAddr() {
        return testAddr;
    }

    public void setTestAddr(String testAddr) {
        this.testAddr = testAddr == null ? null : testAddr.trim();
    }
}