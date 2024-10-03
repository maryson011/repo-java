function reverseArray(arr) {
    // Write your code here
    let newArray = []
    for (let i = arr.length -1; i >=0; i --) {
        console.log(arr[i])
        newArray.push(arr[i])
    }
    return newArray
}

const rray = [1,3,2,4,5]

const rest = reverseArray(rray)
console.log(rest)