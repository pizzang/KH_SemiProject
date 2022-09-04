/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-07-07 08:13:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.community;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.community.model.vo.Community;
import com.kh.common.model.vo.PageInfo;
import com.kh.member.model.vo.Member;
import com.kh.board.model.vo.Attachment2;

public final class volunteerRecruitmentList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/community/../common/header.jsp", Long.valueOf(1657178124000L));
    _jspx_dependants.put("/views/community/../common/footer.jsp", Long.valueOf(1657108742000L));
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
    _jspx_imports_classes.add("com.kh.common.model.vo.PageInfo");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.kh.community.model.vo.Community");
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
      out.write("\r\n");

	ArrayList<Community> list = (ArrayList<Community>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage();


      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>펫밀리 : 봉사하기</title>\r\n");
      out.write("    <style>\r\n");
      out.write("		#content_AR{width: 100%;}\r\n");
      out.write("  \r\n");
      out.write("        .list-area{\r\n");
      out.write("            width: auto;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("        #intro{\r\n");
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
      out.write("		.paging-area>button{	\r\n");
      out.write("			border : 0;\r\n");
      out.write("			border-radius : 5px;	\r\n");
      out.write("			color : white;\r\n");
      out.write("			background-color: rgb(180, 149, 95);\r\n");
      out.write("		}\r\n");
      out.write("		.paging-area>button:hover{\r\n");
      out.write("			background-color: rgb(232, 191, 123);	\r\n");
      out.write("		}\r\n");
      out.write("		table{\r\n");
      out.write("			float: left;\r\n");
      out.write("			height: 400px;\r\n");
      out.write("			margin-left : 100px;\r\n");
      out.write("			margin-bottom : 45px;\r\n");
      out.write("		}\r\n");
      out.write("		.img_AR{\r\n");
      out.write("		width: 450px; height: 350px;\r\n");
      out.write("		padding : 10px\r\n");
      out.write("		}\r\n");
      out.write("		thead:hover{\r\n");
      out.write("		background-color: rgb(255, 217, 135);\r\n");
      out.write("		cursor:pointer;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("		");
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
      out.write("		<br><br>\r\n");
      out.write("	    <div class=\"wrap\">\r\n");
      out.write("        <div id=\"content\" style=\"width:1200px; height: 1400px;\">\r\n");
      out.write("            <div id=\"content_AR\">\r\n");
      out.write("                <div id=\"intro\">			\r\n");
      out.write("                    <h2>봉사하기</h2>\r\n");
      out.write("                    <p>\r\n");
      out.write("						“도움이 필요한 곳, 펫밀리 봉사대가 갑니다!” <br>\r\n");
      out.write("						전국에는 우리가 잘 알지 못하는 유기동물 사설보호소들이 많습니다. 지자체에서 운영하는 시보호소와는 달리, 사설보호소는 개인의 비정기적인 후원금으로 운영되고 있습니다. <br>\r\n");
      out.write("						펫밀리봉사대의 첫 번째 목적은 보호소 환경을 개선하고 개체 수를 감소시켜 보호소의 원활한 운영을 돕거나, 보호소를 폐쇄할 수 있도록 돕는 것입니다. 두 번째 목적은 사설보호소의 존재와 현실을 대중에게 알려 유기동물 문제에 대한 관심을 환기하고 나아가 유기동물의 발생을 막는 것입니다. \r\n");
      out.write("		            </p>\r\n");
      out.write("		             \r\n");
      out.write("                    <a href=\"");
      out.print( contextPath);
      out.write("/reviewlist.vl?cpage=1\"><button id=\"review-btn\">봉사후기 보러가기</button></a>\r\n");
      out.write("\r\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("					\r\n");
      out.write("					");
if(loginUser != null && !loginUser.getUserClass().equals("P")){ 
      out.write(" \r\n");
      out.write("                  	  <button type=\"button\" id=\"intro-button\" onclick=\"writeReview()\">봉사모집 게시글 등록</button>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div> <!--intro-->\r\n");
      out.write("				<script>\r\n");
      out.write("						\r\n");
      out.write("					function writeReview(){\r\n");
      out.write("						location.href=\"");
      out.print(contextPath);
      out.write("/recruitmentForm.vl\"\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("				</script>	\r\n");
      out.write("\r\n");
      out.write("				<br><br>\r\n");
      out.write("                <div class=\"list-area\">\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 if(list.isEmpty()){ 
      out.write("\r\n");
      out.write("                    	<h2>조회된 게시글이 없습니다.</h2>\r\n");
      out.write("                    ");
} else {
      out.write("\r\n");
      out.write("                    	\r\n");
      out.write("                    	");
 for(Community c : list) { 
      out.write("	\r\n");
      out.write("						<table style=\"float:left\">\r\n");
      out.write("						   <thead>\r\n");
      out.write("							   <tr>\r\n");
      out.write("								   <td style=\"width: 450px; height: 350px;\">\r\n");
      out.write("									   <img class=\"img_AR\" src = \"");
      out.print(c.getTitleImg() );
      out.write("\">\r\n");
      out.write("									   <input type=\"hidden\" id=\"cno\" value=\"");
      out.print(c.getComNo());
      out.write("\">\r\n");
      out.write("									   <input type=\"hidden\" id=\"type\" value=\"");
      out.print(c.getType());
      out.write("\">\r\n");
      out.write("								   </td>\r\n");
      out.write("							   </tr>\r\n");
      out.write("						   </thead>\r\n");
      out.write("						   <tbody>\r\n");
      out.write("							   <tr>\r\n");
      out.write("								   <th>제목 | ");
      out.print(c.getTitle() );
      out.write("</th>\r\n");
      out.write("							   </tr>\r\n");
      out.write("							   <tr>\r\n");
      out.write("								   <td>No.");
      out.print(c.getComNo() );
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print(c.getUserNo() );
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print(c.getCreateDate() );
      out.write(" | 👍 ");
      out.print(c.getLikeCount() );
      out.write(" | 👁 ");
      out.print(c.getViewCount() );
      out.write(" |</td>\r\n");
      out.write("							   </tr>\r\n");
      out.write("							   <tr>\r\n");
      out.write("								   <td>\r\n");
      out.write("										");
      out.print(c.getSummary() );
      out.write("\r\n");
      out.write("								   </td>\r\n");
      out.write("							   </tr>\r\n");
      out.write("						   </tbody>\r\n");
      out.write("					   </table>\r\n");
      out.write("						");
} 
      out.write("\r\n");
      out.write("					");
} 
      out.write("	\r\n");
      out.write("          	   </div><!--list-area-->     \r\n");
      out.write("          	 <script>\r\n");
      out.write("				$(function(){\r\n");
      out.write("					$(\"thead\").click(function(){\r\n");
      out.write("		\r\n");
      out.write("						var cno = $(this).children().children().children(\"input#cno\").attr(\"value\");\r\n");
      out.write("						var type = $(this).children().children().children(\"input#type\").attr(\"value\");\r\n");
      out.write("		\r\n");
      out.write("						// http://localhost:8002/SemiProject/detail.an?ano=15\r\n");
      out.write("		\r\n");
      out.write("						location.href=\"");
      out.print(contextPath);
      out.write("/detail.cm?cno=\"+cno +\"&type=\"+type;\r\n");
      out.write("					})\r\n");
      out.write("				})\r\n");
      out.write("			</script>\r\n");
      out.write("       	 </div><!--content_AR-->\r\n");
      out.write("            \r\n");
      out.write("       </div> <!--content-->\r\n");
      out.write("       \r\n");
      out.write("				<br><hr><br>\r\n");
      out.write("          	     <div align=\"center\" class=\"paging-area\">\r\n");
      out.write("   		    	  ");
 if(currentPage != 1){ 
      out.write("\r\n");
      out.write("                   <button onclick=\"location.href='");
      out.print(contextPath);
      out.write("/main.vl?cpage=");
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
      out.write("/main.vl?cpage=");
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
      out.write("/main.vl?cpage=");
      out.print(currentPage +1 );
      out.write("'\"> &gt; </button>\r\n");
      out.write("		        ");
} 
      out.write("\r\n");
      out.write("                </div> <!--페이징-->\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            <br><br><br><!-- content영역과 footer영역 사이 띄우기-->\r\n");
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
      out.write("    </div> <!--wrap-->\r\n");
      out.write("</body>\r\n");
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