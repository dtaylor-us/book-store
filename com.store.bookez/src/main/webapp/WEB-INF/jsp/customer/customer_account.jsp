<%@ include file="../includes/header.jsp" %>
<%@ include file="includes/customer_navbar.jsp" %>

<!-- Page Content -->
<div class="container spacer-50">
    <div class="row">
        <!-- Side Bar -->
        <div class="col-sm-2">
            <%@ include file="includes/customer_sidebar.jsp" %>
        </div>
        <%--Main Content--%>
        <div class="col-sm-offset-1 col-sm-9">
            <%--CUSTOMER ACCOUNT INFO--%>
            <%@ include file="../customer/includes/account-info.jsp" %>

            <!-- ORDER HISTORY -->
            <%@ include file="../customer/includes/account_history.jsp" %>
            <!-- Title -->
            <div class="row">
                <div class="col-lg-12">
                    <h3>New <span class="text-primary"><strong>Arrivals</strong></span></h3>
                </div>
            </div>
            <%--FEATURED PRODUCT--%>
            <div class="row">
                <div class="spacer-20-border"></div>
                <c:forEach var="book" begin="1" end="6" items="${bookList}">
                    <div class=" col-sm-4">

                        <div class="thumbnail ft-thumb">
                            <img class="round-corner-3" src="${book.imageURL}" alt="${book.title}">
                            <div class="caption">
                                <h5 class="bookTitle">${book.title}</h5>
                                <div class="row">
                                    <div class="col-sm-4">
                                        <em class="text-success h6"><strong>$${book.price}</strong></em>
                                    </div>
                                    <div class="col-sm-8 center-block">
                                        <div class="bookRating">
                                            <c:forEach begin="1" end="${book.rating}">
                                                <i class="fa fa-star text-warning"></i>
                                            </c:forEach>
                                        </div>

                                    </div>
                                </div>

                                <p>${book.author}</p>
                                <p>
                                    <a href="#" class="btn btn-info">Buy Now!</a>
                                    <button id="${book.id}" onclick="openModal(${book.id})" class="btn btn-default">More
                                        Info
                                    </button>

                                </p>
                            </div>
                        </div>

                    </div>
                </c:forEach>

            </div>
        </div>
    </div>
<%@ include file="../includes/footer.jsp" %>