/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-07-24 11:51:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.groups;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.Member;
import com.kh.board.model.vo.Attachment2;

public final class groupEnrollForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1657874871187L));
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1657875236666L));
    _jspx_dependants.put("/views/groups/../common/footer.jsp", Long.valueOf(1657108742000L));
    _jspx_dependants.put("jar:file:/C:/Users/김유미/Desktop/SemiProject_PETMILY2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SemiProject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.board.model.vo.Attachment2");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>단체신청 게시판</title>\r\n");
      out.write("<style>\r\n");
      out.write("	div {\r\n");
      out.write("		box-sizing: border-box;\r\n");
      out.write("		/* border: 1px solid darkolivegreen; */\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.wrap {\r\n");
      out.write("		width: 1200px;\r\n");
      out.write("		height: 1600px;\r\n");
      out.write("		margin: auto;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.wrap>div {width: 100%;}\r\n");
      out.write("	\r\n");
      out.write("	#header {height: 10%;}\r\n");
      out.write("	#navigator {height: 3%;}\r\n");
      out.write("	#content {height: 77%;}\r\n");
      out.write("	#footer {height: 10%;}\r\n");
      out.write("	\r\n");
      out.write("	/* 세부 div 속성 */\r\n");
      out.write("	#header>div, #content>div {\r\n");
      out.write("		height: 100%;\r\n");
      out.write("		float: left;\r\n");
      out.write("	}\r\n");
      out.write("	/* 가로길이 */\r\n");
      out.write("	#header_1 {width: 20%;}\r\n");
      out.write("	#header_2 {width: 80%;}\r\n");
      out.write("	#content_1 {width: 20%;}\r\n");
      out.write("	#content_2 {width: 80%;}\r\n");
      out.write("	\r\n");
      out.write("	/*------------------- navigator 영역 --------------------*/\r\n");
      out.write("	#navigator {padding-top: 10px;}\r\n");
      out.write("	\r\n");
      out.write("	#navi {height: 100%;}\r\n");
      out.write("	\r\n");
      out.write("	#navi a {\r\n");
      out.write("		color: black;\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("		font-size: 15px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("	/*------------------- content_1 영역 --------------------*/\r\n");
      out.write("	#content_1 > #user-area{\r\n");
      out.write("         height: 47%;\r\n");
      out.write("         background-color: lightgray;\r\n");
      out.write("\r\n");
      out.write("         /* 사용자영역 표시 - 지우기*/\r\n");
      out.write("         font-size: 16px;\r\n");
      out.write("         padding-top: 1%;\r\n");
      out.write("         padding-left: 5%;\r\n");
      out.write("         \r\n");
      out.write("     }\r\n");
      out.write("     #content_1 > #user-area > p{\r\n");
      out.write("         \r\n");
      out.write("         font-size: 17px;\r\n");
      out.write("         font-weight: bold;\r\n");
      out.write("         \r\n");
      out.write("     }\r\n");
      out.write("     #content_1 > #user-area > li > a {\r\n");
      out.write("         \r\n");
      out.write("         color: black;\r\n");
      out.write("\r\n");
      out.write("         text-decoration-line: none;\r\n");
      out.write("         \r\n");
      out.write("     }\r\n");
      out.write("     #content_1 > #user-area > p > a {\r\n");
      out.write("         \r\n");
      out.write("         color: black;\r\n");
      out.write("\r\n");
      out.write("         text-decoration-line: none;\r\n");
      out.write("         \r\n");
      out.write("     }\r\n");
      out.write("     #content_1 > #admin-area > li > a {\r\n");
      out.write("         \r\n");
      out.write("         color: black;\r\n");
      out.write("\r\n");
      out.write("         text-decoration-line: none;\r\n");
      out.write("         \r\n");
      out.write("     }\r\n");
      out.write("     #content_1 > #br{\r\n");
      out.write("         height: 2%;\r\n");
      out.write("     }\r\n");
      out.write("     #content_1 > #admin-area{\r\n");
      out.write("         height: 25%;\r\n");
      out.write("         background-color: lightgray;\r\n");
      out.write("\r\n");
      out.write("         /* 관리자영역 표시 - 지우기*/\r\n");
      out.write("         font-size: 16px;\r\n");
      out.write("         padding-top: 3%;\r\n");
      out.write("         padding-left: 5%;\r\n");
      out.write("         \r\n");
      out.write("     }\r\n");
      out.write("	/*------------------- content_2 영역 --------------------*/\r\n");
      out.write("	#content_2>#content-area {\r\n");
      out.write("		height: 100%;\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		margin-left: 20px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#table-area {\r\n");
      out.write("		position: relative;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#button-area {\r\n");
      out.write("		border-style: none; /*div에 테두리 지우기*/\r\n");
      out.write("		position: absolute;\r\n");
      out.write("		top: 50%;\r\n");
      out.write("		left: 50%;\r\n");
      out.write("		transform: translate(-50%, -50%);\r\n");
      out.write("		margin-top: 300px;\r\n");
      out.write("	}\r\n");
      out.write("	#button-area > #backBtn{\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		border-color: black;\r\n");
      out.write("		color: black;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#button-area > #submitBtn{\r\n");
      out.write("		background-color: burlywood;\r\n");
      out.write("		color: white;\r\n");
      out.write("	}\r\n");
      out.write("	/*------------------- content_2 영역의 헤더 영역 --------------------*/\r\n");
      out.write("	#content-header2 button {\r\n");
      out.write("		background-color: wheat;\r\n");
      out.write("		border-color: none;\r\n");
      out.write("		color: black;\r\n");
      out.write("\r\n");
      out.write("	}\r\n");
      out.write("	/*------------------- content_2 영역의 테이블 영역 --------------------*/\r\n");
      out.write("	\r\n");
      out.write("	#table-area{\r\n");
      out.write("		height: 50%;\r\n");
      out.write("		/* background-color: rebeccapurple; */\r\n");
      out.write("	}\r\n");
      out.write("	#table {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#table th { \r\n");
      out.write("		background-color: burlywood;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	/*------------------- footer 영역 --------------------*/\r\n");
      out.write("	#footer {\r\n");
      out.write("		background-color: gray;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	#content-header > div{\r\n");
      out.write("		height: 60px;\r\n");
      out.write("		float: left;\r\n");
      out.write("	}\r\n");
      out.write("	#content-header1{\r\n");
      out.write("		width: 50%;\r\n");
      out.write("	}\r\n");
      out.write("	#content-header2{\r\n");
      out.write("		border: solid 1px black;\r\n");
      out.write("		width: 50%;\r\n");
      out.write("		text-align: right;\r\n");
      out.write("		padding-top: 20px;\r\n");
      out.write("	}\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"wrap\">\r\n");
      out.write("	\r\n");
      out.write("		");
      out.write("\r\n");
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
      out.write("		// 얼럿 띄우기(공용)\r\n");
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
      out.write("		<!-- 로고 -->\r\n");
      out.write("		<div id=\"logo-area\">\r\n");
      out.write("			<div id=\"logo\">\r\n");
      out.write("				<a href=\"");
      out.print( contextPath );
      out.write("\">PETMILY</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- 메인메뉴 -->\r\n");
      out.write("		<div id=\"menubar-area\">\r\n");
      out.write("			<div id=\"menubar\">\r\n");
      out.write("				<a href=\"");
      out.print(contextPath);
      out.write("/main.ad?cpage=1\">입양하기</a>\r\n");
      out.write("				<a href=\"");
      out.print(contextPath);
      out.write("/main.vl?cpage=1\">봉사하기</a>\r\n");
      out.write("				<a href=\"\">굿즈샵</a>\r\n");
      out.write("				");
 if(loginUser!=null){ 
      out.write("\r\n");
      out.write("					<a href=\"");
      out.print(contextPath);
      out.write("/list.as?cpage=1\">고객센터</a>\r\n");
      out.write("				");
} else{ 
      out.write("\r\n");
      out.write("					<a onclick=\"loginBlock()\">고객센터</a>			\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<script>\r\n");
      out.write("			function loginBlock(){\r\n");
      out.write("				alert(\"로그인 후 이용할 수 있는 서비스입니다.\");\r\n");
      out.write("			}\r\n");
      out.write("		\r\n");
      out.write("		</script>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<!-- 로그인 상태에 보여지는 login-area -->\r\n");
      out.write("		");
 if(loginUser != null) { 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("			<div id=\"login-area\">\r\n");
      out.write("\r\n");
      out.write("				<!-- 로그인 정보 표시(프로필 사진, 회원등급, 닉네임) -->\r\n");
      out.write("				<div id=\"login-info\">\r\n");
      out.write("\r\n");
      out.write("					<!-- 프로필 사진 -->\r\n");
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
      out.write("					<!-- 회원등급 -->\r\n");
      out.write("					<div id=\"user-class\">\r\n");
      out.write("						");
 
							String userClass = "";
						
							switch (loginUser.getUserClass()) {
							
								case "A" : userClass = "관리자"; break;
								case "G" : userClass = "단체"; break;
								case "P" : userClass = "일반"; break;
							}
						
      out.write("\r\n");
      out.write("						[");
      out.print( userClass );
      out.write("]\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<!-- 닉네임 -->\r\n");
      out.write("					<div id=\"user-nickname\">\r\n");
      out.write("						");
      out.print( loginUser.getUserNickname() );
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- 로그인 시 보여지는 login-menu -->\r\n");
      out.write("				<div id=\"login-menu\">\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("\">HOME</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">마이페이지</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/logout.me\">로그아웃</a>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		<!-- 비회원 상태에 보여지는 login-area -->\r\n");
      out.write("		");
 } else { 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("			<div id=\"login-area\">\r\n");
      out.write("\r\n");
      out.write("				<!-- 로그인 정보 표시(비회원이라 내용 없음) -->\r\n");
      out.write("				<div id=\"login-info\">\r\n");
      out.write("					<div id=\"profile-picture\"></div>\r\n");
      out.write("					<div id=\"user-nickname\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- 비회원 시 보여지는 login-menu -->\r\n");
      out.write("				<div id=\"login-menu\">\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("\">HOME</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.me\">회원가입</a>\r\n");
      out.write("					&nbsp;&nbsp;&vert;&nbsp;&nbsp;\r\n");
      out.write("					<a href=\"");
      out.print( contextPath );
      out.write("/loginForm.me\">로그인</a>\r\n");
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
      out.write("		");

			String userClass = loginUser.getUserClass();
		
      out.write("\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		<div id=\"navigator\">\r\n");
      out.write("\r\n");
      out.write("			<div id=\"navi\">\r\n");
      out.write("				<!-- 임시 내용 -->\r\n");
      out.write("				<a href=\"#\">HOME</a> > <a href=\"#\">마이페이지</a> > <a href=\"#\">내가 쓴\r\n");
      out.write("					글 조회</a>\r\n");
      out.write("			</div><!--navi-->\r\n");
      out.write("\r\n");
      out.write("		</div><!--navigator-->\r\n");
      out.write("\r\n");
      out.write("		<div id=\"content\">\r\n");
      out.write("			<div id=\"content_1\">\r\n");
      out.write("            ");
 if(!(userClass.equals("A"))) { 
      out.write("\r\n");
      out.write("                <div id=\"user-area\">\r\n");
      out.write("                    <!-- 사용자만 보이는 영역-->\r\n");
      out.write("                    ");
 if(userClass.equals("P")) { 
      out.write("\r\n");
      out.write("                        <p>회원 정보 관리</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/profile.me\">내 프로필 수정</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/updateForm.me\">회원 정보 수정</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/updatePwdForm.me\">비밀번호 변경</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/deletePage.me\">회원 탈퇴</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p>내가 쓴 글 조회</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/adoptComment.bo\">입양 후기 게시글 조회</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p>굿즈샵</p>\r\n");
      out.write("                        <li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("                        <li><a href=\"#\">구매내역/배송조회</a></li>\r\n");
      out.write("                        <li><a href=\"#\">내가 쓴 리뷰 조회</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p><a href=\"");
      out.print( contextPath );
      out.write("/interList.bo\">관심 목록</a></p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/interListAN.bo\">관심 등록 동물 보기</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/interListPR.bo\">관심 등록 굿즈 보기</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p>고객센터</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">1:1 문의하기</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.gr\">단체 신청</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">문의 내역</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                    ");
  } else { 
      out.write("\r\n");
      out.write("                    	\r\n");
      out.write("                        <p>회원 정보 관리</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/profile.me\">내 프로필 수정</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/updateForm.me\">회원 정보 수정</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/updatePwdForm.me\">비밀번호 변경</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/deletePage.me\">회원 탈퇴</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                        <p><a href=\"");
      out.print( contextPath );
      out.write("/myPost.bo\">내가 쓴 글 조회</a> </p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/volunteerRecruit.bo\">봉사 활동 모집글 조회</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/volunteerComment.bo\">봉사 후기 게시글 조회</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/animalPost.bo\">동물 등록 게시글 조회</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                        <p>굿즈샵</p>\r\n");
      out.write("                        <li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("                        <li><a href=\"#\">구매내역/배송조회</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                        <p><a href=\"");
      out.print( contextPath );
      out.write("/interList.bo\">관심 목록</a></p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/interListAN.bo\">관심 등록 동물 보기</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/interListPR.bo\">관심 등록 굿즈 보기</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                        <p>고객센터</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">1:1 문의하기</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.gr\">단체 신청</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">문의 내역</a></li>\r\n");
      out.write("                       </ul>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"br\">\r\n");
      out.write("                    <!-- 사용자영역과 관리자영역 사이 공간-->\r\n");
      out.write("                </div>\r\n");
      out.write("            ");
 } else { 
      out.write("\r\n");
      out.write("                <div id=\"user-area\">\r\n");
      out.write("                    <p>회원 정보 관리</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/profile.me\">내 프로필 수정</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/updateForm.me\">회원 정보 수정</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/deletePage.me\">회원 탈퇴</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p>내가 쓴 글 조회</p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/adoptComment.bo\">입양 후기 게시글 조회</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p>굿즈샵</p>\r\n");
      out.write("                        <li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("                        <li><a href=\"#\">구매내역/배송조회</a></li>\r\n");
      out.write("                        <li><a href=\"#\">내가 쓴 리뷰 조회</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p><a href=\"");
      out.print( contextPath );
      out.write("/interList.bo\">관심 목록</a></p>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/interListAN.bo\">관심 등록 동물 보기</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/interListPR.bo\">관심 등록 굿즈 보기</a></li>\r\n");
      out.write("                       \r\n");
      out.write("                       <p>고객센터</p>\r\n");
      out.write("                       	<li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/askEnrollForm.as\">1:1 문의하기</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/enrollForm.gr\">단체 신청</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">문의 내역</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"admin-area\">\r\n");
      out.write("                    <!-- 관리자가 볼 수 있는 영역-->\r\n");
      out.write("                    <p>관리자 메뉴</p>\r\n");
      out.write("                	<li><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">공지사항</a></li>\r\n");
      out.write("                    <li><a href=\"#\">상품 등록</a></li>\r\n");
      out.write("                    <li><a href=\"#\">상품 주문내역</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print( contextPath );
      out.write("/list.gr?cpage=1\">단체 승인 내역</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print( contextPath );
      out.write("list.ap?cpage=1\">입양신청서</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print( contextPath );
      out.write("/list.as?cpage=1\">1:1 문의내역</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            </div><!-- content_1 -->\r\n");
      out.write("\r\n");
      out.write("			<div id=\"content_2\">\r\n");
      out.write("				<div id=\"content-area\">\r\n");
      out.write("					<h2>단체신청</h2>\r\n");
      out.write("					<hr>\r\n");
      out.write("						<p>\r\n");
      out.write("							관리자가 확인 후 승인을 도와드립니다. 최대 7일까지 소요될 수 있습니다. <br>\r\n");
      out.write("							궁금한 사항은 1:1문의하기 게시판을 이용해주세요.\r\n");
      out.write("						</p>\r\n");
      out.write("					<hr>\r\n");
      out.write("					\r\n");
      out.write("					<div id=\"table-area\">\r\n");
      out.write("						<form id=\"group-enroll-form\" action=\"");
      out.print( contextPath );
      out.write("/insert.gr\" method=\"post\" class=\"form-inline\">\r\n");
      out.write("							\r\n");
      out.write("							<input type=\"hidden\" name=\"userNo\" value=\"");
      out.print(loginUser.getUserNo() );
      out.write("\">\r\n");
      out.write("							<input type=\"hidden\" name=\"userName\" value=\"");
      out.print(loginUser.getUserName() );
      out.write("\">\r\n");
      out.write("							\r\n");
      out.write("							<table class=\"table\">\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th width=\"200\">단체명 *</th>\r\n");
      out.write("									<td><input type=\"text\" name=\"groupName\" required></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>신청인</th>\r\n");
      out.write("									<td>");
      out.print( loginUser.getUserName() );
      out.write("</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>연락처 *</th>\r\n");
      out.write("									<td><input type=\"text\" name=\"userPhone\" placeholder=\"-포함\" required></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>사업자등록번호</th>\r\n");
      out.write("									<td><input type=\"text\" name=\"groupEnrollno\"></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>공식사이트</th>\r\n");
      out.write("									<td><input type=\"text\" name=\"groupUrl\"></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>참고사항</th>\r\n");
      out.write("									<td><textarea name=\"groupEtc\" cols=\"80\" rows=\"10\" style=\"resize:none;\"></textarea></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</table>\r\n");
      out.write("							\r\n");
      out.write("							<hr>\r\n");
      out.write("							\r\n");
      out.write("							<div id=\"button-area\">\r\n");
      out.write("								<button type=\"button\" class=\"btn\" id=\"backBtn\" onclick=\"goBack();\">취소</button> &emsp;\r\n");
      out.write("								<button type=\"submit\" class=\"btn\" id=\"submitBtn\">작성완료</button>\r\n");
      out.write("							</div>\r\n");
      out.write("							<script>\r\n");
      out.write("								function goBack(){\r\n");
      out.write("									window.history.back();\r\n");
      out.write("								}\r\n");
      out.write("							</script>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div><!-- table-area -->\r\n");
      out.write("				</div><!-- content-area -->\r\n");
      out.write("			</div><!-- content_2 -->\r\n");
      out.write("\r\n");
      out.write("		</div><!--content-->\r\n");
      out.write("\r\n");
      out.write("		<div id=\"footer\">\r\n");
      out.write("			<br><br><br><!-- content영역과 footer영역 사이 띄우기-->\r\n");
      out.write("       		");
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
      out.write("				(04540) 서울시 중구 남대문로 120 대일빌딩 2F, 3F&nbsp;&nbsp;&nbsp;대표 : 이승철\r\n");
      out.write("				<br>MAIL : petmily@gmail.com&nbsp;&nbsp;&nbsp;TEL : 02-999-1004&nbsp;&nbsp;&nbsp;FAX : 02-999-1004&nbsp;&nbsp;&nbsp;사업자등록번호 : 123-12-12345\r\n");
      out.write("				<br><br>Copyright © 2022 PETMILY All Right Reserved\r\n");
      out.write("			</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("		</div><!--footer-->\r\n");
      out.write("		\r\n");
      out.write("	</div><!-- wrap -->\r\n");
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