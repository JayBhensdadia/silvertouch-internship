<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<div>
    
    <div class="container container-tight py-4">
        
        <form class="card card-md" action="/offer/add-offer-to-db" method="post" autocomplete="off" novalidate>
          <div class="card-body">
            <h2 class="card-title text-center mb-4">Add New Offer</h2>
            <div class="mb-3">
              <label class="form-label required">Offer Name</label>
              <input name="offerName" type="text" class="form-control" placeholder="Enter offer name" required>
            </div>
            <div class="mb-3">
              <label class="form-label required">Category Name</label>
              <input name="categoryName" type="text" class="form-control" placeholder="Enter category name" required>
            </div>
            <div class="mb-3">
              <label class="form-label">Sub-Category Name</label>
              <input name="subCategoryName" type="text" class="form-control" placeholder="Enter area name" required>
            </div>
            <div class="mb-3">
              <label class="form-label">Restaurant Name</label>
              <input name="restaurantName" type="text" class="form-control" placeholder="Enter restaurant name" required>
            </div>
            <div class="mb-3">
              <label class="form-label">Discount</label>
              <input name="discount" type="number" class="form-control" placeholder="Enter discount" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Description</label>
                <input name="description" type="text" class="form-control" placeholder="Enter description" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Start Date</label>
                <input name="startDate" type="date" class="form-control" placeholder="start date" required>
            </div>
            <div class="mb-3">
                <label class="form-label">End Date</label>
                <input name="endDate" type="date" class="form-control" placeholder="end date" required>
            </div>
            
            
            <div class="form-footer">
              <button type="submit" class="btn btn-primary w-100">Add</button>
            </div>
          </div>
        </form>
    
      </div>


</div>