<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%! String u1 = "first"; %>
<%! String u2 = "second"; %>
<%! String u3 = "third"; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	

	<form action="get_display.jsp" method="post">
		 <input type="hidden" name="u1" value="<%=u1%>"/>
		 <input type="hidden" name="u2" value="<%=u2%>" />
		 <input type="hidden" name="u3" value="<%=u3%>" />
		 <button type="hidden" id="qq" value="Login" style="display: none;"></button>
	</form>
	
	<script type="text/javascript">
     	document.getElementById("qq").click();
  	</script>
  
</body>
</html>