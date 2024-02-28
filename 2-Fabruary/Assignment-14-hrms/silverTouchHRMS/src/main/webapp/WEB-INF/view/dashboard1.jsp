<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/css/select2.min.css" rel="stylesheet" />
    <style>
        .employee-list{
            margin-left: 9.5%;
            margin-right: auto;
        }
        #sttl-logo{
            width: 130px;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
    <script src="https://cdn.datatables.net/2.0.0/js/dataTables.js"></script>
    <script src="https://cdn.datatables.net/2.0.0/js/dataTables.jqueryui.js"></script>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/2.0.0/css/dataTables.jqueryui.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/2.0.0/js/dataTables.bootstrap5.js">
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/dataTables.buttons.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.jqueryui.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.print.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/3.0.0/js/buttons.pdf.min.js"></script>
    <link rel="stylesheet" href="https://cdn.datatables.net/2.0.0/css/dataTables.bootstrap5.css">
</head>
<body class="p-0 m-0">
<nav class="navbar navbar-expand-lg p-4 sticky-top bg-white">
    <div class="d-flex flex-row justify-content-center" id="sttl-logo">
        <a>
            <img src="\stttllogo.png" style="width: 50px; height: 50px"  alt="egsgrg" >
        </a>
    </div>
    <div class="container-fluid d-flex flex-row px-4 justify-content-evenly ">
        <div class="d-flex flex-column ">
            <a href="" class="text-decoration-none text-black-50 ">Parent Menu:</a>
            <a href="" class="text-decoration-none text-black fw-bold  ">Employee Management</a>
        </div>
        <div class="d-flex flex-column ">
            <a href="" class="text-decoration-none text-black-50 ">Company:</a>
            <a href="" class="text-decoration-none text-black fw-bold  ">Tripla Soft pvt ltd</a>
        </div>
        <div class="d-flex flex-column ">
            <a href="" class="text-decoration-none text-black-50 ">Branch:</a>
            <a href="" class="text-decoration-none text-black fw-bold">Ahmedabad Trip</a>
        </div>
        <div class="d-flex flex-column ">
            <a href="" class="text-decoration-none text-black-50 ">Role:</a>
            <a href="" class="text-decoration-none text-black fw-bold  ">Super Admin</a>
        </div>
        <div class="d-flex flex-column ">
            <a href="" class="text-decoration-none text-primary flex-wrap">Wednesday, 21 February</a>
            <div class="d-flex flex-row-reverse"><a href="" class="text-decoration-none text-primary pr-0">2024</a></div>
        </div>
        <a href="" class="text-decoration-none text-black-50 ">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" style="fill: rgba(0, 0, 0, 1);transform: msFilter"><path d="M12 22a2.98 2.98 0 0 0 2.818-2H9.182A2.98 2.98 0 0 0 12 22zm7-7.414V10c0-3.217-2.185-5.927-5.145-6.742C13.562 2.52 12.846 2 12 2s-1.562.52-1.855 1.258C7.185 4.074 5 6.783 5 10v4.586l-1.707 1.707A.996.996 0 0 0 3 17v1a1 1 0 0 0 1 1h16a1 1 0 0 0 1-1v-1a.996.996 0 0 0-.293-.707L19 14.586z"></path></svg>
        </a>
        <a href="">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" style="fill: rgba(0, 0, 0, 1);transform: msFilter"><path d="M9.38 21.646A9.985 9.985 0 0 0 12 22l.141-.001a2.998 2.998 0 0 0 2.515-1.425c.542-.876.6-1.953.153-2.88l-.198-.415c-.453-.942-.097-1.796.388-2.281.485-.485 1.341-.841 2.28-.388h.001l.413.199a2.99 2.99 0 0 0 2.881-.153A2.997 2.997 0 0 0 22 12.141a9.926 9.926 0 0 0-.353-2.76c-1.038-3.827-4.353-6.754-8.246-7.285-3.149-.427-6.241.602-8.471 2.833S1.666 10.247 2.096 13.4c.53 3.894 3.458 7.208 7.284 8.246zM15.5 6a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3zm-5-1a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0-3zM9 15.506a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm-2.5-6.5a1.5 1.5 0 1 1-.001 3.001A1.5 1.5 0 0 1 6.5 9.006z"></path></svg>
        </a>
        <a href="">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" style="fill: rgba(0, 0, 0, 1);transform: msFilter"><path d="M16 13v-2H7V8l-5 4 5 4v-3z"></path><path d="M20 3h-9c-1.103 0-2 .897-2 2v4h2V5h9v14h-9v-4H9v4c0 1.103.897 2 2 2h9c1.103 0 2-.897 2-2V5c0-1.103-.897-2-2-2z"></path></svg>
        </a>
    </div>
