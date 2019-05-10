let array = [
  {name: 'Sweatshirt', price: 45},
  {name: 'Bookmark', price: 2.50},
  {name: 'Tote bag', price: 15}
];

const isSecure = (url) => {
  // Solution code here...
  let test = /^https:\/\/(\w+)/.test(url);

  console.log(test);
};

isSecure('https://www.sdhjflksdjflk.com');
