/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2017-11-07 11:54:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>找回密码</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/css/loginStyle.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/css/toastr.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/plugins/swiper/css/swiper.min.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".swiper-container {\n");
      out.write("\twidth: 500px;\n");
      out.write("\theight: 650px;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\talign-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".swiper-container .swiper-pagination {\n");
      out.write("\tflex-basis: 150px;\n");
      out.write("\tflex-shrink: 0;\n");
      out.write("\tposition: static;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#forgotNavPanel {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".swiper-pagination-bullet {\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("\tborder: 0;\n");
      out.write("\tbackground: none;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\talign-items: center;\n");
      out.write("\tmargin-right: 50px !important;\n");
      out.write("\tfont: normal 14px/24px 'MicroSoft YaHei';\n");
      out.write("\tcolor: #000000;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"swiper-container\">\n");
      out.write("\t\t<!-- 分页点 -->\n");
      out.write("\t\t<div id=\"forgotNavPanel\" class=\"swiper-pagination\"></div>\n");
      out.write("\t\t<!-- 轮播内容容器 -->\n");
      out.write("\t\t<div class=\"swiper-wrapper\">\n");
      out.write("\t\t\t<!-- 轮播内容 -->\n");
      out.write("\t\t\t<div class=\"swiper-slide\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<h2>请输入您的密保问题</h2>\n");
      out.write("\t\t\t\t\t<div class=\"group-forms\">\n");
      out.write("\t\t\t\t\t\t<div class=\"view  view-confirmQuestion \" id=\"1\"\n");
      out.write("\t\t\t\t\t\t\tdata-za-module=\"confirmQuestionForm\">\n");
      out.write("\t\t\t\t\t\t\t<form class=\"confirmQuestion-form\"\n");
      out.write("\t\t\t\t\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/checkQuestion\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"confirmQuestion-form\" autocomplete=\"off\" method=\"POST\"\n");
      out.write("\t\t\t\t\t\t\t\tnovalidate=\"novalidate\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"group-inputs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"name input-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input required=\"\" type=\"text\" name=\"username\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-label=\"用户名\" maxlength=\"16\" placeholder=\"用户名\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"username\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"question input-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"question\" required placeholder=\"请选择密保问题\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"我的生日？\">我的生日？</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"我父亲/母亲的名字？\">我父亲/母亲的名字？</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"我父亲/母亲的生日？\">我父亲/母亲的生日？</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"我小学班主任的名字？\">我小学班主任的名字？</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"我高中班主任的名字？\">我高中班主任的名字？</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"answer input-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input required=\"\" type=\"text\" name=\"answer\" aria-label=\"密保答案\"  maxlength=\"16\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"密保答案\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"button-wrapper command\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"confirmQuestion-button submit\" type=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"confirmQuestion-button\">下一步</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"swiper-slide\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<h2>请输入您的新密码</h2>\n");
      out.write("\t\t\t\t\t<div class=\"group-forms\">\n");
      out.write("\t\t\t\t\t\t<div class=\"view  view-confirmQuestion \" id=\"1\"\n");
      out.write("\t\t\t\t\t\t\tdata-za-module=\"confirmQuestionForm\">\n");
      out.write("\t\t\t\t\t\t\t<form class=\"confirmQuestion-form\"\n");
      out.write("\t\t\t\t\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/updatePassword\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"confirmQuestion-form\" autocomplete=\"off\" method=\"POST\"\n");
      out.write("\t\t\t\t\t\t\t\tnovalidate=\"novalidate\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"group-inputs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pwd input-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input required type=\"password\" name=\"password\" id=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-label=\"密码\" placeholder=\"请输入新密码(不少于6位)\" minlength=\"6\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmaxlength=\"16\" autocomplete=\"off\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pwd input-wrapper\" id=\"extr-panel\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input required  type=\"password\" name=\"password\" id=\"repassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-label=\"密码\" placeholder=\"请重复新密码(不少于6位)\" minlength=\"6\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmaxlength=\"16\" autocomplete=\"off\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"error extrtipequal\">两次密码必须相同</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"error extrtipless\">密码不能少于6位</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"error extrtipnull\">密码不能为空</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"button-wrapper command\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"newPassword-button submit\" type=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"newPassword-button\">提交验证</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"htmleaf-container\">\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<ul class=\"bg-bubbles\">\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script type=\"text/javascript\"src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/plugins/swiper/js/swiper.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/js/toastr.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\tvar activeForm = \".view-confirmQuestion\";\n");
      out.write("\t\t\t$(activeForm).toggleClass(\"active\");\n");
      out.write("\n");
      out.write("\t\t\tvar itemSwiper = new Swiper(\n");
      out.write("\t\t\t\t\t\".swiper-container\",\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tspeed : 400,\n");
      out.write("\t\t\t\t\t\tspaceBetween : 100,\n");
      out.write("\t\t\t\t\t\tsimulateTouch : false,\n");
      out.write("\t\t\t\t\t\tpagination : {\n");
      out.write("\t\t\t\t\t\t\tel : \".swiper-pagination\",\n");
      out.write("\t\t\t\t\t\t\tclickable : false,\n");
      out.write("\t\t\t\t\t\t\trenderBullet : function(index, className) {\n");
      out.write("\t\t\t\t\t\t\t\tif (index === 0) {\n");
      out.write("\t\t\t\t\t\t\t\t\treturn \"<div class='\" + className + \"'><h1>① 验证密保问题</h1></div>\";\n");
      out.write("\t\t\t\t\t\t\t\t} else if (index === 1) {\n");
      out.write("\t\t\t\t\t\t\t\t\treturn \"<div class='\" + className + \"'><h1>② 重置密码</h1></div>\";\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t// 点击进入下一页\n");
      out.write("\t\t\t$(\"#confirmQuestion-button\").on(\"click\", function() {\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : $(\"form:first\").prop(\"action\"),\n");
      out.write("\t\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\t\tdata : $(\"form:first\").serialize(),\n");
      out.write("\t\t\t\t\tasync : false,\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\t\tconsole.log(data.success);\n");
      out.write("\t\t\t\t\t\tif (data.success) {\n");
      out.write("\t\t\t\t\t\t\titemSwiper.slideNext();\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\ttoastr.error(\"密保回答错误！请重新输入！！\");\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#newPassword-button\").on(\"click\", function() {\n");
      out.write("\t\t\t\t$(\"#extr-panel\").find(\"label\").removeClass(\"is-visible\");\n");
      out.write("\t\t\t\tif(!$(\"#password\").val()|| !$(\"#repassword\").val()){\n");
      out.write("\t\t\t\t\t$(\"#extr-panel\").find(\"label.extrtipnull\").addClass(\"is-visible\");\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}else if( $(\"#repassword\").val().length<6 || $(\"#password\").val().length<6){\n");
      out.write("\t\t\t\t\t$(\"#extr-panel\").find(\"label.extrtipless\").addClass(\"is-visible\");\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}else if( $(\"#repassword\").val()!== $(\"#password\").val() )\t{\n");
      out.write("\t\t\t        $(\"#extr-panel\").find(\"label.extrtipequal\").addClass(\"is-visible\"); \n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar username = $(\"#username\").val();\n");
      out.write("\t\t\t\tvar password = $(\"#password\").val();\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : $(\"form:last\").prop(\"action\"),\n");
      out.write("\t\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\t\"username\" : username,\n");
      out.write("\t\t\t\t\t\t\"password\" : password\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tasync : false,\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\tif (data.success) {\n");
      out.write("\t\t\t\t\t\t\ttoastr.success(\"密码修改成功！\");\n");
      out.write("\t\t\t\t\t\t\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\";\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\ttoastr.error(\"密码修改失败！！\");\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("\n");
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
