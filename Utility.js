function anuragh () {
    console.log("I am Prem Anuragh");

    let a = 5;
    let b = 2;
    console.log("(" + a + "+" + b + ")" + "^" + "2" + "=" + solve(a,b));
}

function solve (a,b) {
    let ans = (a*a) + (b*b) + 2*a*b;
    return ans;
}


anuragh();