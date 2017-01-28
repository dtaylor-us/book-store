<%@ include file="includes/header.jsp" %>
<%@ include file="includes/navbar.jsp" %>

<!-- Page Content -->
<div class="container spacer-50">
    <!-- Title -->
    <div class="row spacer-25">
        <div class="col-lg-12">
            <h3>Welcome <span class="text-primary"><strong>Toolbar</strong></span></h3>
        </div>
    </div>
    <!-- /.row -->
    <div class="row spacer-25">
        <div class="col-sm-6">
            <div class="panel">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-Users fa-5x spacer-25 text-white spacer-left-25"></i>

                        </div>
                        <div class="col-xs-9 text-left text-white">
                            <div class="spacer-left-25">
                                <h3>Customers</h3>
                                <p>Get the latest books, check your account or <br> sign up for our newsletter!</p>
                            </div>
                        </div>
                    </div>
                </div>
                <a href="/customer">
                    <div class="panel-footer text-white">
                        <div class="spacer-left-10">
                            <a class="btn btn-primary btn-wide" href="/customer"><span
                                    class="pull-left">Enter Here</span></a>
                                <span class="pull-right"><i
                                        class="fa  fa-2x spacer-5 spacer-right-25  fa-arrow-circle-right"></i></span>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </a>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-6">
                <div class="panel">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-gears fa-5x spacer-25 text-white spacer-left-25"></i>

                            </div>
                            <div class="col-xs-9 text-left text-white">

                                <div class="spacer-left-25">
                                    <h3>Admin</h3>
                                    <p>Manage your Customers, Inventory and Orders. <br> Administrator privileges
                                        required.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <a href="/admin">
                        <div class="panel-footer text-white">
                            <div class="spacer-left-10">
                                <a class="btn btn-primary btn-wide" href="/admin"><span
                                        class="pull-left">Enter Here</span></a>
                                    <span class="pull-right"><i
                                            class="fa fa-2x spacer-5 spacer-right-25 fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>

        </div>
    </div>

    <%@ include file="includes/footer.jsp" %>


