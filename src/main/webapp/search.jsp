<%@include file="taglib.jsp"%>
<%--<c:set var="title" value="Search Results"/>--%>
<%@include file="Head.jsp"%>
<%@include file="maintitle.jsp"%>
<body>

<!--end header -->
<!-- main -->
<div id="main">

    <%--    <div id="sidebar">--%>
    <%--        <h3>Unit 2</h3>--%>
    <%--&lt;%&ndash;        <%@include file="unittwosidebar.jsp"%>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <h3>Unit 3</h3>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <%@include file="unitthreesidebar.jsp"%>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <h3>Unit 4</h3>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <%@include file="unitfoursidebar.jsp"%>&ndash;%&gt;--%>
    <%--    </div>--%>

    <%--    <h1>Welcome</h1>--%>
    <%--    <h2></h2>--%>

    <h1> Welcome to my billing system project!!!!</h1>
    <h2>Comming soon...............</h2>

    <h2>User Display Exercise</h2>
    <form action="searchUser" class="form-inline">
        <div class="form-group">
            <lable for=""searchTerm"> Search</lable>
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