<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/14/20
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>aws search</title>
</head>
<body>
<h2>User Display</h2>
<form action="searchUser" class="form-inline">
    <div class="form-group">
        <lable for="searchTerm"> Search</lable>
        <input type="text" class="form-control" id="searchTerm" name="searchTerm" area-describrdby="searchTermHelp">
    </div>
    <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
    <button type="submit" name="submit" value="viewall" class="btn btn-primary">View all users</button>
</form>
</div><!-- end main -->
<!-- footer -->
<%--<%@include file="footer.jsp"%>--%>
</body>
</html>
</body>
</html>
