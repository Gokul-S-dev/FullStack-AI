
import HTML from '../assests/HTML.png'
function Course(props) {
    return (
        <div className="card">
            <img src={HTML} alt=""/>
            <h2>{props.name}</h2>
            <p>{props.price}.</p>   

        </div>
    )
}

export default Course;