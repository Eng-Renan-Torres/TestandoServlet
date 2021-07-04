package br.com.rtorres.gerenciador.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveEmpresa
 */
@WebServlet("/remove-empresa")
public class RemoveEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idRemove = request.getParameter("id");
		Banco banco = new Banco();
		
		banco.remove(Integer.parseInt(idRemove));
		
		response.sendRedirect("ListaEmpresas");
		
		
	}

}
