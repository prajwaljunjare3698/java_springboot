package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dbcon.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class want_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>CrimeFile Management</title>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        #contentinfo p {\n");
      out.write("            line-height: 20px;\n");
      out.write("            margin: 50px;\n");
      out.write("            padding-bottom: 20px;\n");
      out.write("            text-align:inherit;\n");
      out.write("            width: 1000px;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu-wrapper\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"ahome.jsp\">home</a></li>\n");
      out.write("                    <li><a href=\"com_de.jsp\">Complaints</a></li>\n");
      out.write("                    <li><a href=\"wit_de.jsp\">Witness</a></li>\n");
      out.write("                    <li><a href=\"mis_per_de.jsp\" class=\"active\">Missing</a></li>\n");
      out.write("                    <li><a href=\"want_list.jsp\">Wanted Add</a></li>\n");
      out.write("                    <li><a href=\"edit_com.jsp\">Wanted View</a></li>\n");
      out.write("                    <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"call\">\n");
      out.write("                <!--    <h1>Call us :<span> ( 000 ) 8888 888888</span></h1>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--- menu-wrapper div end -->\n");
      out.write("        <div class=\"clearing\"></div>\n");
      out.write("        <div class=\"border-bottom\"></div>\n");
      out.write("        <div class=\"logo-wrapper\">\n");
      out.write("            <div class=\"leftshadow\"><img src=\"images/logo-wrap-left.jpg\" /></div>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <h1><font style=\"font-family: fantasy; \">Crime File Management System</font></h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rightshadow\"><img src=\"images/logo-wrap-right.jpg\" /></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearing\"></div>\n");
      out.write("        <div class=\"banner-wrapper\">\n");
      out.write("            <div class=\"bannerlef\"><img src=\"images/banner-wrap-left.jpg\" /></div>\n");
      out.write("            <div class=\"banner-container\">\n");
      out.write("                <div class=\"banner\">\n");
      out.write("                    <div class=\"banner-content\">\n");
      out.write("                        <img width=\"500\" height=\"200\" src=\"img\\ar.jpg\"/>\n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bannerright\"><img src=\"images/banner-wrap-right.jpg\"/></div>\n");
      out.write("\n");
      out.write("        <!--- banner wrapper div end -->\n");
      out.write("        <div id=\"contentinfo\">\n");
      out.write("            <!--==============================body start=================================-->\n");
      out.write("            <br><br><center><h2 style=\"font-size: 26px; color: white; font-family: cursive\">Witness Details</h2>\n");
      out.write("                        <br><table border=\"2\" style=\"text-align: center; margin-left: 0px; border-color: black\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px; font-size: 16px; color: #5b6a7d\">name</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 400px;  font-size: 16px; color: #5b6a7d\">Missing Place</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">Missing Date</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">Age</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">Wight</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">Height</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">Address of Missing Person</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">Date of report</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">Photo</th>\n");
      out.write("                                    <th style=\"text-align: center;width: 200px;  font-size: 16px; color: #5b6a7d\">FIR</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    ");

                                        Connection con = null;
                                        Statement st = null;
                                        ResultSet rs = null;
                                        try {
                                            con = DbConnection.getConnection();
                                            st = con.createStatement();
                                            rs = st.executeQuery("select * from wanted");
                                            while (rs.next()) {
                                                String fir = rs.getString("mname") + "," + rs.getString("mplace") + "," + rs.getString("misdate") + "," + rs.getString("age") + "," + rs.getString("wight") + "," + rs.getString("height") + "," + rs.getString("addomiss") + "," + rs.getString("dateofreport");
                                                System.out.println("Set Array :" + fir);
                                    
      out.write("\n");
      out.write("                                    <td style=\"font-size: 16px; color: white\"><br>");
      out.print(rs.getString("name"));
      out.write("</td>   \n");
      out.write("                                    <td style=\"font-size: 16px; color: white\"><br>");
      out.print(rs.getString("age"));
      out.write("</td>   \n");
      out.write("                                    <td style=\"font-size: 16px; color: white\"><br>");
      out.print(rs.getString("wight"));
      out.write("</td> \n");
      out.write("                                    <td style=\"font-size: 16px; color: white\"><br>");
      out.print(rs.getString("height"));
      out.write("</td>  \n");
      out.write("                                    <td style=\"font-size: 16px; color: white\"><br>");
      out.print(rs.getString("act"));
      out.write("</td>   \n");
      out.write("                                    <td style=\"font-size: 16px; color: white\"><br><img src=\"viewimage1.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");



                                        }
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }

                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("                                                                                                            <!--==============================end body=================================-->\n");
      out.write("                                                                                                            </div>\n");
      out.write("\n");
      out.write("                                                                                                            <!--- container div end -->\n");
      out.write("                                                                                                            <div class=\"clearing\"></div>\n");
      out.write("\n");
      out.write("                                                                                                            <div class=\"footer-wrapper\">\n");
      out.write("                                                                                                                <div class=\"footer\">\n");
      out.write("                                                                                                                    <p> © 2017 All Rights Reserved.</p>\n");
      out.write("                                                                                                                </div>\n");
      out.write("                                                                                                            </div>\n");
      out.write("                                                                                                            </body>\n");
      out.write("                                                                                                            </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
