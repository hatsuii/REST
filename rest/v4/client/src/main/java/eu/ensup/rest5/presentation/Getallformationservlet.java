package eu.ensup.rest5.presentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import eu.ensup.rest5.domaine.Formation;

/**
 * Servlet implementation class getallformationservlet
 */
@WebServlet("/listeformations")
public class Getallformationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Getallformationservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			URL url = new URL("http://localhost:8080/rest4cliennt/rest/json/formation/readall");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200)
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");



			JSONArray json = null;

			while ((output = br.readLine()) != null) {
				json = new JSONArray(output);
			}

			Formation formation = new Formation();
			String id = null;
			String theme = null;

			for (int i = 0; i < json.length(); i++) {
				System.out.println(i);
				JSONObject jo = json.getJSONObject(i);
				id = jo.getString("id");
				theme = jo.getString("theme");
				formation.put(id, theme);
			}

			System.out.println(formation);
			request.setAttribute("listformation", formation);

			RequestDispatcher dispatch = request.getRequestDispatcher("listeFormation.jsp");

			conn.disconnect();

			dispatch.forward(request, response);

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
