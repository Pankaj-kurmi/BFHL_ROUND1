package com.acropolis.api.service;

import org.springframework.stereotype.Service;
import com.acropolis.api.dto.ResponseDTO;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataProcessingService {

    public ResponseDTO processArray(List<String> data) {
        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();
        int sum = 0;
        StringBuilder reverseAlphabets = new StringBuilder();

        for (String item : data) {
            if (isNumber(item)) {
                int num = Integer.parseInt(item);
                sum += num;
                if (num % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }
            } else if (isAlphabet(item)) {
                alphabets.add(item.toUpperCase());
                reverseAlphabets.insert(0, item.toUpperCase());
            } else {
                specialCharacters.add(item);
            }
        }

        String concatString = alternatingCaps(reverseAlphabets.toString());
        String userId = "pankaj_kurmi_14082004";
        String email = "pankajkurmi230568@acropolis.in";
        String rollNumber = "0827AL231088";

        return new ResponseDTO(true, userId, email, rollNumber, oddNumbers, evenNumbers, 
                              alphabets, specialCharacters, String.valueOf(sum), concatString);
    }

    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isAlphabet(String s) {
        return s.length() == 1 && Character.isLetter(s.charAt(0));
    }

    private String alternatingCaps(String s) {
        StringBuilder result = new StringBuilder();
        boolean upper = true;
        for (char c : s.toCharArray()) {
            if (upper) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
            upper = !upper;
        }
        return result.toString();
    }
}
