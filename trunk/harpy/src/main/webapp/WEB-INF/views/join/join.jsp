<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<div class="container" ng-app="registModule">
	<div class="row">
		<div class="col-xs-12 col-sm-12 col-md-4 well well-sm">
			<legend>
				<a href="http://devnerd.tistory.com/"><i class="glyphicon glyphicon-globe"></i></a> Register
			</legend>
			<form action="#" method="post" class="form" role="form">
				<div class="row margin-bottom-15">
					<div class="col-xs-6 col-md-6">
						<input class="form-control" name="firstname" placeholder="First Name" type="text" required autofocus />
					</div>
					<div class="col-xs-6 col-md-6">
						<input class="form-control" name="lastname" placeholder="Last Name" type="text" required />
					</div>
				</div>
				<input class="form-control margin-bottom-15" name="userid" placeholder="Your Id" type="text" />
				<input class="form-control margin-bottom-15" name="email" placeholder="Your Email" type="email" />
				<input class="form-control margin-bottom-15" name="password" placeholder="New Password" type="password" />
				<label for="" > Birth Date</label>
				<div class="row margin-bottom-15">
					<div class="col-xs-4 col-md-4">
						<select name="birthyear" class="form-control">
							<option value="year">Year</option>
						</select>
					</div>
					<div class="col-xs-4 col-md-4">
						<select name="birthmonth" class="form-control">
							<option value="month">Month</option>
						</select>
					</div>
					<div class="col-xs-4 col-md-4">
						<select name="birthmonth" class="form-control">
							<option value="day">day</option>
						</select>
					</div>
				</div>
				<label class="radio-inline"> <input type="radio" name="sex" id="inlineCheckbox1" value="0" /> Male </label>
				<label class="radio-inline"> <input type="radio" name="sex" id="inlineCheckbox2" value="1" /> Female </label>
				<br /><br />
				<button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
			</form>
		</div>
	</div>
</div>

<script>

</script>