package com.besant.core.interfaces;

public  class IPhoneXL implements IPhone{

    @Override
    public String showModel() {
        return "2022";
    }

    @Override
    public int getSoftwareVersion() {
        return 10;
    }
}
