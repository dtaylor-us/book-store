<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/admin_navbar.jsp" %>

<!-- Page Content -->
<div class="container spacer-50">

    <!-- Title -->
    <div class="row spacer-25">
        <div class="col-lg-12">
            <h3>Admin <span class="text-primary"><strong>Toolbar</strong></span></h3>
        </div>
    </div>
    <!-- /.row -->

    <!-- Page Features -->
    <div class="row spacer-25">

        <div class="row">
            <div class="col-sm-4">
                <div class="panel">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-users fa-5x spacer-25 spacer-left-25 text-white"></i>

                            </div>
                            <div class="col-xs-9 text-right  text-white">

                                <div class="spacer-right-25">
                                    <h3>Customers</h3>
                                    <p>Manage Customers</p>
                                    <br>
                                </div>
                            </div>
                        </div>
                    </div>
                    <a href="/admin/customers/">
                        <div class="panel-footer text-white">
                            <div class="spacer-left-10">
                                <a class="btn btn-danger pull-left btn-wide" href="/admin/customers">
                                    <span class="">Manage Customers</span>
                                </a>
                                <span class="pull-right">
                                    <i class="fa fa-2x spacer-5 spacer-right-25 fa-arrow-circle-right"></i>
                                </span>

                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>


            <div class="col-sm-4">
                <div class="panel">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-file-text fa-5x spacer-25 spacer-left-25 text-white"></i>

                            </div>
                            <div class="col-xs-9 text-right  text-white">

                                <div class="spacer-right-25">
                                    <h3>Orders</h3>
                                    <p>Manage Orders</p>
                                    <br>
                                </div>
                            </div>
                        </div>
                    </div>
                    <a href="/admin/orders/">
                        <div class="panel-footer text-white">
                            <div class="spacer-left-10">
                                <a class="btn btn-danger pull-left btn-wide" href="/admin/orders/">
                                    <span class="">Manage Order</span>
                                </a>
                                <span class="pull-right">
                                    <i class="fa fa-2x spacer-5 spacer-right-25 fa-arrow-circle-right"></i>
                                </span>

                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>


            <div class="col-sm-4">
                <div class="panel">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-book fa-5x spacer-25 spacer-left-25 text-white"></i>

                            </div>
                            <div class="col-xs-9 text-right  text-white">

                                <div class="spacer-right-25">
                                    <h3>Inventory</h3>
                                    <p>Manage Inventory</p>
                                    <br>
                                </div>
                            </div>
                        </div>
                    </div>
                    <a href="">
                        <div class="panel-footer text-white">
                            <div class="spacer-left-10">
                                <a class="btn btn-danger pull-left btn-wide" href="/admin/books/">
                                    <span class="">Manage Inventory</span>
                                </a>
                                <span class="pull-right">
                                    <i class="fa fa-2x spacer-5 spacer-right-25 fa-arrow-circle-right"></i>
                                </span>

                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>

        </div>
        <!-- /.row -->


        <%@ include file="../includes/footer.jsp" %>
