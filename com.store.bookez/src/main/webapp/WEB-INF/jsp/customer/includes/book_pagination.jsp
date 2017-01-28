<div>
    <ul class="pagination pull-right">
        <c:choose>
            <c:when test="${currentIndex == 1}">
                <li class="disabled"><a href="#">&laquo;&laquo;</a></li>
                <li class="disabled"><a href="#">&laquo;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="${firstUrl}">&laquo;&laquo;</a></li>
                <li><a href="${prevUrl}">&laquo;</a></li>
            </c:otherwise>
        </c:choose>
        <c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
            <c:url var="pageUrl" value="/customer/pages/${i}"/>
            <c:choose>
                <c:when test="${i == currentIndex}">
                    <li class="active"><a href="${pageUrl}"><c:out value="${i}"/></a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="${pageUrl}"><c:out value="${i}"/></a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        <c:choose>
            <c:when test="${currentIndex == totalPages}">
                <li class="disabled"><a href="#">&raquo;</a></li>
                <li class="disabled"><a href="#">&raquo;&raquo;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="${nextUrl}">&raquo;</a></li>
                <li><a href="${lastUrl}">&raquo;&raquo;</a></li>
            </c:otherwise>
        </c:choose>
    </ul>
</div>
