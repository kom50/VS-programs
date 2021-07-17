/* Modules Demo  */
//function
function sayHello(name){
    console.log("Hello ",name);
}

// Variable
const PI  =  3.1415;

// Object
class Person{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    show(){
        // String templates
        console.log(`Name : ${this.name}, age : ${this.age}`) ;
    }
}


export default Person;      // Exporting default modules
export {PI, sayHello};      // Exporting named modules