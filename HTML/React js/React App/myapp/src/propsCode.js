import React from 'react';

//  props - property

class Car extends React.Component {
        render() {
            console.log(this)
            return (
             <h3 >Car name : {this.props.name}, brand : {this.props.brand} </h3>
            );
        }
};

export default Car;