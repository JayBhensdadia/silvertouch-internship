<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<div>
    
    <div class="container container-tight py-4">
        
        <form class="card card-md" action="/complaint/add-complaint-to-db" method="post" autocomplete="off" novalidate>
          <div class="card-body">
            <h2 class="card-title text-center mb-4">Add New Complaint</h2>
            
            <div class="mb-3">
              <label class="form-label required">Restaurant Id</label>
              <input name="restaurantId" type="number" class="form-control" placeholder="Enter restaurant-id" required>
            </div>


            <div class="mb-3">
              <label class="form-label required">User Name</label>
              <input name="userName" type="email" class="form-control" placeholder="Enter user name" required>
            </div>


            <div class="mb-3">
              <label class="form-label">Subject</label>
              <input name="subject" type="text" class="form-control" placeholder="Enter subject" required>
            </div>
            <div class="mb-3">
              <label class="form-label">Description</label>
              <input name="description" type="text" class="form-control" placeholder="Enter description" required>
            </div>


            <div class="mb-3">
              <label class="form-label">Complaint Date</label>
              <input name="complaintDate" type="date" class="form-control" placeholder="Enter complaint date" required>
            </div>
            
            <div class="mb-3">
              <label class="form-label">Reply-Date Date</label>
              <input name="replyDate" type="date" class="form-control" placeholder="Enter reply date" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Reply</label>
                <input name="reply" type="text" class="form-control" placeholder="Enter reply" required>
            </div>
            
            <div class="mb-3">
                <label class="form-label">Status</label>
                <input name="status" type="text" class="form-control" placeholder="Enter status" required>
            </div>
            
            <div class="form-footer">
              <button type="submit" class="btn btn-primary w-100">Add</button>
            </div>
          </div>
        </form>
    
      </div>


</div>