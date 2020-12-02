<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 11/17/20
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<jsp:include page="/head.jsp" />
<body role="document">
<jsp:include page="navbar.jsp" />
<div class = "container">
    <form id="signUpForm" role="form" data-toggle="validator" class="form-horizontal"
          action="signUpUser"
          method="post">

<%--        <div class="form-group">--%>
<%--            <label class="control-label col-sm-2" for="firstName">First--%>
<%--                Name</label>--%>
<%--            <div class="col-sm-4">--%>
<%--                <input type="text" class="form-control" id="firstName"--%>
<%--                       name="firstName"--%>
<%--                       data-error="Please enter your first name." required>--%>
<%--            </div>--%>
<%--            <div class="help-block with-errors"></div>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label class="control-label col-sm-2" for="lastName">Last Name</label>--%>
<%--            <div class="col-sm-4">--%>
<%--                <input type="text" class="form-control" id="lastName"--%>
<%--                       name="lastName"--%>
<%--                       data-error="Please enter your last name." required>--%>
<%--            </div>--%>
<%--            <div class="help-block with-errors"></div>--%>
<%--        </div>--%>

        <div class="form-group">
            <label  class="control-label col-sm-2" for="userName">Username</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="userName"
                       name="userName"
                       data-error="Please enter your userName." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="password">Password
            </label>
            <div class="col-sm-4">
                <input type="password" class="form-control" id="password"
                       name="password" data-error="Please provide a password."
                       required>
                <div class="help-block with-errors"></div>
            </div>

        </div>
        <div class="form-group">
            <label class="control-label col-sm-2"
                   for="confirmPassword">Retype
                Password</label>
            <div class="col-sm-4">
                <input type="password" class="form-control" id="confirmPassword"
                       name="confirmPassword" equalTo="#password"
                       data-match="#password"
                       data-match-error="Confirmation password does not match"
                       required data-error="Please retype your password.">
                <div class="help-block with-errors"></div>
            </div>
        </div>
        <div class="form-group">
            <label  class="control-label col-sm-2" for="role"> Role
                </label>
            <div class="col-sm-4">
                <input type="role" class="form-control" id="role"
                       name="role"
                       data-error="Please enter your role." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>

        <button type="submit" class="btn btn-default col-sm-offset-3"
                data-disable="true">Submit
        </button>
        <button type="reset" class="btn btn-default">Clear</button>

    </form>
</div>
</body>

</html>

</form>