<%@ taglib prefix="tr" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Manager</title>
</head>
<body>
<div align="center">
    <h1>Product List</h1>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
        <tr>
            <th>Product ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Made In</th>
            <th>Price</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${listProducts}" var="product">
                <tr>
                    <td><c:out value="${product.id}"/></td>
                    <td><c:out value="${product.name}"/></td>
                    <td><c:out value="${product.brand}"/></td>
                    <td><c:out value="${product.madein}"/></td>
                    <td><c:out value="${product.price}"/></td>
                    <td>
                        <a href="/edit/${product.id}">Edit</a>
                        &nbsp;&nbsp;&nbsp;
                        <a href="/delete/${product.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>