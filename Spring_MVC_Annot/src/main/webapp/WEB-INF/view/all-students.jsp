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

        <c:url var="updateButton" value="/students/updateStudent">
            <c:param name="studentId" value="${student.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/students/deleteStudent">
            <c:param name="studentId" value="${student.id}"/>
        </c:url>

        <tr>
            <th>${student.name}</th>
            <th>${student.surname}</th>
            <th>${student.salary}</th>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/>
                <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>


</table>

<br>
<p align="center">
    <input type="button" style="color:green" value="Add Student" onclick="window.location.href = 'createStudent'">
</p>

</body>
</html>
