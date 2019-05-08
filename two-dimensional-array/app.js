const board = [
  ['#', ' ', '#', ' '],
  ['#', ' ', '#', ' '],
  ['#', ' ', ' ', ' '],
  [' ', ' ', '#', '#'],
];


const battleship = (board, row, col) => {
  // Solution code here...
  let colCount = 0;
  let rowCount = 0;

  let output = board.forEach(a => {
    console.log(`col: ${colCount}`);
    colCount++;

    a.map(hit => {
      console.log(`row: ${rowCount}`);
      rowCount++;

      if (hit === '#' && row === rowCount && col === colCount) {
        return 'hit';
      } else {
        return 'miss';
      }
    });
  });

  console.log(output);
};

battleship(board, 5, 6);
