<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/nominees/addNominee" method="post">

    <div class="row mt-3">
        <h1 class="col accordion-header" id="headingOne">
            Nominee
        </h1>
    </div>

    <div class="row mt-3">

        <div class="col-4 p-0">
            <a type="button" class="btn text-decoration-underline text-primary" data-bs-toggle="modal"
                    data-bs-target="#exampleModal">
                Import Information from Family details
            </a>
        </div>

        <div class="modal fade" id="exampleModal" tabindex="-1"
             aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                aria-label="Close"></button>
                    </div>
                    <div class="modal-body">

                        <!-- add data table here -->

                    </div>

                </div>
            </div>
        </div>
    </div>


    <div class="row mt-3">

        <div class="col-4 md-3">
            <label for="" class="mt-2">Priority<span class="text-danger">*</span></label>
            <input name="priority" id="" type="text" class="form-control mt-2" required>
        </div>

        <div class="col-4 md-3 mt-3">
            <p>[1 is High Priority]</p>
        </div>

        <div class="col-4 md-3"></div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">First Name<span class="text-danger">*</span></label>
            <input name="firstName" id="" type="text" class="form-control mt-2" required>
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Middle Name</label>
            <input name="middleName" id="" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Last Name</label>
            <input name="lastName" id="" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3">
            <label for="field10" class="mt-2 md-3">Relation<span
                    class="text-danger">*</span></label>

            <select class="form-select" id="field10" aria-label="Default select example"
                  name="relation"  required>
                <option selected>--Select Type--</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
            </select>
        </div>

        <div class="col-4 md-3">
            <label for="field11" class="mt-2 md-3">Gender</label>

            <select class="form-select" id="field11" name="gender" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Date of Birth<span class="text-danger">*</span></label>
            <input name="dateOfBirth" id="" type="date" class="form-control mt-2"
                   placeholder="Enter a number" required>
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">UID No.</label>
            <input name="UIDNumber" id="" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Pan Number</label>
            <input name="panNumber" id="" type="text" class="form-control mt-2">
        </div>

        <div class="col-8 md-3 ">
            <label for="" class="mt-2">Contact Number</label>
            <input name="contactNumber" id="" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-12 md-3 ">
            <label for="" class="mt-2">Nominee Invalid Condition</label>
            <input name="nomineeInvalidCondition" id="" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3 pt-2">

        <div class="table-responsive">
            <table class="table table-borderless">
                <thead class="table-primary text-bg-primary rounded-top">
                <tr>
                    <th scope="col">Nominee Type Name</th>
                    <th scope="col">Percentage</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        <input type="checkbox" class="form-check-input" id="exampleCheckbox">
                        <label class="form-check-label " for="exampleCheckbox">t1</label>
                    </td>
                    <td>
                        <input name="" id="" type="text" class="form-control mt-2">
                    </td>
                </tr>
                </tbody>
            </table>
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