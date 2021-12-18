// Username or password
let i = 1;
alert("Only 3 Chances to login");
for (; i <= 3; i++) {
  let username = prompt("Enter Username");
  let pass = prompt("Enter Password");
  if (username == "admin" && pass == "admin") {
    alert("Welcome user");
    break;
  } else alert("try again you have use " + i + "st chance");
}
if (i === 4) {
  alert("You are rich the limit");
}
