<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList, com.kh.ask.model.vo.Category" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1문의하기 - 사용자</title>
<style>
	div {
		box-sizing: border-box;
		/* border: 1px solid darkolivegreen; */
		/* border: 1px solid darkolivegreen; */
	}
	
	.wrap {
		width: 1200px;
		height: 1600px;
		margin: auto;
	}
	
	.wrap>div {width: 100%;}
	
	#header {height: 10%;}
	#navigator {height: 3%;}
	#content {height: 77%;}
	#footer {height: 10%;}
	
	/* 세부 div 속성 */
	#header>div, #content>div {
		height: 100%;
		float: left;
	}
	/* 가로길이 */
	#header_1 {width: 20%;}
	#header_2 {width: 80%;}
	#content_1 {width: 20%;}
	#content_2 {width: 80%;}
	
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
    #content_1 > #user-area > li > a {
        
        color: black;

        text-decoration-line: none;
        
    }
    #content_1 > #user-area > p > a {
        
        color: black;

        text-decoration-line: none;
        
    }
    #content_1 > #admin-area > li > a {
        
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
	#content_2>#content-area {
		height: 100%;
		width: 100%;
		margin-left: 20px;
	}

	#table-area{
		position: relative;
	}
	
	#button-area {
		border-style: none; /*div에 테두리 지우기*/
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%, -50%);
		margin-top: 300px;
	}
	
	#button-area > #backBtn{
		background-color: white;
		border-color: black;
		color: black;
	}

	#button-area > #submitBtn{
		background-color: burlywood;
		color: white;
	}

	/*------------------- footer 영역 --------------------*/
	#footer {
		background-color: gray;
	}
