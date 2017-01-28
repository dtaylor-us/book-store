<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/admin_navbar.jsp" %>


<!-- Page Content -->
<div class="container spacer-50">
    <div class="row">
        <!-- Side Bar -->
        <div class="col-sm-2">
            <%@ include file="../customer/includes/customer_sidebar.jsp" %>
        </div>
        <%--Main Content--%>
        <div class="col-sm-10">
            <div class="row spacer-25">
                <!-- Title -->
                <div class="col-sm-3">
                    <h3>Book <span class="text-primary"><strong>Manager</strong></span></h3>
                </div>
                <c:forEach var="book" items="${bookInventory}">
                <ul>
                    <li>${book.title}</li>
                </ul>
                </c:forEach>
            </div>

        </div>

    </div>


    <%@ include file="../includes/footer.jsp" %>
