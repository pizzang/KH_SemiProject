<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.kh.adoption.model.vo.*, java.util.ArrayList, com.kh.common.model.vo.PageInfo" %>
<%
	ArrayList<Animal> list = (ArrayList<Animal>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage();

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>μμνκΈ°</title>
    <style>
		#content_AR{width: 100%;}
        .img_AR{
            width: 320px;
            height: 320px;
            padding: 10px;
        }
    
        .outer{
            background-color: coral;
            color : white;
            width: 1000px;
            height: 1000px;
            margin: auto;
            margin-top: 50px;
        }
    
        .list-area{
            width: auto;
            margin: auto;
        }
    
        .thumbnail{
            width: 330px;
            display: inline-block;
            margin: 13px;
        }
    
        .thumbnail>img:hover{
            cursor:pointer;
            background-color: rgb(255,217,135);
        }

        table{
            margin-left:20px;
            margin-bottom : 20px;
        }
        #adoptionInform, #intro{
            padding: 40px;
            background-color: lightgray;
            margin-left : 15px
        }
        #menu-area{
        	margin-left : 40px;
        }
		#intro-button{
			width : 300px;
			background-color: rgb(232, 191, 123);	
			border : 0;
			border-radius : 5px;	
			color : white;
		}
		#review-btn{
			width : 300px;
			background-color: rgb(180, 149, 95);
			border : 0;
			border-radius : 5px;	
			color : white;
		}
		#intro-button:hover, #review-btn:hover{
			background-color: rgb(255, 217, 135);
			color : rgb(155, 128, 82)
		}
		
		#like-btn{
			border : 0;
			outline : 0;
			background-color : rgba(255, 255, 255, 0);
			CURSOR:hand;
		}
		.paging-area>button{	
			border : 0;
			border-radius : 5px;	
			color : white;
			background-color: rgb(180, 149, 95);
		}
		.paging-area>button:hover{
			background-color: rgb(232, 191, 123);	
		}

    </style>
