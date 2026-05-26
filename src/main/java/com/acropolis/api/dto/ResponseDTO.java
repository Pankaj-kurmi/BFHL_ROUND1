package com.acropolis.api.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDTO {
    @JsonProperty("is_success")
    private boolean is_success;
    @JsonProperty("user_id")
    private String user_id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("roll_number")
    private String roll_number;
    @JsonProperty("odd_numbers")
    private List<String> odd_numbers;
    @JsonProperty("even_numbers")
    private List<String> even_numbers;
    @JsonProperty("alphabets")
    private List<String> alphabets;
    @JsonProperty("special_characters")
    private List<String> special_characters;
    @JsonProperty("sum")
    private String sum;
    @JsonProperty("concat_string")
    private String concat_string;

    public ResponseDTO(boolean is_success, String user_id, String email, String roll_number,
                       List<String> odd_numbers, List<String> even_numbers, List<String> alphabets,
                       List<String> special_characters, String sum, String concat_string) {
        this.is_success = is_success;
        this.user_id = user_id;
        this.email = email;
        this.roll_number = roll_number;
        this.odd_numbers = odd_numbers;
        this.even_numbers = even_numbers;
        this.alphabets = alphabets;
        this.special_characters = special_characters;
        this.sum = sum;
        this.concat_string = concat_string;
    }

    public boolean is_success() {
        return is_success;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public List<String> getOdd_numbers() {
        return odd_numbers;
    }

    public List<String> getEven_numbers() {
        return even_numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public List<String> getSpecial_characters() {
        return special_characters;
    }

    public String getSum() {
        return sum;
    }

    public String getConcat_string() {
        return concat_string;
    }
}
