function formSubmit() {
    const name = document.getElementById("name").value;
    const rollno =   document.getElementById("rollno").value;
    const data  = JSON.stringify({
        name : name,
        rollno : rollno
    })
    const options = {
        body :  data,
        method : "post",
        headers : {
            "content-type" : "application/json"
        }
    }

    fetch("/save"
        , options).then(respo=>respo.json())
    .then(data=>console.log(data));

    const o ={
        name : name1,
        name32 : name2
    }

   
}

