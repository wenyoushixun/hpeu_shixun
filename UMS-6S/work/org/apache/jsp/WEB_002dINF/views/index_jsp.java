/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2017-11-07 13:05:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/D:/maven/reposibity/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1509326658227L));
    _jspx_dependants.put("jar:file:/D:/maven/reposibity/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>用户管理系统</title>\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.css\"> -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/plugins/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/css/toastr.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/css/indexStyle.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/css/iconfont.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/css/iconfontlist.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/jquery/jquery.form.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/js/toastr.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"topPanel\">\n");
      out.write("\t\t<div class=\"logo_panel\">\n");
      out.write("\t\t\t<div class=\"logo_content_panel\"><span class=\"span-font\" id=\"ifont-1\">6S</span></div>\n");
      out.write("\t\t\t<h3>用户管理系统-UMS</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<form id=\"avatarForm\" method=\"post\"\n");
      out.write("\t\t\tenctype=\"multipart/form-data\">\n");
      out.write("\t\t\t<!-- 把文件框隐藏，在点击图片的时候触发文件框的点击事件 -->\n");
      out.write("\t\t\t<span style=\"display: none\"><input type=\"file\"\n");
      out.write("\t\t\t\tonchange=\"uploadPic()\" name=\"avatarFile\"></span>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<div class=\"avatar1_panel\">\n");
      out.write("\t\t\t<div class=\"avatar1_content_panel\">\n");
      out.write("\t\t\t\t<div class=\"s_menu\">\n");
      out.write("\t\t\t\t\t<img id=\"avatarImg\"\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentLoginUser.avatarPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"u_name\">\n");
      out.write("\t\t\t\t\t<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentLoginUser.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"hide_ul\">\n");
      out.write("\t\t\t\t\t<li><a href=\"https://scgmysunny.github.io/\" target=\"_blank\">帮助</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logout\" class=\"logout\">退出</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"bottomPanel\">\n");
      out.write("\t\t<div class=\"menu_panel\">\n");
      out.write("\t\t\t<div class=\"menu_content_panel\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t    <!-- \n");
      out.write("\t\t\t\t\t<li class=\"active li1\" onclick=\"accountManage()\"><a href=\"javascript:;\">账号管理</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"li2\" onclick=\"roleManage()\"><a href=\"javascript:;\">角色管理</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"li3\" onclick=\"superManage()\"><a href=\"javascript:;\">权限管理</a> </li>\n");
      out.write("\t\t\t\t\t<li class=\"li4\" onclick=\"departManage()\"><a href=\"javascript:;\">部门管理</a> </li>\n");
      out.write("\t\t\t\t\t -->\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"content_panel\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\n");
      out.write("\t$(\".menu-flag-li:first\").click();\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//提示框属性设置\n");
      out.write("\t\t\ttoastr.options = {\n");
      out.write("\t\t\t\t\t//展现时间\n");
      out.write("\t\t\t\t\t\"timeOut\": \"1000\", \n");
      out.write("\t\t\t\t\t//消失的动画时间\n");
      out.write("\t\t\t\t\t\"hideDuration\": \"8000\",\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t$(\".avatar1_content_panel\").mouseover(function() {\n");
      out.write("\t\t\t\t\t\t\t$(\".hide_ul\").show();//显示menu\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(\".avatar1_content_panel\").mouseout(function() {\n");
      out.write("\t\t\t\t\t\t\t$(\".hide_ul\").hide();//隐藏menu\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t// 点击图片的时候触发上传文件的输入框的点击事件\n");
      out.write("\t\t\t$(\"#avatarImg\").on(\"click\", function() {\n");
      out.write("\t\t\t\t if (confirm(\"确定要上传头像吗？\")) { \n");
      out.write("\t\t\t\t\t$(\"input[type=file]\").click();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 选中li高亮\n");
      out.write("\t\tfunction loadPage(uri,_this){\n");
      out.write("\t\t\tvar li = $(_this);\n");
      out.write("\t\t\t$(\".menu-flag-li\").removeClass(\"active\");\n");
      out.write("\t\t\tli.addClass(\"active\");\n");
      out.write("            $(\".content_panel\").load(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"+uri);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t//上传头像\n");
      out.write("\t\tfunction uploadPic() {\n");
      out.write("\n");
      out.write("\t\t\tvar file = $(\"input[type=file]\").val();\n");
      out.write("\t\t\t// 文件名\n");
      out.write("\t\t\tvar filename = file.replace(/.*(\\/|\\\\)/, \"\");\n");
      out.write("\t\t\t// 后缀\n");
      out.write("\t\t\tvar fileExt = (/[.]/.exec(filename)) ? /[^.]+$/.exec(filename\n");
      out.write("\t\t\t\t\t.toLowerCase()) : '';\n");
      out.write("\t\t\t// 判断文件格式\n");
      out.write("\t\t\tif (fileExt != \"png\" && fileExt != \"jpg\") {\n");
      out.write("\t\t\t\talert(\"上传的文件格式不符合要求，请上传 png 或者 jpg 格式的图片\");\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t// 上传设置  \n");
      out.write("\t\t\tvar options = {\n");
      out.write("\t\t\t\t// 规定把请求发送到那个URL  \n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/avatar\",\n");
      out.write("\t\t\t\t// 请求方式  \n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\t// 服务器响应的数据类型  \n");
      out.write("\t\t\t\tdataType : \"json\",\n");
      out.write("\t\t\t\t// 请求成功时执行的回调函数  \n");
      out.write("\t\t\t\tsuccess : function(data, status, xhr) {\n");
      out.write("\t\t\t\t\tif(data.success){\n");
      out.write("\t\t\t\t\t\ttoastr.success(\"头像修改成功！\");\n");
      out.write("\t\t\t\t\t\t// 图片显示地址  \n");
      out.write("\t\t\t\t\t\t$(\"#avatarImg\").attr(\"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resource\"+data.data);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\ttoastr.error(\"头像修改失败，请稍后再试\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t$(\"#avatarForm\").ajaxSubmit(options);\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t// 显示输入框错误提示\n");
      out.write("\t\tfunction showInputErrorTip($input, value) {\n");
      out.write("\t\t\tvar $parent = $input.parent();\n");
      out.write("\n");
      out.write("\t\t\t$parent.addClass(\"error-group\");\n");
      out.write("\t\t\t$parent.find(\"span\").remove();\n");
      out.write("\t\t\t$parent.append(\"<span class='error-tip'>\" + value + \"</span>\");\n");
      out.write("\n");
      out.write("\t\t\t$input.focus();\n");
      out.write("\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// 隐藏输入框错误提示\n");
      out.write("\t\tfunction hideInputErrorTip($input) {\n");
      out.write("\t\t\tvar $parent = $input.parent();\n");
      out.write("\n");
      out.write("\t\t\t$parent.removeClass(\"error-group\");\n");
      out.write("\t\t\t$parent.find(\"span\").remove();\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html> ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/index.jsp(59,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index.jsp(59,5) '${currentJurisdictions }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${currentJurisdictions }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/index.jsp(59,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t   <li class=\"menu-flag-li\" onclick=\"loadPage('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.uri}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("',this)\"><i class=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.styleType }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"></i> <a href=\"javascript:;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.jurisdictionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a> </li>\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
