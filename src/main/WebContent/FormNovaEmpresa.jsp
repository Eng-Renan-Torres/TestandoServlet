<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "tml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Cadastral de Empresas</title>
</head>
<body>
	<c:url value= "/nova-empresa" var="dirNovaEmpresa"/> 
	<form action="${dirNovaEmpresa}" method = "post">
		
		Nome: <input type="text" name="nome"    />
		Data de Abertura: <input type="text" name="data"    />
				
		<input type="submit" />
	</form>
</body>
</html>