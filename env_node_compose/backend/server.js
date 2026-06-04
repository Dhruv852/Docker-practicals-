const express = require("express");

const app = express();

const PORT = process.env.PORT || 5010;
app.get("/", (req, res) => {
    res.send(`DB_HOST : ${process.env.DB_HOST}`)
})

app.listen(PORT, () => {
    console.log(`The ${PORT}`)
})