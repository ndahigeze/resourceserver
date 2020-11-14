package com.example.resourceserver;

public class Account {

    private int accNo;

    private String accType;

    private String accHolderName;

    private String accBnakName;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccBnakName() {
        return accBnakName;
    }

    public void setAccBnakName(String accBnakName) {
        this.accBnakName = accBnakName;
    }

    public Account(int accNo, String accType, String accHolderName, String accBnakName) {
        this.accNo = accNo;
        this.accType = accType;
        this.accHolderName = accHolderName;
        this.accBnakName = accBnakName;
    }

    public Account(){}

}
