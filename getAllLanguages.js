const languages = require("./lanList.json");
const fs = require("fs");
const { translate } = require("./writeTranslations");

let execute = async () => {
  let num = 0;
  let lans = [];
  for (const language of languages) {
    for (const setLan of languages) {
      if (language.code == "en") {
        language[setLan.code] = setLan.lang;
      } else {
        response = await translate("en", language.code, setLan.lang);
        console.log(num + ": ", setLan.code, language.code, response);
        language[setLan.code] = response;
      }
      num++;
    }
  }
  fs.writeFile("lanListNew.json", JSON.stringify(languages, null, 2), (err) => {
    if (err) {
      console.error("Error writing to file:", err);
    } else {
      console.log("Response successfully written to 'response.json'");
    }
  });
};
execute();
