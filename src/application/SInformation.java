package application;

import java.io.Serializable;

public class SInformation implements Serializable{
   private static final long serialVersionUID = 1L;
   
   private int pk = 0;   
   private String city = null;            
   private String district = null;
   private String manageName = null;
   private String areaName = null;      
   private String dischargeType = null;    
   private String dischargePlace = null;   
   private String lifeWay = null;          
   private String foodWay = null;      
   private String recycleWay = null;      
   private String tempWay = null;         
   private String tempPlace = null;
   private String lifeDay = null;
   private String foodDay = null;
   private String recycleDay = null;      
   private String lifeStartTime = null;
   private String foodStartTime = null;
   private String recycleStartTime = null;
   private String tempStartTime = null;   
   private String lifeEndTime = null;
   private String foodEndTime = null;
   private String recycleEndTime = null;   
   private String tempEndTime = null;   
   private String uncollectedDate = null;
   private String Department = null;
   private String phoneNum = null;         
   
   
   public SInformation() {}
   public SInformation(int pk, String city, String district,String manageName, String areaName, String dischargeType, String dischargePlace, String lifeWay, String foodWay, String recycleWay, String tempWay, 
         String tempPlace, String lifeDay, String foodDay, String recycleDay, String lifeStartTime, String foodStartTime , String recycleStartTime, String tempStartTime, String lifeEndTime, 
         String foodEndTime , String recycleEndTime , String tempEndTime , String uncollectedDate, String Department, String phoneNum) 
   {
      this.pk = pk;
      this.city = city;
      this.district = district;
      this.manageName = manageName;
      this.areaName = areaName;
      this.dischargeType = dischargeType;
      this.dischargePlace = dischargePlace;
      this.lifeWay = lifeWay;
      this.foodWay = foodWay;
      this.recycleWay = recycleWay;
      this.tempWay = tempWay;
      this.tempPlace = tempPlace;
      this.phoneNum = phoneNum;
      this.lifeDay = lifeDay;
      this.foodDay = foodDay;
      this.recycleDay = recycleDay;      
      this.lifeStartTime = lifeStartTime;
      this.foodStartTime = foodStartTime;
      this.recycleStartTime = recycleStartTime;
      this.tempStartTime = tempStartTime;   
      this.lifeEndTime = lifeEndTime;
      this.foodEndTime = foodEndTime;
      this.recycleEndTime = recycleEndTime;   
      this.tempEndTime = tempEndTime;   
      this.uncollectedDate = uncollectedDate;
      this.Department = Department;   
   }
   public SInformation (int pk, String city, String district,String manageName, String areaName ) {
	   this.pk = pk;
	   this.city = city;
	   this.district = district;
	   this.manageName = manageName;
	   this.areaName = areaName;
   }
   
   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getDistrict() {
      return district;
   }

   public void setDistrict(String district) {
      this.district = district;
   }

