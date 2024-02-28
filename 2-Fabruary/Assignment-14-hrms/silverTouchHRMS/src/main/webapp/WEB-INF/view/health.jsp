<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/healths/addHealth" method="post">

    <h1>
        Health
    </h1>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field1">Height(Cms)<span class="text-danger">*</span></label>
                <input type="text" class="form-control" name="heightCms" id="field1" required>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field2">Weight(Kgs)<span class="text-danger">*</span></label>
                <input type="text" class="form-control" name="weightKgs" id="field2" required>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="mySelect">Blood Group<span class="text-danger">*</span></label>
                <select id="mySelect" name="bloodGroup" style="width: 300px;">
                    <option value="">--Select Type--</option>
                    <option value="1">A Rh Positive</option>
                    <option value="2">A Rh Negative</option>
                    <option value="3">B Rh Positive</option>
                    <option value="4">B Rh Negative</option>
                    <option value="5">AB Rh Positive</option>
                    <option value="6">AB Rh Negative</option>
                    <option value="7">O Rh Positive</option>
                    <option value="8">O Rh Negative</option>
                </select>

                <!-- Include jQuery -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
                <!-- Include Select2 JavaScript -->
                <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js"></script>

                <script>
                    // Initialize Select2
                    $(document).ready(function() {
                        $('#mySelect').select2();
                    });
                </script>

            </div>
        </div>

    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="im1">Identification Mark-1</label>
                <input type="text" name="identificationMark1" class="form-control" id="im1">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="im2">Identification Mark-2</label>
                <input type="text" name="identificationMark2" class="form-control" id="im2">
            </div>
        </div>
        <div class="col-4" style="display: flex;align-items: center;">
            <div class="form-check" >
                <input class="form-check-input" name="physicallyHandicapped" type="checkbox" value="" id="flexCheckDefault">
                <label class="form-check-label" for="flexCheckDefault" style="font-size: larger; ">
                    Physically Handicapped
                </label>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-12 d-flex justify-content-end">
            <input class="btn btn-secondary col-md-1 me-2" type="reset" value="Reset">
            <input class="btn col-md-2" type="submit" value="Save & Continue" style=" background-color: darkorange; color: white">
        </div>
    </div>
</form>