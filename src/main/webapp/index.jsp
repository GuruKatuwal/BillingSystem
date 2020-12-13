<%@include file="taglib.jsp"%>
<%--<c:set var="title" value="Search Results"/>--%>
<%@include file="head.jsp"%>
<%--<%@include file="maintitle.jsp"%>--%>
<body>

<!--end header -->
<!-- main -->
<div class="container">

    <button type="submit" name="submit" href="signIn.jsp" class="btn btn-primary">New User</button>
    <button type="submit" name="submit" href="signUp.jsp" class="btn btn-primary">Existing User</button>

    <h3><a href="awsSearch.jsp">Click here to search</a></h3>
    <h3><a href="search.jsp">Click here to search(admin Only)</a></h3>
    <h4><a href="admin.jsp">Click here to search(admin and all Only)</a></h4>

</div><!-- end main -->
<!-- footer -->
<%--<%@include file="footer.jsp"%>--%>
</body>
</html>

