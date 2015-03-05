package jat.servlet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import jat.core.coordinates.Angle;
import jat.core.coordinates.AstroCoordinate;
import jat.core.coordinates.AstroDateTimeLocation;
import jat.core.coordinates.solarPositioning.SPA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SunPosition")
// defines a Servlet mapped to "/SunPosition"
public class SunPosition extends HttpServlet {

	private static final long serialVersionUID = -8693738797080608295L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Set response header
		response.setContentType("text/html;UTF-8");

		// Set response body content. response body is returned as Ajax Response
		// Text
		PrintWriter writer = response.getWriter();

		
		long UTCms=Long.parseLong(request.getParameter("UTCms"));
		
		
		AstroDateTimeLocation adt;
		AstroCoordinate ac;

		Angle longitude = new Angle(-97.733333, Angle.DEGREES);
		Angle latitude = new Angle(30,17,0, Angle.ARCDEGREES);
		adt = new AstroDateTimeLocation(2003, 3, 1, 0, 0, 0, "CST6CDT", longitude, latitude);
		ac = SPA.getSolarPosition(adt, 1830.14, 67., 820., 11.);
		double az=ac.horizontalCoord.azimuth.getDegrees();
		double alt=ac.horizontalCoord.altitude.getDegrees();
		
		
		
		JSONObject obj = new JSONObject();

		obj.put("message", "SunPosition.java");
		obj.put("UTCms", UTCms);
		obj.put("UTCDateTime", ""+adt.getUTCDateTime());
		
		obj.put("azimuth", az);
		obj.put("altitude", alt);
		
		
		writer.write(""+obj);

		writer.close();

	}
}
