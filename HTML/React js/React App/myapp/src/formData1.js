import React ,{ Component} from 'react';

class App extends Component {
    constructor(props){
        super(props)
        this.state = {

        }
    }
    render() {
        return (
            <div>
                <label > Enter name :{ } </label>
                <input onInput = {this.props.oninput } type="text" />
            </div>
        );
    }
}

export default App;