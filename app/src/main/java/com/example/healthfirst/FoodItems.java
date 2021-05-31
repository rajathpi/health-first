package com.example.healthfirst;

public class FoodItems {
    String foodName;

    @Override
    public String toString() {
        return foodName;
    }

    public FoodItems(String foodName, Integer foodImageId) {
        this.foodName = foodName;
        this.foodImageId = foodImageId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getFoodImageId() {
        return foodImageId;
    }

    public void setFoodImageId(Integer foodImageId) {
        this.foodImageId = foodImageId;
    }

    Integer foodImageId;
}
