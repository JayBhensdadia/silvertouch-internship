<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/jobs/addJob" method="post">
    <h1>Job</h1>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a1">Employment Type<span class="text-danger">*</span></label>
                <select class="form-select" aria-label="Default select example" id="field-a1" required>
                    <option selected>--Select Employment Type--</option>
                    <option value="1">Permanent</option>
                    <option value="2">Daily Wages</option>
                    <option value="3">Permanent</option>
                    <option value="4">Temporary</option>
                    <option value="5">Contract Based and Hnorariun</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a2">Employment Category<span class="text-danger">*</span></label>
                <select class="form-select" aria-label="Default select example" id="field-a2" required>
                    <option selected>--Select Employment Type--</option>
                    <option value="1">Danips</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a3">Employment Sub Type<span class="text-danger">*</span></label>
                <select class="form-select" aria-label="Default select example" id="field-a3" required>
                    <option selected>--Select Employment Sub Type--</option>
                    <option value="1">Ad-hoc</option>
                </select>
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a4">Employment Status<span class="text-danger">*</span></label>
                <select class="form-select" aria-label="Default select example" id="field-a4" required>
                    <option selected>--Select Employment Status--</option>
                    <option value="1">Active</option>
                    <option value="2">Inactive</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a5">Notice Period(In Months)</label>
                <input type="text" class="form-control" id="field-a5">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a6">Employee Grade</label>
                <select class="form-select" aria-label="Default select example" id="field-a6">
                    <option selected>--Select Employee Grade--</option>
                    <option value="1">S-5</option>
                    <option value="2">S-4</option>
                    <option value="3">S-3</option>
                    <option value="4">S-2</option>
                    <option value="5">S-1</option>
                </select>
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a7">Probation Duration(In Months)</label>
                <input type="text" class="form-control" id="field-a7">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a8">Probation Start Date</label>
                <input type="date" class="form-control" id="field-a8">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a9">Duties and Responsibility</label>
                <textarea class="form-control" id="field-a9"></textarea>
            </div>
        </div>
    </div>
    <div class="row mb-4" style="border-bottom: 1px solid rgba(0,0,0,0.2); padding-bottom: 20px">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a10">Insurance Start Group</label>
                <select class="form-select" aria-label="Default select example" id="field-a10">
                    <option selected>--Select Group--</option>
                    <option value="1">The Boys</option>
                    <option value="2">The Girls</option>
                    <option value="3">The Kids</option>
                    <option value="4">The Legends</option>
                    <option value="5">The Noobs</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a11">Insurance With Effective From</label>
                <input type="date" class="form-control" id="field-a11">
            </div>
        </div>
    </div>

    <h1>Initial Joining Details</h1>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-b1">Place Of Posting</label>
                <select class="form-select" aria-label="Default select example" id="field-b1">
                    <option selected>--Select Place Of Posting--</option>
                    <option value="1">Silver Touch Technologies</option>
                    <option value="2">TCS</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b2">Branch Name</label>
                <select class="form-select" aria-label="Default select example" id="field-b2">
                    <option selected>Ahmedabad Head Office</option>
                    <option value="Gandhinagar">Gandhinagar Office</option>
                    <option value="Mumbai">Mumbai Office</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b3">Work Location</label>
                <textarea class="form-control" id="field-b3"></textarea>
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-b4">Designation</label>
                <select class="form-select" aria-label="Default select example" id="field-b4">
                    <option selected>--Select Type--</option>
                    <option value="HR">HR</option>
                    <option value="TL">Tech Lead</option>
                    <option value="PM">Project Manager</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b5">Date Of Posting</label>
                <input type="date" class="form-control" id="field-b5">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b6">Group When Posting</label>
                <select class="form-select" aria-label="Default select example" id="field-b6">
                    <option selected>--Select Group When Posting--</option>
                    <option value="1">The Boys</option>
                    <option value="1">The Girls</option>
                    <option value="1">Group A</option>
                </select>
            </div>
        </div>
    </div>
    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-b7">Posting Order Number</label>
                <input type="text" class="form-control" id="field-b7">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b8">Date Of Posting Order</label>
                <input type="date" class="form-control" id="field-b8">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b9">Pay Configuration</label>
                <select class="form-select" aria-label="Default select example" id="field-b9">
                    <option selected>--Select Pay Configuration--</option>
                    <option value="1">Fourth Pay Commission Pay</option>
                    <option value="2">Seventh Pay Commission Pay</option>
                </select>
            </div>
        </div>
    </div>
    <div class="row mb-4"  style="border-bottom: 1px solid rgba(0,0,0,0.2); padding-bottom: 20px">
        <div class="col-2">
            <div class="form-group">
                <label for="field-b10">Scale</label>
                <select class="form-select" aria-label="Default select example" id="field-b10">
                    <option selected>--Select--</option>
                </select>
            </div>
        </div>
        <div class="col-2">
            <div class="form-group">
                <label for="field-b11">Scale Value</label>
                <input type="text" class="form-control" id="field-b11">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b12">Grade Pay</label>
                <select class="form-select" aria-label="Default select example" id="field-b12">
                    <option selected>--Select Grade Pay--</option>
                </select>
            </div>
        </div>
    </div>

    <div class="row mb-4" style="border-bottom: 1px solid rgba(0,0,0,0.2); padding-bottom: 20px">
        <div class="col-4">
            <label style="margin-bottom: 5px">Recruitment Type</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
                <label class="form-check-label" for="inlineRadio1">Internal</label></div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                <label class="form-check-label" for="inlineRadio2">Other</label>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b14">Recruitment Type*</label>
                <select class="form-select" aria-label="Default select example" id="field-b14" required>
                    <option selected>Contingency Recruiting</option>
                </select>
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b15">Shift</label>
                <select class="form-select" aria-label="Default select example" id="field-b15">
                    <option selected>--Select Shift Policy</option>
                    <option value="1">Day</option>
                    <option value="2">Night</option>
                </select>
            </div>
        </div>
    </div>

    <div class="row mb-4">
        <div class="col-4">
            <div class="form-group">
                <label for="field-b16">Weekly Off With Effective From</label>
                <input type="date" class="form-control" id="field-b16">
            </div>
        </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-b17">Weekly Off</label>
                <input type="text" class="form-control" id="field-b17">
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

<script>

</script>




