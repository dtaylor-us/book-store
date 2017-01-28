<!-- Title -->
<div class="row neg-spacer-25">
    <div class="col-lg-12">
        <h3>New <span class="text-primary"><strong>Arrivals</strong></span></h3>
    </div>
</div>
<%--Featured PRODUCT--%>
<div class="row">
    <div class="spacer-20-border"></div>
    <c:forEach var="book" begin="1" end="4" items="${bookList}">
        <div class="col-sm-3">

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
