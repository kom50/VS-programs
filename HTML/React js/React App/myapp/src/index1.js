import React, {Component} from 'react';
import ReactDom from 'react-dom';
// import { Fragment } from 'react/cjs/react.production.min';
import  './App.css';
// import logo from '.frnd.png';

class App extends Component {
    render(){
        return (
              <div>
                 <img alt="pic" />
                 <h1 > Hello React JS</h1>
              </div>
        );
    }
};
// class App extends Component {
//   render(){
//       return (<Fragment>
//                 <h1 className='hello'> Hello React JS</h1>
//                 <h3 > Hello React App</h3>
//               </Fragment>
//         )
//   }
// };

// let h1 = <h1 className="hello"> Hello React App</h1>
ReactDom.render(<App />, document.querySelector('#root'));
ReactDom.render(<App />, document.querySelector('#root1'));