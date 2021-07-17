import React, { Component} from 'react';
import './App.css';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            show : true
        }
    }
     delText = ()=>{
        this.setState({show : false});
    }
    addText = () =>{
        this.setState({show : true})
    }

    render() {
        let mytext;
        if(this.state.show){
            mytext = <Child />
        }
        return (
            <div> 
                {mytext}
                <button className='hello' type="button" onClick = {this.delText}>Delete text</button>
                <button type="button" onClick = {this.addText}>Add text</button>
            </div>
        );
    }
}

class Child extends Component {
    componentWillUnmount() {
        console.log();
    }
    render(){
        return <h1>Hello World!</h1>
    }
}
export default App;