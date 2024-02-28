<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/job-form" method="get">
    <h1>Allowance Declaration</h1>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a1">Types Of Allowance</label>
                <select class="form-select" aria-label="Default select example" id="field-a1" required>
                    <option selected>--Select Type--</option>
                    <option value="1">Housing Allowance</option>
                    <option value="2">Travel Allowance</option>
                    <option value="2">Others</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a2">Allowance Amount</label>
                <input type="number" class="form-control" id="field-a2">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a3">Allowance Frequency</label>
                <select class="form-select" aria-label="Default select example" id="field-a3" required>
                    <option selected>--Select Type--</option>
                    <option value="1">Monthly</option>
                    <option value="2">Annually</option>
                </select>
            </div>
        </div>
    </div>


    <div class="row mb-4">
        <div class="col-6">
            <div class="form-group">
                <label for="field-a4">Start Date<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a4" required>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="field-a5">End Date<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a5" required>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a6">Name Of Approval<span class="text-danger">*</span></label>
                <input type="text" class="form-control" id="field-a6" required>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a7">Date Of Approval<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a7" required>
            </div>
        </div>
        <div class="col-4" style="margin-top: 100px">
            <div class="row">
                <input class="btn btn-secondary col-md-4" type="reset" value="Reset" style="margin: 0 15px">
                <input class="btn col-md-6" type="submit" value="Save & Continue" style=" background-color: darkorange; color: white">
            </div>
        </div>
    </div>
</form>