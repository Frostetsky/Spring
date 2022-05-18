<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<table align="center">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="student" items="${students}">
        <tr>
            <th>${student.name}</th>
            <th>${student.surname}</th>
            <th>${student.salary}</th>
        </tr>

    </c:forEach>


</table>


</body>
</html>
