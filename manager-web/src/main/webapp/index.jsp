<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/9
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/user/addUser" method="post">
        用户:<input type="text" name="userName">
        年龄:<input type="text" name="userAge">
        <input type="submit" value="保存提交">
    </form>

</body>
</html>
