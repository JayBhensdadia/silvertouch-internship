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

            #test button:hover, #test1 button:hover{
                color: white;
            }

            .file-input-wrapper {
                position: relative;
                overflow: hidden;
                display: flex;
                flex-direction: row-reverse;
                width: 250px;
                height: 50px;
                border: #999999 solid 2px;
                border-radius: 10px;
            }

            .file-input-wrapper input[type=file] {
                font-size: 100px;
                position: absolute;
                right: 0;
                top: 0;
                opacity: 0;
            }

            .file-input-wrapper .btn-browse {
                display: flex;
                align-items: center;
                background-color: #999999;
                color: white;
                padding: 10px 20px;
                cursor: pointer;
                margin: 5px;
                border-radius: 10px;
            }
            #test, #test1{
                width: 40%;
                display: flex;
                flex-direction: row;
                justify-content: space-around;
            }
            #img-container, #img-container1{
                /*background-color: rgb(126, 135, 131);*/
                padding: 30px;
                border: black dotted 2px;
                /*border-radius: 10px;*/
            }
            #sttl-logo{
                width: 130px;
            }
            .employee-list{
                margin-left: 9.5%;
                margin-right: auto;
            }







            .formnav{
                width: 300px;
                border-radius: 15px;
                border: 2px solid rgb(46, 99, 255);
                padding: 20px;
            }
            h1{
                color: #0d6efd !important;
            }
            /*.formnav details summary{*/
            /*    display: flex;*/
            /*    justify-content: space-between;*/
            /*    align-items: center;*/
            /*    cursor: pointer;*/
            /*}*/

            .formnav details span:first-child{
                position: relative;
                top: 3px;
                /*font-size: 22px;*/
            }

            ::marker{
                display: none;
            }

            .toggle{
                color: aqua;
            }

            .formnav .empinfo{
                list-style: none;
                transition: 0.5s;
                padding-left: 0;
            }

            .formnav .empinfo a{
                outline-color: none;
                border: none;
                /*padding: 5px 20px;*/
                width: 100%;
                background-color: transparent;
                text-align: left;
                display: flex;
                flex-direction: row;
                justify-content: space-between;
                align-items: center;
                border-radius: 20px;
            }
            li svg{
                color: #7e8b94;
            }
            ul li{
                padding: 30px auto;
                border-radius: 15px;
            }
            ul li:hover{
                background-color: #0d6efd;
                color: white;
                svg{
                    color: white;
                }
            }

            .sidebar {
                /*width: 250px;*/
                top: 0;
                left: 0;
                background-color: #343a40;
            }
            label,input{
                margin-bottom: 10px;
            }
            .main-body{
                margin-left: 9.5%;
                margin-right: auto;
            }
            .aside{
                width: 20%;
            }
            .main-content{
                width: 70%;
            }

            body{
                overflow-x: hidden;
            }
            input{
                width: 70%;
            }
            .list-group a{
                display: flex;
                flex-direction: row;
                justify-content: space-between;
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
                        <a href="" class="text-decoration-none text-black fw-bold  ">Ahmedabad Trip</a>
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
            <c:choose>
                <c:when test="${form == 'dashboard'}">
                    <jsp:include page="dashboard.jsp" />
                </c:when>
                <c:otherwise>
                    <main class="bg-secondary-subtle position-relative bottom-0 rounded-5 p-3 w-100 main-body">
                <div class="d-flex flex-row m-3 bg-white rounded-3 wrap shadow-lg">
                    <aside class="mx-auto my-5 aside">
                        <div class="formnav mx-auto">

                            <details>
                                <summary class="d-flex flex-row justify-content-between pointer-event  py-3"><span>Employment Information</span> <span class="toggle"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="16" height="16"><path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path></svg></span></summary>
                                <ul class="empinfo content border-bottom border-top py-3">
                                    <li><a href="/employee-form" class="infobtn btn"><span>Employee</span><span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/personal-form" class="infobtn btn"><span>Personal</span><span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/contact-form" class="infobtn btn"><span>Contact</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/family-form" class="infobtn btn"><span>Family</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/emergency-form" class="infobtn btn"><span>Emergency</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/nominee-form" class="infobtn btn"><span>Nominee</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/health-form" class="infobtn btn"><span>Health</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/photo-form" class="infobtn btn"><span>Photographs</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/attach-form" class="infobtn btn"><span>Attachments</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                </ul>

                            </details>

                            <details>
                                <summary class="d-flex flex-row justify-content-between pointer-event  py-3"><span>Employment</span> <span class="toggle"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="16" height="16"><path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path></svg></span></summary>
                                <ul class="empinfo content border-bottom border-top py-3">
                                    <li><a href="/allowance-form" class="infobtn btn "><span>Allowance Declaration</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/job-form" class="infobtn btn"><span>Job</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/reportingOfficer-form" class="infobtn btn"><span>Reporting Officer</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/salary-form" class="infobtn btn"><span>Salary</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                    <li><a href="/previousEmployment-form" class="infobtn btn"><span>Previous Employment</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span></a></li>
                                </ul>

                            </details>

                            <details>
                                <summary class="d-flex flex-row justify-content-between pointer-event  py-3"><span>Qualification</span> <span class="toggle"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" width="16" height="16"><path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path></svg></span></summary>
                                <ul class="empinfo content border-top border-bottom">
                                    <li><a href="/show-qualiForm" class="infobtn btn"><span>Educational Qualification</span> <span><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-caret-right-fill" viewBox="0 0 16 16">
                                                            <path d="m12.14 8.753-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 0 1 1.659-.753l5.48 4.796a1 1 0 0 1 0 1.506z"/>
                                                 </svg></span>
                                    </a>
                                    </li>
                                </ul>
                            </details>

                        </div>
                    </aside>
                    <main class="mx-auto px my-5 main-content">
                        <c:choose>
                            <c:when test="${form == 'quali'}">
                                <jsp:include page="qualiForm.jsp" />
                            </c:when>
                            <c:when test="${form == 'test'}">
                                <jsp:include page="Test.jsp" />
                            </c:when>
                            <c:when test="${form == 'employee'}">
                                <jsp:include page="employee.jsp" />
                            </c:when>
                            <c:when test="${form == 'personal'}">
                                <jsp:include page="personal.jsp" />
                            </c:when>
                            <c:when test="${form == 'contact'}">
                                <jsp:include page="contact.jsp" />
                            </c:when>
                            <c:when test="${form == 'family'}">
                                <jsp:include page="family.jsp" />
                            </c:when>
                            <c:when test="${form == 'emergency'}">
                                <jsp:include page="emergency.jsp" />
                            </c:when>
                            <c:when test="${form == 'nominee'}">
                                <jsp:include page="nominee.jsp" />
                            </c:when>
                            <c:when test="${form == 'health'}">
                                <jsp:include page="health.jsp" />
                            </c:when>
                            <c:when test="${form == 'photo'}">
                                <jsp:include page="photograph.jsp" />
                            </c:when>
                            <c:when test="${form == 'attach'}">
                                <jsp:include page="attachment.jsp" />
                            </c:when>
                            <c:when test="${form == 'allowanceDeclaration'}">
                                <jsp:include page="allowanceDeclaration.jsp" />
                            </c:when>
                            <c:when test="${form == 'job'}">
                                <jsp:include page="job.jsp" />
                            </c:when>
                            <c:when test="${form == 'reportingOfficer'}">
                                <jsp:include page="reportingOfficer.jsp" />
                            </c:when>
                            <c:when test="${form == 'salary'}">
                                <jsp:include page="salary.jsp" />
                            </c:when>
                            <c:when test="${form == 'previousEmployment'}">
                                <jsp:include page="previousEmployment.jsp" />
                            </c:when>
                            <c:otherwise>
<%--                                <c:out value="no no no no"/>--%>
                            </c:otherwise>
                        </c:choose>
                    </main>
                </div>
            </main>
                </c:otherwise>
            </c:choose>

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
        // $('.formnav').change(function() {
        //     var selectedForm = $(this).val();
        //     $('.main-content').load(selectedForm + '.jsp');
        // });
    </script>
    </body>
</html>
