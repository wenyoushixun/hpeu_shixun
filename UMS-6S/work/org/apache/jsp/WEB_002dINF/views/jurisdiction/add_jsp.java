/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2017-11-07 05:38:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.jurisdiction;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div class=\"addR add disappear\">\n");
      out.write("\t<h3>添加权限</h3>\n");
      out.write("\t<form class=\"form-inline\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jurisdiction/add\" method=\"post\">\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"\">名称：</label>\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" name=\"jurisdictionName\" id=\"jurisdictionName\" maxlength=\"16\" required>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"\">描述：</label>\n");
      out.write("\t\t\t<textarea name=\"description\" id=\"description\" cols=\"60\" rows=\"10\" style=\"resize: none\" maxlength=\"16\" required></textarea>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("            <label for=\"\">地址：</label>\n");
      out.write("            <input name=\"uri\" type=\"text\" class=\"form-control\" id=\"uri\" >\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("           <label for=\"\">样式：</label> \n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-role\"><i class=\"iconfont icon-role\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-role1\"><i class=\"iconfont icon-role1\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-ic-control-Jurisdiction\"><i class=\"iconfont icon-ic-control-Jurisdiction\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-yunpingtaitubiao_department\"><i class=\"iconfont icon-yunpingtaitubiao_department\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-ic-control-Jurisdiction\"><i class=\"iconfont icon-ic-control-Jurisdiction\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-datastatistics1\"><i class=\"iconfont icon-datastatistics1\"></i>                                           \n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-data1\"><i class=\"iconfont icon-data1\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-chazhaobiaodanliebiao\"><i class=\"iconfont icon-chazhaobiaodanliebiao\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-liebiao\"><i class=\"iconfont icon-liebiao\"></i>\n");
      out.write("           <input type=\"radio\" name=\"styleType\" value=\"iconfont icon-role4\"><i class=\"iconfont icon-role7\"></i>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t</form>\n");
      out.write("\t<div class=\"save\">\n");
      out.write("\t\t<button class=\"btn btn-info saveJurisdiction\">保存</button>\n");
      out.write("\t\t<button class=\"btn btn-warning\" id=\"cancel\">取消</button>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\n");
      out.write("\t\t//取消按钮\n");
      out.write("\t\t$(\"#cancel\").on(\"click\", function() {\n");
      out.write("\t\t\t$(\".content_panel\").load(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jurisdiction/list\");\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//保存提交按钮\n");
      out.write("\t\t$(\".saveJurisdiction\").on(\"click\", function() {\n");
      out.write("\t\t\t/* var jurisdictionName = $(\"#jurisdictionName\").val();\n");
      out.write("\t\t\tvar description = $(\"#description\").val();\n");
      out.write("\t\t\tvar uri = $(\"#uri\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jurisdiction/add\",\n");
      out.write("\t\t\t\tsync : \"true\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\"jurisdictionName\" : jurisdictionName,\n");
      out.write("\t\t\t\t\t\"description\" : description,\n");
      out.write("\t\t\t\t\t\"uri\" : uri\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tsuccess : function() {\n");
      out.write("\t\t\t\t\ttoastr.success(\"保存成功！\");\n");
      out.write("\t\t\t\t\t$(\".content_panel\").load(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jurisdiction/list\");\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t}); */\n");
      out.write("\t\t\t$form.trigger(\"submit\");\n");
      out.write("\t\t});\t\n");
      out.write("\n");
      out.write("\t\t//为非空验证做准备\n");
      out.write("\t\tvar $add = $(\".add\");\n");
      out.write("\t\tvar $form=$add.find(\".form-inline\");\n");
      out.write("\t\tvar $input=$form.find(\"input\");\n");
      out.write("\n");
      out.write("\t\t// 初始化表单提交\n");
      out.write("\t\t$form.on(\"submit\", function(e) {\n");
      out.write("\t\t\te.preventDefault()\n");
      out.write("\t\t\tvar $this = $(this);\n");
      out.write("\n");
      out.write("\t\t\t$this.ajaxSubmit({\n");
      out.write("\t\t\t\tbeforeSubmit : function(data, $form) {\n");
      out.write("\t\t\t\t\tvar jurisdictionName = $form.find(\"input[id='jurisdictionName']\");\n");
      out.write("\t\t\t\t\tvar description = $form.find(\"textarea[id='description']\");\n");
      out.write("\n");
      out.write("\t\t\t\t\t// 非空验证\n");
      out.write("\t\t\t\t\tif ($.trim(jurisdictionName.val()) === \"\") {\n");
      out.write("\t\t\t\t\t\treturn showInputErrorTip(jurisdictionName, \"请输入权限名称\");\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\thideInputErrorTip(jurisdictionName);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t// 非空验证\n");
      out.write("\t\t\t\t\tif ($.trim(description.val()) === \"\") {\n");
      out.write("\t\t\t\t\t\treturn showInputErrorTip(description, \"请输入权限描述\");\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\thideInputErrorTip(description);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tsuccess : function() {\n");
      out.write("\t\t\t\t\ttoastr.success(\"保存成功！\");\n");
      out.write("\t\t\t\t\t$(\".content_panel\").load(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jurisdiction/list\");\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\t \n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("</script>");
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
