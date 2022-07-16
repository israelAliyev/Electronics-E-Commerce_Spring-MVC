<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>  


<!DOCTYPE html>





<nav class="navbar navbar-expand-lg navbar-dark bg-primary">

<div id="main">

  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Open</span>
</div>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor02">
      <ul class="navbar-nav mr-auto">

        <li class="nav-item active">
        
          <a class="nav-link" href="${pageContext.request.contextPath}/admin/category/" style="font-size:30px;"><spring:message code="home"/><span class="sr-only">(current)</span></a>
        </li>
        
        <c:choose>
        
        <c:when test="${locale eq 'az'}"> 
        
   <li class="nav-item">  
          <div class="dropdown">
  <button class="btn btn-primary dropdown-toggle nav-link" type="button" data-toggle="dropdown" style="font-size:30px;">Language
  <span class="caret"></span></button>
  <ul class="dropdown-menu">
    <li><a href="?lang=az" style="color:green;">AzerBaycan Dili</a></li>
    <li><a href="?lang=en">English Language</a></li>
   
  </ul>

</div>

</li>

</c:when>

<c:otherwise>

   <li class="nav-item">  
          <div class="dropdown">
  <button class="btn btn-primary dropdown-toggle nav-link" type="button" data-toggle="dropdown" style="font-size:30px;">Language
  <span class="caret"></span></button>
  <ul class="dropdown-menu">
    <li ><a href="?lang=az">AzerBaycan Dili</a></li>
    <li><a href="?lang=en" style="color:green;">English Language</a></li>
   
  </ul>

</div>

</li>

</c:otherwise>


</c:choose>
        
        <li class="nav-item">
          <a class="nav-link" href="#" style="font-size:30px;">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#" style="font-size:30px;">About</a>
        </li>
      </ul>
      <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
      </form>
    </div>
  </nav>












