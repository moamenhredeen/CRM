
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="common/header.jsp" %>

<div class="container row mt-3 mx-auto w-50">
<form:form class="row justify-content-center" 
	action="create" 
	modelAttribute="customer" 
	method="POST"> 
		
		<form:hidden path="id"/>
	
		<form:input path="firstName" 
			class="form-control form-control-lg m-2" 
			type="text" 
			placeholder="First Name"/>
		
		<form:input path="lastName" 
			class="form-control form-control-lg m-2" 
			type="text" 
			placeholder="Last Name" />
		
		<form:input path="email" 
			class="form-control form-control-lg m-2" 
			type="text" 
			placeholder="Email" />
		
		<input class="btn btn-lg btn-primary w-50 m-2" type="submit" value="submit" />
	</form:form>
</div>

<%@include file="common/footer.jsp" %>