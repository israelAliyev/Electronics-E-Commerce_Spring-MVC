
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <%@page session="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<!-- Modal -->
<div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
  <div class="modal-dialog" role="document">
  
    <form:form action="${pageContext.request.contextPath}/admin/category/updateCategory" modelAttribute="category">  
  
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Update</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
         <div class="form-group" style="display:none;">
    <label for="exampleInputEmail1">Id</label>
<form:input path="categoryId" id="categoryId" cssClass="form-control"/> 
    <small id="emailHelp" class="form-text text-muted">We'll never share your id with anyone else.</small>
  </div>
  
      <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
<form:input path="categoryName" id="categoryName" cssClass="form-control"/> 
    <small id="emailHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
  </div>
  
  
      </div>
      <div class="modal-footer">
              <button type="submit" class="btn btn-primary">Update</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>

      </div>
      
      </form:form>
    </div>
  </div>
</div>


