<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  



<html>
<head>
<meta  http-equiv="Content-Type" content ="text/html; charset = UTF-8">
<title>Insert title here</title>



<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.6.3/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/select/1.3.1/js/dataTables.select.min.js"></script>
<script type="text/javascript" src="https://editor.datatables.net/extensions/Editor/js/dataTables.editor.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"></link>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/1.6.3/css/buttons.dataTables.min.css"></link>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/select/1.3.1/css/select.dataTables.min.css"></link>
<link rel="stylesheet" type="text/css" href="https://editor.datatables.net/extensions/Editor/css/editor.dataTables.min.css"></link>
 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/footer.css"></link>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/sidenav.css"></link>


<script type="text/javascript" src="${pageContext.request.contextPath}/resources/Modal.js"></script>



</head>


<jsp:include page="layout/header.jsp"/>


<body>





<div class="col-md-4" style="color:red;">

<c:if test="${error!=null}"> 

            ${error}
</c:if>

</div>



  <table id="example" class="display"  style="width:100%">
        <thead>
            <tr>
            
             <th style="display:none;">Id</th>
                <th style="text-align: center;">Name</th>
                <th>Operations</th>
           
              
            </tr>
        </thead>
        <tbody> 
        
   <c:forEach var="c" items="${trashCat}"> 
        
        <tr class="categoryRow">
               <th style="display:none;" class="columnId">${c.categoryId}</th>
                <th style="text-align: center;" class="columnName">${c.categoryName}</th>
                <th>
                <button type="button" class="btn btn-primary btnUpdate" data-toggle="modal" data-target="#buckupModal">BuckUp</button>
                <button type="button" class="btn btn-danger btnDelete" data-toggle="modal" data-target="#modalForDelete">Delete</button>
                
                </th>
                
              
            </tr>
            
         </c:forEach> 
            

        </tbody>
        
       
    </table>
    


    

<jsp:include page="modals/buckupCategory.jsp"/>

<jsp:include page="layout/sidenav2.jsp"/>
<jsp:include page="modals/deleteFromTrashModal.jsp"/>



</body>


<jsp:include page="layout/footer.jsp"/>


</html>