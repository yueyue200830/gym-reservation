/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2018-12-27 21:21:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t\r\n");
      out.write("\t<title>Sign up</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"login.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"settled.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form class=\"form-signin\" id=\"Signup-form\" method=\"post\">\r\n");
      out.write("\t\t<h1 class=\"text-center mb-3 font-weight-normal\">注册</h1>\r\n");
      out.write("\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t<label for=\"usrEmail\">邮箱</label>\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control form-signup\" id=\"usrEmail\" name=\"usrEmail\" placeholder=\"you@example.com\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t<label for=\"usrName\">用户名</label>\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control form-signup\" id=\"usrName\" name=\"usrName\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t<label for=\"usrKey\">密码</label>\r\n");
      out.write("\t\t\t<input  type=\"password\" class=\"form-control form-signup\" id=\"usrKey\" name=\"usrKey\" >\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t<label for=\"cfmKey\">确认密码</label>\r\n");
      out.write("\t\t\t<input type=\"password\" class=\"form-control form-signup\" id=\"cfmKey\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mb-3 ro\">\r\n");
      out.write("\t\t\t<label for=\"vcode\">验证码</label>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control form-signup\" id=\"vcode\" placeholder=\"不区分大小写\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" readonly=\"readonly\" class=\"form-control code\" id=\"checkCode\" onClick=\"createCode()\"> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t<a class=\"btn btn-lg btn-primary btn-block btn-a\" onclick=\"validate()\">注册</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"text-center alert alert-dark alert-login\">\r\n");
      out.write("\t\t\t<a href=\"login.jsp\" class=\"alert-link\">已有账户？</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<footer class=\"footer\">\r\n");
      out.write("      <div class=\"container foot-text\">\r\n");
      out.write("        <span class=\"foot-t\">Created by Jiayi Zhu & Shen Lei</span>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\t<script src=\"https://ajax.aspnetcdn.com/ajax/jquery/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.staticfile.org/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"signup.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tcreateCode();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}