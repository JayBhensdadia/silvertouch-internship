<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<div>
    
    <div class="container container-tight py-4">
        
        <form class="card card-md" action="/category/update-category/${category.id}" method="post" autocomplete="off" novalidate>
          <div class="card-body">
            <h2 class="card-title text-center mb-4">Edit Category</h2>
            <div class="mb-3">
              <label class="form-label">Category Name</label>
              <input name="categoryName" type="text" class="form-control" value="${category.categoryName}">
            </div>
            <div class="mb-3">
              <label class="form-label">Description</label>
              <input name="description" type="text" class="form-control" value="${category.description}">
            </div>
            
            
            <div class="form-footer">
              <button type="submit" class="btn btn-primary w-100">Update</button>
            </div>
          </div>
        </form>
    
      </div>


</div>