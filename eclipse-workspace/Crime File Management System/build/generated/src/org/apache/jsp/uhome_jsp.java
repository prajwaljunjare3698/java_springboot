package org.apache.jsp;

import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Map<String, Long> getDependants() {
    return (Map<String, Long>) _jspx_dependants;
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
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("    #contentinfo p {\n");
      out.write("        line-height: 20px;\n");
      out.write("\tmargin: 50px;\n");
      out.write("\tpadding-bottom: 20px;\n");
      out.write("\ttext-align:inherit;\n");
      out.write("\twidth: 1000px;\n");
      out.write("\tcolor: white;\n");
      out.write("        font-size: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu-wrapper\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\" class=\"active\">home</a></li>\n");
      out.write("                    <li><a href=\"visitor.jsp\">Visitor</a></li>\n");
      out.write("                    <li><a href=\"admin.jsp\">admin</a></li>\n");
      out.write("                    <li><a href=\"reg.jsp\">Register</a></li>\n");
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
      out.write("            <center><h1>WELCOME TO CRIMESTATION</h1>\n");
      out.write("            <p>This website is developed for the Department of the police for helping them in the investigation level.visitors must keep in mind that websites of government organisations anywhere in the world are in view of their inherent complexity intended to provide a general idea of the organisation and furnish authentic through basic information on its functioning in a convenient and attractive manner.</p> \n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--- container div end -->\n");
      out.write("        <div class=\"clearing\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"footer-wrapper\">\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <p> © 2017 All Rights Reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
