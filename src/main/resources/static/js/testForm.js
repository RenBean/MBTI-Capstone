/**
 * Created by Ari on 9/19/16.
 */
function getRadioVal(form, name) {
    var val;
    // get list of radio buttons with specified name
    var radios = form.elements[name];

    // loop through list of radio buttons
    for (var i=0, len=radios.length; i<len; i++) {
        if ( radios[i].checked ) { // radio checked?
            val = radios[i].value; // if so, hold its value in val
            break; // and break out of for loop
        }
    }
    return val; // return value of checked radio or undefined if none checked
}

function getResults()
{
    var e, i, s, n, t, f, p, j;
    e=0; i=0; s=0; n=0; t=0; f=0; p=0; j=0;

    var foo = document.getElementById("myForm");
    var z;
    var bar = 0;
    //alert(bar);
    for (z = 1; z < 21; z++)
    {
        var x = "q" + z;
        var val = getRadioVal(foo, x);
        //alert(val);
        switch(val) {
            case "E":
                e++;
                break;
            case "I":
                i++;
                break;
            case "S":
                s++;
                break;
            case "N":
                n++;
                break;
            case "T":
                t++;
                break;
            case "F":
                f++;
                break;
            case "P":
                p++;
                break;
            case "J":
                j++;
                break;
            default:
                //alert(x);
                bar++;

        }
    }

    //alert(bar);
    if (bar == 0) {
        var str = "  ";
        if (e>i){
            str += "E";
        } else str += "I";
        if (s>n) {
           str += "S";
        } else str += "N";
        if (t>f) {
            str += "T";
        } else str += "F";
        if (p>j) {
            str += "P  ";
        } else str += "J  ";
        //var end = (e + " | " + i);
        // document.getElementById("test").innerHTML = end;
        document.getElementById("test").innerHTML = str;
    } else {
        alert("One or more questions have have not been answered.");
    }
}
