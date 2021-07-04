<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.rtorres.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando empresas com taglib</title>
</head>
<body>
	Lista de empresas: <br />
	<ul>
		<c:forEach items="${ listaEmpresas }" var="empresa">
			
			<li> ${empresa.nome} - 
			<fmt:formatDate value= "${empresa.dataAbertura}" pattern= "dd/MM/yyyy"/>
			<a href="http://localhost:8080/gerenciador/remove-empresa?id=${ empresa.id }"> remover </a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>