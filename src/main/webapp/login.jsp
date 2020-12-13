<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Login</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<FORM ACTION="j_security_check" METHOD="POST">--%>
<%--    <TABLE>--%>
<%--        <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">--%>
<%--        <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">--%>
<%--        <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">--%>
<%--    </TABLE>--%>
<%--</FORM>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<jsp:include page="head.jsp" />
<body>
<div class="container theme-showcase" role="main">

    <div class="col-sm4 col-sm-offset-4">
        <FORM id="signInForm" role="form" class="form-horizontal" ACTION="j_security_check" METHOD="POST">
            <div class="form-group">
                <label class="control-label col-sm-2" for="j_username">User name</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="j_username"
                           name="j_username"
                           data-error="Please enter your username."
                           required>
                </div>
                <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="j_password">Password</label>
                <div class="col-sm-4">
                    <input type="password" class="form-control" id="j_password"
                           name="j_password"
                           data-error="Please enter your password."
                           required>
                </div>
                <div class="help-block with-errors"></div>
            </div>

            <button type="submit" class="btn btn-default col-sm-offset-3"
                    data-disable="true">Log In
            </button>
            <button type="reset" class="btn btn-default">Clear</button>

        </FORM>
    </div>
</div>
<div id="push"></div>

</body>
</html>