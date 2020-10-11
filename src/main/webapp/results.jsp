<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results"/>
<%@include file="Head.jsp"%>
<%@include file="maintitle.jsp"%>
<script type="text/javascript" class="init">
    $(document).ready(function () {
        $('#userTable').DataTable();
    })
</script>
<body>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Name</th>
        <th>User Name</th>
        <th>Age</th>
        <th>Role</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName} ${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.age}</td>
            </tr>
            <td>
                <c:forEach var="role" items="${user.roles}">
                  ${role.role}<br/>
                </c:forEach>
            </td>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>

</body>
</html>