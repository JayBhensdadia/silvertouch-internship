<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/previousEmployments/addPrevEmp" method="post">
    <h1>Previous Employment</h1>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a1">From Date<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a1" required>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a2">To Date<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a2" required>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a3">Company Name<span class="text-danger">*</span></label>
                <input type="text" class="form-control" id="field-a3" required>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a4">Service Type<span class="text-danger">*</span></label>
                <select class="form-select" aria-label="Default select example" id="field-a4" required>
                    <option selected>--Select Type--</option>
                    <option value="1">Full Time</option>
                    <option value="2">Part Time</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a5">Position</label>
                <input type="text" class="form-control" id="field-a5">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a6">Last CTC</label>
                <input type="text" class="form-control" id="field-a6">
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-6">
            <div class="form-group">
                <label for="field-a7">Responsibilities</label>
                <textarea class="form-control" id="field-a7"></textarea>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="field-a8">Reason For Separation</label>
                <textarea class="form-control" id="field-a8"></textarea>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a9">HR Contact Person</label>
                <input type="text" class="form-control" id="field-a9">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a10">Phone No.</label>
                <input type="text" class="form-control" id="field-a10">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a11">Mobile No.</label>
                <input type="text" class="form-control" id="field-a11">
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-6">
            <div class="form-group">
                <label for="field-a12">Email</label>
                <input type="text" class="form-control" id="field-a12">
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="field-a13">Website URL</label>
                <input type="text" class="form-control" id="field-a13" placeholder="https://www.example.com">
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-6">
            <div class="form-group">
                <label for="field-a14">Address</label>
                <textarea class="form-control" id="field-a14"></textarea>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="field-a15">Remark</label>
                <textarea class="form-control" id="field-a15"></textarea>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-6">
        </div>
        <div class="col-6">
            <div class="row" style="margin-left: 50px">
                <input class="btn btn-secondary col-md-3" type="reset" value="Reset" style="margin: 0 15px">
                <input class="btn col-md-4" type="submit" value="Add Record" style=" background-color: darkorange; color: white">
                <input class="btn col-md-3" type="submit" value="Continue" style=" background-color: darkorange; color: white; margin: 0 15px">
            </div>
        </div>
    </div>
</form>