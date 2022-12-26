const returnHtmlTableData = (tableId) => {
  var tableToReturn = [];
  $("#" + tableId + " tr").each(function () {
    // Getting Table heads if any
    var tHeads = $(this).find("th");
    var tHeadsToReturn = [];
    tHeads.each(function (tHeadIndex, tHead) {
      tHeadsToReturn.push($(tHead).text());
    });

    // Getting tds if any
    var tds = $(this).find("td");
    var tdsToReturn = [];
    tds.each(function (tdIndex, td) {
      tdsToReturn.push($(td).text());
    });

    if (tHeadsToReturn.length > 0) {
      tableToReturn.push(tHeadsToReturn);
    }

    if (tdsToReturn.length > 0) {
      tableToReturn.push(tdsToReturn);
    }
  });

  return tableToReturn;
};

async function toDataURL(url, callback) {
  var xhr = new XMLHttpRequest();
  xhr.onload = function () {
    var reader = new FileReader();
    reader.onloadend = async function () {
      await callback(reader.result);
    };
    reader.readAsDataURL(xhr.response);
  };
  xhr.open("GET", url);
  xhr.responseType = "blob";
  xhr.send();
}
