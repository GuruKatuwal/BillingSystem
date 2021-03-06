<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gurukatuwal
  To change this template use File | Settings | File Templates.
--%>

<html>
<jsp:include page="/head.jsp" />
<body role="document">
<jsp:include page="/navbar.jsp" />
<div class = "container">
    <form role="form" data-toggle="validator"
          class="form-horizontal"
          action="signUpUser"
          method="post">

        <div class="form-group">
            <label class="control-label col-sm-2" for="name">Name</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="name"
                       name="name"
                       data-error="Please enter the full name." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="username">User Name</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="username"
                       name="username"
                       data-error="Please enter user name." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="password">Password</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="password"
                       name="password"
                       data-error="Please enter password." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="address">Street
                Address</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="address"
                       name="address"
                       data-error="Please enter the  street address."
                       required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="city">City</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="city"
                       name="city"
                       data-error="Please enter the city." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="state">State/Province</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="state"
                       name="state"
                       data-error="Please enter the state." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="zipcode">Zip Code</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="zipcode"
                       name="zipcode"
                       data-error="Please enter the postal code." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="phone">Phone</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="phone"
                       name="phone"
                       data-error="Please enter the phone number." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="description">Description
            </label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="description"
                       name="description"
                       data-error="Please enter description." required>
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
