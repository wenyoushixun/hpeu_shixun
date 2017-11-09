/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2017-11-08 03:50:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.chart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class line_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>ECharts</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 为ECharts准备一个具备大小（宽高）的Dom -->\r\n");
      out.write("\t<div id=\"main\" style=\"height: 400px\"></div>\r\n");
      out.write("\t<!-- ECharts单文件引入 -->\r\n");
      out.write("\t<script src=\"http://echarts.baidu.com/build/dist/echarts.js \"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t//获取日期\r\n");
      out.write("\t\tvar getCreateDate = function() {\r\n");
      out.write("\t\t\tvar getCreateDate = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${createDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn getCreateDate;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t////获取人数\r\n");
      out.write("\t\tvar getCounts = function() {\r\n");
      out.write("\t\t\tvar counts = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${counts}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn counts;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t// 路径配置\r\n");
      out.write("\t\trequire.config({\r\n");
      out.write("\t\t\tpaths : {\r\n");
      out.write("\t\t\t\techarts : 'http://echarts.baidu.com/build/dist'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// 使用\r\n");
      out.write("\t\trequire([ 'echarts', 'echarts/chart/line' // 使用柱状图就加载bar模块，按需加载\r\n");
      out.write("\t\t], function(ec) {\r\n");
      out.write("\t\t\t// 基于准备好的dom，初始化echarts图表\r\n");
      out.write("\t\t\tvar myChart = ec.init(document.getElementById('main'));\r\n");
      out.write("\r\n");
      out.write("\t\t\toption = {\r\n");
      out.write("\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\ttext : '最近一周系统人数变化',\r\n");
      out.write("\t\t\t\t\tsubtext : '仅供参考'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\ttrigger : 'axis'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\ttoolbox : {\r\n");
      out.write("\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\tfeature : {\r\n");
      out.write("\t\t\t\t\t\tmark : {\r\n");
      out.write("\t\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tdataView : {\r\n");
      out.write("\t\t\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\t\t\treadOnly : false\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tmagicType : {\r\n");
      out.write("\t\t\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\t\t\ttype : [ 'line', 'bar' ]\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\trestore : {\r\n");
      out.write("\t\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tsaveAsImage : {\r\n");
      out.write("\t\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcalculable : true,\r\n");
      out.write("\t\t\t\txAxis : [ {\r\n");
      out.write("\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\tboundaryGap : false,\r\n");
      out.write("\t\t\t\t\tdata : eval(getCreateDate())\r\n");
      out.write("\t\t\t\t} ],\r\n");
      out.write("\t\t\t\tyAxis : [ {\r\n");
      out.write("\t\t\t\t\ttype : 'value',\r\n");
      out.write("\t\t\t\t\taxisLabel : {\r\n");
      out.write("\t\t\t\t\t\tformatter : '{value} 人'\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} ],\r\n");
      out.write("\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\tname : '人数',\r\n");
      out.write("\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\tdata : eval(getCounts()),\r\n");
      out.write("\t\t\t\t},]\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 为echarts对象加载数据 \r\n");
      out.write("\t\t\tmyChart.setOption(option);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
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
