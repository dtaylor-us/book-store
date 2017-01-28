<div class="row">

    <!-- Title -->
    <div class="row spacer-">
        <div class="col-sm-4">

        </div>

    </div>
    <div id="custOrderCont" class="collapse">
        <table class="table bg-default table-striped spacer-25 round-corner-10 table-hover ">
            <thead>
            <tr>
                <th class="">Order Date</th>
                <th class="">Order Status</th>
                <th class="">Ship Date</th>
                <th class="">Total Price</th>
                <th class="">Products</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="customer" items="${bookOrderList}">
                <tr>
                    <td class="text-primary">${customer.orderDate}</td>
                    <td class="text-grey-867A6E">${customer.orderStatus}</td>
                    <td class="text-primary">${customer.shipDate}</td>
                    <td class="text-grey-867A6E">$${customer.totalPrice}</td>
                    <td>
                        <c:forEach var="book" items="${customer.books}">
                            <li class="text-primary">${book.title}</li>
                        </c:forEach>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>
<!-- /.row -->