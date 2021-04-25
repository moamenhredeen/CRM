<%@include file="common/header.jsp" %>

		
	<div class="container">

	
		<main class="container w-75">
			
				<table class="table table-striped">
					
					<!-- Table Header  -->
					<tr class="border">
						<th> First Name </th>
						<th> Last Name </th>
						<th> Email </th>
						<th> Actions </th>
					</tr>		
					
					<!--  Table rows  -->
					<c:forEach var="customer" items="${customers}">
						
						
						<tr> 
							<td> ${customer.firstName} </td>
							<td> ${customer.lastName} </td>
							<td> ${customer.email} </td>
							<td> 
								<!-- methode 1 : create the url manell -->
								<a href="update?customerId=${customer.id }" class="btn btn-primary mx-2">Update</a> 
								<!-- methode 2 : create the link with the help of c:url  -->
								<c:url var="deleteUrl" value="/customer/delete">
									<c:param  name="customerId" value="${customer.id }"/>
								</c:url>							
								<a href="${deleteUrl }" class="btn btn-danger">Delete</a>
							</td>
						</tr>
					</c:forEach>
							
				</table>
		</main>
		
		<footer id="footer"></footer>
	</div>

<%@include file="common/footer.jsp" %>