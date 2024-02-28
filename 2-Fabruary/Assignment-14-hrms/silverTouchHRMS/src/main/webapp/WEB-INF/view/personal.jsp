<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/personalDetails/addPersonalDetails" method="post">

    <div class="row">
        <h1 class="col accordion-header" id="headingOne">
            Personal
        </h1>
    </div>


    <div class="row mt-3">

        <div class="col-4 md-3">
            <label for="gender" class="mt-2 md-3">Gender<span
                    class="text-danger">*</span></label>

            <select class="form-select" id="gender"
                    aria-label="Default select example" name="gender" required>
                <option selected>--Select Type--</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
        </div>

        <div class="col-4 md-3">
            <label for="mrg-status" class="mt-2 md-3">Marriage Status</label>
            <select class="form-select" id="mrg-status"
                    name="marriageStatus" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Married">Married</option>
                <option value="Unmarried">Unmarried</option>
                <option value="Divorced">Divorced</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="dob" class="mt-2">Date of Birth<span
                    class="text-danger">*</span></label>
            <input name="DateOfBirth" id="dob" type="date" class="form-control mt-2"
                   placeholder="Enter a number" required>
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Date of Marriage</label>
            <input name="DateOfMarriage" id="" type="date" class="form-control mt-2"
                   placeholder="Enter a number">
        </div>

        <div class="col-4 md-3 ">
            <label for="" class="mt-2">Birth Place</label>
            <input name="birthPlace" id="" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3">
            <label for="community-cat" class="mt-2 md-3">Community Category<span
                    class="text-danger">*</span></label>

            <select class="form-select" id="community-cat"
                    name="communityCategory" aria-label="Default select example" required>
                <option selected>--Select Type--</option>
                <option value="Married">Married</option>
                <option value="Unmarried">Unmarried</option>
                <option value="Divorced">Divorced</option>
            </select>
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3 ">
            <label for="UIDNumber" class="mt-2">UID No.</label>
            <input name="UIDNumber" id="UIDNumber" type="text" class="form-control mt-2" >
        </div>

        <div class="col-4 md-3 ">
            <label for="GPFNumberAcNo" class="mt-2">GPF A/C No.</label>
            <input name="GPFNumberAcNo" id="GPFNumberAcNo" type="text" class="form-control mt-2" >
        </div>

        <div class="col-4 md-3">
            <label for="religion" class="mt-2 md-3">Religion</label>
            <select class="form-select" id="religion"
                   name="religion" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Married">Married</option>
                <option value="Unmarried">Unmarried</option>
                <option value="Divorced">Divorced</option>
            </select>
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3">
            <label for="caste" class="mt-2 md-3">Caste</label>
            <select class="form-select" id="caste"
                   name="caste" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="General">General</option>
                <option value="SEBC">SEBC</option>
                <option value="SC">SC</option>
                <option value="ST">ST</option>
            </select>
        </div>

        <div class="col-8 md-3 ">
            <label for="communityCategoryReference" class="mt-2">Community Category Reference</label>
            <input name="communityCategoryReference" id="communityCategoryReference" type="text" class="form-control mt-2">
        </div>

    </div>

    <div class="row mt-3">

        <div class="col-4 md-3">
            <label for="nationality" class="mt-2 md-3">Nationality</label>
            <select class="form-select" id="nationality"
                   name="nationality" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Indian">Indian</option>
                <option value="American">American</option>
                <option value="Japanese">Japanese</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="postalLifeInsuarancePolicyNo" class="mt-2">Post Life Insurance Policy No.</label>
            <input name="postalLifeInsuarancePolicyNo" id="postalLifeInsuarancePolicyNo" type="text" class="form-control mt-2" >
        </div>

        <div class="col-4 md-3 ">
            <label for="hobbies" class="mt-2">Hobbies</label>
            <input name="hobbies" id="hobbies" type="text" class="form-control mt-2" >
        </div>

    </div>

    <hr>

    <div class="row mt-3">
        <div class="col-4 md-3">
            <label for="bnk-name" class="mt-2 md-3">Bank Name<span
                    class="text-danger">*</span></label>

            <select class="form-select" id="bnk-name"
                   name="bankName" aria-label="Default select example" required>
                <option selected>--Select Type--</option>
                <option value="SBI">SBI</option>
                <option value="ICICI">ICICI</option>
                <option value="HDFC">HDFC</option>
            </select>
        </div>

        <div class="col-4 md-3">
            <label for="bankBranchName" class="mt-2 md-3">Bank Branch Name<span
                    class="text-danger">*</span></label>

            <select class="form-select" id="bankBranchName"
                   name="bankBranchName" aria-label="Default select example" required>
                <option selected>--Select Type--</option>
                <option value="SBI-branch-1">SBI-branch-1</option>
                <option value="SBI-branch-2">SBI-branch-2</option>
                <option value="ICICI-branch-1">ICICI-branch-1</option>
                <option value="ICICI-branch-2">ICICI-branch-2</option>
                <option value="HDFC-branch-1">HDFC-branch-1</option>
                <option value="HDFC-branch-2">HDFC-branch-2</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="bankAccountNumber" class="mt-2">Bank A/C Number<span class="text-danger">*</span></label>
            <input name="bankAccountNumber" id="bankAccountNumber" type="text" class="form-control mt-2" required>
        </div>
    </div>

    <div class="row mt-3">
        <div class="col-4 md-3 ">
            <label for="ifscCode" class="mt-2">IFSC Code<span class="text-danger">*</span></label>
            <input name="ifscCode" id="ifscCode" type="text" class="form-control mt-2" required>
        </div>

        <div class="col-4 md-3 ">
            <label for="bsrCode" class="mt-2">BSR Code<span class="text-danger">*</span></label>
            <input name="bsrCode" id="bsrCode" type="text" class="form-control mt-2" required>
        </div>

        <div class="col-4 md-3 ">

        </div>
    </div>

    <hr>

    <div class="row mt-3">
        <div class="col-4 md-3 ">
            <label for="passportNo" class="mt-2">Passport No</label>
            <input name="passportNo" id="passportNo" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3 ">
            <label for="dateOfExpiry" class="mt-2">Date of Expiry</label>
            <input name="dateOfExpiry" id="dateOfExpiry" type="date" class="form-control mt-2"
                   placeholder="Enter a number">
        </div>

        <div class="col-4 md-3 ">
            <label for="visaDetail" class="mt-2">Visa Detail</label>
            <input name="visaDetail" id="visaDetail" type="text" class="form-control mt-2">
        </div>
    </div>

    <div class="row mt-3">
        <div class="col-4 md-3 ">
            <label for="dlNumber" class="mt-2">Driving Licence No</label>
            <input name="dlNumber" id="dlNumber" type="text" class="form-control mt-2">
        </div>

        <div class="col-4 md-3">
            <label for="vehicleType" class="mt-2 md-3">Licence Issued for (Vehicle Type)</label>

            <select class="form-select" id="vehicleType"
                   name="vehicleType" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="2wheeler">2-wheeler</option>
                <option value="3wheeler">3-wheeler</option>
                <option value="4wheeler">4-wheeler</option>
            </select>
        </div>

        <div class="col-4 md-3 ">
            <label for="validUpto" class="mt-2">Valid Upto</label>
            <input name="validUpto" id="validUpto" type="date" class="form-control mt-2"
                   placeholder="Enter a number">
        </div>
    </div>

    <div class="row mt-3">
        <div class="col-4 md-3">
            <label for="state" class="mt-2 md-3">Issue State/UT</label>

            <select class="form-select" id="state"
                   name="state" aria-label="Default select example">
                <option selected>--Select Type--</option>
                <option value="Gujarat">Gujarat</option>
                <option value="Maharashtra">Maharashtra</option>
                <option value="Delhi">Delhi</option>
                <option value="Karnataka">Karnataka</option>
            </select>
        </div>

        <div class="col-8 md-3 d-flex flex-row ">

            <div class="d-flex flex-column">
                <label class="form-check-label" for="governmentVehicleProvided">Government <br> Vehicle Provided?</label>
                <input type="checkbox" class="form-check-input" id="governmentVehicleProvided" name="governmentVehicleProvided">
            </div>
            <div class="d-flex flex-column">
                <label class="form-check-label" for="isForeigner">Is Resident of <br> Other Country?</label>
                <input type="checkbox" class="form-check-input" id="isForeigner" name="isForeigner">
            </div>
            <div class="d-flex flex-column">
                <label class="form-check-label" for="isAnyDisciplinaryProcedding">Is Any Disciplinary <br> proceeding?</label>
                <input type="checkbox" class="form-check-input" id="isAnyDisciplinaryProcedding" name="isAnyDisciplinaryProcedding">
            </div>
        </div>

    </div>

    <div class="row mt-3">
        <div class="col-8 md-3 ">
            <label for="additionalInformation" class="mt-2">Additional Info</label>
            <input name="additionalInformation" id="additionalInformation" type="text" class="form-control mt-2">
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