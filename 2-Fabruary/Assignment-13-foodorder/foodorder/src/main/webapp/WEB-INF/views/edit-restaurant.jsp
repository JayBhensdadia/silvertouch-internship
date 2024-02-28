<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<div>
    
    <div class="container container-tight py-4">
        
        <form class="card card-md" action="/restaurant/update-restaurant/${restaurant.id}" method="post" autocomplete="off" novalidate>
          <div class="card-body">
            <h2 class="card-title text-center mb-4">Add New Restaurant</h2>
            <div class="mb-3">
              <label class="form-label required">Restaurant Name</label>
              <input name="name" type="text" class="form-control" placeholder="Enter name" value="${restaurant.name}">
            </div>
            <div class="mb-3">
              <label class="form-label required">City Name</label>
              <input name="cityName" type="text" class="form-control" placeholder="Enter city name" value="${restaurant.cityName}">
            </div>
            <div class="mb-3">
              <label class="form-label">Area Name</label>
              <input name="areaName" type="text" class="form-control" placeholder="Enter area name" value="${restaurant.areaName}">
            </div>
            <div class="mb-3">
              <label class="form-label">Email</label>
              <input name="email" type="text" class="form-control" placeholder="Enter email" value="${restaurant.email}">
            </div>
            <div class="mb-3">
              <label class="form-label">Contact No</label>
              <input name="contactNo" type="text" class="form-control" placeholder="Enter contact number" value="${restaurant.contactNo}">
            </div>

            <div class="mb-3">
                <label class="form-label">Address</label>
                <input name="address" type="text" class="form-control" placeholder="Enter address" value="${restaurant.address}">
            </div>
            <div class="mb-3">
                <label class="form-label">Password</label>
                <input name="password" type="password" class="form-control" placeholder="password" value="${restaurant.password}">
            </div>
            
            
            <div class="form-footer">
              <button type="submit" class="btn btn-primary w-100">Add</button>
            </div>
          </div>
        </form>
    
      </div>


</div>