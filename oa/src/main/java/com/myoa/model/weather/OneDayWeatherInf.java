 package com.myoa.model.weather;
 
 public class OneDayWeatherInf
 {
   private String location;
   private String date;
   private String week;
   private String tempertureOfDay;
   private String tempertureNow;
   private String wind;
   private String weather;
   private String picture;
   private Integer pmTwoPointFive;
   private String weihao;
 
   public OneDayWeatherInf()
   {
     this.location = "";
     this.date = "";
     this.week = "";
     this.tempertureOfDay = "";
     this.tempertureNow = "";
     this.wind = "";
     this.weather = "";
     this.picture = "undefined";
     this.pmTwoPointFive = Integer.valueOf(0);
   }
 
   public String getLocation()
   {
     return this.location;
   }
 
   public void setLocation(String location) {
     this.location = location;
   }
 
   public String getDate() {
     return this.date;
   }
 
   public void setDate(String date) {
     this.date = date;
   }
 
   public String getWeek() {
     return this.week;
   }
 
   public void setWeek(String week) {
     this.week = week;
   }
 
   public String getTempertureOfDay() {
     return this.tempertureOfDay;
   }
 
   public void setTempertureOfDay(String tempertureOfDay) {
     this.tempertureOfDay = tempertureOfDay;
   }
 
   public String getTempertureNow() {
     return this.tempertureNow;
   }
 
   public void setTempertureNow(String tempertureNow) {
     this.tempertureNow = tempertureNow;
   }
 
   public String getWind() {
     return this.wind;
   }
 
   public void setWind(String wind) {
     this.wind = wind;
   }
 
   public String getWeather() {
     return this.weather;
   }
 
   public void setWeather(String weather) {
     this.weather = weather;
   }
 
   public String getPicture() {
     return this.picture;
   }
 
   public void setPicture(String picture) {
     this.picture = picture;
   }
 
   public int getPmTwoPointFive() {
     return this.pmTwoPointFive.intValue();
   }
 
   public void setPmTwoPointFive(int pmTwoPointFive) {
     this.pmTwoPointFive = Integer.valueOf(pmTwoPointFive);
   }
 
   public String getWeihao() {
     return this.weihao;
   }
 
   public void setWeihao(String weihao) {
     this.weihao = weihao;
   }
 }

