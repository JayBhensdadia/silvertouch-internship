<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<div>
    
    <div class="container container-tight py-4">
        
        <form class="card card-md" action="/product/update-product/${product.id}" method="post" autocomplete="off" novalidate>
          <div class="card-body">
            <h2 class="card-title text-center mb-4">Add New product</h2>
            <div class="mb-3">
                <label class="form-label required">Restaurant Id</label>
                <input name="restaurantId" type="number" class="form-control" placeholder="Enter restaurant id" value="${product.restaurantId}">
              </div>
              <div class="mb-3">
                <label class="form-label required">Category Name</label>
                <input name="categoryName" type="text" class="form-control" placeholder="Enter category name" value="${product.categoryName}">
              </div>

              <div class="mb-3">
                <label class="form-label">Sub-Category Name</label>
                <input name="subCategoryName" type="text" class="form-control" placeholder="Enter subcategory name" value="${product.subCategoryName}">
              </div>
            <div class="mb-3">
              <label class="form-label required">product Name</label>
              <input name="productName" type="text" class="form-control" placeholder="Enter product name" value="${product.productName}">
            </div>
            
            
            <div class="mb-3">
              <label class="form-label">Price</label>
              <input name="price" type="number" class="form-control" placeholder="Enter price" value="${product.price}">
            </div>

            <div class="mb-3">
                <label class="form-label">Description</label>
                <input name="description" type="text" class="form-control" placeholder="Enter description" value="${product.description}">
            </div>
            
            
            
            <div class="form-footer">
              <button type="submit" class="btn btn-primary w-100">Add</button>
            </div>
          </div>
        </form>
    
      </div>


</div>