let tags = ['<h1>Hello, world!</h1>', '<p>Welcome to my site</p>'];

const findTagNames = (elements) => {
  // Solution code here...
  let result = elements.map(el => {
    const re = /<([^\s>]+)(\s|>)+/;
    const tag = el.match(re)[1];
    const closingTag = `/${tag}`;
    return closingTag;
  });

  console.log(result);
};

findTagNames(tags);
