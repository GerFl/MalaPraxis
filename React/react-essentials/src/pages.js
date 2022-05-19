import React from "react";
import {Link,useLocation,Outlet} from "react-router-dom";

export function Home(){
    return (
        <div>
            <h1>[Company Website]</h1>
            <nav>
                <Link to="about">About</Link>
                <Link to="events">Events</Link>
                <Link to="contacts">Contacts</Link>
            </nav>
        </div>
    )
}

export function Whoops404(){
    let location=useLocation();
    return (
        <div>
            <h1>Resource not found at {location.pathname}</h1>
        </div>
    )
}

export function Services(){
    return(
        <div>
            <h2>Our Services</h2>
        </div>
    )
}

export function CompanyHistory(){
    return(
        <div>
            <h2>Company History</h2>
        </div>
    )
}

export function Location(){
    return(
        <div>
            <h2>Our Location</h2>
        </div>
    )
}

export function About(){
    return (
        <div>
            <h1>[About]</h1>
            <Outlet />
        </div>
    )
}
export function Events(){
    return (
        <div>
            <h1>[Events]</h1>
        </div>
    )
}

export function Contacts(){
    return (
        <div>
            <h1>[Contacts]</h1>
        </div>
    )
}