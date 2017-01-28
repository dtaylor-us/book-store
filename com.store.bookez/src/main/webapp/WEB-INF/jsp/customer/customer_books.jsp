<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/customer_navbar.jsp" %>

<c:url var="firstUrl" value="/customer/pages/1"/>
<c:url var="lastUrl" value="/customer/pages/${totalPages}"/>
<c:url var="prevUrl" value="/customer/pages/${currentIndex - 1}"/>
<c:url var="nextUrl" value="/customer/pages/${currentIndex + 1}"/>


<script src="/static/js/book_ez.js" type="text/javascript"></script>


<!-- Page Content -->
<div class="container spacer-75">
    <div class="row">
        <!-- Side Bar -->
        <div class="col-sm-2">
            <%@ include file="includes/customer_sidebar.jsp" %>
        </div>
        <%--Main Content--%>
        <div class="col-sm-10">
            <div>
                <!-- Title -->
                <div>
                    <h3>Book <span class="text-primary"><strong>List</strong></span></h3>
                </div>

                <!-- BOOK LIST -->
                <%@ include file="../customer/includes/book_list.jsp" %>
            </div>

        </div>

        <!-- Pagination -->
        <div class="col-sm-12">
            <%@ include file="../customer/includes/book_pagination.jsp" %>
        </div>

        <!-- Modal: PRODUCT INFO -->
        <%@ include file="../customer/includes/book_info.jsp" %>


    </div>


    <%@ include file="../includes/footer.jsp" %>
