<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html> 
<html>
<head>
<title>�Խ��� ���</title>
</head>
<form action = "regist" method = "get">
<body>
<table border="1" width="880">
        <tr>
        <td width="77">
            <p align="center">�۹�ȣ</p>
        </td>
        <td width="327">
            <p align="center">����</p>
        </td>
        <td width="197">
            <p align="center">�ۼ���</p>
        </td>
        <td width="155">
            <p align="center">�ۼ���</p>
        </td>
        <td width="90">
            <p align="center">��ȸ��</p>
        </td>
        </tr>
       
        <c:forEach items="${list}" var="boardVO">
	<tr>
        <td>${boardVO.bno}</td>
        <td><a href='/read?bno=${boardVO.bno}'>${boardVO.title}</a></td>
        <td>${boardVO.writer}</td>
        <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
				value="${boardVO.regdate}" /></td>
        <td><span class="badge bg-red">${boardVO.viewcnt}</span></td>
	</tr>
		</c:forEach>
    </table>
     <button type ="submit">�۾���</button>
   </body>
    </form>
</html>