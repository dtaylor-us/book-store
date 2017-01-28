<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Book Information</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-sm-5">
                        <img id="modalBookImage" class="img-responsive" src="/static/images/full/da-vinci-code.jpg" alt="">
                    </div>
                    <div class="col-sm-7">
                        <h5 id="modalBookTitle">Title - <span class="text-primary h5"><em id="modalBookDate">Date</em></span></h5>
                        <p id="modalBookAuthor">Author</p>
                        <p class="text-warning">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus vel nisl eu elit elementum
                            sodales sit amet at sapien. Integer quis leo ac diam facilisis efficitur id vel justo.
                            Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas cursus ligula urna,
                            non venenatis quam feugiat vel. Aliquam erat volutpat. Ut auctor mauris et pharetra dapibus.
                            Fusce eu nibh augue. </p>
                        <h5 id="modalBookPrice" class="text-primary"></h5>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button id="${book.id}" onclick="addToCart(${book.id})" class="btn btn-info">Add to Cart</button>
            </div>
        </div>
    </div>
</div>