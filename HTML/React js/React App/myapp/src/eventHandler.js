import React, {Component} from 'react';

class App extends Component{
    constructor(props){
        super(props);
        this.state = {
              name : '',
              age : null
        };

        //binding for regular function
        this.show = this.show.bind(this);
    }

    changeHandler = (event) =>{
        this.setState({[event.target.name] : event.target.value})
        console.log(event.target.name ,event.target.value);
    }

    show(){
        console.log(`Name : ${this.state.name}, age : ${this.state.age}`);    
    }
    render() {
        return (
        //Fragment
            <>
                <h1> Event Handling in JavaScript.</h1>
                <form>
                    <label htmlFor={'name'} >Enter name : </label>
                    <input type="text" name="name" onChange={this.changeHandler}/> <br/>
                    <label htmlFor={'age'} >Enter age : </label>
                    <input type="text" name='age' onChange={this.changeHandler}/> <br/>
                    <input type="button" onClick={this.show} value="Submit"/>
                </form>
            </>
        );
    }
}

export default App;