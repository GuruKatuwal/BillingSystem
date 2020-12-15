<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gurukatuwal
  To change this template use File | Settings | File Templates.
--%>

<html lang="en">
<jsp:include page="/head.jsp" />
<body role="document">

<jsp:include page="/navbar.jsp" />
<div class = "container">
    <form  data-toggle="validator"
          class="form-horizontal"
          action="editUser" method="POST"
         >
        <div class="form-group">
            <label class="control-label col-sm-2" for="id">id</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="id" name="id"
                       value="${user.id}"required>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="name">Name</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="name" name="name"
                       value="${user.name}"required>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="username"> User Name</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="username" name="username"
                       value="${user.username}"required>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="password">Password</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="password" name="password"
                       value="${user.password}"required>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="address">Street
                Address</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="address" name="address"
                       value="${user.address}" required>
            </div>

        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="city">City</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="city" name="city"
                       value="${user.city}" required>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="state">State/Province</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="state" name="state"
                       value="${user.state}"required>
            </div>

        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="zipcode">Zip Code</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="zipcode" name="zipcode"
                       value="${user.zipcode}"required>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="phone">Phone</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="phone" name="phone"
                       value="${user.phone}" required>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="description">Description
            </label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="description" name="description"
                       value="${user.description}" required>
            </div>

        </div>




        <button type="submit" class="btn btn-default col-sm-offset-3" name="submit" value="Update"
                data-disable="true">Update
        </button>
        <button type="reset" class="btn btn-default">Clear</button>

    </form>
 </div>
</body>

</html>
