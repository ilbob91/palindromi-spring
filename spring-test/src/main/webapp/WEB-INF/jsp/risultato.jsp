
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>La frase � lunga: ${numero}</h3><br>
<h3>Le parole palindrome nella frase sono: ${numeroParole}</h3><br>
<h3>Le parole palindrome sono:</h3>
 <c:forEach items="${lista}" var = "i" >
         <c:out value = "${i}"/>
      </c:forEach>
</body>
</html>