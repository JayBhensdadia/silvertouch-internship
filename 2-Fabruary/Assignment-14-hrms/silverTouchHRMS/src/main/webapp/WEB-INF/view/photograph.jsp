<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/photographs/addPhoto" method="post">

    <h1>
        Photographs
    </h1>

    <div class="row mb-4">
        <div class="col-12">
            <label for="test1">Employee Photo<span class="text-danger">*</span></label><br>
            <div id="test1">
                <div id="img-container1" class="bg-white" >
                    <p>No Image</p>
                </div>
                <div class="file-input-wrapper bg-white" style="margin-left: 3%">
                    <input type="file" id="emp-pic" name="employeePhotoImageUrl">
                    <label for="emp-pic" class="btn-browse">Browse</label>
                </div>
                <button type="button" class="btn btn-outline-warning"
                        style="height: 50px; margin-left: 3%">Upload</button>

            </div>

            <p><small class="form-text text-muted">(Only JPG/JPEG/PNG files are allowed,<br>
                Minimum dimension width 200px and height 100px,<br>
                Maximum file size 500 KB)</small></p>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-12">
            <label for="test" class="d-flex flex-row ">Employee Sign<span class="text-danger">*</span></label><br>
            <div id="test">
                <div id="img-container" class="bg-white" >
                    <p>No Image</p>
                </div>
                <div class="file-input-wrapper bg-white" style="margin-left: 3%">
                    <input type="file" id="emp-sign" name="employeeSignImageUrl">
                    <label for="emp-sign" class="btn-browse">Browse</label>
                </div>
                <button type="button" class="btn btn-outline-warning"
                        style="height: 50px; margin-left: 3%">Upload</button>
            </div>

            <p><small class="form-text text-muted">(Only JPG/JPEG/PNG files are allowed,<br>
                Minimum dimension width 200px and height 100px,<br>
                Maximum file size 500 KB)</small>
            </p>
        </div>
    </div>
    <div class="row">
        <div class="col-12 d-flex justify-content-end">
            <input class="btn btn-secondary col-md-1 me-2" type="reset" value="Reset">
            <input class="btn col-md-2" type="submit" value="Continue" style=" background-color: darkorange; color: white">
        </div>
    </div>
</form>

