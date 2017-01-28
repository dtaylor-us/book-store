<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Book-<span class="text-primary"><strong>EZ</strong></span></a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li>
                    <a href="/admin"><i class="fa fa-home"></i> Home</a>
                </li>
                <li>
                    <a href="/admin/customers/"><i class="fa fa-users"></i> Customers</a>
                </li>
                <li>
                    <a href="/admin/orders"><i class="fa fa-file-text"></i> Orders</a>
                </li>
                <li>
                    <a href="/admin/books"><i class="fa fa-book"></i> Books</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <%--LOGIN LINK--%>


                <li><a href="/logout">Logout <i class="fa fa-lock"></i></a></li>

            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>