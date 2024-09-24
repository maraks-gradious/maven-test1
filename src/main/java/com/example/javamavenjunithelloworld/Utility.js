//function to check if the given number is even or odd
var x = 8;
function checker(x)
{
    if(x%2 === 0)
    {
        return "Even";
    }
    return "Odd";
}
console.log(checker(x));