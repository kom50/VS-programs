// importing modules
import Person from './modules.js'; // importing default module

import {PI, sayHello} from "./modules.js"; // importing named modules

import * as device from "./modules.js"; // importing all modules

device.sayHello('Ram');


let obj = new Person('Ram', 66);
obj.show();

sayHello('Jay')
console.log(PI)