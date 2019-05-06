let pin = '1234';

const validatePin = (pin) => {
  // Solution code here...
  let result = /^\d{4}$/.test(pin);

  console.log(result);
};

validatePin(pin);
