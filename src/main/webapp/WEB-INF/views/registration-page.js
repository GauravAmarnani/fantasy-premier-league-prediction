var regexName = /^[a-zA-Z]+$/;
var isValidFirstName = false;
var isValidLastName = false;
var regexEmail = Zx;
var isValidEmail = false;
var regexMobile = /^[0-9]+$/;
var isValidMobile = false;
var isValidCreatePassword = false;
var isValidConfirmPassword = false;

function onLoad() {
var firstNameWarning = document.getElementById("firstNameWarning");
var lastNameWarning = document.getElementById("lastNameWarning");
var emailWarning = document.getElementById("emailWarning");
var mobileWarning = document.getElementById("mobileWarning");
var createWarning = document.getElementById("createWarning");
var confirmWarning = document.getElementById("confirmWarning");
}

function onSubmitClick() {

    //First Name Validation
    var firstName = document.getElementById("firstName").value;
    if (!regexName.test(firstName) && firstName != "") {
        firstNameWarning.classList.remove("warning-hide");
        firstNameWarning.setAttribute('title', 'Only alphabets are allowed');
        isValidFirstName = false;
    } else if (regexName.test(firstName)) {
        firstNameWarning.classList.add("warning-hide")
        isValidFirstName = true;
    } else if (firstName == "") {
        firstNameWarning.classList.remove("warning-hide");
        firstNameWarning.setAttribute('title', 'First name is required');
        isValidFirstName = false;
    }

    //Last Name Validation
    var lastName = document.getElementById("lastName").value;
    if (!regexName.test(lastName) && lastName != "") {
        lastNameWarning.classList.remove("warning-hide");
        lastNameWarning.setAttribute('title', 'Only alphabets are allowed');
        isValidLastName = false;
    } else if (regexName.test(lastName)) {
        lastNameWarning.classList.add("warning-hide")
        isValidLastName = true;
    } else if (firstName == "") {
        lastNameWarning.classList.remove("warning-hide");
        lastNameWarning.setAttribute('title', 'Last Name is required');
        isValidLastName = false;
    }


    //Email Validation
    var email = document.getElementById("email").value;
    if (!regexEmail.test(email) && email != "") {
        emailWarning.classList.remove("warning-hide");
        emailWarning.setAttribute('title', 'Invalid email Address');
        isValidEmail = false;
    } else if (regexEmail.test(email)) {
        emailWarning.classList.add("warning-hide");
        isValidEmail = true;
    } else if (email == "") {
        emailWarning.classList.remove("warning-hide");
        emailWarning.setAttribute('title', 'Email is required');
        isValidEmail = false;
    }

    //Mobile Validation
    var mobile = document.getElementById("mobile").value;
    if (!regexMobile.test(mobile) && mobile.length < 10) {
        mobileWarning.classList.remove("warning-hide");
        mobileWarning.setAttribute('title', 'Invalid Mobile Number');
        isValidMobile = false;

    } else if (regexMobile.test(mobile) && mobile.length == 10) {
        mobileWarning.classList.add("warning-hide");
        isValidMobile = true;

    } else if (mobile.length == 0) {
        mobileWarning.classList.remove("warning-hide");
        mobileWarning.setAttribute('title', 'Mobile Number is required');
        isValidMobile = false;

    }


    //CREATE PASSWORD
    var createPassword = document.getElementById("createPassword").value;
    if (createPassword == "") {
        createWarning.classList.remove("warning-hide");
        createWarning.setAttribute('title', 'Password cannot be empty');
        isValidCreatePassword = false;
    } else if (createPassword.length < 8) {
        createWarning.classList.remove("warning-hide");
        createWarning.setAttribute('title', 'Length of password must be greater than 7 characters');
        isValidCreatePassword = false;
    } else {
        createWarning.classList.add("warning-hide");
        isValidCreatePassword = true;
    }

    //Confirm Password Validation
    var confirmPassword = document.getElementById("confirmPassword").value;
    if (confirmPassword != createPassword) {
        confirmWarning.classList.remove("warning-hide");
        confirmWarning.setAttribute('title', 'Password not matched');
        isValidConfirmPassword = false;
    } else {
        confirmWarning.classList.add("warning-hide");
        isValidConfirmPassword = true;
    }


    //ON SUCCESSFUL SUBMISSION
    if (isValidFirstName && isValidLastName && isValidEmail && isValidMobile && isValidCreatePassword && isValidConfirmPassword) {
        alert("Success!");
        document.getElementById("signup").reset();
    }
}

function onCancelClick() {
	alert("Cancel Clicked");
    firstNameWarning.classList.add("warning-hide");
    lastNameWarning.classList.add("warning-hide");
    emailWarning.classList.add("warning-hide");
    mobileWarning.classList.add("warning-hide");
    createWarning.classList.add("warning-hide");
    confirmWarning.classList.add("warning-hide");
}
