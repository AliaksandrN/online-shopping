$(function() {
	// solving the active menu problem
	switch (menu2) {
	case 'About us': //like in controller 
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;

	}
});