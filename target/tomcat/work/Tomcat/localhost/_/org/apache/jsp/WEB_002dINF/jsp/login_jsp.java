/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-08-31 06:31:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/jsp/common/css.jspf", Long.valueOf(1629891071922L));
    _jspx_dependants.put("/WEB-INF/jsp/common/header.jspf", Long.valueOf(1629891050619L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"webjars/bootstrap/5.1.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>");
      out.write('\r');
      out.write('\n');
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tbackground-color: #17a2b8;\r\n");
      out.write("\theight: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login .container #login-row #login-column #login-box {\r\n");
      out.write("\tmargin-top: 120px;\r\n");
      out.write("\tmax-width: 600px;\r\n");
      out.write("\theight: 320px;\r\n");
      out.write("\tborder: 1px solid #9C9C9C;\r\n");
      out.write("\tbackground-color: #EAEAEA;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login .container #login-row #login-column #login-box #login-form {\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login .container #login-row #login-column #login-box #login-form #register-link\r\n");
      out.write("\t{\r\n");
      out.write("\tmargin-top: -85px;\r\n");
      out.write("}\r\n");
      out.write("</style>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"login\">\r\n");
      out.write("\t<!-- <h3 class=\"text-center text-white pt-5\">Login form</h3> -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div id=\"login-row\"\r\n");
      out.write("\t\t\tclass=\"row justify-content-center align-items-center\">\r\n");
      out.write("\t\t\t<div id=\"login-column\" class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<div id=\"login-box\" class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<form id=\"login-form\" class=\"form\" action=\"/login\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"red\" class=\"text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"text-center text-info\">Login</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"text-info\">Username:</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" id=\"username\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\" class=\"text-info\">Password:</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"password\" id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"remember-me\" class=\"text-info\"><span>Remember\r\n");
      out.write("\t\t\t\t\t\t\t\t\tme</span>??<span><input id=\"remember-me\" name=\"remember-me\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"checkbox\"></span></label><br> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"submit\" class=\"btn btn-info btn-md\" value=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<!-- <div id=\"register-link\" class=\"text-right\">\r\n");
      out.write("                                <a href=\"#\" class=\"text-info\">Register here</a>\r\n");
      out.write("                            </div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
