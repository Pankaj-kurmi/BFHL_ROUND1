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
  "user_id": "john_doe_17091999",
  "email": "john@xyz.com",
  "roll_number": "ABCD123",
  "odd_numbers": ["1"],
  "even_numbers": ["334", "4"],
  "alphabets": ["A", "R"],
  "special_characters": ["$"],
  "sum": "339",
  "concat_string": "Ra"
}
```

## Setup & Run

1. Clone the repository
2. Run: `mvn clean install`
3. Run: `mvn spring-boot:run`
4. API will be available at `http://localhost:8080/bfhl`

## Deploy
- Supports Railway, Render, Heroku, and other platforms
- Connect your GitHub repo and deploy
