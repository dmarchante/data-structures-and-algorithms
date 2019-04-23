const removeOne = (num, arr) => {
  // Solution code here...
  let remainder = num % 3;
  if (remainder === 2){
    arr.pop();
  }
};

const removeElements = (arr, callback) => {
  // Solution code here...
  for (let i = 0; i < arr.length; i++) {
    callback(arr[i], arr);
  }

  return arr;
};

const removeWithForEach = (arr, callback) => {
  // Solution code here...
  arr.forEach(a => callback(a, arr));
  return arr;
};

let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const removeWithAnon = (arr) => {
  // Solution code here...
  arr.forEach((el, i, arr) => {

    let remainder = el % 3;
    if (remainder === 2) {
      arr.splice(i, 1);
    }
  });
  console.log(arr);
  return arr;
};

removeWithAnon(array);