/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-07-07 05:41:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.Member;
import com.kh.adoption.model.vo.Animal;
import java.util.ArrayList;
import com.kh.member.model.vo.Member;
import com.kh.board.model.vo.Attachment2;

public final class InterListAN_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1657160039949L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.adoption.model.vo.Animal");
    _jspx_imports_classes.add("com.kh.board.model.vo.Attachment2");
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");


	
    ArrayList<Animal> listAN = (ArrayList<Animal>)session.getAttribute("interListAN");


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>???????????????</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("        div{\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            /* border: 1px solid darkolivegreen; */\r\n");
      out.write("        }\r\n");
      out.write("        .wrap{\r\n");
      out.write("            width: 1200px;\r\n");
      out.write("            height: 1600px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("        }\r\n");
      out.write("        .wrap > div{width: 100%;}\r\n");
      out.write("        #header{height: 10%;} \r\n");
      out.write("        #footer{height: 10%;}\r\n");
      out.write("        #navigator{height: 3%;}\r\n");
      out.write("        #content{height: 77%;}\r\n");
      out.write("\r\n");
      out.write("        /* ?????? div ?????? */\r\n");
      out.write("        #header > div, #content > div{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("        /* ???????????? */\r\n");
      out.write("        #header_1{width: 20%;}\r\n");
      out.write("        #header_2{width: 80%;}\r\n");
      out.write("\r\n");
      out.write("        #content_1{width: 20%;}\r\n");
      out.write("        #content_2{width: 80%;}\r\n");
      out.write("/*------------------- header_1 ?????? --------------------*/\r\n");
      out.write("        #header_1{\r\n");
      out.write("            /* ?????? ????????? : ????????? */\r\n");
      out.write("            background-color: floralwhite;\r\n");
      out.write("            color: sandybrown;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            font-weight: 900;\r\n");
      out.write("            padding-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("/*------------------- header_2 ?????? --------------------*/\r\n");
      out.write("        #header_2 > #login-area{\r\n");
      out.write("            text-align: right;\r\n");
      out.write("            height: 20%;\r\n");
      out.write("        }\r\n");
      out.write("        #header_2 > #login-area a{\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        #header_2 > #menubar{\r\n");
      out.write("            height: 80%;\r\n");
      out.write("            padding: 50px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        /* #header_2 > #menubar a{\r\n");
      out.write("            color: rgb(155, 128, 82);\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 50px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        } */\r\n");
      out.write("        #header_2 > #menubar > pre a{\r\n");
      out.write("            color: rgb(155, 128, 82);\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        #header_2 > #menubar :hover{\r\n");
      out.write("            color: orange;\r\n");
      out.write("        }\r\n");
      out.write("/*------------------- navigator ?????? --------------------*/\r\n");
      out.write("        #navigator{padding-top: 10px;}\r\n");
      out.write("        #navi{height: 100%;}\r\n");
      out.write("        #navi a{\r\n");
      out.write("            color: black;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 15px; \r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("/*------------------- content_1 ?????? --------------------*/\r\n");
      out.write("        #content_1 > #user-area{\r\n");
      out.write("            height: 47%;\r\n");
      out.write("            background-color: lightgray;\r\n");
      out.write("\r\n");
      out.write("            /* ??????????????? ?????? - ?????????*/\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            padding-top: 1%;\r\n");
      out.write("            padding-left: 5%;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        #content_1 > #user-area > p{\r\n");
      out.write("            \r\n");
      out.write("            font-size: 17px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        #content_1 > #user-area > p > a {\r\n");
      out.write("            \r\n");
      out.write("            color: black;\r\n");
      out.write("\r\n");
      out.write("            text-decoration-line: none;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        #content_1 > #user-area > li > a {\r\n");
      out.write("            \r\n");
      out.write("            color: black;\r\n");
      out.write("\r\n");
      out.write("            text-decoration-line: none;\r\n");
      out.write("            \r\n");
      out.write("        }#content_1 > #admin-area > li > a {\r\n");
      out.write("            \r\n");
      out.write("            color: black;\r\n");
      out.write("\r\n");
      out.write("            text-decoration-line: none;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        #content_1 > #br{\r\n");
      out.write("            height: 2%;\r\n");
      out.write("        }\r\n");
      out.write("        #content_1 > #admin-area{\r\n");
      out.write("            height: 25%;\r\n");
      out.write("            background-color: lightgray;\r\n");
      out.write("\r\n");
      out.write("            /* ??????????????? ?????? - ?????????*/\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            padding-top: 3%;\r\n");
      out.write("            padding-left: 5%;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("/*------------------- content_2 ?????? --------------------*/\r\n");
      out.write("        #content_2 > #content-area{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("            background-color: floralwhite;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("/*------------------- footer ?????? --------------------*/\r\n");
      out.write("        #footer{\r\n");
      out.write("            background-color: gray;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");

	Member loginUser = (Member)session.getAttribute("loginUser");
	String alertMsg = (String)session.getAttribute("alertMsg");
	String contextPath = request.getContextPath();
	Attachment2 at2 = (Attachment2)session.getAttribute("at");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("	/* header */\r\n");
      out.write("	#header {height: 100px;}\r\n");
      out.write("	#header > div {\r\n");
      out.write("		height: 100%;\r\n");
      out.write("		float: left;\r\n");
      out.write("		box-sizing: border-box;\r\n");
      out.write("	}\r\n");
      out.write("	#header a {text-decoration: none;}\r\n");
      out.write("\r\n");
      out.write("	/* header > login-area */\r\n");
      out.write("	#logo-area {\r\n");
      out.write("		width: 250px;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	#logo {\r\n");
      out.write("		width: 200px;\r\n");
      out.write("		margin: auto;\r\n");
      out.write("		margin-top: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	#logo > a {\r\n");
      out.write("		color: rgb(232, 191, 123);\r\n");
      out.write("		font-size: 50px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	/* header > menubar-area */\r\n");
      out.write("	#menubar-area {\r\n");
      out.write("		width: 660px;\r\n");
      out.write("		padding-top: 60px;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	#menubar {margin-right: 10px;}\r\n");
      out.write("	#menubar > a {\r\n");
      out.write("		color: black;\r\n");
      out.write("		font-size: 23px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		margin-left: 35px;\r\n");
      out.write("		margin-right: 35px;\r\n");
      out.write("	}\r\n");
      out.write("	#menubar > a:hover {color: rgb(155, 128, 82);}\r\n");
      out.write("\r\n");
      out.write("	/* header > login-area */\r\n");
      out.write("	#login-area {width: 290px;}\r\n");
      out.write("	#login-area > div {box-sizing: border-box;}\r\n");
      out.write("	#login-info {\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		height: 60px;\r\n");
      out.write("		color: black;\r\n");
      out.write("		font-size: 18px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		text-align: left;\r\n");
      out.write("		display: flex;\r\n");
      out.write("	}\r\n");
      out.write("	#login-info > div {\r\n");
      out.write("		height: 100%;\r\n");
      out.write("		line-height: 57.33px;\r\n");
      out.write("		float: left;\r\n");
      out.write("	}\r\n");
      out.write("	#profile {\r\n");
      out.write("		width: 22%;\r\n");
      out.write("		display: flex;\r\n");
      out.write("		margin-left: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	#profile > img {\r\n");
      out.write("		border: 1px solid rgb(125, 125, 125);\r\n");
      out.write("		border-radius: 70%;\r\n");
      out.write("		margin: auto;\r\n");
      out.write("	}\r\n");
      out.write("	#user-class {\r\n");
      out.write("		width: 30%;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	#user-nickname {\r\n");
      out.write("		width: 48%;\r\n");
      out.write("		overflow: hidden;\r\n");
      out.write("		text-overflow: ellipsis;\r\n");
      out.write("	}\r\n");
      out.write("	#login-menu {text-align: center;}\r\n");
      out.write("	#login-menu > a {color: rgb(125, 125, 125);}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("		// ?????? ?????????(??????)\r\n");
      out.write("		var msg = \"");
      out.print( alertMsg );
      out.write("\";\r\n");
      out.write("		\r\n");
      out.write("		if (msg != \"null\") {\r\n");
      out.write("\r\n");
      out.write("			alert(msg);\r\n");
      out.write("			");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("	<!-- header -->\r\n");
      out.write("	<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("		<!-- ?????? -->\r\n");
      out.write("		<div id=\"logo-area\">\r\n");
      out.write("			<div id=\"logo\">\r\n");
      out.write("				<a href=\"");
      out.print( contextPath );
      out.write("\">PETMILY</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- ???????????? -->\r\n");
      out.write("		<div id=\"menubar-area\">\r\n");
      out.write("			<div id=\"menubar\">\r\n");
      out.write("				<a href=\"");
      out.print(contextPath);
      out.write("/main.ad?cpage=1\">????????????</a>\r\n");
      out.write("				<a href=\"");
      out.print(contextPath);
      out.write("/main.vl?cpage=1\">????????????</a>\r\n");
      out.write("				<a href=\"\">?????????</a>\r\n");
      out.write("				<a href=\"");
      out.print(contextPath);
      out.write("/list.as?cpage=1\">????????????</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<!-- ????????? ????????? ???????????? login-area -->\r\n");
      out.write("		");
 if(loginUser != null) { 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("			<div id=\"login-area\">\r\n");
      out.write("\r\n");
      out.write("				<!-- ????????? ?????? ??????(????????? ??????, ????????????, ?????????) -->\r\n");
      out.write("				<div id=\"login-info\">\r\n");
      out.write("\r\n");
      out.write("					<!-- ????????? ?????? -->\r\n");
      out.write("					<div id=\"profile\">\r\n");
      out.write("                        ");
 if(at2 == null) { 
      out.write("\r\n");
      out.write("                        <img class=\"profileImg\" src=\"");
      out.print( contextPath );
      out.write("/resources/blank-profile-picture.png\" height=\"70%\">\r\n");
      out.write("                        ");
 } else { 
      out.write("\r\n");
      out.write("                        <img class=\"profileImg\" src=\"");
      out.print( contextPath );
      out.write('/');
      out.print( at2.getFilePath()+at2.getChangeName() );
      out.write("\" height=\"70%\">\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<!-- ???????????? -->\r\n");
      out.write("					<div id=\"user-class\">\r\n");
      out.write("						");
 
							String userClass = "";
						
							switch (loginUser.getUserClass()) {
							
								case "A" : userClass = "?????????"; break;
								case "G" : userClass = "??????"; break;
								case "P" : userClass = "??????"; break;
							}
						
      out.write("\r\n");
      out.write("						[");
      out.print( userClass );
      out.write("]\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<!-- ????????? -->\r\n");
      out.write("					<div id=\"user-nickname\">\r\n");
      out.write("						");
      out.print( loginUser.getUserNickname() );
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- ????????? ??? ???????????? login-menu -->\r\n");
      out.write("				<div id=\"login-menu\">\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("\">HOME</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">???????????????</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/logout.me\">????????????</a>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		<!-- ????????? ????????? ???????????? login-area -->\r\n");
      out.write("		");
 } else { 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("			<div id=\"login-area\">\r\n");
      out.write("\r\n");
      out.write("				<!-- ????????? ?????? ??????(??????????????? ?????? ??????) -->\r\n");
      out.write("				<div id=\"login-info\">\r\n");
      out.write("					<div id=\"profile-picture\"></div>\r\n");
      out.write("					<div id=\"user-nickname\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- ????????? ??? ???????????? login-menu -->\r\n");
      out.write("				<div id=\"login-menu\">\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("\">HOME</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.me\">????????????</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/loginForm.me\">?????????</a>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
 
        
        String birthDate = loginUser.getBirthDate();
    	
    	String userNickname = loginUser.getUserNickname();
    		
    	String userClass = loginUser.getUserClass();

       // Attachment at = (Attachment)session.getAttribute("at");

        
        
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"navigator\">\r\n");
      out.write("\r\n");
      out.write("            <div id=\"navi\">\r\n");
      out.write("                <!-- ?????? ?????? -->\r\n");
      out.write("                <a href=\"");
      out.print( contextPath );
      out.write("\">HOME</a> > \r\n");
      out.write("                <a href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">???????????????</a> >\r\n");
      out.write("                <a href=\"");
      out.print( contextPath );
      out.write("/interListAN.bo\">?????? ?????? ?????? ??????</a>\r\n");
      out.write("                \r\n");
      out.write("            </div><!--navi-->\r\n");
      out.write("\r\n");
      out.write("        </div><!--navigator-->\r\n");
      out.write("\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("            <div id=\"content_1\">\r\n");
      out.write("                ");
 if(!(userClass.equals("A"))) { 
      out.write("\r\n");
      out.write("                    <div id=\"user-area\">\r\n");
      out.write("                        <!-- ???????????? ????????? ??????-->\r\n");
      out.write("                        ");
 if(userClass.equals("P")) { 
      out.write("\r\n");
      out.write("                            <p>?????? ?????? ??????</p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/profile.me\">??? ????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/updateForm.me\">?????? ?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/updatePwdForm.me\">???????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/deletePage.me\">?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p>?????? ??? ??? ??????</p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/adoptComment.bo\">?????? ?????? ????????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p>?????????</p>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????/????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">?????? ??? ?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p><a href=\"");
      out.print( contextPath );
      out.write("/interList.bo\">?????? ??????</a></p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/interListAN.bo\">?????? ?????? ?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/interListPR.bo\">?????? ?????? ?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p>????????????</p>\r\n");
      out.write("                               <li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">1:1 ????????????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.gr\">?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                        ");
  } else { 
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <p>?????? ?????? ??????</p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/profile.me\">??? ????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/updateForm.me\">?????? ?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/updatePwdForm.me\">???????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/deletePage.me\">?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                            <p><a href=\"");
      out.print( contextPath );
      out.write("/myPost.bo\">?????? ??? ??? ??????</a> </p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/volunteerRecruit.bo\">?????? ?????? ????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/volunteerComment.bo\">?????? ?????? ????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/animalPost.bo\">?????? ?????? ????????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                            <p>?????????</p>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????/????????????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                            <p><a href=\"");
      out.print( contextPath );
      out.write("/interList.bo\">?????? ??????</a></p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/interListAN.bo\">?????? ?????? ?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/interListPR.bo\">?????? ?????? ?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                            <p>????????????</p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">1:1 ????????????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.gr\">?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">?????? ??????</a></li>\r\n");
      out.write("                           </ul>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"br\">\r\n");
      out.write("                        <!-- ?????????????????? ??????????????? ?????? ??????-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                    <div id=\"user-area\">\r\n");
      out.write("                        <p>?????? ?????? ??????</p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/profile.me\">??? ????????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/updateForm.me\">?????? ?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/deletePage.me\">?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p>?????? ??? ??? ??????</p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/adoptComment.bo\">?????? ?????? ????????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p>?????????</p>\r\n");
      out.write("                            <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">????????????/????????????</a></li>\r\n");
      out.write("                            <li><a href=\"#\">?????? ??? ?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p><a href=\"");
      out.print( contextPath );
      out.write("/interList.bo\">?????? ??????</a></p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/interListAN.bo\">?????? ?????? ?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/interListPR.bo\">?????? ?????? ?????? ??????</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                           <p>????????????</p>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">????????????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">1:1 ????????????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.gr\">?????? ??????</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">?????? ??????</a></li>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"admin-area\">\r\n");
      out.write("                        <!-- ???????????? ??? ??? ?????? ??????-->\r\n");
      out.write("                        <p>????????? ??????</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">????????????</a></li>\r\n");
      out.write("                        <li><a href=\"#\">?????? ??????</a></li>\r\n");
      out.write("                        <li><a href=\"#\">?????? ????????????</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.gr\">?????? ??????</a></li>\r\n");
      out.write("                        <li><a href=\"#\">???????????????</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">1:1 ????????????</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"content_2\">\r\n");
      out.write("                <div id=\"content-area\">\r\n");
      out.write("                	\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h3>?????? ?????? ??????</h3>\r\n");
      out.write("                        ");
 if(listAN.isEmpty()) { 
      out.write("\r\n");
      out.write("                            <h4>?????? ?????? ????????? ????????????~</h4>\r\n");
      out.write("                        ");
 } else { 
      out.write("    \r\n");
      out.write("                        <table align=\"center\" class=\"table table-hover\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th width=\"100\">?????? ??????</th>\r\n");
      out.write("                                    <th width=\"100\">?????? ??????</th>\r\n");
      out.write("                                    <th width=\"150\">??????/????????? ??????</th>\r\n");
      out.write("                                    <th width=\"100\">??????</th>\r\n");
      out.write("                                    <th width=\"100\">?????????</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
 for(Animal a : listAN) { 
      out.write("\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>");
      out.print( a.getCategoryName() );
      out.write("</td>\r\n");
      out.write("                                    	<td><a href=\"");
      out.print(contextPath);
      out.write("/detail.an?ano=");
      out.print( a.getAnimalNo() );
      out.write('"');
      out.write('>');
      out.print( a.getAnimalName() );
      out.write("</a></td>\r\n");
      out.write("                                        <td>");
      out.print( a.getGender() );
      out.write(' ');
      out.write('/');
      out.write(' ');
      out.print( a.getNeutralization() );
      out.write("</td>\r\n");
      out.write("                                        <td>");
      out.print( a.getAnimalAge() );
      out.write("</td>\r\n");
      out.write("                                        <td>");
      out.print( a.getWeight() );
      out.write("</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!--content-->\r\n");
      out.write("\r\n");
      out.write("        <br><!-- content????????? footer?????? ?????? ?????????-->\r\n");
      out.write("\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("        </div><!--footer-->\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
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
