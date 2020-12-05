<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results"/>
<%@include file="head.jsp"%>
<%--<%@include file="maintitle.jsp"%>--%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<script type="text/javascript" class="init">
    $(document).ready(function () {
        $('#userTable').DataTable();
    })
</script>
    <script type="text/javascript" class="init1">
        $(document).ready(function () {
            $('#roleTable').DataTable();
        })
</script>
<Html>
<body>
        <div class="container-fluid">
            <h2>Search Results: </h2>
            <h2>  <a class='add' title="Add" data-toggle="tooltip" href="addUser.jsp"><i class="material-icons" style="font-size:20px;color:green">&#xe146;</i></a></h2>
            <table id="userTable" class="display" cellspacing="0" width="100%">
                <thead>
                <th>Id</th>
                <th>Name</th>
                <th>address</th>
                <th>City</th>
                <th>State</th>
                <th>Zip code</th>
                <th>Phone</th>
                <th>Description</th>
                <th>Age</th>
                <th>Action</th>
                </thead>
                <tbody>
                <c:forEach var="user" items="${users}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.address}</td>
                        <td>${user.city}</td>
                        <td>${user.state}</td>
                        <td>${user.zipcode}</td>
                        <td>${user.phone}</td>
                        <td>${user.description}</td>
                        <td>${user.age}</td>
        <%--                <c:forEach items="${users}" var="desireAction">--%>

        <%--                    <td><a class='add' title="Add" data-toggle="tooltip" href="editUser.jsp"><i class="material-icons" >&#xe146;</i></a>--%>
        <%--                        <a class="edit" title="Edit" data-toggle="tooltip" href="editUser?id=${desireAction.getId()}"><i class="material-icons" >&#xE254;</i></a>--%>
        <%--                        <a class="delete" title="Delete" data-toggle="tooltip" href="deleteUser?id=${desireAction.getId()}&firstName=${desireAction.getName()}"><i class="material-icons" >&#xE872;</i></a>--%>
        <%--                    </td>--%>
        <%--                    <td><a class='add' title="Add" data-toggle="tooltip" href="editUser.jsp"><i class="material-icons" >&#xe146;</i></a>--%>
        <%--                        <a class="edit" title="Edit" data-toggle="tooltip" href="editUser?id=${desireAction.getId()}"><i class="material-icons" >&#xE254;</i></a>--%>
        <%--                        <a class="delete" title="Delete" data-toggle="tooltip" href="deleteUser?id=${desireAction.getId()}&firstName=${desireAction.getName()}"><i class="material-icons" >&#xE872;</i></a>--%>
        <%--                    </td>--%>
                            <td>
<%--                                <a class='add' title="Add" data-toggle="tooltip" href="addUser.jsp"><i class="material-icons" style="font-size:12px;color:green">&#xe146;</i></a>--%>
                                <a class="edit" title="Edit" data-toggle="tooltip" href="editUser?id=${user.id}"><i class="material-icons" style="font-size:12px;color:orange" >&#xE254;</i></a>
                                <a class="delete" title="Delete" data-toggle="tooltip" href="deleteUser?id=${user.id}"><i class="material-icons" style="font-size:12px;color:red">&#xE872;</i></a>
                            </td>

                    </tr>

                </c:forEach>
                </tbody>
            </table>
        </div>


</body>
</html>