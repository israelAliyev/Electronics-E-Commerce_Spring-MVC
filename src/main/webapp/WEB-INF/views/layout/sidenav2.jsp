<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>



<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  
   <h3 style="margin-left: 10%">Operations</h3>
  <a href="#" data-toggle="modal" data-target="#addCategoryModal">Add Category</a>
  
  
  <form  action="${pageContext.request.contextPath}/admin/category/deleteTrash" method="post">
  
  <input name="emptyTrash" type="submit" value="Trashi Bosalt"/>
  
  </form>
  
  
  <a href="#">Clients</a>
  <a href="#">Contact</a>
</div>



<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
  document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
  document.body.style.backgroundColor = "white";
}
</script>
   
