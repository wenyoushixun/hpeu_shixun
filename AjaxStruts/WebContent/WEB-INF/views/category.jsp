<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<ul>
	<c:forEach var="category" items="${categories }">
		<li class="goods-category-item" data-id="${category.id }">${category.name }</li>
	</c:forEach>
</ul>