   public String getAreaName() {
      return areaName;
   }

   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }
   
   public String getManageName() {
	      return manageName;
	   }

	   public void setManageName(String manageName) {
	      this.manageName = manageName;
	   }

   public String getDischargeType() {
      return dischargeType;
   }

   public void setDischargeType(String dischargeType) {
      this.dischargeType = dischargeType;
   }

   public String getDischargePlace() {
      return dischargePlace;
   }

   public void setDischargePlace(String dischargePlace) {
      this.dischargePlace = dischargePlace;
   }

   public String getLifeWay() {
      return lifeWay;
   }

   public void setLifeWay(String lifeWay) {
      this.lifeWay = lifeWay;
   }

   public String getFoodWay() {
      return foodWay;
   }

   public void setFoodWay(String foodWay) {
      this.foodWay = foodWay;
   }

   public String getRecycleWay() {
      return recycleWay;
   }

   public void setRecycleWay(String recycleWay) {
      this.recycleWay = recycleWay;
   }

   public String getTempWay() {
      return tempWay;
   }

   public void setTempWay(String tempWay) {
      this.tempWay = tempWay;
   }

   public String getTempPlace() {
      return tempPlace;
   }

   public void setTempPlace(String tempPlace) {
      this.tempPlace = tempPlace;
   }

   public String getPhoneNum() {
      return phoneNum;
   }

   public void setPhoneNum(String phoneNum) {
      this.phoneNum = phoneNum;
   }

   public int getPk() {
      return pk;
   }

   public String getLifeDay() {
      return lifeDay;
   }
   public void setLifeDay(String lifeDay) {
      this.lifeDay = lifeDay;
   }
   public String getFoodDay() {
      return foodDay;
   }
   public void setFoodDay(String foodDay) {
      this.foodDay = foodDay;
   }
   public String getRecycleDay() {
      return recycleDay;
   }
   public void setRecycleDay(String recycleDay) {
      this.recycleDay = recycleDay;
   }
   public String getLifeStartTime() {
      return lifeStartTime;
   }
   public void setLifeStartTime(String lifeStartTime) {
      this.lifeStartTime = lifeStartTime;
   }
   public String getFoodStartTime() {
      return foodStartTime;
   }
   public void setFoodStartTime(String foodStartTime) {
      this.foodStartTime = foodStartTime;
   }
   public String getRecycleStartTime() {
      return recycleStartTime;
   }
   public void setRecycleStartTime(String recycleStartTime) {
      this.recycleStartTime = recycleStartTime;
   }
   public String getTempStartTime() {
      return tempStartTime;
   }
   public void setTempStartTime(String tempStartTime) {
      this.tempStartTime = tempStartTime;
   }
   public String getLifeEndTime() {
      return lifeEndTime;
   }
   public void setLifeEndTime(String lifeEndTime) {
      this.lifeEndTime = lifeEndTime;
   }
   public String getFoodEndTime() {
      return foodEndTime;
   }
   public void setFoodEndTime(String foodEndTime) {
      this.foodEndTime = foodEndTime;
   }
   public String getRecycleEndTime() {
      return recycleEndTime;
   }
   public void setRecycleEndTime(String recycleEndTime) {
      this.recycleEndTime = recycleEndTime;
   }
   public String getTempEndTime() {
      return tempEndTime;
   }
   public void setTempEndTime(String tempEndTime) {
      this.tempEndTime = tempEndTime;
   }
   public String getUncollectedDate() {
      return uncollectedDate;
   }
   public void setUncollectedDate(String uncollectedDate) {
      this.uncollectedDate = uncollectedDate;
   }
   public String getDepartment() {
      return Department;
   }
   public void setDepartment(String department) {
      Department = department;
   }
   public static long getSerialversionuid() {
      return serialVersionUID;
   }
   public void setPk(int pk) {
      this.pk = pk;
   }
   @Override
   public String toString() {
      return "Trash [pk=" + pk + ", city=" + city + ", district=" + district + ", areaName=" + areaName
            + ", dischargeType=" + dischargeType + ", dischargePlace=" + dischargePlace + ", lifeWay=" + lifeWay
            + ", foodWay=" + foodWay + ", recycleWay=" + recycleWay + ", tempWay=" + tempWay + ", tempPlace="
            + tempPlace + ", lifeDay=" + lifeDay + ", foodDay=" + foodDay + ", recycleDay=" + recycleDay
            + ", lifeStartTime=" + lifeStartTime + ", foodStartTime=" + foodStartTime + ", recycleStartTime="
            + recycleStartTime + ", tempStartTime=" + tempStartTime + ", lifeEndTime=" + lifeEndTime
            + ", foodEndTime=" + foodEndTime + ", recycleEndTime=" + recycleEndTime + ", tempEndTime=" + tempEndTime
            + ", uncollectedDate=" + uncollectedDate + ", Department=" + Department + ", phoneNum=" + phoneNum
            + "]";
   }
}