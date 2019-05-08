let stringArray = ['abcd', 'efgh', 'ijkl', 'mnop']

const characterByIndex = (arr) => {
  // Solution code here...
  let array = [];

  for (let i = 0; i < arr.length; i++) {
      array.push(arr[i].charAt(i));
  }



  console.log(array);
};

characterByIndex(stringArray);
