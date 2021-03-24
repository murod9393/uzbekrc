package uz.uzbekrc;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		try {
			
			ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> multiFiles = sf.parseRequest(request);
			
			for(FileItem item: multiFiles) {
				item.write(new File("/home/pi/Documents/" + item.getName()));
			out.println("File: " + item.getName() + " Successfully uploaded!!!");
			}
			
		} catch (Exception e) {
			
			out.println(e);
			out.println("file not uploaded");
		}
			
	}

}
