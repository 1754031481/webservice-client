<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-2.1.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>三级联动</title>
</head>
<body>
		省<select id="sheng" onchange="sheng1()"></select>
		<span id="shi2">市</span><select id="shi" onchange="shi1()"></select>
		<span id="xian2">县</span><select id="xian" ></select>
</body>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type:'post',
			data : "",
			dataType : "json",
			url:'<%=request.getContextPath()%>/AreaController/queryS.do',
			success:function(result){
				var str = "<option value='-1'>--请选择--</option>";
				if(result.object.length != 0){
					$("#shi").hide();
					$("#shi2").hide();
					$("#xian").hide();
					$("#xian2").hide();
				}
				for (var i = 0; i < result.object.length; i++) {
					str += "<option value='"+result.object[i].id+"'>"+result.object[i].fullName+"</option>";
				}
				$("#sheng").html(str);
			},
			error:function(){
				alert("网络错误，请联系管理员")
			}
		})
	})
	
	//查询市
	function sheng1(){
		if($("#sheng").val() == -1){
			$("#shi").hide();
			$("#shi2").hide();
			$("#xian").hide();
			$("#xian2").hide();
		}
		$.ajax({
			url:"${pageContext.request.contextPath}/AreaController/queryShi.do",
			type:"post",
			data:{"id":$("#sheng").val()},
			dataType:"json",
			success:function(data){
				var reg="<option value='-1'>--请选择--</option>";
				 if (data.object.length!=0) {
					$("#shi").show();
					$("#shi2").show();
					$("#xian").hide();
					$("#xian2").hide();
				} 
				for (var i = 0; i < data.object.length; i++) {
					reg+="<option value='"+data.object[i].id+"'>"+data.object[i].name+"</option>"
				}
				$("#shi").html(reg);
			}
		})
	}
	function shi1(){
		if($("#shi").val()==-1){
			$("#xian").hide();
			$("#xian2").hide();
		}
		$.ajax({
			url:"${pageContext.request.contextPath}/AreaController/queryShi.do",
			type:"post",
			data:{"id":$("#shi").val()},
			dataType:"json",
			success : function(result){
				var str = "<option value='-1'>--请选择--</option>";
				if(result.object.length != 0){
					$("#xian").show();
					$("#xian2").show();
				}
				for (var i = 0; i < result.object.length; i++) {
					str += "<option value='"+result.object[i].id+"'>"+result.object[i].name+"</option>";
				}
				$("#xian").html(str);
			},
			error : function(){
				
			}
		})
	}
</script>
</html>