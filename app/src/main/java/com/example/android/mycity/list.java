package com.example.android.mycity;

public class list {
    private int mMainImageResourceId;
    private String mTitleName;
    private String mNearLocation;
    private String mOpenandCloseTime;
    private int mLogoImageResourceId;


    public list(int mainImageResourceId,String titleName,String nearLocation,String openandCloseTime,int logoImageResourceId){
        mMainImageResourceId=mainImageResourceId;
        mTitleName=titleName;
        mNearLocation=nearLocation;
        mOpenandCloseTime=openandCloseTime;
        mLogoImageResourceId=logoImageResourceId;
    }

    public int getMainImageResourseId() {
        return mMainImageResourceId;
    }
    public  String getTitleName(){
        return  mTitleName;
    }
    public String getNearLocation(){ return mNearLocation;}
    public String getOpenandCloseTime(){
        return  mOpenandCloseTime;
    }
    public int getLogoImageResourceId(){
        return mLogoImageResourceId;
    }



}
