const string = 'Gregor want a ride to Georgia';

const extractVowels = (str) => {
  const noPunctuation = str => str.match(/[a-zA-Z0-9]*\w\s/g);

  let stringArray = [];
  let consonant = str.replace(/[aeiou]/ig,'').split('').join('');
  let vowel = str.replace(/[b-df-hj-np-tv-xz]/ig,'').split('').sort().join('').replace(/\s/g, '');

  stringArray.push(consonant, vowel);

  console.log(stringArray);
};

extractVowels(string);
