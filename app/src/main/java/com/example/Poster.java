
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Poster {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("source")
    @Expose
    private Source source;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Poster withImage(String image) {
        this.image = image;
        return this;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Poster withSource(Source source) {
        this.source = source;
        return this;
    }

}
