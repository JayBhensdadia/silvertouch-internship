<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form class="px-3 h-100" action="/previousEmployment-form" method="get">
    <h1>Salary</h1>

    <div class="row mb-6">
        <div class="col-4">
            <div class="form-group">
                <label for="field-a1">Basic Salary</label>
                <input type="number" class="form-control" id="field-a1">
            </div>
        </div>
                <div class="col-4">
                    <label>Allowances</label><br>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                        <label class="form-check-label" for="inlineCheckbox1">Housing</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                        <label class="form-check-label" for="inlineCheckbox2">Transport</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="option3">
                        <label class="form-check-label" for="inlineCheckbox2">Special</label>
                    </div>
                </div>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a3">Bonus Amount</label>
                <input type="number" class="form-control" id="field-a3">
            </div>
        </div>
        <%--        </div>--%>
        <div class="col-4">
            <div class="form-group">
                <label for="field-a5">Net Salary</label>
                <input type="number" class="form-control" id="field-a5">
            </div>
        </div>
    </div>


    <div class="row mb-6">
        <div class="col-4">
        </div>
        <div class="col-4">
        </div>
        <div class="col-4">
            <div class="row" style="margin-top: 20px">
                <input class="btn btn-secondary col-md-4" type="reset" value="Reset" style="margin: 0 15px">
                <input class="btn col-md-6" type="submit" value="Save & Continue" style=" background-color: darkorange; color: white">
            </div>
        </div>
    </div>
            <div class="col-6">
                <label>Benefits</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="ainlineCheckbox1" value="option1">
                    <label class="form-check-label" for="ainlineCheckbox1">Health Insurance</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="ainlineCheckbox2" value="option2">
                    <label class="form-check-label" for="ainlineCheckbox2">Retirement Benefits</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="ainlineCheckbox3" value="option3">
                    <label class="form-check-label" for="ainlineCheckbox2">Other</label>
                </div>
            </div>

</form>