<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/emergencies/addEmergency" method="post">

    <div class="row">
        <h1 class="col accordion-header" id="headingOne">
            Emergency
        </h1>
    </div>


    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Priority</label>
            <input name="priority" id="" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">First Name<span class="text-danger">*</span></label>
            <input name="firstName" id="" type="text" class="form-control mt-2" required>
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Middle Name</label>
            <input name="middleName" id="" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Last Name</label>
            <input name="lastName" id="" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3">
            <label for="field10" class="mt-2 md-3">Relation<span
                    class="text-danger">*</span></label>

            <select name="relation" class="form-select" id="field10"
                    aria-label="Default select example" required>
                <option selected>--Select Type--</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Phone No.</label>
            <input name="phoneNumber" id="" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Mobile No.<span class="text-danger">*</span></label>
            <input name="mobileNumber" id="" type="text" class="form-control mt-2" required>
        </div>

        <div class="col-8 md-3 ">
            <label for="" class="mt-2">Email</label>
            <input name="email" id="" type="email" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-12 md-3 ">
            <label for="" class="mt-2">Address</label>
            <input name="address" id="" type="text" class="form-control mt-2">
        </div>

    </div>


    <div class="row mt-3">

        <div class="col-4 mt-3"></div>
        <div class="col-4 mt-3"></div>

        <div class="row">
            <div class="col-12 d-flex justify-content-end">
                <input class="btn btn-secondary col-md-1 me-2" type="reset" value="Reset">
                <input class="btn col-md-2 me-2" type="submit" value="Add Record" style=" background-color: darkorange; color: white">
                <input class="btn col-md-2" type="submit" value="Continue" style=" background-color: darkorange; color: white">
            </div>
        </div>
    </div>

</form>