


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>



<html>
  <head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Register</title>
    <script src="https://cdn.jsdelivr.net/npm/@tabler/core@latest/dist/js/tabler.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@tabler/core@latest/dist/css/tabler.min.css">
  </head>
  <body  class=" d-flex flex-column">
    
    <div class="page page-center">

      <div>
    
        <div class="container container-tight py-4">
            
            <form class="card card-md" action="/restaurant/add-restaurant-to-db" method="post" autocomplete="off" novalidate>
              <div class="card-body">
                <h2 class="card-title text-center mb-4">Add New Restaurant</h2>
                <div class="mb-3">
                  <label class="form-label required">Restaurant Name</label>
                  <input name="name" type="text" class="form-control" placeholder="Enter name" required>
                </div>
                <div class="mb-3">
                  <label class="form-label required">City Name</label>
                  <!-- <input name="cityName" type="text" class="form-control" placeholder="Enter city name" required> -->
    
                  <select name="cityName" class="form-select">
                    <c:forEach items="${cities}" var="city" >
                        <option>${city.cityName}</option>
                        
                    </c:forEach>
                  </select>
    
                  
    
                </div>
                <div class="mb-3">
                  <label class="form-label">Area Name</label>
                  <!-- <input name="areaName" type="text" class="form-control" placeholder="Enter area name" required> -->
    
                  <select name="areaName" class="form-select">
                    <c:forEach items="${areas}" var="area" >
                        <option>${area.areaName}</option>
                    </c:forEach>
                  </select>
    
    
                </div>
                <div class="mb-3">
                  <label class="form-label">Email</label>
                  <input name="email" type="text" class="form-control" placeholder="Enter email" required>
                </div>
                <div class="mb-3">
                  <label class="form-label">Contact No</label>
                  <input name="contactNo" type="text" class="form-control" placeholder="Enter contact number" required>
                </div>
    
                <div class="mb-3">
                    <label class="form-label">Address</label>
                    <input name="address" type="text" class="form-control" placeholder="Enter address" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input name="password" type="password" class="form-control" placeholder="password" required>
                </div>
                
                
                <div class="form-footer">
                  <button type="submit" class="btn btn-primary w-100">Add</button>
                </div>
              </div>
            </form>
        
          </div>
    
    
    </div>
      
    </div>
    
  </body>
</html>