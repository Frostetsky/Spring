<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML>

<html>

<body>

<h2> Information for All Employees </h2>
<br>
<security:authorize access="hasRole('HR')">
<input type="button" value="Salary" onclick="window.location.href = 'hr_info'">
Only for HR Staff
</security:authorize>
<br>
<br>
<security:authorize access="hasRole('Manager')">
<input type="button" value="Performance" onclick="window.location.href = 'manager_info'">
Only for Managers
</security:authorize>
<br>
</body>

</html>