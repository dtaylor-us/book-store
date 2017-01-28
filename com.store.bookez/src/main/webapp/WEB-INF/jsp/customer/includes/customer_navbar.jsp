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
                    <a href="/customer/" title=""> <i class="fa fa-navitem fa-lg fa-home"></i> Home </a>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" title=""><i
                            class="fa fa-lg fa-dashboard fa-navitem"></i> My Account <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="/customer/account/"> Account Settings</a>
                        </li>
                        <li>
                            <a href="/customer/account/"> Order History</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="/customer/pages/1" title=""><i class="fa fa-navitem fa-lg fa-book"></i> Books </a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" title=""><span
                            class="text-success">${userName}</span> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="/logout"> Log-Out</a>
                        </li>

                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-shopping-cart"></i> <span id="cartTotal"
                                                                                class="badge">${cartTotal}</span> </a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