</nav>
<div class="d-flex flex-row p-0 m-0">

    <aside class="position-fixed">
        <div class="vh-100 bg-primary border rounded-start  rounded-5  container-fluid  d-flex flex-column">
            <a href="" class="text-white text-decoration-none mb-3 mt-4">Others</a>
            <a href="" class="text-white text-decoration-none my-3">Employee Information</a>
            <a href="" class="text-white text-decoration-none my-3">Reports</a>
            <a href="" class="text-white text-decoration-none my-3">Location Master</a>
            <a href="" class="text-white text-decoration-none my-3">Pay Master</a>
            <a href="" class="text-white text-decoration-none my-3">Job Master</a>
            <a href="" class="text-white text-decoration-none my-3">Personal Master</a>
        </div>
    </aside>
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
                    <a class="btn" style=" background-color: darkorange; color: white" href="#">Add Employee</a>
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

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js"></script>
    <script>
        $('summary').click(function(){
            let currentContent = $(this).find('.toggle').html();
            $(this).find('.toggle').html(currentContent === '<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="16" height="16"><path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path></svg>'?'<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="16" height="16"><path d="M2 7.75A.75.75 0 0 1 2.75 7h10a.75.75 0 0 1 0 1.5h-10A.75.75 0 0 1 2 7.75Z"></path></svg>':'<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="16" height="16"><path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path></svg>')
        });
        $(document).ready(function() {
            $('select').select2();
        });
        $('#add-address').click(function (){
            console.log("kjnfkjdfbnknxdvdn b xkkdvjbn  nvzkk")
            $('select').select2();
        })
        $("#emp-pic").change(function(e) {

            $("#img-container1").empty().css({
                "padding": 0
            });

            for (var i = 0; i < e.originalEvent.srcElement.files.length; i++) {

                var file = e.originalEvent.srcElement.files[i];

                var img = document.createElement("img");
                var reader = new FileReader();
                reader.onloadend = function() {
                    img.src = reader.result;
                }
                reader.readAsDataURL(file);
                $("#img-container1").append(img);
            }

        });
        $("#emp-sign").change(function(e) {

            $("#img-container").empty().css({
                "padding": 0
            });

            for (var i = 0; i < e.originalEvent.srcElement.files.length; i++) {

                var file = e.originalEvent.srcElement.files[i];

                var img = document.createElement("img");
                var reader = new FileReader();
                reader.onloadend = function() {
                    img.src = reader.result;
                }
                reader.readAsDataURL(file);
                $("#img-container").append(img);
            }

        });
        $("#document").change(function(e) {

            $("#img-container").empty().css({
                "padding": 0
            });

            for (var i = 0; i < e.originalEvent.srcElement.files.length; i++) {

                var file = e.originalEvent.srcElement.files[i];

                var img = document.createElement("img");
                var reader = new FileReader();
                reader.onloadend = function() {
                    img.src = reader.result;
                }
                reader.readAsDataURL(file);
                $("#img-container").append(img);
            }

        });
        $('#mytable').DataTable( {
            layout: {
                topStart: {
                    buttons: []
                }
            }
        } );
        // $('.formnav').change(function() {
        //     var selectedForm = $(this).val();
        //     $('.main-content').load(selectedForm + '.jsp');
        // });
    </script>
</body>
</html>
