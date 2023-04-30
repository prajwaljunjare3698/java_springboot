package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crime_005fre_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>CrimeFile Management</title>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        ");

            if (request.getParameter("msg") != null) {
        
      out.write("\n");
      out.write("        <script>alert('complaint add successfully..');</script>\n");
      out.write("        ");
            }
        
      out.write("\n");
      out.write("        ");

            if (request.getParameter("msgg") != null) {
        
      out.write("\n");
      out.write("        <script>alert('Error');</script>\n");
      out.write("        ");
            }
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style> \n");
      out.write("\n");
      out.write("        .inputs {\n");
      out.write("            background: #F7E1B9;\n");
      out.write("            font-size: 0.9rem;\n");
      out.write("            -moz-border-radius: 3px;\n");
      out.write("            -webkit-border-radius: 3px;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 10px;\n");
      out.write("            width: 200px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            box-shadow: inset 0 2px 3px rgba( 0, 0, 0, 0.1 );\n");
      out.write("            clear: both;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .inputs:focus {\n");
      out.write("            background: #fff;\n");
      out.write("            box-shadow: 0 0 0 3px #fff38e, inset 0 2px 3px rgba( 0, 0, 0, 0.2 ), 0px 5px 5px rgba( 0, 0, 0, 0.15 );\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        .inputss {\n");
      out.write("            background: #F7E1B9;\n");
      out.write("            font-size: 0.9rem;\n");
      out.write("            -moz-border-radius: 3px;\n");
      out.write("            -webkit-border-radius: 3px;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 10px;\n");
      out.write("            width: 220px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            box-shadow: inset 0 2px 3px rgba( 0, 0, 0, 0.1 );\n");
      out.write("            clear: both;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .inputss:focus {\n");
      out.write("            background: #fff;\n");
      out.write("            box-shadow: 0 0 0 3px #fff38e, inset 0 2px 3px rgba( 0, 0, 0, 0.2 ), 0px 5px 5px rgba( 0, 0, 0, 0.15 );\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        .button {\n");
      out.write("            background-color: #4CAF50; /* Green */\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 27px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("    </style> \n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu-wrapper\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"uhome.jsp\">home</a></li>\n");
      out.write("                    <li><a href=\"com.jsp\"  class=\"active\">Complaint</a></li>\n");
      out.write("                    <li><a href=\"crime_re.jsp\">Crime Report</a></li>\n");
      out.write("                    <li><a href=\"mis_baby.jsp\">Missing baby</a></li>\n");
      out.write("                    <li><a href=\"want_list.jsp\">Wanted List</a></li>\n");
      out.write("                    <li><a href=\"edit_com.jsp\">Edit Comp</a></li>\n");
      out.write("                    <li><a href=\"edit_ac.jsp\">Edit Account</a></li>\n");
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
      out.write("            <br><br><center><h2 style=\"font-size: 26px; color: #ffffff; font-family: cursive\">Crime Report :</h2>\n");
      out.write("                        <br><form action=\"login.jsp\" method=\"get\"> \n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <label style=\"font-size: 20px; color: window\">Informer name : </label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" class=\"inputs\" name=\"name\" required=\"\" placeholder=\"Your Name\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <label style=\"font-size: 20px; color: window\">Informer Report : </label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" class=\"inputs\" name=\"name\" required=\"\" placeholder=\"Your Name\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <label style=\"font-size: 20px; color: window\">Description : </label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <textarea rows=\"4\" cols=\"\" name=\"dis\" class=\"inputs\" placeholder=\"Description\"></textarea>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <label style=\"font-size: 20px; color: window\">Date : </label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" class=\"inputs\" name=\"name\" required=\"\" placeholder=\"Your Name\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <label style=\"font-size: 20px; color: window\">Type Of Crime : </label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select class=\"inputss\" required=\"\" name=\"tocrime\" >\n");
      out.write("                                                <option value=\"Civil\">Civil</option>\n");
      out.write("                                                <option value=\"other\">other</option>\n");
      out.write("                                                <input type=\"hidden\" value=\"4\" name=\"status\" />\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td> <input type=\"Submit\" value=\"Submit\" class=\"button\" ></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                               \n");
      out.write("                            </form></center>\n");
      out.write("\n");
      out.write("                    <br><br><br><br><br><br><br><br><br><br>\n");
      out.write("                                                            <!--==============================end body=================================-->\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <!--- container div end -->\n");
      out.write("                                                            <div class=\"clearing\"></div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"footer-wrapper\">\n");
      out.write("                                                                <div class=\"footer\">\n");
      out.write("                                                                    <p> © 2017 All Rights Reserved.</p>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            </body>\n");
      out.write("                                                            </html>");
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