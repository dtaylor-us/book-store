<div class="row spacer-50">
    <div class="panel">
        <div class="panel-heading">
            <div class="row">
                <div class="col-sm-12 text-left  text-white">
                    <div class="col-sm-5">
                        <div>
                            <h3>Customer <span class="text-primary"><strong>Manager</strong></span></h3>
                        </div>
                    </div>
                    <div class="col-sm-7">
                        <button class="btn btn-info spacer-20 pull-right"
                                data-toggle="modal" data-target="#myModalNorm">
                            <span class=""><i class="fa fa-fw fa-plus-circle"></i> Add Customer</span>
                        </button>
                    </div>

                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <table id="orderTable"
                           class="table bg-default table-striped spacer-25 round-corner-10 table-hover ">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>User</th>
                            <th>Email</th>
                            <th>Phone Number</th>
                            <th>Address</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="customer" items="${customerList}">
                            <tr>
                                <td>${customer.name}</td>
                                <td>${customer.userName}</td>
                                <td>${customer.email}</td>
                                <td>${customer.phoneNumber}</td>
                                <td>${customer.address}</td>
                                <td>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <button data-toggle="modal" data-target="#myModalNorm" id="${customer.id}" onclick="editCustomer(${customer.id})"
                                                    class="pull-left btn btn-full btn-info"><i
                                                    class="fa fa-fw fa-pencil"></i></button>
                                        </div>
                                        <div class="col-sm-6">
                                            <button id="${customer.id}" onclick="deleteCustomer(${customer.id})"
                                                    class="pull-left btn btn-full btn-danger"><i
                                                    class="fa fa-fw fa-trash"></i></button>
                                        </div>
                                    </div>


                                </td>

                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>
        <a href="/admin/customers/">
            <div class="panel-footer text-white spacer-10">
                <div class="spacer-left-10">


                    <div class="clearfix"></div>
                </div>
            </div>
        </a>
    </div>
</div>