<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import= "com.kh.member.model.vo.Member" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
        div{
            box-sizing: border-box;
            /* border: 1px solid darkolivegreen; */
        }
        .wrap{
            width: 1200px;
            height: 1600px;
            margin: auto;
        }
        .wrap > div{width: 100%;}
        #header{height: 10%;} 
        #footer{height: 10%;}
        #navigator{height: 3%;}
        #content{height: 77%;}

        /* 세부 div 속성 */
        #header > div, #content > div{
            height: 100%;
            float: left;
        }
        /* 가로길이 */
        #header_1{width: 20%;}
        #header_2{width: 80%;}

        #content_1{width: 20%;}
        #content_2{width: 80%;}
/*------------------- header_1 영역 --------------------*/
        #header_1{
            /* 영역 표시용 : 지우기 */
            background-color: floralwhite;
            color: sandybrown;
            text-align: center;
            font-size: 20px;
            font-weight: 900;
            padding-top: 50px;
        }
/*------------------- header_2 영역 --------------------*/
        #header_2 > #login-area{
            text-align: right;
            height: 20%;
        }
        #header_2 > #login-area a{
            color: black;
            text-decoration: none;
            font-size: 15px;
        }
        #header_2 > #menubar{
            height: 80%;
            padding: 50px;
            text-align: center;
        }
        /* #header_2 > #menubar a{
            color: rgb(155, 128, 82);
            text-decoration: none;
            font-size: 50px;
            font-weight: bold;
        } */
        #header_2 > #menubar > pre a{
            color: rgb(155, 128, 82);
            text-decoration: none;
            font-size: 30px;
            font-weight: bold;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        }
        #header_2 > #menubar :hover{
            color: orange;
        }
/*------------------- navigator 영역 --------------------*/
        #navigator{padding-top: 10px;}
        #navi{height: 100%;}
        #navi a{
            color: black;
            text-decoration: none;
            font-size: 15px; 
            font-weight: bold;
        }
/*------------------- content_1 영역 --------------------*/
        #content_1 > #user-area{
            height: 47%;
            background-color: lightgray;

            /* 사용자영역 표시 - 지우기*/
            font-size: 16px;
            padding-top: 1%;
            padding-left: 5%;
            
        }
        #content_1 > #user-area > p{
            
            font-size: 17px;
            font-weight: bold;
            
        }
        #content_1 > #user-area > p > a {
            
            color: black;

            text-decoration-line: none;
            
        }
        #content_1 > #user-area > li > a {
            
            color: black;

            text-decoration-line: none;
            
        }#content_1 > #admin-area > li > a {
            
            color: black;

            text-decoration-line: none;
            
        }
        #content_1 > #br{
            height: 2%;
        }
        #content_1 > #admin-area{
            height: 25%;
            background-color: lightgray;

            /* 관리자영역 표시 - 지우기*/
            font-size: 16px;
            padding-top: 3%;
            padding-left: 5%;
            
        }
/*------------------- content_2 영역 --------------------*/
        #content_2 > #content-area{
            height: 100%;
            margin-left: 20px;
            background-color: floralwhite;
        }
        
/*------------------- footer 영역 --------------------*/
        #footer{
            background-color: gray;
        }
       
    </style>
