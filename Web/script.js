function greetUser() {
    let name = document.getElementByID('name').value;
    if (name = "") {
        alert("Please enter your name.");
    } else {
        document.getElementById("message").innerText = "Hello, " + name + "!";
    }
}
