package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Classy Login form Widget Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/styleLogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- for-mobile-apps -->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /> \n");
      out.write("        <meta name=\"keywords\" content=\"Classy Login form Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <!-- //for-mobile-apps -->\n");
      out.write("        <!--Google Fonts-->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <!--header start here-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-main\">\n");
      out.write("                <h1>Login </h1>\n");
      out.write("                <div class=\"header-bottom\">\n");
      out.write("                    <div class=\"header-right w3agile\">\n");
      out.write("\n");
      out.write("                        <div class=\"header-left-bottom agileinfo\">\n");
      out.write("\n");
      out.write("                            <form action=\"login\" method=\"post\">\n");
      out.write("                                <input type=\"text\"  value=\"User name\" name=\"account\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                            this.value = 'User name';\n");
      out.write("                                        }\"/>\n");
      out.write("                                <input type=\"password\"  value=\"Password\" name=\"password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                            this.value = 'password';\n");
      out.write("                                        }\"/>\n");
      out.write("                                <div class=\"remember\">\n");
      out.write("                                    <span class=\"checkbox1\">\n");
      out.write("                                        <label class=\"checkbox\"><input type=\"checkbox\" name=\"remember\" checked=\"\"><i> </i>Remember me</label>\n");
      out.write("                                    </span>\n");
      out.write("                                    <div class=\"forgot\">\n");
      out.write("                                        <h6><a href=\"#\">Forgot Password?</a></h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clear\"> </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <input type=\"submit\" value=\"Login\">\n");
      out.write("                            </form>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--header end here-->\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <p>FPT University<a href=\"http://w3layouts.com/\" target=\"_blank\">  </a></p>\n");
      out.write("        </div>\n");
      out.write("        <!--footer end here-->\n");
      out.write("    </body>\n");
      out.write("</html>");
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
