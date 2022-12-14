<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<form:form action="addProduct" method="post" modelAttribute="product" ><br>

<div class="form-group row"> 
<form:label path="inventoryId" class="col-sm-2 col-form-label">Inventory Id: </form:label>
<div class="col-sm-10">
<form:input type ="text" class="form-control" path="inventoryId"/>
</div>
</div>
<div class="form-group row">
<form:label path="productId" class="col-sm-2 col-form-label">Product Id : </form:label>
<div class="col-sm-10">
<form:input type="number" class="form-control" path="productId"/>
</div>
</div>
<div class="form-group row">
<form:label path="quantity" class="col-sm-2 col-form-label">Quantity : </form:label>
<div class="col-sm-10">
<form:input type ="text" class="form-control" path="quantity"/>
</div>
</div>
<div align="center">
<form:button class="btn btn-primary">Add</form:button>
</div>
</form:form>


</body>
</html>