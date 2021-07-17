import React, {Component} from 'react';

class ToggleButton extends Component{
    constructor(props){
        super(props);
        this.state = {
            creator : 'Create by om',
        }
    }

    click = (event) =>{
        let left = event.target.offsetLeft;
        let target = event.target;
        let parent = target.parentElement;
        if(left === -2 ){
            Object.assign(target.style, {
                'left': '12px',
            });
            parent.style.backgroundColor  = 'rgb(0, 174, 255)';
            //  callback function  call when toggle button on
            this.props.whenOn();
        } else{
            Object.assign(target.style, {
                'left': '-2px',
            });
            parent.style.backgroundColor  = 'gray';
            //  callback function call when toggle button off
            this.props.whenOff();
        }
    }
    render() {
        const styles = {
            width: '30px',
            height: '15px',
            borderRadius : '35px',
            position : 'relative',
            boxShadow : '0 0 .8px gray',
            borderStyle : 'upset',
            backgroundColor : 'gray',
            transition : 'all .4s ease-in-out',
        };
        const styles1  = {
            width : '20px',
            height : '20px',
            borderRadius : '50%',
            // backgroundColor : 'rgb(0, 174, 255)',
            backgroundColor : 'white',
            boxShadow : '0 0 5px gray',
            position: 'relative',
            top : '-2.6px',
            left : '-2px',
            transition : 'all 0.2s ease-in',
        }

        return (
            <div style={ styles } className='container'>
                <div style={ styles1 } onClick = { this.click} className='circle'> </div>
            </div>
        );
    }
}

export default ToggleButton;
