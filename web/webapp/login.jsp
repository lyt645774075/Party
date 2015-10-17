<%--
  Created by IntelliJ IDEA.
  User: liyangtao
  Date: 13/10/15
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form class="form-inline" method="POST" >
  <input type="hidden" name="${_csrf.parameterName}"
         value="${_csrf.token}" />

  <div class="form-group">
    <label class="sr-only" for="username">Email address</label>
    <input type="email" class="form-control :focus" id="username" name="username" placeholder="Email">
  </div>
  <div class="form-group">
    <label class="sr-only" for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
  </div>
  <button type="submit" class="btn btn-default">login in</button>
</form>

</body>
</html>
