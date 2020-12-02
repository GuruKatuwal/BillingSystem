<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results"/>
<%@include file="head.jsp"%>
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
        <th>address</th>
        <th>City</th>
        <th>State</th>
        <th>Phone</th>
        <th>Description</th>
        <th>Age</th>

        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                 <td>${user.name}</td>
                <td>${user.address}</td>
                <td>${user.city}</td>
                <td>${user.state}</td>
                <td>${user.zipcode}</td>
                <td>${user.phone}</td>
                <td>${user.description}</td>
                <td>${user.age}</td>

            </tr>

        </c:forEach>
        </tbody>
    </table>
</div>

</body>

</body>
</html>