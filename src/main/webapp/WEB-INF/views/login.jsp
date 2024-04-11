<%@ include file="../common/header.jspf"%>

<div class="container">

	<p>
		<font color="red"> ${loginError}</font>
	</p>
	<form action="/login.do" method="post">
		Enter your username: <input type="text" name="username" /> <br>
		Enter your password: <input type="text" name="password" /> <br> <input
			type="submit" name="submit" value="Submit" /> <br>
		<small> <a href="/resetpassword"><i>Forgot your
					password?</i></a>
		</small>

	</form>

</div>

<%@ include file="../common/footer.jspf"%>
