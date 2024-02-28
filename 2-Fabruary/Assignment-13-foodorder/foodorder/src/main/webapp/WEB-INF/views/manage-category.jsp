<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>



<div class="container-xl p-5 ">
    <div class="row row-cards">
      

      <div class="col-12">
        <div class="card">
          <div class="card-header">
            <h3 class="card-title">Category Table</h3>
            
          </div>
          <div class="card-body border-bottom py-3">
            <div class="d-flex justify-content-between  align-items-center ">
              

              <div>
                <button id="copy" class="btn btn-primary ">Copy</button>
                <button class="btn btn-primary " onclick="tableToCSV()">CSV</button>
                <!-- <button class="btn btn-primary ">PDF</button> -->
                <a href="/category/pdf" class="btn btn-primary">PDF</a>
                <button id="print" class="btn btn-primary ">Print</button>
              </div>

              <!-- <div class="ms-auto text-secondary px-5">
                Search:
                <div class="ms-2 d-inline-block">
                  <input type="text" class="form-control form-control-sm" aria-label="Search invoice">
                </div>
              </div> -->


              <div>
                <!-- <button class="btn btn-primary">Add +</button> -->
                <a href="/category/add-category" class="btn btn-primary ">Add +</a>
              </div>
            </div>
          </div>
          <div class="table-responsive">
            <table id="table" class="table card-table table-vcenter text-nowrap datatable">
              <thead>
                <tr>
                
                  <th>Id</th>
                  <th>Category Name</th>
                  <th>Description</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                
                    <c:forEach items="${categories}" var="category" varStatus="status">
                        <tr>
                            <td>${category.id}</td>
                            <td>${category.categoryName}</td>
                            <td>${category.description}</td>
                            <td>
                                
                                <div class="d-flex flex-row gap-1 justify-content-center align-items-center ">
                                    <a href="/category/edit-category/${category.id}" class="btn btn-primary">
                                        <span>
                                            <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-edit" width="24" height="24" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M7 7h-1a2 2 0 0 0 -2 2v9a2 2 0 0 0 2 2h9a2 2 0 0 0 2 -2v-1" /><path d="M20.385 6.585a2.1 2.1 0 0 0 -2.97 -2.97l-8.415 8.385v3h3l8.385 -8.415z" /><path d="M16 5l3 3" /></svg>
                                        </span>
                                    </a>
                            
                                    <a href="/category/delete-category/${category.id}" class="btn btn-danger ">
                                        <span>
                                            <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-trash" width="24" height="24" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M4 7l16 0" /><path d="M10 11l0 6" /><path d="M14 11l0 6" /><path d="M5 7l1 12a2 2 0 0 0 2 2h8a2 2 0 0 0 2 -2l1 -12" /><path d="M9 7v-3a1 1 0 0 1 1 -1h4a1 1 0 0 1 1 1v3" /></svg>
                                        </span>
                                    </a>
                                </div>

                            </td>
                        </tr>
                    </c:forEach>

              </tbody>
            </table>
          </div>
          <div class="card-footer d-flex align-items-center">
            <p class="m-0 text-secondary">
              Showing <span>${currentPage*5 - 4}</span> to <span>${currentPage*5}</span> of
                <span>${totalItems}</span> entries
            </p>
            <ul class="pagination m-0 ms-auto">
              <li class="page-item">
                <a class="page-link" href="/category/page/${currentPage - 1}" tabindex="-1" aria-disabled="true">
                  <!-- Download SVG icon from http://tabler-icons.io/i/chevron-left -->
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M15 6l-6 6l6 6" /></svg>
                  prev
                </a>
              </li>
              
              <li class="page-item">
                <a class="page-link" href="/category/page/${currentPage + 1}">
                  next <!-- Download SVG icon from http://tabler-icons.io/i/chevron-right -->
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon" width="24" height="24" viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M9 6l6 6l-6 6" /></svg>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
