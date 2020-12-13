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
    <form id="editUser" role="form" data-toggle="validator"
          class="form-horizontal"
          action="editUser"
          method="POST">

        <div class="form-group">
            <label class="control-label col-sm-2" for="name">Name</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="name"
                       value="${user.name}"
                       data-error="Please enter the full name." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="presentReading">Present Meter Reading</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="presentReading"
                       value="presentReading"
                       data-error="Please enter the  Present meter Reading Number."
                       required>
            </div>
            <div class="help-block with-errors"></div>
        </div>



        <button type="submit" class="btn btn-default col-sm-offset-3" name="submit" value="submit"
                data-disable="true">Calculate
        </button>
        <button type="reset" class="btn btn-default">Clear</button>

    </form>
    <p>${user.id}</p>
</div>
</body>

</html>
