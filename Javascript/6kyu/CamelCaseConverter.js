const toCamelCase = (sentence) => {
  let toCamelCase = "";
  let capitalizeNext = false;

  for (i = 0; i < sentence.length; i++) {
    const char = sentence[i];

    if (char == "-" || char == "_") {
    capitalizeNext = true;
    }else{
        toCamelCase += capitalizeNext ? char.toUpperCase(): char;
        capitalizeNext = false;
    }
  }

  return toCamelCase;
};

console.log(toCamelCase("what-is-going-on-here"));
