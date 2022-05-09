<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

// @RequestParam - возвращает параметр из URL
// @RequestParam(id) int - в данном случае вернёт 1
// Пример: http://localhost:9000/students/student?id=1

<table align="center">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>salary</th>
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


</body>
</html>
