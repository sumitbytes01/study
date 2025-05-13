package org.bytes.javatuts.basics;

public enum Department {
    HR( "Human Resources"),
    IT("Information Technology"),
    ADMIN( "Admin"),
    FINANCE("Finance Department");

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    Department(String desc) {
        this.desc = desc;
    }

    public static String getDesc(Department department){
        if (department != null){
            return department.getDesc();
        }
        return null;
    }

    // write a method that returns description. Input to method should be Enum constant.
}
