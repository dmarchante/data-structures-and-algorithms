const string = `Hello, and have a wonderful day!`;

const noPunctuation = str => {
  // Solution code here...
  let arrayNoPunc = [];
  let array = str.split(' ');

  array.forEach(arr => {
    if(!/\W+/.test(arr)) {
      arrayNoPunc.push(`${arr} `);
    }
  });

  console.log(array);
  console.log(arrayNoPunc);
};

noPunctuation(string);
