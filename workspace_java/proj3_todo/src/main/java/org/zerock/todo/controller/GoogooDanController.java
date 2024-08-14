package org.zerock.todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoogooDanController
 */
@WebServlet("/googoodan")
public class GoogooDanController extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public GoogooDanController() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 요청 파라미터 인코딩 설정
			request.setCharacterEncoding("UTF-8");
					
			// html에서 받은 text에 name"dan"값 받아와서 int값에 넣기
			String danStr = request.getParameter("dan");
			int dan = Integer.parseInt(danStr);
					
			// 구구단 결과 배열에 담기
			String[] gugudanResults = new String[9];
			for(int i = 1; i <= 9; i++) {
				gugudanResults[i-1] = dan + " * " + i + " = " + (dan * i);
			}
					  
			// 계산된 구구단 결과를 request 객체에 속성으로 추가
			request.setAttribute("gugudanResults", gugudanResults);
					    
			// result.jsp로 전송
			RequestDispatcher dispatcher = request.getRequestDispatcher("/googoodan.jsp");
			dispatcher.forward(request, response);
		}

	}
