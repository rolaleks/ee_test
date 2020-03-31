<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="productSearch"  class="ru.geekbrains.servlet.route.ProductSearch" scope="request" />
<h1>Каталог!!!</h1>
<table>
    <tbody>
        <tr>
            <th>Товар</th>
            <th>Цена</th>
        </tr>
        <c:forEach items="${productSearch.products}" var="product">
            <tr>
                <td>${product.title}</td>
                <td>${product.price}</td>
             </tr>
        </c:forEach>
    </tbody>
</table>
