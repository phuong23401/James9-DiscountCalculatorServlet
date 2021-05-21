<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/21/2021
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount Calculator</title>
</head>
<body>
<h2>CHƯƠNG TRÌNH TÍNH GIÁ CHIẾT KHẤU</h2>
<form action="/caltulator" method="post">
    <input type="text" name="description" placeholder="Input description: "/>
    <input type="text" name="price" placeholder="Input list price: "/>
    <input type="text" name="discount" placeholder="Input discount percent(%): "/>
    <input type="submit" id="submit" value="Calculator Discount"/>
</form>
</body>
</html>
