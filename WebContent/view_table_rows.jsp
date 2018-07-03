<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<body>
<h2>Coin Table Rows</h2>
<hr>
<br/>
	<table border="1">

		<c:forEach var="tempRows" items="${table_rows}">
		
			${tempRows}
			
		</c:forEach>
	
	</table>
</body>

</html>