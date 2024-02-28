<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

    <!DOCTYPE html>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

            <html>

            <head>
                <meta charset="utf-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover" />
                <meta http-equiv="X-UA-Compatible" content="ie=edge" />
                <title>FoodOrder</title>
                <!-- CSS files -->
                <!-- <link href="../../dist/css/tabler.min.css?1692870487" rel="stylesheet" />
                <link href="../../dist/css/tabler-flags.min.css?1692870487" rel="stylesheet" />
                <link href="../../dist/css/tabler-payments.min.css?1692870487" rel="stylesheet" />
                <link href="../../dist/css/tabler-vendors.min.css?1692870487" rel="stylesheet" />
                <link href="../../dist/css/demo.min.css?1692870487" rel="stylesheet" />
                <link href="../../dist/css/hover.css" rel="stylesheet" /> -->

                <script src="https://cdn.jsdelivr.net/npm/@tabler/core@latest/dist/js/tabler.min.js"></script>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@tabler/core@latest/dist/css/tabler.min.css">
                
                
                <!-- <style>
                    @import url('https://rsms.me/inter/inter.css');

                    :root {
                        --tblr-font-sans-serif: 'Inter Var', -apple-system, BlinkMacSystemFont, San Francisco, Segoe UI, Roboto, Helvetica Neue, sans-serif;
                    }

                    body {
                        font-feature-settings: "cv03", "cv04", "cv11";
                    }
                </style> -->


            </head>

            <body>
                <script src="../../dist/js/demo-theme.min.js?1692870487"></script>
                <div class="page">
                    <!-- Sidebar -->
                    <aside class="navbar navbar-vertical navbar-expand-lg" data-bs-theme="dark">
                        <div class="container-fluid">
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#sidebar-menu" aria-controls="sidebar-menu" aria-expanded="false"
                                aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <h1 class="navbar-brand navbar-brand-autodark">
                                <a href=".">
                                    <!-- <img src="./static/logo.svg" width="110" height="32" alt="Tabler" class="navbar-brand-image"> -->
                                    <svg xmlns="http://www.w3.org/2000/svg"
                                        class="icon icon-tabler icon-tabler-tools-kitchen-2" width="24" height="24"
                                        viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" fill="none"
                                        stroke-linecap="round" stroke-linejoin="round">
                                        <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                        <path
                                            d="M19 3v12h-5c-.023 -3.681 .184 -7.406 5 -12zm0 12v6h-1v-3m-10 -14v17m-3 -17v3a3 3 0 1 0 6 0v-3" />
                                    </svg>

                                    Food Order

                                </a>
                            </h1>


                            <div class="collapse navbar-collapse" id="sidebar-menu">
                                <ul class="navbar-nav pt-lg-3">

                                    <c:choose>
                                        <c:when test="${role == 'ADMIN'}">

                                            <li class="nav-item">
                                                <a class="nav-link" href="/dashboard">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/home -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-device-desktop"
                                                            width="24" height="24" viewBox="0 0 24 24"
                                                            stroke-width="1.5" stroke="currentColor" fill="none"
                                                            stroke-linecap="round" stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M3 5a1 1 0 0 1 1 -1h16a1 1 0 0 1 1 1v10a1 1 0 0 1 -1 1h-16a1 1 0 0 1 -1 -1v-10z" />
                                                            <path d="M7 20h10" />
                                                            <path d="M9 16v4" />
                                                            <path d="M15 16v4" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Dashboard
                                                    </span>
                                                </a>
                                            </li>


                                            <li class="nav-item">
                                                <a class="nav-link" href="/manage-city">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-building" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path d="M3 21l18 0" />
                                                            <path d="M9 8l1 0" />
                                                            <path d="M9 12l1 0" />
                                                            <path d="M9 16l1 0" />
                                                            <path d="M14 8l1 0" />
                                                            <path d="M14 12l1 0" />
                                                            <path d="M14 16l1 0" />
                                                            <path d="M5 21v-16a2 2 0 0 1 2 -2h10a2 2 0 0 1 2 2v16" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage City
                                                    </span>
                                                </a>

                                            </li>


                                            <li class="nav-item">
                                                <a class="nav-link" href="/area/manage-area">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-map-pin" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path d="M9 11a3 3 0 1 0 6 0a3 3 0 0 0 -6 0" />
                                                            <path
                                                                d="M17.657 16.657l-4.243 4.243a2 2 0 0 1 -2.827 0l-4.244 -4.243a8 8 0 1 1 11.314 0z" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Area
                                                    </span>
                                                </a>

                                            </li>



                                            <li class="nav-item">
                                                <a class="nav-link" href="/category/manage-category">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-mug" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M4.083 5h10.834a1.08 1.08 0 0 1 1.083 1.077v8.615c0 2.38 -1.94 4.308 -4.333 4.308h-4.334c-2.393 0 -4.333 -1.929 -4.333 -4.308v-8.615a1.08 1.08 0 0 1 1.083 -1.077" />
                                                            <path
                                                                d="M16 8h2.5c1.38 0 2.5 1.045 2.5 2.333v2.334c0 1.288 -1.12 2.333 -2.5 2.333h-2.5" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Category
                                                    </span>
                                                </a>

                                            </li>





                                            <li class="nav-item">
                                                <a class="nav-link" href="/subcategory/manage-subcategory">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-salad" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M4 11h16a1 1 0 0 1 1 1v.5c0 1.5 -2.517 5.573 -4 6.5v1a1 1 0 0 1 -1 1h-8a1 1 0 0 1 -1 -1v-1c-1.687 -1.054 -4 -5 -4 -6.5v-.5a1 1 0 0 1 1 -1z" />
                                                            <path
                                                                d="M18.5 11c.351 -1.017 .426 -2.236 .5 -3.714v-1.286h-2.256c-2.83 0 -4.616 .804 -5.64 2.076" />
                                                            <path
                                                                d="M5.255 11.008a12.204 12.204 0 0 1 -.255 -2.008v-1h1.755c.98 0 1.801 .124 2.479 .35" />
                                                            <path d="M8 8l1 -4l4 2.5" />
                                                            <path d="M13 11v-.5a2.5 2.5 0 1 0 -5 0v.5" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Sub Category
                                                    </span>
                                                </a>

                                            </li>


                                            <li class="nav-item">
                                                <a class="nav-link" href="/restaurant/manage-restaurant">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-tools-kitchen"
                                                            width="24" height="24" viewBox="0 0 24 24"
                                                            stroke-width="1.5" stroke="currentColor" fill="none"
                                                            stroke-linecap="round" stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path d="M4 3h8l-1 9h-6z" />
                                                            <path d="M7 18h2v3h-2z" />
                                                            <path d="M20 3v12h-5c-.023 -3.681 .184 -7.406 5 -12z" />
                                                            <path d="M20 15v6h-1v-3" />
                                                            <path d="M8 12l0 6" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Restaurant
                                                    </span>
                                                </a>

                                            </li>






                                            <li class="nav-item">
                                                <a class="nav-link" href="/offer/manage-offer">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-report-money" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M9 5h-2a2 2 0 0 0 -2 2v12a2 2 0 0 0 2 2h10a2 2 0 0 0 2 -2v-12a2 2 0 0 0 -2 -2h-2" />
                                                            <path
                                                                d="M9 3m0 2a2 2 0 0 1 2 -2h2a2 2 0 0 1 2 2v0a2 2 0 0 1 -2 2h-2a2 2 0 0 1 -2 -2z" />
                                                            <path
                                                                d="M14 11h-2.5a1.5 1.5 0 0 0 0 3h1a1.5 1.5 0 0 1 0 3h-2.5" />
                                                            <path d="M12 17v1m0 -8v1" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Offers
                                                    </span>
                                                </a>

                                            </li>




                                            <li class="nav-item">
                                                <a class="nav-link" href="/complaint/manage-complaints">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-phone" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M5 4h4l2 5l-2.5 1.5a11 11 0 0 0 5 5l1.5 -2.5l5 2v4a2 2 0 0 1 -2 2a16 16 0 0 1 -15 -15a2 2 0 0 1 2 -2" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Complaints
                                                    </span>
                                                </a>

                                            </li>

                                        </c:when>
                                    </c:choose>




                                    <c:choose>
                                        <c:when test="${role == 'RESTAURANT'}">

                                            <li class="nav-item">
                                                <a class="nav-link" href="/product/manage-products">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-paper-bag" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M8 3h8a2 2 0 0 1 2 2v1.82a5 5 0 0 0 .528 2.236l.944 1.888a5 5 0 0 1 .528 2.236v5.82a2 2 0 0 1 -2 2h-12a2 2 0 0 1 -2 -2v-5.82a5 5 0 0 1 .528 -2.236l1.472 -2.944v-3a2 2 0 0 1 2 -2z" />
                                                            <path d="M14 15m-2 0a2 2 0 1 0 4 0a2 2 0 1 0 -4 0" />
                                                            <path
                                                                d="M6 21a2 2 0 0 0 2 -2v-5.82a5 5 0 0 0 -.528 -2.236l-1.472 -2.944" />
                                                            <path d="M11 7h2" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Products
                                                    </span>
                                                </a>

                                            </li>


                                            <li class="nav-item">
                                                <a class="nav-link" href="/complaint/manage-complaints">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-phone" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M5 4h4l2 5l-2.5 1.5a11 11 0 0 0 5 5l1.5 -2.5l5 2v4a2 2 0 0 1 -2 2a16 16 0 0 1 -15 -15a2 2 0 0 1 2 -2" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Complaints
                                                    </span>
                                                </a>

                                            </li>


                                            <li class="nav-item">
                                                <a class="nav-link" href="/offer/manage-offer">
                                                    <span
                                                        class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                        <svg xmlns="http://www.w3.org/2000/svg"
                                                            class="icon icon-tabler icon-tabler-report-money" width="24"
                                                            height="24" viewBox="0 0 24 24" stroke-width="1.5"
                                                            stroke="currentColor" fill="none" stroke-linecap="round"
                                                            stroke-linejoin="round">
                                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                            <path
                                                                d="M9 5h-2a2 2 0 0 0 -2 2v12a2 2 0 0 0 2 2h10a2 2 0 0 0 2 -2v-12a2 2 0 0 0 -2 -2h-2" />
                                                            <path
                                                                d="M9 3m0 2a2 2 0 0 1 2 -2h2a2 2 0 0 1 2 2v0a2 2 0 0 1 -2 2h-2a2 2 0 0 1 -2 -2z" />
                                                            <path
                                                                d="M14 11h-2.5a1.5 1.5 0 0 0 0 3h1a1.5 1.5 0 0 1 0 3h-2.5" />
                                                            <path d="M12 17v1m0 -8v1" />
                                                        </svg>
                                                    </span>
                                                    <span class="nav-link-title">
                                                        Manage Offers
                                                    </span>
                                                </a>

                                            </li>

                                        </c:when>
                                    </c:choose>



                                    <li class="nav-item">
                                        <a class="nav-link" href="/logout">
                                            <span
                                                class="nav-link-icon d-md-none d-lg-inline-block"><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                                                <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-logout" width="24" height="24" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" fill="none" stroke-linecap="round" stroke-linejoin="round"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M14 8v-2a2 2 0 0 0 -2 -2h-7a2 2 0 0 0 -2 2v12a2 2 0 0 0 2 2h7a2 2 0 0 0 2 -2v-2" /><path d="M9 12h12l-3 -3" /><path d="M18 15l3 -3" /></svg>
                                            </span>
                                            <span class="nav-link-title">
                                                Logout
                                            </span>
                                        </a>

                                    </li>

                                </ul>
                            </div>
                        </div>
                    </aside>



                    <!-- Navbar -->
                    <header class="navbar navbar-expand-md d-none d-lg-flex d-print-none">
                        <div class="container-xl">
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbar-menu" aria-controls="navbar-menu" aria-expanded="false"
                                aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="navbar-nav flex-row order-md-last">
                                <div class="d-none d-md-flex">
                                    <a href="?theme=dark" class="nav-link px-0 hide-theme-dark" title="Enable dark mode"
                                        data-bs-toggle="tooltip" data-bs-placement="bottom">
                                        <!-- Download SVG icon from http://tabler-icons.io/i/moon -->
                                        <svg xmlns="http://www.w3.org/2000/svg" class="icon" width="24" height="24"
                                            viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none"
                                            stroke-linecap="round" stroke-linejoin="round">
                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                            <path
                                                d="M12 3c.132 0 .263 0 .393 0a7.5 7.5 0 0 0 7.92 12.446a9 9 0 1 1 -8.313 -12.454z" />
                                        </svg>
                                    </a>
                                    <a href="?theme=light" class="nav-link px-0 hide-theme-light"
                                        title="Enable light mode" data-bs-toggle="tooltip" data-bs-placement="bottom">
                                        <!-- Download SVG icon from http://tabler-icons.io/i/sun -->
                                        <svg xmlns="http://www.w3.org/2000/svg" class="icon" width="24" height="24"
                                            viewBox="0 0 24 24" stroke-width="2" stroke="currentColor" fill="none"
                                            stroke-linecap="round" stroke-linejoin="round">
                                            <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                            <path d="M12 12m-4 0a4 4 0 1 0 8 0a4 4 0 1 0 -8 0" />
                                            <path
                                                d="M3 12h1m8 -9v1m8 8h1m-9 8v1m-6.4 -15.4l.7 .7m12.1 -.7l-.7 .7m0 11.4l.7 .7m-12.1 -.7l-.7 .7" />
                                        </svg>
                                    </a>

                                </div>
                                <div class="nav-item ">
                                    <a href="#" class="nav-link d-flex lh-1 text-reset p-0" data-bs-toggle="dropdown"
                                        aria-label="Open user menu">
                                        <span class="avatar avatar-sm">
                                            <svg xmlns="http://www.w3.org/2000/svg"
                                                class="icon icon-tabler icon-tabler-user" width="24" height="24"
                                                viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" fill="none"
                                                stroke-linecap="round" stroke-linejoin="round">
                                                <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                <path d="M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0" />
                                                <path d="M6 21v-2a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v2" />
                                            </svg>
                                        </span>
                                        <div class="d-none d-xl-block ps-2">
                                            <div>Jay Bhensdadia</div>
                                            <div class="mt-1 small text-secondary">Full Stack Developer</div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <div class="collapse navbar-collapse" id="navbar-menu">
                                <div>
                                    <form action="./" method="get" autocomplete="off" novalidate>
                                        <div class="input-icon">
                                            <span class="input-icon-addon">
                                                <!-- Download SVG icon from http://tabler-icons.io/i/search -->
                                                <svg xmlns="http://www.w3.org/2000/svg" class="icon" width="24"
                                                    height="24" viewBox="0 0 24 24" stroke-width="2"
                                                    stroke="currentColor" fill="none" stroke-linecap="round"
                                                    stroke-linejoin="round">
                                                    <path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                    <path d="M10 10m-7 0a7 7 0 1 0 14 0a7 7 0 1 0 -14 0" />
                                                    <path d="M21 21l-6 -6" />
                                                </svg>
                                            </span>
                                            <input type="text" value="" class="form-control" placeholder="Search"
                                                aria-label="Search in website">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </header>




                    <div class="page-wrapper">
                        <!-- Page header -->

                        <!-- Page body -->

                        <c:choose>
                            <c:when test="${page == 'dashboard'}">
                                <jsp:include page="dashboard.jsp" />
                            </c:when>

                            <c:when test="${page == 'manage-city'}">
                                <jsp:include page="manage-city.jsp" />
                            </c:when>

                            <c:when test="${page == 'manage-area'}">
                                <jsp:include page="manage-area.jsp" />
                            </c:when>







                            <c:when test="${page == 'manage-offers'}">
                                <jsp:include page="manage-offers.jsp" />
                            </c:when>

                            <c:when test="${page == 'manage-complaints'}">
                                <jsp:include page="manage-complaints.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-city'}">
                                <jsp:include page="edit-city.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-city'}">
                                <jsp:include page="add-city.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-area'}">
                                <jsp:include page="add-area.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-area'}">
                                <jsp:include page="edit-area.jsp" />
                            </c:when>


                            <c:when test="${page == 'manage-category'}">
                                <jsp:include page="manage-category.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-category'}">
                                <jsp:include page="add-category.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-category'}">
                                <jsp:include page="edit-category.jsp" />
                            </c:when>


                            <c:when test="${page == 'manage-subcategory'}">
                                <jsp:include page="manage-subcategory.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-subcategory'}">
                                <jsp:include page="add-subcategory.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-subcategory'}">
                                <jsp:include page="edit-subcategory.jsp" />
                            </c:when>

                            <c:when test="${page == 'manage-restaurant'}">
                                <jsp:include page="manage-restaurant.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-restaurant'}">
                                <jsp:include page="add-restaurant.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-restaurant'}">
                                <jsp:include page="edit-restaurant.jsp" />
                            </c:when>

                            <c:when test="${page == 'manage-offer'}">
                                <jsp:include page="manage-offers.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-offer'}">
                                <jsp:include page="add-offer.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-offer'}">
                                <jsp:include page="edit-offer.jsp" />
                            </c:when>

                            <c:when test="${page == 'manage-products'}">
                                <jsp:include page="manage-products.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-product'}">
                                <jsp:include page="add-product.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-product'}">
                                <jsp:include page="edit-product.jsp" />
                            </c:when>

                            <c:when test="${page == 'manage-complaints'}">
                                <jsp:include page="manage-complaints.jsp" />
                            </c:when>

                            <c:when test="${page == 'add-complaint'}">
                                <jsp:include page="add-complaint.jsp" />
                            </c:when>

                            <c:when test="${page == 'edit-complaint'}">
                                <jsp:include page="edit-complaint.jsp" />
                            </c:when>

                            <c:otherwise>

                                <p>Invalid role.</p>
                            </c:otherwise>
                        </c:choose>


                        <footer class="footer footer-transparent d-print-none">
                            <div class="container-xl">
                                <div class="row text-center align-items-center flex-row-reverse">

                                    <div class="col-12 col-lg-auto mt-3 mt-lg-0">
                                        <ul class="list-inline list-inline-dots mb-0">
                                            <li class="list-inline-item">
                                                Copyright &copy; 2024
                                                <a href="." class="link-secondary">Tabler</a>.
                                                All rights reserved.
                                            </li>

                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </footer>
                    </div>
                </div>


                <!-- Libs JS -->
                <!-- <script src="../../dist/libs/apexcharts/dist/apexcharts.min.js?1692870487" defer></script>
                <script src="../../dist/libs/jsvectormap/dist/js/jsvectormap.min.js?1692870487" defer></script>
                <script src="../../dist/libs/jsvectormap/dist/maps/world.js?1692870487" defer></script>
                <script src="../../dist/libs/jsvectormap/dist/maps/world-merc.js?1692870487" defer></script> -->
                <!-- Tabler Core -->
                <!-- <script src="../../dist/js/tabler.min.js?1692870487" defer></script>
                <script src="../../dist/js/demo.min.js?1692870487" defer></script>
                <script src="../../js/city.js"></script> -->


                <script>

                    

                    document.getElementById("copy").onclick = () => {
                        navigator.clipboard.writeText(document.getElementById("table").innerText.trim());
                        alert("table is copyed sucessfuly");
                    }


                    document.getElementById("print").onclick = () => {
                        window.print();
                    }


                    function tableToCSV() {
                        
                        let csv_data = [];

                        
                        let table = document.getElementById('table');

                        
                        let rows = table.getElementsByTagName('tr');
                        for (let i = 0; i < rows.length; i++) {

                            
                            let cols = rows[i].querySelectorAll('td,th');

                            
                            let csvrow = [];
                            for (let j = 0; j < cols.length; j++) {

                                
                                csvrow.push(cols[j].innerText);
                            }

                           
                            csv_data.push(csvrow.join(","));
                        }

                        
                        csv_data = csv_data.join('\n');

                         
                        downloadCSVFile(csv_data);
                    }


                    function downloadCSVFile(csv_data) {
                        
                        CSVFile = new Blob([csv_data], {
                            type: "text/csv"
                        });

                        
                        let temp_link = document.createElement('a');

                        
                        temp_link.download = "table.csv";
                        let url = window.URL.createObjectURL(CSVFile);
                        temp_link.href = url;

                        
                        temp_link.style.display = "none";
                        document.body.appendChild(temp_link);

                        
                        temp_link.click();
                        document.body.removeChild(temp_link);
                    }

                   


                </script>


            </body>

            </html>