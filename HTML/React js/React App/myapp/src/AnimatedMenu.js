import React, {Component} from 'react';

class AnimatedMenu extends Component{
    constructor(props){
        super(props);
        this.state = {
            creator : 'Create by om',
            flag : true,
            type : ['cross', 'left-arrow', 'right-arrow' ],
        }
    }

    click = (event) =>{
        let container = event.target.parentElement;
        let lines = container.querySelectorAll('.line');

        if (this.state.flag) {
            this.setState ({flag : false });
            // Cross
            if(this.state.type[0] === this.props.type){
                lines[1].style.display = 'none';
                Object.assign(lines[0].style, {
                    'top': '13px',
                    'transform': 'rotate(45deg)'
                });
                Object.assign(lines[2].style, {
                    'top': '6px',
                    'transform': 'rotate(-45deg)'
                });
            }else if(this.state.type[1] === this.props.type){
                // left arrow
                let obj = {
                    'width':'15px',
                }
                Object.assign(lines[0].style, {
                    ...obj,  // Object merge
                    'top' : '4px',
                    'transform': 'rotate(-25deg)',
                });
                Object.assign(lines[2].style, {
                    ...obj,
                    'top': '-4px',
                    'transform': 'rotate(25deg)',
                });
            }
            else {
                // right arrow
                let obj = {
                    'right' : '-10px',
                    'width':'15px',
                }
                Object.assign(lines[0].style, {
                    ...obj,
                    'top': '-4px',
                    'transform': 'rotate(25deg)',
                });
                Object.assign(lines[2].style, {
                    ...obj,
                    'top': '-4px',
                    'transform': 'rotate(-25deg)',
                });
            }
        } else {
            this.setState ({flag : true });
            // Cross
            if(this.state.type[0] === this.props.type){
                lines[1].style.display = 'block';
                let obj = {
                    'top': '0px',
                    'transform': 'rotate(0deg)'
                };
                Object.assign(lines[0].style, obj );
                Object.assign(lines[2].style, obj );
            }else if(this.state.type[1] === this.props.type){
                //  left arrow
                let obj = {
                    'top': '0px',
                    'transform': 'rotate(0deg)',
                    'width':'auto',
                };
                Object.assign(lines[0].style, obj );
                Object.assign(lines[2].style, obj );
            }
            else {
                // Right arrow
                let obj = {
                    'top': '0px',
                    "right" : '0',
                    'transform': 'rotate(0deg)',
                    'width':'auto',
                };
                Object.assign(lines[0].style, obj );
                Object.assign(lines[2].style, obj );
            }
        }
    }

    render() {
        const iconStyle = {
            height: '30px',
            width: '25px',
            margin: 'auto',
            display : 'inline-block',
            position: 'relative',
        }
        const styles =  {
            height: '2px',
            "backgroundColor": 'black',
            'marginTop': '5px',
            'transitionTimingFunction': 'ease-in-out',
            position: 'relative',
            transition:'all 0.5s linear',
            borderRadius: '10px'
        }

        return (
            <div id='icon' style= { iconStyle } onClick = { this.click }>
                <div style = { styles } className = { 'line' } > </div>
                <div style = { styles } className = { 'line' } > </div>
                <div style = { styles } className = { 'line' } > </div>
            </div>
        );
    }
}

export default AnimatedMenu;
