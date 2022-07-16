<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>

<!-- Modal -->
<div class="modal fade" id="modalforDelete" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
  <div class="modal-dialog" role="document">
  
    <form:form modelAttribute="category">  
  
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Delete</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
         <div class="form-group" style="display:none;">
    <label for="exampleInputEmail1">Id</label>
<form:input path="categoryId" id="deleteCategoryId" cssClass="form-control"/> 
    <small id="emailHelp" class="form-text text-muted">We'll never share your id with anyone else.</small>
  </div>
  
      <div class="form-group">
    <label id="lblCategoryName"></label>
    <label> Silinsinmi ?</label>

  </div>
  
  
      </div>
      <div class="modal-footer">
              <button type="button" class="btn btn-danger" id="btnDeleteForm">Delete</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>

      </div>
      
      </form:form>
    </div>
  </div>
</div>


