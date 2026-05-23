import { useState } from 'react';
import './Course.css'

function Course(props) {

    const [enrolled, setEnrolled] = useState(false);
    function handleEnroll(){
        if(!enrolled){
            setEnrolled(true);
        }
    }
    return(
        <>
        <div className="card">

            <p>{props.id}</p>
            <p>{props.name}</p>
            <p>{props.price}</p>
            <p>{props.rating}</p>
            <p>{enrolled ? 'Enrolled' : 'Not enrolled'}</p>
            <button onClick={()=>{handleEnroll()}}>Enroll now</button>
            <button onClick={()=>{props.onDelete(props.id)}}>Delete</button>   
        </div>
        </>
    )
}

export default Course;