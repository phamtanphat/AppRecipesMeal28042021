package com.example.apprecipesmeal28042021;

import com.google.gson.annotations.SerializedName;

public class ApiResponse<T> {

    @SerializedName("data")
    private T data;
    @SerializedName("message")
    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
