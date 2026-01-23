Payment Processing Engine
-------------------------

This application simulates a backend system where a customer's
payment is processed.

### Problem Description

### Flow of operations
- System receives a payment request from the customer
- System validates the request
- System processes the payment
- System delegates the payment request to the customer's bank
- The bank validates the request
- The bank responds to the systems request

# Data models
- Payment
  - id (int)
  - amount (double)
  - customer (Customer)
  - currency (String)
  - type (String)

- Customer
  - name (String)
  - id (int)

- Merchant
  - name (String)
  - id (int)
