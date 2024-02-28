<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/attachments/addAttach" method="post">
    <h1>
        Attachment
    </h1>
    <div class="row mb-4">
        <div class="col-6 ">
            <div class="form-group">
                <label for="mySelect">Document Category<span class="text-danger">*</span></label><br>
                <select id="mySelect" name="documentCategory" style="width: 100%;">
                    <option value="">--Select Type--</option>
                    <option value="1">Pan Card</option>
                    <option value="2">Residential Proof</option>
                    <option value="3">Document</option>
                    <option value="4">Aadhaar Card</option>
                </select>
            </div>
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="field2">Title of Document<span class="text-danger">*</span></label>
                <input type="text" name="documentTitle" class="form-control" id="field2" required>
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-12">
            <div class="form-group">
                <label for="field3">Document Description</label>
                <textarea class="form-control" name="documentDescription" id="field3" rows="3"></textarea>
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <label for="test">Document<span class="text-danger">*</span></label><br>
        <div id="test">
            <div class="file-input-wrapper bg-white" >
                <input type="file" id="document" name="documentUrl">
                <label for="document" class="btn-browse">Browse</label>
            </div>
            <div id="img-container" class="bg-white" style="margin-left:10px;">
                <p>No Image</p>
            </div>
        </div>

        <p><small class="form-text text-muted">(Only JPG/JPEG/PNG files are allowed,<br>
            Minimum dimension width 200px and height 100px,<br>
            Maximum file size 500 KB)</small>
        </p>
    </div>
    <div class="row">
        <div class="col-12 d-flex justify-content-end">
            <input class="btn btn-secondary col-md-1 me-2" type="reset" value="Reset">
            <input class="btn col-md-2" type="submit" value="Add Record" style=" background-color: darkorange; color: white">
        </div>
    </div>
</form>