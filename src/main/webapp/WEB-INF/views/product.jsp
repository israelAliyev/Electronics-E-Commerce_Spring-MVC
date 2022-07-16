
    
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


<script type="text/javascript" src="${pageContext.request.contextPath}/resources/Product.js"></script>



</head>


<jsp:include page="layout/header.jsp"/>


<body>


<div class="col-md-4" style="color:red;">

<c:if test="${error!=null}"> 

            ${error}
</c:if>

</div>



  <table id="productTable" class="display"  style="width:100%"  >
        <thead>
            <tr>
            
            
                <th style="text-align: center;">Name</th>
                 <th style="text-align: center;">Description</th>
                  <th style="text-align: center;">Price</th>
                   <th style="text-align: center;">Date</th>
                    <th style="text-align: center;">Image</th>
                     <th style="text-align: center;">Category</th>
                      <th style="text-align: center;">Brand</th>
                <th>Operations</th>
           
              
            </tr>
        </thead>
        <tbody> 
        
   <c:forEach var="p" items="${prod}"> 
        
        <tr class="categoryRow">
          
                <th style="text-align: center;" class="">${p.productName}</th>
                <th style="text-align: center;" class="">${p.paroductDescription}</th>
                <th style="text-align: center;" class="">${p.productPrice}</th>
                <th style="text-align: center;" class="">${p.productRegister}</th>              
                <th style="text-align: center;" class=""><img src="${pageContext.request.contextPath}/images/${p.productImagepath}"></th>
                <th style="text-align: center;" class="">${p.category.categoryName}</th>
                <th style="text-align: center;" class="">${p.brand.brandName}</th>
                

                <th>
                <button type="button" class="btn btn-primary btnUpdate" data-toggle="modal" data-target="#exampleModalLong">Update</button>
                <button type="button" class="btn btn-danger btnDelete" data-toggle="modal" data-target="#modalForDelete">Delete</button>
                
                </th>
                
              
            </tr>
            
         </c:forEach> 
            

        </tbody>
        
       
    </table>
   






</body>


<jsp:include page="layout/footer.jsp"/>


</html>