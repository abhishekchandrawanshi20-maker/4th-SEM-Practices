const arr = [
    "https://share.google/r4gSCRI8sFJSuZYtV",
    "https://share.google/eUQqvAQDIwP7xjVny",
    'https://share.google/wa2oja6gzma5Be2kT'
]
const imageEl = document.querySelector('img');
let num = 0;
setIntervarl(function() {
    imageEl.setAttribute('src',arr[num]);
    num = (num + 1) %arr.length;
},2000);