/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-08-31 08:21:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/jsp/common/footer.jspf", Long.valueOf(1629871409127L));
    _jspx_dependants.put("/WEB-INF/jsp/common/header.jspf", Long.valueOf(1629891050619L));
    _jspx_dependants.put("/WEB-INF/jsp/common/navigation.jspf", Long.valueOf(1630392535928L));
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
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\">Todo Application</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("\t\t\t\t\taria-current=\"page\" href=\"/home\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/todo-list\">Todo</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Pricing</a></li>\r\n");
      out.write("\t\t\t\t<!-- <li class=\"nav-item\"><a class=\"nav-link \" href=\"/logout\"\r\n");
      out.write("\t\t\t\t\ttabindex=\"-1\" aria-disabled=\"true\">Logout</a></li> -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/logout\">Logout</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(". your are authenticate\r\n");
      out.write("<br>\r\n");
      out.write("<a href=\"todo-list\">to start maintaining your todo's</a>\r\n");
      out.write("<script src=\"webjars/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"webjars/bootstrap/5.1.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        $('#targetDate').datepicker({\r\n");
      out.write("            format : 'dd/mm/yyyy'\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
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
