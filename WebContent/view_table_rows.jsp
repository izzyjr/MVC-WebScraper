<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<body>
<h2>Coin Table Rows</h2>
<hr>
<br/>
	<table border="1">
	
		<tr>
			<th>Coins</th>
		</tr>
	

		<c:forEach var="tempRows" items="${rows_info}">
				
			<tr>
				<td>${tempRows.row}</td>
			</tr>
			
		</c:forEach>
	
	</table>
</body>

</html>