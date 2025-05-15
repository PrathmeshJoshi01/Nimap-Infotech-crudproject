# Nimap-Infotech-crudproject

# CRUD API Endpoints for Product & Category

## Category API Endpoints

### Create Category
**POST**  
`http://localhost:8080/categories`  
**Request Body**
```json
{
  "name": "Electronics"
}
```

### Get All Categories
**GET**  
`http://localhost:8080/categories`

### Get Category by ID
**GET**  
`http://localhost:8080/categories/{id}`

### Update Category
**PUT**  
`http://localhost:8080/categories/{id}`  
**Request Body**
```json
{
  "name": "Updated Electronics"
}
```

### Delete Category
**DELETE**  
`http://localhost:8080/categories/{id}`

### Get Paginated Categories
**GET**  
`http://localhost:8080/categories/paginated?page=0&size=5`

---

## Product API Endpoints

### Create Product
**POST**  
`http://localhost:8080/products`  
**Request Body**
```json
{
  "name": "iPhone 15",
  "description": "Apple smartphone",
  "price": 1000,
  "category": {
    "id": 1
  }
}
```

### Get All Products
**GET**  
`http://localhost:8080/products`

### Get Product by ID
**GET**  
`http://localhost:8080/products/{id}`

### Update Product
**PUT**  
`http://localhost:8080/products/{id}`  
**Request Body**
```json
{
  "name": "iPhone 15 Pro",
  "description": "Updated Apple smartphone",
  "price": 1200,
  "category": {
    "id": 1
  }
}
```

### Delete Product
**DELETE**  
`http://localhost:8080/products/{id}`

### Get Paginated Products
**GET**  
`http://localhost:8080/products/paginated?page=0&size=5`