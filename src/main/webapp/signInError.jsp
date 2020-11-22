<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/17/20
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>


<html>
<jsp:include page="head.jsp" />
<body role="document">
<jsp:include page="navbar.jsp" />
<div class="container theme-showcase" role="main">

    <div class="alert alert-danger" role="alert">
        <strong>Login Failed</strong> That userid/password combination
        does not exist.
    </div>
    <a href="addUser.jsp"><button type="button" class="btn btn-primary">
        Retry</button></a>
    <a href="viewUser"><button type="button" class="btn btn-default">Cancel
    </button></a>

</div>
</body>

</html>

