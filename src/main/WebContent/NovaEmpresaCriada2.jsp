<!DOCTYPE html>

<%
	String nomeDaEmpresa = (String) request.getAttribute("empresa");;
	System.out.println(nomeDaEmpresa);
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas Criadas</title>
</head>
<body>
Empresa <%= nomeDaEmpresa /*out.println(nomeDaEmpresa);*/ %> cadastrada com sucesso!
</body>
</html>