<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/customer_navbar.jsp" %>

<!-- Page Content -->
<div class="container spacer-50">

    <!-- Jumbotron Header -->
    <header class="jumbotron jumbotron-img text-center">
        <h1>Welcome To Book-<span class="text-light-blue"><strong>EZ</strong></span></h1>
        <p class="text-white">Find the right book, <span class="text-primary"><strong>  at the right price.</strong></span></p>
        </p>
        <a href="/customer/pages/1" class="btn btn-wide btn-warning spacer-25"><strong class="h5">View <i class="fa fa-fw fa-book"></i> Book List</strong></a>
    </header>

    <%--FEATURED PRODUCT--%>
    <%@ include file="../customer/includes/book-featured.jsp" %>
    <!-- /.row -->


    <%@ include file="../includes/footer.jsp" %>
