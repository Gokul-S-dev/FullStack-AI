import {useState} from 'react'
import Course from './Course.jsx'


function CourseList(){
    const [courses, setCourses] = useState([
        {
            id: 1,
            name: 'React',
            price: 100,
            rating: 4.5
        },{
            id: 2,
            name: 'Angular',
            price: 150,
            rating: 4.0
        },{
            id: 3,
            name: 'Vue',
            price: 120,
            rating: 4.2
        }

])
    function handleDelete(id){
        const updatedCourses = courses.filter(course => course.id !== id);
        setCourses(updatedCourses);
    }

const courseList = courses.map(course => <Course
     id={course.id}
     name={course.name} 
     price={course.price} 
     rating={course.rating}
      onDelete={handleDelete}/>)
    return(
        
        <> 
         {
            courseList
         }
        </>
    )
}

export default CourseList;