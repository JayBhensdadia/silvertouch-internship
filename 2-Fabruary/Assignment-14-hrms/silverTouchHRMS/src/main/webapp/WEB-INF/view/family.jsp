<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/families/addFamily" method="post">

    <div class="row">
        <h1 class="col accordion-header" id="headingOne">
            Family
        </h1>
    </div>


    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="firstName" class="mt-2">First Name<span class="text-danger">*</span></label>
            <input name="firstName" id="firstName" type="text" class="form-control mt-2" required>
        </div>

        <div class="col-4 md-3 ">
            <label for="middleName" class="mt-2">Middle Name</label>
            <input name="middleName" id="middleName" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="lastName" class="mt-2">Last Name</label>
            <input name="lastName" id="lastName" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3">
            <label for="field10" class="mt-2 md-3">Select Relation<span
                    class="text-danger">*</span></label>

            <select class="form-select" id="field10"
                  name="relation" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Date of Birth<span
                    class="text-danger">*</span></label>
            <input name="dateOfBirth" id="" type="date" class="form-control mt-2"
                   placeholder="Enter a number" required>
        </div>

        <div class="col-4 md-3">
            <label for="field11" class="mt-2 md-3">Gender<span
                    class="text-danger">*</span></label>

            <select class="form-select" id=""
                  name="gender"  aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 mt-3 md-3">
            <input type="checkbox" class="form-check-input"
                 name="isNominee"  id="">
            <label class="form-check-label "
                   for="exampleCheckbox">Is Nominee</label>
        </div>

        <div class="col-4 md-3">
            <label for="field11" class="mt-2 md-3">Marital Status<span
                    class="text-danger">*</span></label>

            <select class="form-select" id=""
                   name="maritalStatus" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Married">Married</option>
                <option value="Unmarried">Unmarried</option>
                <option value="Divorced">Divorced</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Occupation</label>
            <input name="occupation" id="" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 mt-3 md-3">
            <input type="checkbox" class="form-check-input"
                 name="isDependent"  id="">
            <label class="form-check-label "
                   for="exampleCheckbox">Is Dependent</label>
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Contact Detail</label>
            <input name="contactDetail" id="" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3">
            <label for="field11" class="mt-2 md-3">Nationality<span
                    class="text-danger">*</span></label>

            <select class="form-select" id="field11"
                  name="nationality"  aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Married">Married</option>
                <option value="Unmarried">Unmarried</option>
                <option value="Divorced">Divorced</option>
            </select>
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 mt-3 md-3">
            <input type="checkbox" class="form-check-input"
                 name="isResidingWith"  id="">
            <label class="form-check-label "
                   for="exampleCheckbox">Is Residing With</label>
        </div>

        <div class="col-4 mt-3 md-3">
            <label class="form-check-label "
                   for="exampleCheckbox">Can be contacted in Emergency?</label>
            <input type="checkbox" class="form-check-input"
                  name="canBeContactedInEmergency" id="">
        </div>

        <div class="col-4 mt-3 md-3">
            <input type="checkbox" class="form-check-input"
                  name="isPhysicallyDisabled" id="exampleCheckbox">
            <label class="form-check-label "
                   for="exampleCheckbox">Is Physically Disabled?</label>
        </div>

    </div>

    <hr>

    <div class="row mt-3">
        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Address</label>
            <textarea class="form-control" id="textarea1" name="address" rows="3"></textarea>
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