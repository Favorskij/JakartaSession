package com.jakartasession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

//Тут мы получаем Session
@Path("Session")
public class MySession {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethodCookies(@Context HttpServletRequest request, @Context HttpServletResponse response) {

		// Получаем сессию
	    HttpSession session = request.getSession();

		return "Смотреть сессию в куках JSESSIONID.";
	}

}
