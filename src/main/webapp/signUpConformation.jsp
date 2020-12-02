<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/1/20
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
    <jsp:include page="/head.jsp" />

    <body role="document">
        <jsp:include page="navbar.jsp"/>
        <div class="container" role="main">
            <c:choose>
                <c:when test="${errorMessage == null}">
                    <div class="alert alert-success" role="alert">
                        <Strong> New Registration --Success</Strong> Add user
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="alert alert-danger" role="alert">
                        <strong> Registration Failed</strong> <br />
                        ${errorMessage} <br />
                        <a href="signUp.jsp">
                            <button type="button" class="btn btn-primary">
                                Retry
                            </button>
                        </a>
                        <a href="viewreport">
                            <button type="button" class="btn btn-primary">
                                 Cancel
                            </button>
                        </a>
                    </div>
                </c:otherwise>
            </c:choose>

        </div>
    </body>
</html>
