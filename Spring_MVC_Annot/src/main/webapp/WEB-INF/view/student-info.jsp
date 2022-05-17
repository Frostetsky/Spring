<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>

<h2 align="center" style="color:blue">Student Information</h2>

<br>

<form:form action="saveStudent" modelAttribute="student">

        <form:hidden path="id"/>

        <b>Name: <form:input path="name"/></b>
        <br>
        <br>
        <b>SurName: <form:input path="surname"/></b>
        <br>
        <br>
        <b>Salary: <form:input path="salary"/></b>
        <br>
        <br>
        <input type="submit" value="OK">


</form:form>

</body>

</html>
