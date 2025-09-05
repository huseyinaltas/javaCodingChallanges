const translations = require("./translations.json");
const fs = require("fs");
const { translate } = require("./writeTranslations");

let execute = async () => {
  for (const langObj of translations) {
    let original =
      "You have been reported ${reportedCount} times for breaking rules.";
    if (langObj.code !== "en") {
      original = await translate("en", langObj.code, original);
    }
    if (!langObj.translations) {
      langObj.translations = {};
    }
    console.log(
      `Adding type message translation for ${langObj.lang}: ${original}`
    );
    langObj.translations.reportedTimes = original;
  }
  fs.writeFile(
    "translations.json",
    JSON.stringify(translations, null, 2),
    (err) => {
      if (err) {
        console.error("Error writing to file:", err);
      } else {
        console.log(
          "changeusername translations successfully added to 'translations.json'"
        );
      }
    }
  );
};
execute();
