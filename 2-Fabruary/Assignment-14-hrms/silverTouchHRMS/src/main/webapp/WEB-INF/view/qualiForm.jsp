<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="h-100" action="/qualifications/addQuali" method="get">
    <div class="row mb-4">
        <div class="col">
            <div class="form-group">
                <h1>Education Qualification</h1>
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field1">Qualification<span class="text-danger">*</span></label>
                <select class="form-select" id="field1" aria-label="Default select example">
                    <option selected>--Select Qualification--</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field2">Mode of Study</label>
                <select class="form-select" id="field2" aria-label="Default select example">
                    <option selected>--Select--</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field3">University</label>
                <input type="text" class="form-control" id="field3">
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field4">Passing Month<span class="text-danger">*</span></label>
                <input type="text" class="form-control" id="field4">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field5">Institute/Board</label>
                <input type="text" class="form-control" id="field5">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field6">Passing Year<span class="text-danger">*</span></label>
                <input type="text" class="form-control" id="field6">
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field7">Duration</label>
                <input type="text" class="form-control" id="field7">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field8">Major</label>
                <input type="text" class="form-control" id="field8">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field9">Percentage</label>
                <input type="text" class="form-control" id="field9">
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field7">Grade</label>
                <select class="form-select" id="field10" aria-label="Default select example">
                    <option selected>--Select Grade--</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field8">Percentile</label>
                <input type="text" class="form-control" id="field11">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field9">GPA Score</label>
                <input type="text" class="form-control" id="field12">
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-6">
            <div class="form-group">
                <label for="textarea1">Remark</label>
                <textarea class="form-control" id="textarea1" rows="3"></textarea>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="textarea2">Institute Address</label>
                <textarea class="form-control" id="textarea2" rows="3"></textarea>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-12 d-flex justify-content-end">
            <input class="btn btn-secondary col-md-1 me-2" type="reset" value="Reset">
            <input class="btn col-md-2 me-2" type="submit" value="Add Record" style=" background-color: darkorange; color: white">
            <input class="btn col-md-2" type="submit" value="Back To List Page" style=" background-color: darkorange; color: white">
        </div>
    </div>
</form>
