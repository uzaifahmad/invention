<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Inventory</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

<h1 align="center"> Inventory Information of Product</h1>



 <form:form action="products/search" method="get">
<div class="d-flex flex-row-reverse">
  <div class="p-2">
            <button type="submit">Submit</button>
        </div>
  <div class="p-2">

                <label>Search</label>
                <input type="text" name="productId">
	</div>
  </div>
</form:form>


  
<div class="d-flex justify-content-center">

<a class="btn btn-success m-2" href="products/addProduct" role="button">addInventory</a>
<a class="btn btn-success m-2" href="products/update" role="button">updateInventory</a>
<a class="btn btn-success m-2" href="products/delete" role="button">deleteInventory</a>
</div>



</body>
</html>