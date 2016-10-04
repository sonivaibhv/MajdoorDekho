

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.exception.ConstraintViolationException;

import com.md.serviceImpl.CancelService;


@WebServlet("/cancelb")
public class cancelb extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String destination = "/WEB-INF/view/cancelb.jsp";

	        RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
	        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {	
		String bookingNo=req.getParameter("bookingNo");
		CancelService service=new CancelService();
		try{
		service.deleteBookingNo(bookingNo);
		}catch(ConstraintViolationException ex){
			req.setAttribute("msg", ex.getMessage());
			String destination = "/WEB-INF/view/cancelb.jsp";
	        RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
	        rd.forward(req, resp);
		}
		req.setAttribute("msg", "Booking Canceled");
		String destination = "/WEB-INF/view/cancelb.jsp";
        RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
        rd.forward(req, resp);
	}
}
