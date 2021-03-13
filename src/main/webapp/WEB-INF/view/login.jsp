<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
	<style>
		.error {color:orangered}
	</style>
</head>
<body>
	<div style="height:65px;align: center;background: #07736f;font-family: Cambrias;color: white;">
		<br><b>
		<a href="" style="font-family:Cambria;font-size:34px;margin:0 0 0 10px;color:white;text-decoration: none;">Bookmarking</a></b>
		<h6>By insignia</h6>
	</div>
	<br><br>
	<form:form method="post" action="${pageContext.request.contextPath}/auth" modelAttribute="login">
      <fieldset>
	    <legend>Log In</legend>	    
	    <table>
	    	<tr>
	    		<td><label>Email:</label></td>
        		<td>
					<form:input path="email"/>
					<form:errors path="email" cssClass="error" />
        		</td>
        	</tr>
        	<tr>
        		<td><label>Password:</label></td>
        		<td>
					<form:password path="password"/>
        			<form:errors path="password" cssClass="error"/>
				</td>
        	</tr>
        	<tr>
        		<td>&nbsp;</td>
        		<td><input type="submit" name="submitLoginForm" value="Log In"></td>
        	</tr>
        </table>
	  </fieldset>
    </form:form>
</body>
</html>