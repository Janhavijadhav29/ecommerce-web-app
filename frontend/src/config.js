export const APP_TITLE = "E-Commerce Web App";

export const ENTITIES = [
  {
    "key": "products",
    "label": "Products",
    "singular": "Product",
    "path": "products",
    "searchLabel": "Category",
    "fields": [
      {
        "name": "name",
        "label": "Name",
        "type": "text",
        "required": true
      },
      {
        "name": "description",
        "label": "Description",
        "type": "text",
        "required": false
      },
      {
        "name": "category",
        "label": "Category",
        "type": "text",
        "required": true
      },
      {
        "name": "price",
        "label": "Price",
        "type": "number",
        "required": true
      },
      {
        "name": "stock",
        "label": "Stock",
        "type": "number",
        "required": true
      },
      {
        "name": "imageUrl",
        "label": "Image URL",
        "type": "text",
        "required": false
      }
    ]
  },
  {
    "key": "orders",
    "label": "Orders",
    "singular": "Order",
    "path": "orders",
    "searchLabel": "Customer Name",
    "fields": [
      {
        "name": "customerName",
        "label": "Customer Name",
        "type": "text",
        "required": true
      },
      {
        "name": "email",
        "label": "Email",
        "type": "text",
        "required": true
      },
      {
        "name": "productName",
        "label": "Product Name",
        "type": "text",
        "required": true
      },
      {
        "name": "quantity",
        "label": "Quantity",
        "type": "number",
        "required": true
      },
      {
        "name": "totalAmount",
        "label": "Total Amount",
        "type": "number",
        "required": true
      },
      {
        "name": "status",
        "label": "Status",
        "type": "text",
        "required": true
      },
      {
        "name": "orderDate",
        "label": "Order Date",
        "type": "date",
        "required": false
      }
    ]
  }
];
