/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-05 09:16:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/board/../include/include.jsp", Long.valueOf(1617545965178L));
    _jspx_dependants.put("/WEB-INF/views/board/../footer.jsp", Long.valueOf(1617549271024L));
    _jspx_dependants.put("/WEB-INF/views/board/../menu.jsp", Long.valueOf(1617545965393L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1617542255367L));
    _jspx_dependants.put("jar:file:/D:/h/spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/sp08_board_sql/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- ???????????? -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<!-- ?????? -->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/chatstyle.css\" rel=\"stylesheet\">  \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- ?????????????????? -->\r\n");
      out.write("<!-- <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script> -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ????????? ?????????????????? -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tif ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'!=''){\r\n");
      out.write("\t\talert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'!=''){\r\n");
      out.write("\t\talert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script> ");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>???????????????</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//?????? ??????\r\n");
      out.write("\t\t$('#btnFileAdd').on('click', function(e) {\r\n");
      out.write("\t\t\te.preventDefault(); //??????????????? ??????\r\n");
      out.write("\t\t\tvar appendHtml = '<li><input type=\"file\" name=\"uploadfiles\" >' +\r\n");
      out.write("\t\t\t\t\t\t\t'<button class=\"btnFileRemove\">??????</button></li>';\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#fileGroup').append(appendHtml);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//?????? ??????:???????????? ????????? ????????? ??????\r\n");
      out.write("\t\t$('#fileGroup').on('click', 'button', function(e) {\r\n");
      out.write("\t\t\te.preventDefault(); //??????????????? ??????(submit????????????)\r\n");
      out.write("\t\t\t//this ?????? ??????\r\n");
      out.write("\t\t\t$(this).parent().remove();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//??????????????? ???????????????\r\n");
      out.write("\t\t$('#btnAdd').on('click', function(e) {\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//loginid??????\r\n");
      out.write("\t\t\tconst session_userid = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\t\t\tif (session_userid==''){\r\n");
      out.write("\t\t\t\talert('??????????????? ????????????');\r\n");
      out.write("\t\t\t\treturn ;\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//???????????????\r\n");
      out.write("\t\t\tconst subject = frmAdd.subject.value;\r\n");
      out.write("\t\t\tconst content = frmAdd.content.value;\r\n");
      out.write("\t\t\tif (subject==''){\r\n");
      out.write("\t\t\t\t//alert('????????? ??????????????????');\r\n");
      out.write("\t\t\t\t$('#msg').html('????????? ??????????????????!');\r\n");
      out.write("\t\t\t\tfrmAdd.subject.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}else if (content==''){\r\n");
      out.write("\t\t\t\talert('????????? ??????????????????');\r\n");
      out.write("\t\t\t\tfrmAdd.content.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//form??? ?????? ??????\r\n");
      out.write("\t\t\t$('#frmAdd').attr('action','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/add');\r\n");
      out.write("\t\t\t$('#frmAdd').attr('method','post');\r\n");
      out.write("\t\t\t$('#frmAdd').attr('enctype','multipart/form-data');\r\n");
      out.write("\t\t\t$('#frmAdd').submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//?????????,????????????,???????????? show ??????\r\n");
      out.write(" \t\tif ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("' ==''){\r\n");
      out.write("\t\t\t$('#aLogin').show();\r\n");
      out.write("\t\t\t$('#aJoin').show();\r\n");
      out.write("\t\t\t$('#aLogout').hide();\r\n");
      out.write("\t\t\t$('#imgThumbnail').hide();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$('#aLogin').hide();\r\n");
      out.write("\t\t\t$('#aJoin').hide();\r\n");
      out.write("\t\t\t$('#aLogout').show();\t\t\r\n");
      out.write("\t\t\t$('#imgThumbnail').show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//??????\r\n");
      out.write("\t\t$('#aHome').on('click', function(e) {\r\n");
      out.write("\t\t\t$(this).attr('href', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/main');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//?????????\r\n");
      out.write("\t\t$('#aBoardList').on('click', function(e) {\r\n");
      out.write("\t\t\t$(this).attr('href', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/');\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//????????????\r\n");
      out.write("\t\t$('#aInfo').on('click', function(e) {\r\n");
      out.write("\t\t\t$(this).attr('href', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/info');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t//????????????\r\n");
      out.write("\t\t$('#aLogout').on('click', function(e) {\r\n");
      out.write("\t\t\te.preventDefault(); //????????? ??????????????? ??????\r\n");
      out.write("\t\t\tvar result = confirm('???????????? ???????????????????');\r\n");
      out.write("\t\t\tif (result){\r\n");
      out.write("\t\t\t\t$(location).attr('href', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logout');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//?????????\r\n");
      out.write("\t\t$('#btnLogin').on('click', function(e) {\r\n");
      out.write("\t\t\t//?????????/???????????? ??????\r\n");
      out.write("\t\t\te.preventDefault(); //????????? ??????????????? ??????\r\n");
      out.write("\t\t\t$('#loginForm').attr('action','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login');\r\n");
      out.write("\t\t\t$('#loginForm').attr('method','post');\r\n");
      out.write("\t\t\t$('#loginForm').submit();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t//????????? ??????\r\n");
      out.write("\t\t$('#btnLoginCancel').on('click', function(e) {\r\n");
      out.write("\t\t\te.preventDefault(); //????????? ??????????????? ??????\r\n");
      out.write("\t\t\t$('#loginModal').modal('hide');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//??????\r\n");
      out.write("\t\t$('#aChat').on('click', function(e) {\r\n");
      out.write("\t\t\te.preventDefault(); //????????? ??????????????? ??????\r\n");
      out.write("\t\t\t$(location).attr('href', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/chatbot');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Navbar -->\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>                        \r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"\" id=\"aHome\" >??????</a>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"\" id=\"aBoardList\">?????????</a>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"\" id=\"aInfo\">????????????</a>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"\" id=\"aChat\" >??????</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#loginModal\" id=\"aLogin\">?????????</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/add\" target=\"myframe\" id=\"aJoin\">????????????</a></li>\r\n");
      out.write("        <li><a href=\"\" id=\"aLogout\">????????????</a></li>\r\n");
      out.write("        <li><a href=\"#\" id=\"aMyinfo\" target=\"myframe\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("        <li><img id=\"imgThumbnail\" alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/localimg/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.thumbnail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" width=\"50\" ></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    \r\n");
      out.write("  <!-- ????????? Modal -->\r\n");
      out.write("  <div class=\"modal fade\" id=\"loginModal\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("\t\t<div class=\"modal-header\">\r\n");
      out.write("\t \t\t<h4 class=\"modal-title\">?????????</h4>\r\n");
      out.write("\t    </div>\r\n");
      out.write("        <div class=\"modal-body\">\t    \r\n");
      out.write("\t\t\t<form id =\"loginForm\">\r\n");
      out.write("\t\t\t  \t<div class=\"input-group\">\r\n");
      out.write("\t\t\t    \t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\r\n");
      out.write("\t\t\t    \t<input id=\"id\" type=\"text\" class=\"form-control\" name=\"userid\" placeholder=\"id\">\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t  \t<div class=\"input-group\">\r\n");
      out.write("\t\t\t    \t<span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\r\n");
      out.write("\t\t\t    \t<input id=\"password\" type=\"password\" class=\"form-control\" name=\"passwd\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t  \t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write(" \t\t<div class=\"modal-footer\">\r\n");
      out.write(" \t\t\t<a href=\"\"  class=\"btn btn-primary\" id=\"btnLogin\">?????????</a>\r\n");
      out.write(" \t\t\t<a href=\"\" class=\"btn btn-success\" id=\"btnLoginCancel\">??????</a>\r\n");
      out.write("\t\t</div>      \r\n");
      out.write(" \t\t<div class=\"modal-footer\">\r\n");
      out.write(" \t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${apiURL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><img height=\"50\" src=\"http://static.nid.naver.com/oauth/small_g_in.PNG\"/></a>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</nav>\t");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<h2>???????????????</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t<form id=\"frmAdd\" name=\"frmAdd\" >\r\n");
      out.write("\t\t?????? : <input type=\"text\" name=\"subject\" id=\"subject\" ><br>\r\n");
      out.write("\t\t?????? : \r\n");
      out.write("\t\t<textarea rows=\"5\" cols=\"20\" name=\"content\" id=\"content\"></textarea> <br>\r\n");
      out.write("\t\t?????? : \r\n");
      out.write("\t\t\t<button id=\"btnFileAdd\" class=\"btn btn-success\">??????</button> \r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<ul id=\"fileGroup\">\r\n");
      out.write("\t\t\t\t<li><input type=\"file\" name=\"uploadfiles\"><button class=\"btnFileRemove\">??????</button> </li>\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t<button id=\"btnAdd\" class=\"btn btn-success\">??????</button>\r\n");
      out.write("\t\t<input type=\"reset\" value=\"??????\" class=\"btn btn-danger\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div class=\"text-danger\" id=\"msg\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"container-fluid bg-4 text-center\">\r\n");
      out.write("  <p>???????????? ????????? <a href=\"https://www.naver.com\">gusrb1954@naver.com</a></p> \r\n");
      out.write("</footer>");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/board/../include/include.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path");
      // /WEB-INF/views/board/../include/include.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/board/../include/include.jsp(4,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
