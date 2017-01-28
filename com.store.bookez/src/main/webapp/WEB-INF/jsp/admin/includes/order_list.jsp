<div class="row spacer-50">
    <div class="panel">
        <div class="panel-heading">
            <div class="row">
                <div class="col-sm-12 text-left  text-white">
                    <div class="col-sm-6">
                        <div>
                            <h3>Order <span class="text-primary"><strong>Manager</strong></span></h3>
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <a class="btn btn-primary spacer-20 btn-wide" href="#">
                            <span class="btn-wide">Add Order</span>
                        </a>
                        <a data-toggle="collapse" data-target="#demo"
                           class="btn btn-primary spacer-20 btn-wide pull-right" href="#">
                            <span class="btn-wide">View List</span>
                        </a>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <div id="demo" class="collapse">
                        <table id="orderTable"
                               class="table bg-default table-striped spacer-25 round-corner-10 table-hover ">
                            <thead>
                            <tr>
                                <th>Customer</th>
                                <th>Order Date</th>
                                <th>Status</th>
                                <th>Ship Date</th>
                                <th>Price</th>
                                <th>Books</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="order" items="${orderList}">
                                <tr>
                                    <td>${order.customer.name}</td>
                                    <td>${order.orderDate}</td>
                                    <td>${order.orderStatus}</td>
                                    <td>${order.shipDate}</td>
                                    <td>$${order.totalPrice}</td>
                                    <td>${order.totalBooks}</td>
                                    <td><a href="#" class="pull-left btn btn-full btn-danger"><i class="fa fa-fw fa-pencil"></i> Edit</a></td>

                                        <%--<c:forEach var="book" items="${order.books}">--%>
                                        <%--<li class="text-primary">${book.title}</li>--%>
                                        <%--</c:forEach>--%>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>

            </div>
        </div>
        <a href="/admin/customers/">
            <div class="panel-footer text-white spacer-10">
                <div class="spacer-left-10">


                    <div class="clearfix"></div>
                </div>
            </div>
        </a>
    </div>
</div>