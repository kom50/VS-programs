import React from 'react';

class Car extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            color : 'white',
            name : 'Audi'
        }
        console.log(this);
        console.log(props);
        console.log(this.state);
        console.log(typeof props, typeof this.state, typeof this)
    }
    changeColor = ()=>{
        console.log("button click")
        this.setState({color : 'blue'});
    }
    render(){
        return (
            <div>
                <h1> props : {this.props.cname}</h1>
                <h1> Car name : {this.state.name}, color : {this.state.color}</h1>
                <button onClick={this.changeColor}> Change Color</button>
            </div>
        );
    }
}

export default Car;
