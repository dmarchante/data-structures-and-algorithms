let array = [1, 2, 3, 4, 'hello', 5, 6, 'yo'];

const evenOdd = (arr) => {
  // Solution code here...
  let arrayMap = [];

  arr.map(a => {
    if (typeof a === 'number') {
      if (a % 2 === 0) {
        arrayMap.push('even');
      } else {
        arrayMap.push('odd');
      }
    } else {
      arrayMap.push('N/A');
    }
  });

  console.log(arrayMap);
};

evenOdd(array);
