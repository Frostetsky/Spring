<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h1>------------------</h1>

<br>

<c:forEach var="student" items="${studentsbyname}">
    <tr>
        <th>${student.name}</th>
        <th>${student.surname}</th>
        <th>${student.salary}</th>
    </tr>

</c:forEach>

<br>

<h1>------------------</h1>

</body>
</html>
