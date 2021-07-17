import React, {Component} from 'react';
import './App.css'
import styles from './mystyles.module.css';

class App extends Component {
     constructor(props) {
        super(props);
        this.state = {
            color : 'white',
            name : 'Audi'
        }
     }
     render(){
         const styleObj ={
            color : 'red',
            padding : '10px',
            backgroundColor : 'pink',
            textAlign : 'center',
            borderRadius : '20px',
        };

         return (
            <div>
                <h1>Add Css on elements Using React Js</h1>
                {/* Inline style for element */}
                <h1 style={
                        {
                            color : 'red',
                            padding : '10px',
                            backgroundColor : 'pink',
                            textAlign : 'center',
                            borderRadius : '20px',
                            textDecoration : 'underline',
                        }
                }> inline style  </h1>

                {/* Css module */}
                <h1 className= { styles.container } > css module</h1>

                {/* Css stylesheet */}
                <h1 className= 'hello' > Css stylesheet</h1>

                {/* Style object Css  */}
                <h1 style={styleObj} > style object  Css internal style </h1>
            </div>
         );
     }
}

export default App;