<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<div>
    
    <div class="container container-tight py-4">
        
        <form class="card card-md" action="/subcategory/add-subcategory-to-db" method="post" autocomplete="off" novalidate>
          <div class="card-body">
            <h2 class="card-title text-center mb-4">Add New Sub Category</h2>
            <div class="mb-3">
              <label class="form-label required">Category Name</label>
              <!-- <input name="categoryName" type="text" class="form-control" placeholder="Enter name" required> -->


              <select name="categoryName" class="form-select">
                <c:forEach items="${categories}" var="category" >
                    <option>${category.categoryName}</option>
                </c:forEach>
              </select>

            </div>
            <div class="mb-3">
              <label class="form-label required">Sub Category Name</label>
              <input name="subCategoryName" type="text" class="form-control" placeholder="Enter name" required>
            </div>
            <div class="mb-3">
              <label class="form-label">Description</label>
              <input name="description" type="text" class="form-control" placeholder="Enter description" required>
            </div>
            
            
            <div class="form-footer">
              <button type="submit" class="btn btn-primary w-100">Add</button>
            </div>
          </div>
        </form>
    
      </div>


</div>