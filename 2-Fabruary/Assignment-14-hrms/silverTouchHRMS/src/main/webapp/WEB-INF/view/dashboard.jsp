<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="bg-secondary-subtle w-100 border rounded  rounded-5 p-5 employee-list ">

    <div class="d-flex flex-row justify-content-between">
        <div>
            <h1 class="text-primary ">Employee Information</h1>
            <nav style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#" class="text-secondary">Dashboard</a></li>
                    <li class="breadcrumb-item"><a href="#" class="text-secondary">Employee Information</a></li>
                </ol>
            </nav>
        </div>
        <div>
            <a class="btn" style=" background-color: darkorange; color: white" href="/employees/employee-form">Add Employee</a>
        </div>
    </div>
    <hr>

    <div class="container">


        <div class="d-flex flex-row-reverse justify-content-between py-5  ">
            <div >
                <input type="" placeholder="Search" class="p-2 px-3 border-0 rounded-3  text-black-50 fw-bold ">
                <button class=" bg-secondary border border-0 rounded-2  p-2 ">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" style="fill: rgba(255, 255, 255, 1);transform:msFilter"><path d="M10 18a7.952 7.952 0 0 0 4.897-1.688l4.396 4.396 1.414-1.414-4.396-4.396A7.952 7.952 0 0 0 18 10c0-4.411-3.589-8-8-8s-8 3.589-8 8 3.589 8 8 8zm0-14c3.309 0 6 2.691 6 6s-2.691 6-6 6-6-2.691-6-6 2.691-6 6-6z"></path></svg>
                </button>
                <button class=" bg-secondary border border-0 rounded-2  p-2 ">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" style="fill: rgba(255, 255, 255, 1);transform: msFilter"><path d="M10 11H7.101l.001-.009a4.956 4.956 0 0 1 .752-1.787 5.054 5.054 0 0 1 2.2-1.811c.302-.128.617-.226.938-.291a5.078 5.078 0 0 1 2.018 0 4.978 4.978 0 0 1 2.525 1.361l1.416-1.412a7.036 7.036 0 0 0-2.224-1.501 6.921 6.921 0 0 0-1.315-.408 7.079 7.079 0 0 0-2.819 0 6.94 6.94 0 0 0-1.316.409 7.04 7.04 0 0 0-3.08 2.534 6.978 6.978 0 0 0-1.054 2.505c-.028.135-.043.273-.063.41H2l4 4 4-4zm4 2h2.899l-.001.008a4.976 4.976 0 0 1-2.103 3.138 4.943 4.943 0 0 1-1.787.752 5.073 5.073 0 0 1-2.017 0 4.956 4.956 0 0 1-1.787-.752 5.072 5.072 0 0 1-.74-.61L7.05 16.95a7.032 7.032 0 0 0 2.225 1.5c.424.18.867.317 1.315.408a7.07 7.07 0 0 0 2.818 0 7.031 7.031 0 0 0 4.395-2.945 6.974 6.974 0 0 0 1.053-2.503c.027-.135.043-.273.063-.41H22l-4-4-4 4z"></path></svg>
                </button>
                <select name="" id="" class="border-0 rounded-3 p-2 px-3 text-black-50 fw-bold ">
                    <option value="">10</option>
                </select>
            </div>
        </div>


        <table id="mytable" class="table border border-0 rounded ">
            <thead class="bg-primary fw-bolder">
            <th class="text-white border border-0 rounded-3  ">colname</th>
            <th class="text-white border border-0 rounded-3  ">colname</th>
            <th class="text-white border border-0 rounded-3  ">colname</th>
            <th class="text-white border border-0 rounded-3  ">colname</th>
            </thead>
            <tbody class="bg-white border border-0  rounded-3 ">
            <tr class="">
                <td class="">mydata</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            <tr>
                <td>data</td>
                <td>data</td>
                <td>data</td>
                <td>data</td>
            </tr>
            </tbody>
        </table>


    </div>



</div>
<div class="flex-grow-1 flex-shrink-1  bg-light p-5 border rounded-end rounded-5  ">

    <div class=" d-flex flex-column justify-content-center align-items-center ">

        <svg xmlns="http://www.w3.org/2000/svg" width="156" height="156" viewBox="0 0 24 24" style="fill: rgba(156, 154, 154, 1);transform: msFilter"><path d="M12 2C6.579 2 2 6.579 2 12s4.579 10 10 10 10-4.579 10-10S17.421 2 12 2zm0 5c1.727 0 3 1.272 3 3s-1.273 3-3 3c-1.726 0-3-1.272-3-3s1.274-3 3-3zm-5.106 9.772c.897-1.32 2.393-2.2 4.106-2.2h2c1.714 0 3.209.88 4.106 2.2C15.828 18.14 14.015 19 12 19s-3.828-.86-5.106-2.228z"></path></svg>
        <p class="text-primary fw-bold fs-5">Super Admin</p>
        <p class="text-black-50  fw-bold">My Profile</p>
        <p class="text-black-50  fw-bold">My Team</p>

        <hr>

        <p class="text-black-50 ">Employee Id : su</p>
        <p class="text-black-50 ">Department: -</p>
        <p class="text-black-50 ">Location: Ahmedabad Head Office</p>
        <p class="text-black-50 ">Reporting: -</p>

        <hr>
        <p class="text-black-50 "> Last login</p>

        <hr>
        <button class="py-2 px-5 bg-danger-subtle   border-0 rounded-3 ">Apply For</button>



    </div>


</div>