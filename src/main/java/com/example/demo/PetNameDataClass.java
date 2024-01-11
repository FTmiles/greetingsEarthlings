package com.example.demo;

public class PetNameDataClass {
    String petType;
    String ageNA;
    String gender;

    String quality1;
    String quality2;
    String quality3;
    String quality4;
    String quality5;

    String colorNA;
    String favFoodNA;

    String otherDetails;

    int favNumber;


    public int getFavNumber() {
        return favNumber;
    }

    public void setFavNumber(int favNumber) {
        this.favNumber = favNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PetNameDataClass{");
        sb.append("petType='").append(petType).append('\'');
        sb.append(", ageNA='").append(ageNA).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", quality1='").append(quality1).append('\'');
        sb.append(", quality2='").append(quality2).append('\'');
        sb.append(", quality3='").append(quality3).append('\'');
        sb.append(", quality4='").append(quality4).append('\'');
        sb.append(", quality5='").append(quality5).append('\'');
        sb.append(", colorNA='").append(colorNA).append('\'');
        sb.append(", favFoodNA='").append(favFoodNA).append('\'');
        sb.append(", otherDetails='").append(otherDetails).append('\'');
        sb.append(", favNumber=").append(favNumber);
        sb.append('}');
        return sb.toString();
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getAgeNA() {
        return ageNA;
    }

    public void setAgeNA(String ageNA) {
        this.ageNA = ageNA;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQuality1() {
        return quality1;
    }

    public void setQuality1(String quality1) {
        this.quality1 = quality1;
    }

    public String getQuality2() {
        return quality2;
    }

    public void setQuality2(String quality2) {
        this.quality2 = quality2;
    }

    public String getQuality3() {
        return quality3;
    }

    public void setQuality3(String quality3) {
        this.quality3 = quality3;
    }

    public String getQuality4() {
        return quality4;
    }

    public void setQuality4(String quality4) {
        this.quality4 = quality4;
    }

    public String getQuality5() {
        return quality5;
    }

    public void setQuality5(String quality5) {
        this.quality5 = quality5;
    }

    public String getColorNA() {
        return colorNA;
    }

    public void setColorNA(String colorNA) {
        this.colorNA = colorNA;
    }

    public String getFavFoodNA() {
        return favFoodNA;
    }

    public void setFavFoodNA(String favFoodNA) {
        this.favFoodNA = favFoodNA;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
}
