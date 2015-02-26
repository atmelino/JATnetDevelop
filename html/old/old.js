	function timedCount() {

		if (document.getElementById('cbLive').checked)
			ex13.datetimepicker('setDate', (new Date()));

		if (!document.getElementById('cbStop').checked) {
			myDate = ex13.datetimepicker('getDate');
			//printlnMessage('messages', myDate);
			myUTC = myDate.getTime();
			printlnMessage('messages', myUTC);

			//myDate.setTime(myUTC);
			myDate.setTime(myUTC + timeFactor * 1000);

			//myDate.setDate(myDate.getSeconds() + timeFactor);
			ex13.datetimepicker('setDate', myDate);
		}

		t = setTimeout(function() {
			timedCount()
		}, 1000);
	}

	
	function doTimer() {
		if (!timer_is_on) {
			timer_is_on = 1;
			timedCount();
		}
	}

	function stopCount() {
		clearTimeout(t);
		timer_is_on = 0;
	}

	//$("#datepicker").datepicker();
	//$("#datepicker").datepicker({
	//showButtonPanel : true,
	//});

	//$("#datepicker").datepicker("setDate", new Date());