</head>
<body>


    <div class="wrap">

        <%@ include file="/views/common/header.jsp" %>
        
        <% 
        
        String birthDate = loginUser.getBirthDate();
    	
    	String userNickname = loginUser.getUserNickname();
    		
    	String userClass = loginUser.getUserClass();
        
        %>

    

        <hr>

        <div id="navigator">

            <div id="navi">
                <!-- 임시 내용 -->
                <a href="<%= contextPath %>">HOME</a> > 
                <a href="<%= contextPath %>/myPage.me">마이페이지</a> >
                <a href="<%= contextPath %>/deletePage.me">회원 탈퇴</a>
            </div><!--navi-->

        </div><!--navigator-->

        <div id="content">
            <div id="content_1">
                <% if(!(userClass.equals("A"))) { %>
                    <div id="user-area">
                        <!-- 사용자만 보이는 영역-->
                        <% if(userClass.equals("P")) { %>
                            <p>회원 정보 관리</p>
                            <li><a href="<%= contextPath %>/profile.me">내 프로필 수정</a></li>
                            <li><a href="<%= contextPath %>/updateForm.me">회원 정보 수정</a></li>
                            <li><a href="<%= contextPath %>/updatePwdForm.me">비밀번호 변경</a></li>
                            <li><a href="<%= contextPath %>/deletePage.me">회원 탈퇴</a></li>
                           
                           <p>내가 쓴 글 조회</p>
                            <li><a href="<%= contextPath %>/adoptComment.bo">입양 후기 게시글 조회</a></li>
                           
                           <p>굿즈샵</p>
                            <li><a href="#">장바구니</a></li>
                            <li><a href="#">구매내역/배송조회</a></li>
                            <li><a href="#">내가 쓴 리뷰 조회</a></li>
                           
                           <p><a href="<%= contextPath %>/interList.bo">관심 목록</a></p>
                            <li><a href="<%= contextPath %>/interListAN.bo">관심 등록 동물 보기</a></li>
                            <li><a href="<%= contextPath %>/interListPR.bo">관심 등록 굿즈 보기</a></li>
                           
                           <p>고객센터</p>
                               <li><a href="<%= contextPath %>/list.no">공지사항</a></li>
                            <li><a href="<%= contextPath %>/list.as?cpage=1">1:1 문의하기</a></li>
                            <li><a href="<%= contextPath %>/enrollForm.gr">단체 신청</a></li>
                            <li><a href="<%= contextPath %>/list.as?cpage=1">문의 내역</a></li>
                           
                        <%  } else { %>
                            
                            <p>회원 정보 관리</p>
                            <li><a href="<%= contextPath %>/profile.me">내 프로필 수정</a></li>
                            <li><a href="<%= contextPath %>/updateForm.me">회원 정보 수정</a></li>
                            <li><a href="<%= contextPath %>/updatePwdForm.me">비밀번호 변경</a></li>
                            <li><a href="<%= contextPath %>/deletePage.me">회원 탈퇴</a></li>
                           
                            <p><a href="<%= contextPath %>/myPost.bo">내가 쓴 글 조회</a> </p>
                            <li><a href="<%= contextPath %>/volunteerRecruit.bo">봉사 활동 모집글 조회</a></li>
                            <li><a href="<%= contextPath %>/volunteerComment.bo">봉사 후기 게시글 조회</a></li>
                            <li><a href="<%= contextPath %>/animalPost.bo">동물 등록 게시글 조회</a></li>
                           
                            <p>굿즈샵</p>
                            <li><a href="#">장바구니</a></li>
                            <li><a href="#">구매내역/배송조회</a></li>
                           
                            <p><a href="<%= contextPath %>/interList.bo">관심 목록</a></p>
                            <li><a href="<%= contextPath %>/interListAN.bo">관심 등록 동물 보기</a></li>
                            <li><a href="<%= contextPath %>/interListPR.bo">관심 등록 굿즈 보기</a></li>
                           
                            <p>고객센터</p>
                            <li><a href="<%= contextPath %>/list.no">공지사항</a></li>
                            <li><a href="<%= contextPath %>/list.as?cpage=1">1:1 문의하기</a></li>
                            <li><a href="<%= contextPath %>/enrollForm.gr">단체 신청</a></li>
                            <li><a href="<%= contextPath %>/list.as?cpage=1">문의 내역</a></li>
                           </ul>
                        <% } %>
                        
                    </div>
                    <div id="br">
                        <!-- 사용자영역과 관리자영역 사이 공간-->
                    </div>
                <% } else { %>
                    <div id="user-area">
                        <p>회원 정보 관리</p>
                            <li><a href="<%= contextPath %>/profile.me">내 프로필 수정</a></li>
                            <li><a href="<%= contextPath %>/updateForm.me">회원 정보 수정</a></li>
                            <li><a href="<%= contextPath %>/deletePage.me">회원 탈퇴</a></li>
                           
                           <p>내가 쓴 글 조회</p>
                            <li><a href="<%= contextPath %>/adoptComment.bo">입양 후기 게시글 조회</a></li>
                           
                           <p>굿즈샵</p>
                            <li><a href="#">장바구니</a></li>
                            <li><a href="#">구매내역/배송조회</a></li>
                            <li><a href="#">내가 쓴 리뷰 조회</a></li>
                           
                           <p><a href="<%= contextPath %>/interList.bo">관심 목록</a></p>
                            <li><a href="<%= contextPath %>/interListAN.bo">관심 등록 동물 보기</a></li>
                            <li><a href="<%= contextPath %>/interListPR.bo">관심 등록 굿즈 보기</a></li>
                           
                           <p>고객센터</p>
                            <li><a href="<%= contextPath %>/list.no">공지사항</a></li>
                            <li><a href="<%= contextPath %>/list.as?cpage=1">1:1 문의하기</a></li>
                            <li><a href="<%= contextPath %>/enrollForm.gr">단체 신청</a></li>
                            <li><a href="<%= contextPath %>/list.as?cpage=1">문의 내역</a></li>
                    </div>
                    <div id="admin-area">
                        <!-- 관리자가 볼 수 있는 영역-->
                        <p>관리자 메뉴</p>
                        <li><a href="<%= contextPath %>/list.no">공지사항</a></li>
                        <li><a href="#">상품 등록</a></li>
                        <li><a href="#">상품 주문내역</a></li>
                        <li><a href="<%= contextPath %>/list.gr">단체 승인</a></li>
                        <li><a href="#">입양신청서</a></li>
                        <li><a href="<%= contextPath %>/list.as?cpage=1">1:1 문의내역</a></li>
                        
                    </div>
            <% } %>
            </div>
            <div id="content_2">
                <div id="content-area">
                	<div id="delete-area">
                        <h3>회 원 탈 퇴</h3>
                        <pre>회원탈퇴에관한설명어쩌고저쩌고이러쿵저러쿵</pre>
                        <form id="delete-form" method="post">
                            <table>
                                <tr>
                                    <th>아이디</th>
                                    <td><input type="text" name="userId" value="<%= loginUser.getUserId() %>" readonly></td>
                                </tr>
                                <tr>
                                    <th>비밀번호</th>
                                    <td><input type="password" name="userPwd" required></td>
                                </tr>
                                <tr>
                                    <th><input type="checkbox" name="deleteCheck"></th>
                                    <td>회원탈퇴 시 모든 정보는 복구되지않으며 어쩌고저쩌고 동의하십니까?</td>
                                </tr>             
                            </table>
                            <button type="submit" id="delete-btn">회원탈퇴</button>
                        </form>
                    </div>
                </div>
            </div>
        </div><!--content-->

        <br><!-- content영역과 footer영역 사이 띄우기-->

        <div id="footer">
        </div><!--footer-->
    </div>
    
    <script>

       /* $("input:checkbox[name='deleteCheck']").click(function(){
            if($(this).is(":checked")){
                $("#delete-btn").removeAttr("disabled");
            }
            else{
                $("#delete-btn").attr("disabled", true);
            }

        });
        */
        
       $("#delete-btn").click(function(){

            if(!$("input:checkbox[name='deleteCheck']").is(":checked")){
                alert("정보처리약관에 동의해주세요.")
            }
            else{
                var result = confirm("정말로 탈퇴하시겠습니까? 모든 정보는 복구되지 않습니다.");

                if(result){
                    $("#delete-form").attr('action', "<%= contextPath %>/delete.me");
                }

            }
           


       })
       
    </script>
    
</body>
</html>