function identifyPrime(n) {
    let c=0;
    for(i=1;i<=n;i++){
        if(n%i===0){
        c++;
    }
    }if (c>2){
    console.log("No")
    }else{
    console.log("Yes")
    }
}
