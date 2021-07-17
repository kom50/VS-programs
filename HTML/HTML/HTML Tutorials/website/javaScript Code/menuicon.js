function animatedMenu() {
    let lines = document.querySelectorAll("#icon div[class*='line']");
    let flag = true;
    document.querySelector('#icon').addEventListener('click', event => {
        if (flag) {
            flag = false;
            lines[1].style.display = 'none';
            Object.assign(lines[0].style, {
                'top': '14px',
                'transform': 'rotate(45deg)'
            });
            Object.assign(lines[2].style, {
                'top': '5px',
                'transform': 'rotate(-45deg)'
            });
        } else {
            flag = true;
            lines[1].style.display = 'block';
            Object.assign(lines[0].style, {
                'top': '0px',
                'transform': 'rotate(0deg)'
            });
            Object.assign(lines[2].style, {
                'top': '0px',
                'transform': 'rotate(0deg)'
            });

        }
    });

    window.addEventListener('resize', event => {
        // console.log("window resize - > window.innerWidth ", window.innerWidth," window.outerWidth "+window.outerWidth)
        console.log("animate menu")
        if (window.innerWidth >= 400)
            flag = false;

    });
}