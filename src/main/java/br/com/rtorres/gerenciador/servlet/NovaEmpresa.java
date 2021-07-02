package br.com.rtorres.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
//import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/nova-empresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("cadastrando nova empresa");
		String nomeDaEmpresa = request.getParameter("nome");
		String envioDataAbertura = request.getParameter("data");
		Date dataAbertura = null;
		
//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//			dataAbertura = sdf.parse(envioDataAbertura);
//		} catch (ParseException e) {
//			throw new ServletException(e);
//		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeDaEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		response.sendRedirect("ListaEmpresas");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas");
//		request.setAttribute("empresa", nomeDaEmpresa);
//		rd.forward(request, response);
		
		
//		System.out.println("Cadastrando nova empresa");
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa "+ nomeDaEmpresa +" cadastrada com sucesso!</body></html>");
   }

}
