package br.com.rtorres.gerenciador.servlet;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServerlet
 */
@WebServlet("/ListaEmpresas")
public class ListaEmpresasServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresa();
		request.setAttribute("listaEmpresas", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas.jsp");
		
		rd.forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>");
//		out.println("<ul>");
//		for(Empresa empresa:lista) {
//			out.println("<li>"+ empresa.getNome() +"</li>");
//		}
//		out.println("</ul>");
//		out.println("</body></html>");
	}

}