</style>
</head>
<body>

	<div class="wrap">
	
		<jsp:include page="../common/header.jsp"></jsp:include>
	
		<div id="navigator">

			<div id="navi">
				<!-- 임시 내용 -->
				<a href="#">HOME</a> > <a href="#">마이페이지</a> > <a href="#">내가 쓴
					글 조회</a>
			</div><!--navi-->

		</div><!--navigator-->

		<div id="content">
			<div id="content_1">
	            <c:choose>
	            	<c:when test="${ userClass eq 'A' }">
	            		
	            		<div id="user-area"><!-- 사용자만 보이는 영역-->
	            		
		                    <c:choose>
		                    	<c:when test="${ userClass eq 'P' }">
		                    		<p>회원 정보 관리</p>
				                        <li><a href="${ contextPath }/profile.me">내 프로필 수정</a></li>
				                        <li><a href="${ contextPath }/updateForm.me">회원 정보 수정</a></li>
				                        <li><a href="${ contextPath }/updatePwdForm.me">비밀번호 변경</a></li>
				                        <li><a href="${ contextPath }/deletePage.me">회원 탈퇴</a></li>
									
									<p>내가 쓴 글 조회</p>
				                        <li><a href="${ contextPath }/adoptComment.bo">입양 후기 게시글 조회</a></li>
				
									<p>굿즈샵</p>
				                        <li><a href="#">장바구니</a></li>
				                        <li><a href="#">구매내역/배송조회</a></li>
				                        <li><a href="#">내가 쓴 리뷰 조회</a></li>
				
									<p>		<a href="${ contextPath }/interList.bo">관심 목록</a></p>
				                        <li><a href="${ contextPath }/interListAN.bo">관심 등록 동물 보기</a></li>
				                        <li><a href="${ contextPath }/interListPR.bo">관심 등록 굿즈 보기</a></li>
				
									<p>고객센터</p>
										<li><a href="${ contextPath }/list.no">공지사항</a></li>
				                        <li><a href="${ contextPath }/list.as?cpage=1">1:1 문의하기</a></li>
				                        <li><a href="${ contextPath }/enrollForm.gr">단체 신청</a></li>
				                        <li><a href="${ contextPath }/list.as?cpage=1">문의 내역</a></li>
		                    	</c:when>
		                    	<c:otherwise>
									<p>회원 정보 관리</p>
										<li><a href="${ contextPath }/profile.me">내 프로필 수정</a></li>
										<li><a href="${ contextPath }/updateForm.me">회원 정보 수정</a></li>
										<li><a href="${ contextPath }/updatePwdForm.me">비밀번호 변경</a></li>
										<li><a href="${ contextPath }/deletePage.me">회원 탈퇴</a></li>
									<p>		<a href="${ contextPath }/myPost.bo">내가 쓴 글 조회</a> </p>
										<li><a href="${ contextPath }/volunteerRecruit.bo">봉사 활동 모집글 조회</a></li>
										<li><a href="${ contextPath }/volunteerComment.bo">봉사 후기 게시글 조회</a></li>
										<li><a href="${ contextPath }/animalPost.bo">동물 등록 게시글 조회</a></li>
									
									<p>굿즈샵</p>
										<li><a href="#">장바구니</a></li>
										<li><a href="#">구매내역/배송조회</a></li>
									
									<p>		<a href="${ contextPath }/interList.bo">관심 목록</a></p>
										<li><a href="${ contextPath }/interListAN.bo">관심 등록 동물 보기</a></li>
										<li><a href="${ contextPath }/interListPR.bo">관심 등록 굿즈 보기</a></li>
										
									<p>고객센터</p>
										<li><a href="${ contextPath }/list.no">공지사항</a></li>
										<li><a href="${ contextPath }/list.as?cpage=1">1:1 문의하기</a></li>
										<li><a href="${ contextPath }/enrollForm.gr">단체 신청</a></li>
				                        <li><a href="${ contextPath }/list.as?cpage=1">문의 내역</a></li>
		                    	</c:otherwise>
		                    </c:choose>
		                    
	                	</div><!-- user-area -->
	                	
	                	<div id="br"><!-- 사용자영역과 관리자영역 사이 공간--></div>
	                	
	            	</c:when>
	            	<c:otherwise>
	            	
	            		<div id="user-area">
	            		
						<p>회원 정보 관리</p>
							<li><a href="${ contextPath }/profile.me">내 프로필 수정</a></li>
							<li><a href="${ contextPath }/updateForm.me">회원 정보 수정</a></li>
							<li><a href="${ contextPath }/deletePage.me">회원 탈퇴</a></li>
					
						<p>내가 쓴 글 조회</p>
							<li><a href="${ contextPath }/adoptComment.bo">입양 후기 게시글 조회</a></li>
					
						<p>굿즈샵</p>
							<li><a href="#">장바구니</a></li>
							<li><a href="#">구매내역/배송조회</a></li>
							<li><a href="#">내가 쓴 리뷰 조회</a></li>
					
						<p>		<a href="${ contextPath }/interList.bo">관심 목록</a></p>
							<li><a href="${ contextPath }/interListAN.bo">관심 등록 동물 보기</a></li>
							<li><a href="${ contextPath }/interListPR.bo">관심 등록 굿즈 보기</a></li>
					
						<p>고객센터</p>
							<li><a href="${ contextPath }/list.no">공지사항</a></li>
							<li><a href="${ contextPath }/list.as?cpage=1">1:1 문의하기</a></li>
							<li><a href="${ contextPath }/enrollForm.gr">단체 신청</a></li>
							<li><a href="${ contextPath }/list.as?cpage=1">문의 내역</a></li>
							
					</div><!-- user-area -->
					
					<div id="admin-area"><!-- 관리자가 볼 수 있는 영역-->
					
						<p>관리자 메뉴</p>
							<li><a href="${ contextPath }/list.no">공지사항</a></li>
							<li><a href="#">상품 등록</a></li>
							<li><a href="#">상품 주문내역</a></li>
							<li><a href="${ contextPath }/list.gr?cpage=1">단체 승인 내역</a></li>
							<li><a href="${ contextPath }list.ap?cpage=1">입양신청서</a></li>
							<li><a href="${ contextPath }/list.as?cpage=1">1:1 문의내역</a></li>
					</div><!-- admin-area -->
					
	            	</c:otherwise>
	            </c:choose>
				
            </div><!-- content_1 -->

			<div id="content_2">
				<div id="content-area">
					<h2>1:1문의</h2>
					<h5>궁금한 내용을 등록해 주세요. 담당자가 확인 후 빠르게 답변해 드리겠습니다</h5>

					<br>

					<div id="table-area">
						<form id="ask-enroll-form" enctype="multipart/form-data" action="${ contextPath }/insert.as" method="post" class="form-inline">
							<input type="hidden" name="userName" value="${ loginUser.userName }">
							<input type="hidden" name="userNo" value="${ loginUser.userId }">
							<table class="table">
								<tr>
									<th>카테고리 *</th>
									<td>
										<select name="askCategory">
											<c:forEach var="c" items="${ cList }">
												<option value = "${ c.categoryNo }">${ c.categoryName }</option>
											</c:forEach>
										</select>
									</td>
								</tr>
								<tr>
									<th>제목 *</th>
									<td><input type="text" name="askTitle" required></td>
								</tr>
								<tr>
									<th>작성자</th>
									<td>${ loginUser.userName }</td>
								</tr>
								<tr>
									<th>첨부파일</th>
									<td><input type="file" id="upfile" name="upfile"></td>
								</tr>
								<tr>
									<th>본문 *</th>
									<td><textarea name="askContent" id="" cols="80" rows="10" style="resize:none;"
												required></textarea></td>
								</tr>
							</table>
							
							<hr>
							
							<div id="button-area">
								<button type="button" class="btn" id="backBtn" onclick="goBack();">목록</button> &emsp;
								<button type="submit" class="btn" id="submitBtn">작성완료</button>
							</div>

							<script>
								function goBack(){// 목록 : 뒤로 가기
									window.history.back();
								}
							</script>
						</form>
						
					</div><!-- table-area -->
				</div><!-- content-area -->
			</div><!-- content_2 -->
		</div><!--content-->

		<div id="footer">
			<br><br><br><!-- content영역과 footer영역 사이 띄우기-->
			
       		<jsp:include page="../common/footer.jsp"></jsp:include>

		</div><!--footer-->
		
	</div>
</body>
</html>