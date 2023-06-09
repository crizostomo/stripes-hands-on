<%--
  Created by IntelliJ IDEA.
  User: W512226
  Date: 25/05/2023
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=ISO-8859-1" language="java"%>
<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <title>Hello, Stripes!</title>
</head>
<body>
    <h3>Hello, Stripes!</h3>
    <p>
        Date and time:
        <br>
        <b>
            <fmt:formatDate type="both" dateStyle="full"
                            value="${actionBean.date}"/>
        </b>
    </p>
    <p>
        <s:link beanclass="action.HelloActionBean"
                event="currentDate">
                Show the current date and time
        </s:link> |
        <s:link beanclass="action.HelloActionBean"
                event="randomDate">
            Show a random date and time
        </s:link>
    </p>
</body>
</html>
