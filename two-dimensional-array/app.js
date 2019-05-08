let excelString = '1,1,1\n4,4,4\n9,9,9';


const excel = (str) => {
  // Solution code here...
  let output = str.split('\n');

  // let temp = '';

  let outputNew = output.map(a => Array.from(a.split(','))).map(a => a.reduce((a, b) => (parseInt(a) + parseInt(b))));

  console.log(outputNew);
};

excel(excelString);
