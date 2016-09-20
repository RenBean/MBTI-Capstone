/**
 * Created by Ari on 9/17/16.
 */
var e, i, s, n, t, f, p, j;
e=0; i=0; s=0; n=0; t=0; f=0; p=0; j=0;

function doFirst() {
    var button = document.getElementById("button");
    var str;
    doEorI();
    if (e>i){
        window.alert(str += "E");
    } else if (i>e){
        window.alert(str += "I");
    }
}
function doEorI() {
    //q1
    if (document.getElementById('r1').checked){
        e++;
    }
    if (document.getElementById('r2').checked) {
        i++;
    }
    //q2
    if (document.getElementById('r3').checked) {
        e++;
    }
    if (document.getElementById('r4').checked) {
        i++;
    }
    //q3
    if (document.getElementById('r5').checked) {
        e++;
    }
    if (document.getElementById('r6').checked) {
        i++;
    }
    //q4
    if (document.getElementById('r7').checked) {
        i++;
    }
    if (document.getElementById('r8').checked) {
        e++;
    }
    //q5
    if (document.getElementById('r9').checked) {
        i++;
    }
    if (document.getElementById('r10').checked) {
        e++;
    }
}



window.addEventListener("load", doFirst, false);