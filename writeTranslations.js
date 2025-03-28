const axios = require("axios");
const fs = require("fs");
const res = require("./response.json");
const languages = require("./languages.json");

let result = "";
translate = async (source, language, sentence) => {
  const axios = require("axios");
  let data = JSON.stringify({
    q: sentence,
    source: source,
    target: language,
    format: "text",
  });

  let config = {
    method: "post",
    maxBodyLength: Infinity,
    url: "https://translation.googleapis.com/language/translate/v2?key=AIzaSyBJYMEe4qwgZUbZAbVvTUCKexxfjoGxURA",
    headers: {
      "Content-Type": "application/json",
    },
    data: data,
  };

  await axios
    .request(config)
    .then((response) => {
      // console.log(
      //   JSON.stringify(response.data.data.translations[0].translatedText)
      // );
      return (result = response.data.data.translations[0].translatedText);
    })
    .catch((error) => {
      console.log(error);
    });
  return result;
};

module.exports = { translate };
