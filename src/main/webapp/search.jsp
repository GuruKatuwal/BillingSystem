<%@include file="taglib.jsp"%>
<%--<c:set var="title" value="Search Results"/>--%>
<%@include file="head.jsp"%>
<%--<%@include file="maintitle.jsp"%>--%>
<body>

<!--end header -->
<!-- main -->
<div id="main">



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