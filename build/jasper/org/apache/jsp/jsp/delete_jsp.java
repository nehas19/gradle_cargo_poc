/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspCServletContext/1.0
 * Generated at: 2015-10-01 07:07:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write('\n');
      out.write('\n');
      com.sample.mvc.model.EmployeeCommand entity = null;
      synchronized (session) {
        entity = (com.sample.mvc.model.EmployeeCommand) _jspx_page_context.getAttribute("entity", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (entity == null){
          entity = new com.sample.mvc.model.EmployeeCommand();
          _jspx_page_context.setAttribute("entity", entity, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("entity"), request);
      out.write(" \n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n<title>Employee Application</title>\n<style type=\"text/css\">\n/* Reset body padding and margins */\nbody { margin:0; padding:0; }\n \n/* Make Header Sticky */\n#header_container { background:#8AC007;  height:50px; left:0; position:fixed; width:100%; top:0; }\n#header{ line-height:40px; margin:0 auto; width:940px; text-align:center;font-weight: bolder;font-size: 30px;color:white;}\n \n .smart-green {\n    width: 400px;\n    margin-top:200px;\n    margin-right: auto;\n    margin-left: auto;\n    background: #FFF;\n    padding: 30px 30px 20px 30px;\n    box-shadow: rgba(194, 194, 194, 0.7) 0 3px 10px -1px;\n    -webkit-box-shadow: rgba(194, 194, 194, 0.7) 0 3px 10px -1px;\n    font: 12px Arial, Helvetica, sans-serif;\n    color: #666;\n    border-radius: 5px;\n    -webkit-border-radius: 5px;\n    -moz-border-radius: 5px;\n}\n.smart-green h1 {\n    font: 24px \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n    padding: 20px 0px 20px 40px;\n    display: block;\n");
      out.write("    margin: -30px -30px 10px -30px;\n    color: #FFF;\n    background: #9DC45F;\n    text-shadow: 1px 1px 1px #949494;\n    border-radius: 5px 5px 0px 0px;\n    -webkit-border-radius: 5px 5px 0px 0px;\n    -moz-border-radius: 5px 5px 0px 0px;\n    border-bottom:1px solid #89AF4C;\n\n}\n.smart-green h1>span {\n    display: block;\n    font-size: 11px;\n    color: #FFF;\n}\n\n.smart-green label {\n    display: block;\n    margin: 0px 0px 5px;\n}\n.smart-green label>span {\n    float: left;\n    margin-top: 10px;\n    color: #5E5E5E;\n}\n.smart-green input[type=\"text\"], .smart-green input[type=\"email\"], .smart-green textarea, .smart-green select {\n    color: #555;\n    height:24px;\n    width: 96%;\n    padding: 3px 3px 3px 10px;\n    margin-top: 2px;\n    margin-bottom: 16px;\n    border: 1px solid #E5E5E5;\n    background: #FBFBFB;\n    outline: 0;\n    -webkit-box-shadow: inset 1px 1px 2px rgba(238, 238, 238, 0.2);\n    box-shadow: inset 1px 1px 2px rgba(238, 238, 238, 0.2);\n    font: normal 14px/14px Arial, Helvetica, sans-serif;\n}\n.smart-green button {\n");
      out.write("    background-color: #9DC45F;\n    border-radius: 5px;\n    -webkit-border-radius: 5px;\n    -moz-border-border-radius: 5px;\n    border: none;\n    padding: 10px 25px 10px 25px;\n    color: #FFF;\n    text-shadow: 1px 1px 1px #949494;\n}\n.smart-green button:hover {\n    background-color:#80A24A;\n}\na:link {color:#9DC45F;}    /* unvisited link */\na:hover {color:#80A24A;}   /* mouse over link */\n</style>\n</head>\n<body> <!-- background=\"images/pattern.jpg\" -->\n<div id=\"header_container\">\n    <div id=\"header\">\n       Employee Management System\n    </div>\n</div>\n<div class=\"smart-green\">\n\t<h1>Delete Existing Employee</h1>\n\t<br>\n\t<form method=\"post\" action=\"/delete\">\n\t\t<label>Are you sure for deletion</label><input type=\"text\" name=\"code\" required=\"required\" value=\"");
      out.print(request.getParameter("code") );
      out.write("\" readonly/>\n\t\t<br/>\n\t\t<!-- <input type=\"submit\" value=\"Add Employee\" id=\"SubmitEmployee\" class=\"button\"/> -->\n\t\t<button type=\"submit\"  value=\"Delete Employee\" id=\"deleteEmployee\">Delete Employee</button>\n\t</form>\n<a href=\"");
      out.print(request.getContextPath());
      out.write("/home.htm\">Back to Main</a>\n</div>\n</body>\n</html>\n\n\n\n\n\n");
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
