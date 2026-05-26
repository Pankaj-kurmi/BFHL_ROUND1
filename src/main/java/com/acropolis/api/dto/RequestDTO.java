package com.acropolis.api.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestDTO {
    @JsonProperty("data")
    private List<String> data;

    public RequestDTO() {
    }

    public RequestDTO(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
