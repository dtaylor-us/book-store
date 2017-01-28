<!-- Modal -->
<div class="modal fade" id="myModalNorm" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <!-- Modal Header -->
            <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="myModalLabel"> Add Customer</h4>
            </div>

            <!-- Modal Body -->
            <div class="modal-body">
                <input type="hidden" id="addCustomerId"/>
                <input type="hidden" id="addCustomerVersion"/>

                    <div class="form-group">
                        <label for="addCustomerName">Full Name</label>
                        <input type="text" class="form-control" id="addCustomerName" placeholder="Enter Full Name"/>
                    </div>

                    <div class="form-group">
                        <label for="addCustomerAddress">Address</label>
                        <input type="text" class="form-control" id="addCustomerAddress" placeholder="Enter Address"/>
                    </div>


                    <div class="form-group">
                        <label for="addCustomerPhoneNumber">Phone Number</label>
                        <input path="phoneNumber" type="text" class="form-control" id="addCustomerPhoneNumber" placeholder="Enter PhoneNumber"/>
                    </div>

                    <div class="form-group">
                        <label for="addCustomerEmail">Email</label>
                        <input path="email" type="email" class="form-control" id="addCustomerEmail" placeholder="Enter Email"/>
                    </div>

                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="1"/> Subscribed to Newsletter
                        </label>
                    </div>



            </div>

            <!-- Modal Footer -->
            <div class="modal-footer">
                <button type="button" onclick="addCustomer()" class="btn btn-primary">Submit</button>
                <button type="button" class="btn btn-default" data-dismiss="modal"> Close</button>
            </div>
        </div>
    </div>
</div>
