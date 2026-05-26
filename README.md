# BFHL API - Acropolis Campus Hiring

Spring Boot REST API that processes an array and returns categorized data.

## Features
- Separates even and odd numbers
- Extracts alphabets (converted to uppercase)
- Identifies special characters
- Returns sum of all numbers as a string
- Concatenates alphabets in reverse order with alternating caps

## Endpoint
- **Method:** POST
- **Route:** `/bfhl`
- **Response Code:** 200

## Request Format
```json
{
  "data": ["a", "1", "334", "4", "R", "$"]
}
```

## Response Format
```json
{
  "is_success": true,
  "user_id": "pankaj_kurmi_14082004",
  "email": "pankajkurmi230568@acropolis.in",
  "roll_number": "0827AL231088",
  "odd_numbers": ["1"],
  "even_numbers": ["334", "4"],
  "alphabets": ["A", "R"],
  "special_characters": ["$"],
  "sum": "339",
  "concat_string": "Ra"
}
```

y
