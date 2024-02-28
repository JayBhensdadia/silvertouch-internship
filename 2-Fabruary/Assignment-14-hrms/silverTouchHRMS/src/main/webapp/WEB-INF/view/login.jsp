<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/tabler@latest/dist/css/tabler.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('loginBg.jpg');
            background-size: cover;
            height: 100vh;
            overflow: hidden;
            background-repeat: no-repeat;
        }
        form{
            border-radius: 15px;
        }
        input{
            border-radius: 10px;
        }

        .content {
            width: 100%;
            height: 100%;
            background-color: rgba(45, 45, 255, 0.5);
        }

        .hrms {
            font-size: large;
            color: #333e7d;
        }

        .big {
            font-size: x-large;
        }

        .buttun {
            color: #fff;
            background-color: #e95b1f;
            border-color: #e95b1f;
            border-radius: 10px;
        }
    </style>
</head>

<body class="antialiased border-top-wide border-primary d-flex flex-column">
<div class="content ">
    <div class="w-100 h-100 d-flex flex-row justify-content-center align-items-center">

        <form class="w-25 bg-white" id="loginForm" action="/login" method="post">
            <div class="text-center mt-5">
                <a href="."><img src="stlogo.png" alt="" width="200"></a>
            </div>
            <div class="card-body">
                <h2 class="card-title text-center mb-4 hrms">Human Resource Management System</h2>
                <h1 class="card-title text-center mb-4  big">HRMS Login</h1>
                <div class="mb-3 mx-3">
                    <label class="form-label">Username</label>
                    <input type="text" class="form-control" id="username" name="username"
                           placeholder="Enter your username" >
                </div>
                <div class="mb-2 mx-3">
                    <label class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password"
                           placeholder="Password" >
                    <span class="form-label-description py-3">
                            <a href="./forgot-password.html" class="fw-bolder text-decoration-none">Forgot Password?</a>
                    </span>
                </div>
                <div class="form-footer mx-3">
                    <button type="submit" class="btn buttun btn-block">Login</button>
                </div>
            </div>
            <div class="text-center text-muted mt-3 px-4 mb-3 mx-3 d-flex flex-row justify-content-between">
                <h3 style="text-align: start;">Download Mobile App</h3>
                <a href="#1"><img src="google-play-badge.png" width="100px" height="30px"></a>
                <a href="#2"><img src="App_Store_logo.png" width="100px" height="30px"></a>
            </div>
        </form>

    </div>
    <p>@ 2024 SIlvertouch</p>
</div>

</body>

</html>