<%@page isELIgnored="false" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
<c:forEach var="p" items="${requestScope.persons}">
   ${p.tid}
    ${p.tname}
    ${p.email}
    ${p.birthday}

</c:forEach>
</body>