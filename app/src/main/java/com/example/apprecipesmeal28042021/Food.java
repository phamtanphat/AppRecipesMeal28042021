package com.example.apprecipesmeal28042021;

import com.google.gson.annotations.SerializedName;

public class Food {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("image")
    private String image;
    @SerializedName("youtube")
    private String youtube;
    @SerializedName("instruction")
    private String instruction;
    @SerializedName("calo")
    private String calo;
    @SerializedName("ingredient")
    private String ingredient;
    @SerializedName("carbo")
    private String carbo;
    @SerializedName("protein")
    private String protein;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getCalo() {
        return calo;
    }

    public void setCalo(String calo) {
        this.calo = calo;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getCarbo() {
        return carbo;
    }

    public void setCarbo(String carbo) {
        this.carbo = carbo;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", youtube='" + youtube + '\'' +
                ", instruction='" + instruction + '\'' +
                ", calo='" + calo + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", carbo='" + carbo + '\'' +
                ", protein='" + protein + '\'' +
                '}';
    }
}
