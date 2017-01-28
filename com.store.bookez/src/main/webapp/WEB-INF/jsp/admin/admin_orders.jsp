<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/admin_navbar.jsp" %>

<script src="../../../static/js/book_ez.js"></script>

    <!-- Page Content -->
    <div class="container spacer-50">
        <div class="row">
            <!-- Side Bar -->
            <div class="col-sm-2">
                <%@ include file="../customer/includes/customer_sidebar.jsp" %>
            </div>
            <%--Main Content--%>
            <div class="col-sm-10">
                <%@ include file="../admin/includes/order_list.jsp" %>
            </div>

        </div>


        <%@ include file="../includes/footer.jsp" %>
