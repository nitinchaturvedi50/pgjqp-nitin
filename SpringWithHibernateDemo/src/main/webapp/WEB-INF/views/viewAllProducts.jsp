<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All Products</h1>

            <p class="lead">Checkout all the products available now!</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
                <tr class="bg-success">
                  
                    <th>Product Name</th>
                   
                    <th>Price</th>
                    <th></th>
                </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                   <td>${product.productName}</td>
                   <td>Rs ${product.price} </td>
                    <td><a href="<spring:url value="/viewProduct/${product.productID}" />">view ditail</a>
                     </tr>
                      <td><a href="<spring:url value="/updateProduct/${product.productID}" />">update product</a>
                     </tr>
                      <td><a href="<spring:url value="/deleteProduct/${product.productID}" />">delete product</a>
                     </tr>
            </c:forEach>
        </table>

</body>
</html>