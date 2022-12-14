<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Inventory</title>

</head>
<body>

<c:forEach items="${products}" var="product">
  
  <p>${product.inventoryId}</p>
     <p> ${product.productId}</p>
     <p>${product.quantity}</p>
   
      </c:forEach>

</body>
</html>