import React, {Component} from 'react';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            msg  : '',
            isFocus : false,
        }
    }

    handler = (event) =>{
        this.setState({
            msg: event.target.getAttribute('data-help'),
            isFocus : true,
            [event.target.name] : event.target.value,
        });
    }
    handler1 = (event) =>{
        this.setState({
            msg: '',
            isFocus : false,
        });
    }
    input = (event) =>{
        this.setState({
            [event.target.name] : event.target.value,
        });
    }
    data = (event) => {
       console.log('Name : ', this.state.name,', age : ',this.state.age)
    }
    render(){
        const styles = {
            padding: '20px',
            border : '1px solid blue',
            display : 'inline-block',
            position : 'relative',
            margin : 'auto',
        };
        return (
            <form style={styles}>
                <legend >Form </legend>
                <input onChange={this.input} onFocus={ this.handler } onBlur=   {this.handler1} type="text" name='name' data-help='Enter name.'/> <br/><br/>

                <input onChange={this.input} onFocus={ this.handler }  onBlur={this.handler1}  type="number" name='age' data-help='Enter age.'/><br/><br/>

                <input type="submit" value="Submit" onClick={ event =>{
                    event.preventDefault();
                    this.data();
                }}/> <br/><br/>

                <span id='msg'>{this.state.isFocus ? this.state.msg : ' '}</span>
            </form>
        );
    }
}

export default App;