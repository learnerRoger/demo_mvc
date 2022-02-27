<%--
  Created by IntelliJ IDEA.
  User: 小刘同学
  Date: 2022-02-27
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick19" method="post" enctype="multipart/form-data">
        名称<input type="text" name="username"><br/>
        文件<input type="file" name="uploadFile"><br/>
        文件<input type="file" name="uploadFile2"><br/>
        <input type="submit" value="提交">
    </form>

    <form action="${pageContext.request.contextPath}/user/quick20" method="post" enctype="multipart/form-data">
        名称<input type="text" name="username"><br/>
        文件<input type="file" name="uploadFile"><br/>
        文件<input type="file" name="uploadFile"><br/>
        <input type="submit" value="提交">
    </form>
</body>
<script>
</script>
</html>
