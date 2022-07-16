<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


 <thead>
            <tr>
            
             <th style="display:none;">Id</th>
                <th style="text-align: center;">Name</th>
                <th>Operations</th>
           
              
            </tr>
        </thead>
        <tbody> 
        
   <c:forEach var="c" items="${cat}"> 
        
        <tr class="categoryRow">
               <th style="display:none;" class="columnId">${c.categoryId}</th>
                <th style="text-align: center;" class="columnName">${c.categoryName}</th>
                <th>
                <button type="button" class="btn btn-primary btnUpdate" data-toggle="modal" data-target="#exampleModalLong">Update</button>
                <button type="button" class="btn btn-danger btnDelete" data-toggle="modal" data-target="#deleteModal">Delete</button>
                
                </th>
                
              
            </tr>
            
         </c:forEach> 
            

        </tbody>
      