</head>
<body>
	<%@include file="../common/header.jsp" %>
		<br><br>
	    <div class="wrap">
        <div id="content" style="width:1200px">
            <div id="content_AR">
                <div id="intro">			
                    <% if(loginUser != null && loginUser.getUserClass().equals("A")) { %>
                    <!-- κ΄λ¦¬μ μμλ²νΌ -- μμμ μ²­μνμΈκ²μν μ΄λ -->
                    <a href="<%= contextPath%>/list.ap?cpage=1"><button>μμμ μ²­μ λͺ©λ‘(κ΄λ¦¬μ)</button></a>
                    
                    <%} %>  
                    <h2>μμνκΈ°</h2>
                    <p>
						ν«μ μΌμλμ μ§μ΄λ λλ¬Όμ μ΄λ©΄μλ λ λ€λ₯Έ μλͺμ κ³ ν΅μ΄ μμ μ μμ΅λλ€. <br>
						μμμ κ°μ₯ μ€μ²μ μΈ λλ¬Όκ΅¬νΈ νλμλλ€. κ°μ‘±μ κΈ°λ€λ¦¬λ λλ¬Όλ€, μ¬μ§λ§κ³  μμνμΈμ.
		            </p>

                    <a href="#adoptionInform"><button id="intro-button">μμ μ μ°¨ μλ΄</button></a>
                    &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="<%= contextPath%>/reviewlist.ad?cpage=1"><button id="review-btn">μμνκΈ°</button></a>
                    
                    <% if(loginUser != null && !loginUser.getUserClass().equals("P")) { %>
                     &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                    <!-- λ¨μ²΄/κ΄λ¦¬μλ§ -->
                    <a href="<%= contextPath%>/enrollForm.an"><button id="intro-button">λ³΄νΈλλ¬Ό λ±λ‘</button></a>
                    
                    <%} %>    
                    
                    
                    
                </div> <!--intro-->

				<br><br>
                <div class="list-area" align="center">
                   
                    <% if(list.isEmpty()){ %>
                    	<h2>μ‘°νλ κ²μκΈμ΄ μμ΅λλ€.</h2>
                    <%} else {%>
                    	
                    	<% for(Animal a : list) { %>	
		                  <div class="thumbnail" align="center">
	                    	<div class="animalNo" value="<%=a.getAnimalNo()%>" style="display:none"></div> <!-- λλ¬Όλ²νΈ μ¨κ²¨μ κ°μ Έμ΄ > μμΈμ‘°ν μν¨ -->
		                        <img class="img_AR" src=<%=a.getTitleImg() %> alt="λλ¬Ό">		                      
		                        <table align="left">
		                            <tr>
		                                <th width="200px" style="text-align: left; font-size:xx-large"><%= a.getAnimalName() %></th>
		                                
	                                	<td width="45" style="color:red;">
											<button type="button" id="like-btn" title="κ΄μ¬λ±λ‘"></button>																														
	                                	</td>
	                                	
		                                <th width="45" style="font-size:large; color:red;" align="right">            
			                                <% if(a.getAdopted().equals("Y")){ %>
			                                	μμμλ£
			                                <%}%>                                	
		                                </th>
		                                
		                            </tr>
		                            <tr>
		                                <td style="font-size:small"><%=a.getCategoryNo() %></td>
		                            </tr>
		                            <tr>
		                                <td style="font-size:small">
				                            <% if(a.getGender().equals("M")){ %>
				                            	μμ»·
				                            <%} else{%>
				                            	μμ»·
				                            <%} %>
	
			                                <% if(a.getNeutralization().equals("Y")){ %>
			                                	(μ€μ±ν O)
			                                <%} else {%>
			                                	(μ€μ±ν X)
			                                <%} %>
		                                
		                                </td>
		                            </tr>
		                            <tr>
		                                <td style="font-size:small"><%=a.getAnimalAge() %> μ΄ / <%=a.getWeight() %> kg</td>
		                            </tr>
		                        </table>
		                 </div> <!--λλ¬Ό--> 
                 		<%} %>
                    <%} %>
          
                <br><br>
                <div align="center" class="paging-area">
   		    	  <% if(currentPage != 1){ %>
                   <button onclick="location.href='<%=contextPath%>/main.ad?cpage=<%=currentPage -1 %>'">&lt;</button>
               	  <%} %>
                  
		       	  <% for(int i = startPage; i <= endPage; i++) { %>
		            <% if(i != currentPage){ %>
		                <button onclick="location.href='<%=contextPath%>/main.ad?cpage=<%=i %>'"><%=i%></button>
		            <%} else { %>
		                <button disabled><%=i %></button>
		            <%} %>
		       	  <%} %>
		       	  
		        <% if(currentPage != maxPage){ %>
		            <button onclick="location.href='<%=contextPath%>/main.ad?cpage=<%=currentPage +1 %>'"> &gt; </button>
		        <%} %>
                </div> <!--νμ΄μ§-->
                
      <script>
		$(function(){
			$(".thumbnail>img").click(function(){

				var ano = $(this).parent().children('div.animalNo').attr("value");

				// http://localhost:8002/SemiProject/detail.an?ano=15

				location.href="<%=contextPath%>/detail.an?ano="+ano;
			})
		})
	</script>

            </div><!--list-area-->
            
            <br><br>
            
            <div id="adoptionInform">
                <h2>μμ μ μ°¨</h2>
		                μμμ μ²­μ μμ± ν μμμλ΄κΉμ§λ μ½ 2-4μ£Όκ° μμλ©λλ€. <br><br>
		    
		                μμ μλ΄μ μ λ³λ λΆμ ννμ¬ λ΄λΉ νλκ°μ μ νλ₯Ό ν΅ν΄ μ§νλλ μ  μ°Έκ³ ν΄ μ£ΌμΈμ.<br><br>
		    
		               <b>μμ μ  νμΈν΄μ£ΌμΈμ</b><br>
		    
		                ν«λ°λ¦¬μ μμμμΉμ λμνμλ λΆλ€λ§ μμμ μ²­μ΄ κ°λ₯ν©λλ€.<br>
		                μμ λλ¬Όμ λ°λμ μ€μ±ν μμ μ ν΄μ£ΌμμΌ νλ©°, λμνμ§ μμ κ²½μ° μμμ μ²­μ΄ μ΄λ ΅μ΅λλ€.<br>
		                μμμ μ²­ μμμ λͺ¨λ  μ λ³΄λ₯Ό λ±λ‘ν΄ μ£ΌμμΌ μλ΄μ΄ μ§νλ©λλ€.<br>
		                λ§μλΉλ μκΈ°λλ¬Ό μΉλ£λΉ, λ°λ €λλ¬Όλ³΄νΈ λ³΅μ§ νλμ μ μ‘ μ¬μ©λ©λλ€.<br>
		                κ°μ‘± κ΅¬μ±μ μ μ²΄μ λμλ₯Ό μ»μ§ μμ κ²½μ°λ λ―Έμ±λμμ μμμ μ²­μ μ΄λ ΅μ΅λλ€.<br>
		                κ° μμ μ λ§λΉκ²¬μΌλ‘μ λ°λ €λ λΆκ°λ₯ν©λλ€.<br>
		                κ³ μμ΄ μμ μ μΈμΆλ₯μ΄, μ°μ±λ₯μ΄λ‘μ λ°λ €λ λΆκ°λ₯ν©λλ€.<br>
		                μμλ³΄νΈ μ μμκ³Ό λμΌν μ μ°¨λ‘ μ§νλ©λλ€.<br>
            </div> <!--μμμ μ°¨-->
            
          
       	 </div><!--content2-->
       </div> <!--content-->
            
            <br><br><br><!-- contentμμ­κ³Ό footerμμ­ μ¬μ΄ λμ°κΈ°-->
			<%@include file="../common/footer.jsp" %>
    </div> <!--wrap-->
</body>
</html>