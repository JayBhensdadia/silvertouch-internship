<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<div>
    
    <div class="container container-tight py-4">
        
        <form class="card card-md" action="/complaint/update-complaint/${complaint.id}" method="post" autocomplete="off" novalidate>
          <div class="card-body">
            <h2 class="card-title text-center mb-4">Edit Complaint</h2>
            
            <div class="mb-3">
              <label class="form-label required">Restaurant Id</label>
              <input name="restaurantId" type="number" class="form-control" placeholder="Enter restaurant-id" value="${complaint.restaurantId}">
            </div>


            <div class="mb-3">
              <label class="form-label required">User Name</label>
              <input name="userName" type="email" class="form-control" placeholder="Enter user name" value="${complaint.userName}">
            </div>


            <div class="mb-3">
              <label class="form-label">Subject</label>
              <input name="subject" type="text" class="form-control" placeholder="Enter subject" value="${complaint.subject}">
            </div>
            <div class="mb-3">
              <label class="form-label">Description</label>
              <input name="description" type="text" class="form-control" placeholder="Enter description" value="${complaint.description}">
            </div>


            <div class="mb-3">
              <label class="form-label">Complaint Date</label>
              <input name="complaintDate" type="date" class="form-control" placeholder="Enter complaint date" value="${complaint.complaintDate}">
            </div>
            
            <div class="mb-3">
              <label class="form-label">Reply-Date Date</label>
              <input name="replyDate" type="date" class="form-control" placeholder="Enter reply date" value="${complaint.replyDate}">
            </div>

            <div class="mb-3">
                <label class="form-label">Reply</label>
                <input name="reply" type="text" class="form-control" placeholder="Enter reply" value="${complaint.reply}">
            </div>
            
            <div class="mb-3">
                <label class="form-label">Status</label>
                <input name="status" type="text" class="form-control" placeholder="Enter status" value="${complaint.status}">
            </div>
            
            <div class="form-footer">
              <button type="submit" class="btn btn-primary w-100">Update</button>
            </div>
          </div>
        </form>
    
      </div>


</div>