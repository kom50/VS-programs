import React, {Component} from 'react';

class App extends Component{
    constructor(props){
        super(props);
        this.state = {
          
        };

        //binding for regular function
        this.show = this.show.bind(this);
    }

    changeHandler = (event) =>{
        const target = event.target;
        const value = target.type === 'checkbox' ? target.checked : target.value;
        const name = target.name;

        this.setState({
            [name] : value
        })
        console.log(event.target.name ,event.target.value," ", this);
    }

    show(){
        // console.log(`Name : ${this.state.name}, age : ${this.state.male}`);
        console.log(Object.keys(this.state))
        var keys = Object.keys(this.state);
        for(let k of keys){
            console.log(k, " : ",this.state[k]);
        }
    }
    render() {
        return (
        //Fragment
            <>
                <h1> Event Handling in JavaScript.</h1>
                <form>
                    <label htmlFor={'male'} >Male : </label>
                    <input type="checkbox" name="male"  onChange={this.changeHandler}/> <br/>
                    <label htmlFor={'name'} >Enter Name : </label>
                    <input type="text" name='name' onChange={this.changeHandler}/> <br/>
                    <label htmlFor={'age'} >Enter age : </label>
                    <input type="text" name='age' onChange={this.changeHandler}/> <br/>
                    <input type="button" onClick={this.show} value="Submit"/>
                </form>
            </>
        );
    }
}

export default App;