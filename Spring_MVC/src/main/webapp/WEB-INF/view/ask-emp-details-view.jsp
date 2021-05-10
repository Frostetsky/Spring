<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>

<body>

<h2> Hello Employee. Write your name! </h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">
    Name: <form:input path="name"/>
    <br>
    Surname: <form:input path="surname"/>
    <br>
    Salary: <form:input path="salary"/>
    <br>
    Department: <form:select path="department">
                <form:options items="${employee.departments}"/>
                </form:select>
    <br>
    <input type="submit" value="OK">
</form:form>

</body>

</html>