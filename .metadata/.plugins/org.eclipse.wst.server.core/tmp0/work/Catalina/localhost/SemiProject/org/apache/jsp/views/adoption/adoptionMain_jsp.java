/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-07-07 08:13:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.adoption;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.adoption.model.vo.*;
import java.util.ArrayList;
import com.kh.common.model.vo.PageInfo;
import com.kh.member.model.vo.Member;
import com.kh.board.model.vo.Attachment2;

public final class adoptionMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/adoption/../common/header.jsp", Long.valueOf(1657178124000L));
    _jspx_dependants.put("/views/adoption/../common/footer.jsp", Long.valueOf(1657108742000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.kh.adoption.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.board.model.vo.Attachment2");
    _jspx_imports_classes.add("com.kh.common.model.vo.PageInfo");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
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
      out.write("\r\n");

	ArrayList<Animal> list = (ArrayList<Animal>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage();


      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>????????????</title>\r\n");
      out.write("    <style>\r\n");
      out.write("		#content_AR{width: 100%;}\r\n");
      out.write("        .img_AR{\r\n");
      out.write("            width: 320px;\r\n");
      out.write("            height: 320px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("        .outer{\r\n");
      out.write("            background-color: coral;\r\n");
      out.write("            color : white;\r\n");
      out.write("            width: 1000px;\r\n");
      out.write("            height: 1000px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("        .list-area{\r\n");
      out.write("            width: auto;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("        .thumbnail{\r\n");
      out.write("            width: 330px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            margin: 13px;\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("        .thumbnail>img:hover{\r\n");
      out.write("            cursor:pointer;\r\n");
      out.write("            background-color: rgb(255,217,135);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table{\r\n");
      out.write("            margin-left:20px;\r\n");
      out.write("            margin-bottom : 20px;\r\n");
      out.write("        }\r\n");
      out.write("        #adoptionInform, #intro{\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            background-color: lightgray;\r\n");
      out.write("            margin-left : 15px\r\n");
      out.write("        }\r\n");
      out.write("        #menu-area{\r\n");
      out.write("        	margin-left : 40px;\r\n");
      out.write("        }\r\n");
      out.write("		#intro-button{\r\n");
      out.write("			width : 300px;\r\n");
      out.write("			background-color: rgb(232, 191, 123);	\r\n");
      out.write("			border : 0;\r\n");
      out.write("			border-radius : 5px;	\r\n");
      out.write("			color : white;\r\n");
      out.write("		}\r\n");
      out.write("		#review-btn{\r\n");
      out.write("			width : 300px;\r\n");
      out.write("			background-color: rgb(180, 149, 95);\r\n");
      out.write("			border : 0;\r\n");
      out.write("			border-radius : 5px;	\r\n");
      out.write("			color : white;\r\n");
      out.write("		}\r\n");
      out.write("		#intro-button:hover, #review-btn:hover{\r\n");
      out.write("			background-color: rgb(255, 217, 135);\r\n");
      out.write("			color : rgb(155, 128, 82)\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#like-btn{\r\n");
      out.write("			border : 0;\r\n");
      out.write("			outline : 0;\r\n");
      out.write("			background-color : rgba(255, 255, 255, 0);\r\n");
      out.write("			CURSOR:hand;\r\n");
      out.write("		}\r\n");
      out.write("		.paging-area>button{	\r\n");
      out.write("			border : 0;\r\n");
      out.write("			border-radius : 5px;	\r\n");
      out.write("			color : white;\r\n");
      out.write("			background-color: rgb(180, 149, 95);\r\n");
      out.write("		}\r\n");
      out.write("		.paging-area>button:hover{\r\n");
      out.write("			background-color: rgb(232, 191, 123);	\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
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
      out.write("				");
 if(loginUser!=null){ 
      out.write("\r\n");
      out.write("					<a href=\"");
      out.print(contextPath);
      out.write("/list.as?cpage=1\">????????????</a>\r\n");
      out.write("				");
} else{ 
      out.write("\r\n");
      out.write("					<a onclick=\"loginBlock()\">????????????</a>			\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<script>\r\n");
      out.write("			function loginBlock(){\r\n");
      out.write("				alert(\"????????? ??? ????????? ??? ?????? ??????????????????.\");\r\n");
      out.write("			}\r\n");
      out.write("		\r\n");
      out.write("		</script>\r\n");
      out.write("		\r\n");
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
      out.write("		<br><br>\r\n");
      out.write("	    <div class=\"wrap\">\r\n");
      out.write("        <div id=\"content\" style=\"width:1200px\">\r\n");
      out.write("            <div id=\"content_AR\">\r\n");
      out.write("                <div id=\"intro\">			\r\n");
      out.write("                    ");
 if(loginUser != null && loginUser.getUserClass().equals("A")) { 
      out.write("\r\n");
      out.write("                    <!-- ????????? ???????????? -- ?????????????????????????????? ?????? -->\r\n");
      out.write("                    <a href=\"");
      out.print( contextPath);
      out.write("/list.ap?cpage=1\"><button>??????????????? ??????(?????????)</button></a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
} 
      out.write("  \r\n");
      out.write("                    <h2>????????????</h2>\r\n");
      out.write("                    <p>\r\n");
      out.write("						?????? ???????????? ????????? ????????? ???????????? ??? ?????? ????????? ????????? ?????? ??? ????????????. <br>\r\n");
      out.write("						????????? ?????? ???????????? ???????????? ???????????????. ????????? ???????????? ?????????, ???????????? ???????????????.\r\n");
      out.write("		            </p>\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"#adoptionInform\"><button id=\"intro-button\">?????? ?????? ??????</button></a>\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <a href=\"");
      out.print( contextPath);
      out.write("/reviewlist.ad?cpage=1\"><button id=\"review-btn\">????????????</button></a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 if(loginUser != null && !loginUser.getUserClass().equals("P")) { 
      out.write("\r\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <!-- ??????/???????????? -->\r\n");
      out.write("                    <a href=\"");
      out.print( contextPath);
      out.write("/enrollForm.an\"><button id=\"intro-button\">???????????? ??????</button></a>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
} 
      out.write("    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div> <!--intro-->\r\n");
      out.write("\r\n");
      out.write("				<br><br>\r\n");
      out.write("                <div class=\"list-area\" align=\"center\">\r\n");
      out.write("                   \r\n");
      out.write("                    ");
 if(list.isEmpty()){ 
      out.write("\r\n");
      out.write("                    	<h2>????????? ???????????? ????????????.</h2>\r\n");
      out.write("                    ");
} else {
      out.write("\r\n");
      out.write("                    	\r\n");
      out.write("                    	");
 for(Animal a : list) { 
      out.write("	\r\n");
      out.write("		                  <div class=\"thumbnail\" align=\"center\">\r\n");
      out.write("	                    	<div class=\"animalNo\" value=\"");
      out.print(a.getAnimalNo());
      out.write("\" style=\"display:none\"></div> <!-- ???????????? ????????? ????????? > ???????????? ?????? -->\r\n");
      out.write("		                        <img class=\"img_AR\" src=");
      out.print(a.getTitleImg() );
      out.write(" alt=\"??????\">		                      \r\n");
      out.write("		                        <table align=\"left\">\r\n");
      out.write("		                            <tr>\r\n");
      out.write("		                                <th width=\"200px\" style=\"text-align: left; font-size:xx-large\">");
      out.print( a.getAnimalName() );
      out.write("</th>\r\n");
      out.write("		                                \r\n");
      out.write("	                                	<td width=\"45\" style=\"color:red;\">\r\n");
      out.write("											<button type=\"button\" id=\"like-btn\" title=\"????????????\"></button>																														\r\n");
      out.write("	                                	</td>\r\n");
      out.write("	                                	\r\n");
      out.write("		                                <th width=\"45\" style=\"font-size:large; color:red;\" align=\"right\">            \r\n");
      out.write("			                                ");
 if(a.getAdopted().equals("Y")){ 
      out.write("\r\n");
      out.write("			                                	????????????\r\n");
      out.write("			                                ");
}
      out.write("                                	\r\n");
      out.write("		                                </th>\r\n");
      out.write("		                                \r\n");
      out.write("		                            </tr>\r\n");
      out.write("		                            <tr>\r\n");
      out.write("		                                <td style=\"font-size:small\">");
      out.print(a.getCategoryNo() );
      out.write("</td>\r\n");
      out.write("		                            </tr>\r\n");
      out.write("		                            <tr>\r\n");
      out.write("		                                <td style=\"font-size:small\">\r\n");
      out.write("				                            ");
 if(a.getGender().equals("M")){ 
      out.write("\r\n");
      out.write("				                            	??????\r\n");
      out.write("				                            ");
} else{
      out.write("\r\n");
      out.write("				                            	??????\r\n");
      out.write("				                            ");
} 
      out.write("\r\n");
      out.write("	\r\n");
      out.write("			                                ");
 if(a.getNeutralization().equals("Y")){ 
      out.write("\r\n");
      out.write("			                                	(????????? O)\r\n");
      out.write("			                                ");
} else {
      out.write("\r\n");
      out.write("			                                	(????????? X)\r\n");
      out.write("			                                ");
} 
      out.write("\r\n");
      out.write("		                                \r\n");
      out.write("		                                </td>\r\n");
      out.write("		                            </tr>\r\n");
      out.write("		                            <tr>\r\n");
      out.write("		                                <td style=\"font-size:small\">");
      out.print(a.getAnimalAge() );
      out.write(" ??? / ");
      out.print(a.getWeight() );
      out.write(" kg</td>\r\n");
      out.write("		                            </tr>\r\n");
      out.write("		                        </table>\r\n");
      out.write("		                 </div> <!--??????--> \r\n");
      out.write("                 		");
} 
      out.write("\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("          \r\n");
      out.write("                <br><br>\r\n");
      out.write("                <div align=\"center\" class=\"paging-area\">\r\n");
      out.write("   		    	  ");
 if(currentPage != 1){ 
      out.write("\r\n");
      out.write("                   <button onclick=\"location.href='");
      out.print(contextPath);
      out.write("/main.ad?cpage=");
      out.print(currentPage -1 );
      out.write("'\">&lt;</button>\r\n");
      out.write("               	  ");
} 
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("		       	  ");
 for(int i = startPage; i <= endPage; i++) { 
      out.write("\r\n");
      out.write("		            ");
 if(i != currentPage){ 
      out.write("\r\n");
      out.write("		                <button onclick=\"location.href='");
      out.print(contextPath);
      out.write("/main.ad?cpage=");
      out.print(i );
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</button>\r\n");
      out.write("		            ");
} else { 
      out.write("\r\n");
      out.write("		                <button disabled>");
      out.print(i );
      out.write("</button>\r\n");
      out.write("		            ");
} 
      out.write("\r\n");
      out.write("		       	  ");
} 
      out.write("\r\n");
      out.write("		       	  \r\n");
      out.write("		        ");
 if(currentPage != maxPage){ 
      out.write("\r\n");
      out.write("		            <button onclick=\"location.href='");
      out.print(contextPath);
      out.write("/main.ad?cpage=");
      out.print(currentPage +1 );
      out.write("'\"> &gt; </button>\r\n");
      out.write("		        ");
} 
      out.write("\r\n");
      out.write("                </div> <!--?????????-->\r\n");
      out.write("                \r\n");
      out.write("      <script>\r\n");
      out.write("		$(function(){\r\n");
      out.write("			$(\".thumbnail>img\").click(function(){\r\n");
      out.write("\r\n");
      out.write("				var ano = $(this).parent().children('div.animalNo').attr(\"value\");\r\n");
      out.write("\r\n");
      out.write("				// http://localhost:8002/SemiProject/detail.an?ano=15\r\n");
      out.write("\r\n");
      out.write("				location.href=\"");
      out.print(contextPath);
      out.write("/detail.an?ano=\"+ano;\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("            </div><!--list-area-->\r\n");
      out.write("            \r\n");
      out.write("            <br><br>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"adoptionInform\">\r\n");
      out.write("                <h2>?????? ??????</h2>\r\n");
      out.write("		                ??????????????? ?????? ??? ????????????????????? ??? 2-4?????? ???????????????. <br><br>\r\n");
      out.write("		    \r\n");
      out.write("		                ?????? ????????? ????????? ?????? ????????? ?????? ???????????? ????????? ?????? ???????????? ??? ????????? ?????????.<br><br>\r\n");
      out.write("		    \r\n");
      out.write("		               <b>?????? ??? ??????????????????</b><br>\r\n");
      out.write("		    \r\n");
      out.write("		                ???????????? ??????????????? ??????????????? ????????? ??????????????? ???????????????.<br>\r\n");
      out.write("		                ?????? ????????? ????????? ????????? ????????? ???????????? ??????, ???????????? ?????? ?????? ??????????????? ???????????????.<br>\r\n");
      out.write("		                ???????????? ????????? ?????? ????????? ????????? ????????? ????????? ???????????????.<br>\r\n");
      out.write("		                ???????????? ???????????? ?????????, ?????????????????? ?????? ????????? ?????? ???????????????.<br>\r\n");
      out.write("		                ?????? ????????? ????????? ????????? ?????? ?????? ????????? ??????????????? ??????????????? ???????????????.<br>\r\n");
      out.write("		                ??? ?????? ??? ?????????????????? ????????? ??????????????????.<br>\r\n");
      out.write("		                ????????? ?????? ??? ????????????, ?????????????????? ????????? ??????????????????.<br>\r\n");
      out.write("		                ???????????? ??? ????????? ????????? ????????? ???????????????.<br>\r\n");
      out.write("            </div> <!--????????????-->\r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("       	 </div><!--content2-->\r\n");
      out.write("       </div> <!--content-->\r\n");
      out.write("            \r\n");
      out.write("            <br><br><br><!-- content????????? footer?????? ?????? ?????????-->\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>footer</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("	/* footer */\r\n");
      out.write("	#footer {\r\n");
      out.write("		background-color: rgb(158, 158, 158);\r\n");
      out.write("		height: 120px;\r\n");
      out.write("	}\r\n");
      out.write("	#footer-content {\r\n");
      out.write("		padding-top: 6px;\r\n");
      out.write("		padding-left: 20px;\r\n");
      out.write("		padding-right: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	#footer-content > p {\r\n");
      out.write("		color: white;\r\n");
      out.write("		font-size: 14px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- footer -->\r\n");
      out.write("	<div id=\"footer\">\r\n");
      out.write("		<div id=\"footer-content\">\r\n");
      out.write("			<p>\r\n");
      out.write("				(04540) ????????? ?????? ???????????? 120 ???????????? 2F, 3F&nbsp;&nbsp;&nbsp;?????? : ?????????\r\n");
      out.write("				<br>MAIL : petmily@gmail.com&nbsp;&nbsp;&nbsp;TEL : 02-999-1004&nbsp;&nbsp;&nbsp;FAX : 02-999-1004&nbsp;&nbsp;&nbsp;????????????????????? : 123-12-12345\r\n");
      out.write("				<br><br>Copyright ?? 2022 PETMILY All Right Reserved\r\n");
      out.write("			</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    </div> <!--wrap-->\r\n");
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
