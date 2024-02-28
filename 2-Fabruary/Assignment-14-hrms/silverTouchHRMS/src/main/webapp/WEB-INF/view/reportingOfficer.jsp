<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/reportingOfficers/addReporting" method="post">
    <h1>Reporting Officer</h1>

    <div class="row mb-4">
        <div class="col-6">
            <div class="form-group">
                <label for="field-a1">Start Date<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a1" required>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="field-a2">End Date<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a2" required>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a3">DDO (Level-1)</label>
                <input type="text" class="form-control" id="field-a3" placeholder="Find Employee">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a4">DH (Level-2)<span class="text-danger">*</span></label>
                <input type="text" class="form-control" id="field-a4" placeholder="Find Employee" required>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a5">HD (Level-3)<span class="text-danger">*</span></label>
                <input type="text" class="form-control" id="field-a5" placeholder="Find Employee" required>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a6">HOD (Level-4)<span class="text-danger">*</span></label>
                <input type="text" class="form-control" id="field-a6" placeholder="Find Employee" required>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a7">Authorization Date<span class="text-danger">*</span></label>
                <input type="date" class="form-control" id="field-a7" required>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-12">
            <div class="form-group">
                <label for="field-a8">Note</label>
                <textarea class="form-control" id="field-a8"></textarea>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-6">
        </div>
        <div class="col-6">
            <div class="row" style="margin-left: 50px">
                <input class="btn btn-secondary col-md-3" type="reset" value="Reset" style="margin: 0 15px">
                <input class="btn col-md-4" type="submit" value="Add Record" style="background-color: darkorange;color: white">
                <input class="btn col-md-3" type="submit" value="Continue" style="background-color: darkorange ;color: white; margin: 0 15px">
            </div>
        </div>
    </div>
</form>