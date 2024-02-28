<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<style>
    .modal{
        margin-top: 100px !important;
    }
</style>
<form class="px-3 h-100" action="/contacts/addContact" method="post">

    <div class="row">
        <h1 class="col accordion-header" id="headingOne">
            Contact
        </h1>
    </div>


    <div class="row mt-3">

        <div class="col-3 md-2 ">
            <label for="workPhone" class="mt-2">Work Phone</label>
            <input name="workPhone" id="workPhone" type="text" class="form-control mt-2">
        </div>
        <div class="col-1 md-1 ">
            <label for="extension" class="mt-2">Extension</label>
            <input name="extension" id="extension" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="workMobile" class="mt-2">Work Mobile</label>
            <input name="workMobile" id="workMobile" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="homePhone" class="mt-2">Home Phone</label>
            <input name="homePhone" id="homePhone" type="text" class="form-control mt-2">
        </div>



    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="homeMobile" class="mt-2">Home Mobile</label>
            <input name="homeMobile" id="homeMobile" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="corporateEmail" class="mt-2">Corporate Email<span class="text-danger">*</span></label>
            <input name="corporateEmail" id="corporateEmail" type="email" class="form-control mt-2" required>
        </div>

        <div class="col-4 md-3 ">
            <label for="personalEmail" class="mt-2">Personal Email</label>
            <input name="personalEmail" id="personalEmail" type="email" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="secondaryEmail" class="mt-2">Secondary Email</label>
            <input name="secondaryEmail" id="secondaryEmail" type="email" class="form-control mt-2">
        </div>
    </div>

    <hr>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="" class="mt-2 md-3">Address</label>

            <div class="card" style="width: 18rem;">
                <div class="card-body ">
                    <p class="card-title" style="padding-left: 20px;">Add new record for address</p>

                    <br>

                    <a href="/addresses/add-addr"><img src="plus.svg" type="button" style="height: 10vh; width: auto; margin-left: 70px;" class="card-img-top justify-content-center"
                         data-bs-toggle="modal" data-bs-target="#exampleModal"></a>

                    <div class="modal  mt-5" id="exampleModal" tabindex="-1"
                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h1 class="modal-title fs-5" id="exampleModalLabel">Add New Address</h1>
                                    <hr>
                                    <button type="button" class="btn-close"
                                            data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>

                                <div class="modal-body">
                                    <div class="row">
                                        <div class="col-6 md-3">

                                            <label for="addressType" class="mt-2 md-3">Address Type<span class="text-danger">*</span></label>
                                            <select class="form-select" id="addressType" aria-label="Default select example" name="addressType">
                                                <option selected>--Select Type--</option>
                                                <option value="Home">Home</option>
                                                <option value="Office">Office</option>
                                                <option value="Other">Other</option>
                                            </select>
                                        </div>

                                        <div class="col-6 md-3 ">
                                            <label for="address" class="mt-2">Address<span class="text-danger">*</span></label>
                                            <textarea class="form-control" id="address" rows="3" name="address"></textarea>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <div class="col-6 md-3">
                                            <label for="country" class="mt-2 md-3">Country<span class="text-danger">*</span></label>
                                            <select class="form-select" id="country" name="country" aria-label="Default select example">
                                                <option selected>--Select Type--</option>
                                                <option value="India">India</option>
                                                <option value="USA">USA</option>
                                                <option value="Russia">Russia</option>
                                            </select>
                                        </div>

                                        <div class="col-6 md-3">
                                            <label for="field10" class="mt-2 md-3">State<span
                                                    class="text-danger">*</span></label>

                                            <select class="form-select" id="field10"
                                                   name="state" aria-label="Default select example">
                                                <option selected>--Select Type--</option>
                                                <option value="Gujarat">Gujarat</option>
                                                <option value="Maharashtra">Maharashtra</option>
                                                <option value="MP">MP</option>
                                            </select>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <div class="col-6 md-3">
                                            <label for="field10" class="mt-2 md-3">District<span class="text-danger">*</span></label>
                                            <select class="form-select" id="field10" name="district" aria-label="Default select example">
                                                <option selected>--Select Type--</option>
                                                <option value="Rajkot">Rajkot</option>
                                                <option value="Jamnagar">Jamnagar</option>
                                                <option value="Gandhinagar">Gandhinagar</option>
                                            </select>
                                        </div>

                                        <div class="col-6 md-3">
                                            <label for="field10" class="mt-2 md-3">City<span class="text-danger">*</span></label>
                                            <select class="form-select" id="field10" name="city" aria-label="Default select example">
                                                <option selected>--Select Type--</option>
                                                <option value="Rajkot">Rajkot</option>
                                                <option value="Gandhinagar">Gandhinagar</option>
                                                <option value="Vadodara">Vadodara</option>
                                            </select>
                                        </div>

                                        <div class="col-1 md-3" hidden>
                                            <label for="field10" class="" >District<span class="text-danger">*</span></label>
                                            <select class="form-select" id="field10" aria-label="Default select example" >
                                                <option selected hidden>--Select Type--</option>
                                                <option value="Rajkot" hidden>Rajkot</option>
                                                <option value="Jamnagar" hidden>Jamnagar</option>
                                                <option value="Gandhinagar" hidden>Gandhinagar</option>
                                            </select>
                                        </div>

                                    </div>

                                    <div class="row">

                                        <div class="col-6 mt-3 md-3">
                                            <label for="pin" class="mt-2 md-3 d-block">Pincode<span class="text-danger">*</span></label>
                                            <input class="rounded-2" type="text" name="pincode" id="pin" pattern="[1-9][0-9]{5}" title="Please enter a valid Indian PIN code">
                                        </div>

                                        <div class="col-6 mt-5 md-3">
                                            <label class="form-check-label " for="exampleCheckbox">All Addresses are Same</label>
                                            <input type="checkbox" name="allAddressAreSame" class="form-check-input" id="exampleCheckbox">
                                        </div>

                                        <div class="row mt-3">

                                            <div class="col-1 md-3">
                                                <input type="radio" id="owner" name="ownerShip"
                                                       value="owner">
                                            </div>
                                            <div class="col-2">
                                                <label for="owner">Owner</label><br>
                                            </div>
                                            <div class="col-1 md-3">
                                                <input type="radio" id="tenant" name="ownerShip"
                                                       value="tenant">
                                            </div>
                                            <div class="col-2">
                                                <label for="tenant">Tenant</label><br>
                                            </div>
                                        </div>

                                    </div>

                                </div>


                                <div class="modal-footer d-flex">
                                    <a type="button" href="/addresses/add-addr" class="btn dark w-25" style=" background-color: darkorange; color: white">Add</a>
                                    <a type="button" class="btn btn-secondary w-25" data-bs-dismiss="modal">Cancel</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>



    </div>



    <div class="row mt-3">

        <div class="col-4 mt-3"></div>
        <div class="col-4 mt-3"></div>

        <div class="col-4" style="margin-top: 100px">
            <div class="row">
                <input class="btn btn-secondary col-md-4" type="reset" value="Reset" style="margin: 0 15px">
                <input class="btn col-md-6" type="submit" value="Save & Continue" style=" background-color: darkorange; color: white">
            </div>
        </div>
    </div>

</form>