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
            <label class="control-label col-sm-2" for="address">Street
                Address</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="address"
                       value="${user.address}"
                       data-error="Please enter the  street address."
                       required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="city">City</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="city"
                       value="${user.city}"
                       data-error="Please enter the city." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="state">State/Province</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="state"
                       value="${user.state}"
                       data-error="Please enter the state." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="zipcode">Zip Code</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="zipcode"
                       value="${user.zipcode}"
                       data-error="Please enter the postal code." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="phone">Phone</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="phone"
                       value="${user.phone}"
                       data-error="Please enter the phone number." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="description">Description
            </label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="description"
                       value="${user.description}"
                       data-error="Please enter trail description." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>




        <button type="submit" class="btn btn-default col-sm-offset-3" name="submit" value="Update"
                data-disable="true">Update
        </button>
        <button type="reset" class="btn btn-default">Clear</button>
        <a href ="searchUser?searchTerm=&submit=viewAll"><button type="button" class="btn btn-default">Cancel</button></a>
    </form>
 </div>
</body>

</html>
