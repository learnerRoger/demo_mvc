<%--
  Created by IntelliJ IDEA.
  User: 小刘同学
  Date: 2022-02-26
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src = "${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script>
        var userList = new Array();
        userList.push({username:"集合测试1",age:1});
        userList.push({username:"集合测试2",age:1});

        $.ajax({
            type:"Post",
            url:"${pageContext.request.contextPath}/user/quick13",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        })
    </script>
</head>
<body>

</body>
</html>
