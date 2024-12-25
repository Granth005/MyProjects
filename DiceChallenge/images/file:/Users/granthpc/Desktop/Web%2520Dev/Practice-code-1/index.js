$("#head").css("color", "blue");

document.querySelector("header").classList.add("sticky");

document.querySelector("#button-val").classList.add("btn-1");

document.querySelector("#txt-box").classList.add("adv-txt-box");


$("button-val").click(function () {
    var textInput = $("#txt-box").val();

});

document.getElementById("txt-box").addEventListener("keyup", function (event) {
    if (event.key === 13) {
        document.getElementById("button-val").click();
    }
});


var numberOfButtons = document.querySelectorAll(".drum").length;

for (var i = 0; i < numberOfButtons; i++) {

    document.querySelectorAll(".drum")[i].addEventListener('click', function () {
        var buttonInnerHTML = this.innerHTML;

        makeSound(buttonInnerHTML);
        buttonAnimation(buttonInnerHTML);


    });
}

document.addEventListener("keypress", function(event) {
    makeSound(event.key);
    buttonAnimation(event.key);
});



function makeSound(key) {
    switch (key) {
        case "q":
            var so1 = new Audio("sounds/tom-1.mp3");
            so1.play();
            break;

        case "w":
            var so2 = new Audio("sounds/tom-2.mp3");
            so2.play();
            break;

        case "e":
            var so3 = new Audio("sounds/tom-3.mp3");
            so3.play();
            break;


        case "r":
            var so4 = new Audio("sounds/snare.mp3");
            so4.play();
            break;


        case "t":
            var so5 = new Audio("sounds/crash.mp3");
            so5.play();
            break;


        case "y":
            var so6 = new Audio("sounds/tom-4.mp3");
            so6.play();
            break;


        case "u":
            var so7 = new Audio("sounds/kick-bass.mp3");
            so7.play();
            break;


        case "i":
            var so8 = new Audio("sounds/tom-1.mp3");
            so8.play();
            break;


        case "d":
            var so9 = new Audio("sounds/tom-2.mp3");
            so9.play();
            break;


        case "s":
            var so10 = new Audio("sounds/tom-3.mp3");
            so10.play();
            break;

        default:console.log(key);
          
    }
}

function buttonAnimation(currentKey) {
    var activeButton = document.querySelector("." + currentKey);
    activeButton.classList.add(".clicked");

    setTimeout(function() {
        activeButton.classList.remove(".clicked");
    }, 100);
}


