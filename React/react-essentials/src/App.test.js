import { render, fireEvent } from "@testing-library/react";
import React from "react";
import App from "./App";

test("Renders an h1",()=>{
    const {getByText}=render(<App/>);
    const h1=getByText(/Hello React Testing Library/);
    expect(h1).toHaveTextContent("Hello React Testing Library");
});

test("Selecting checkbox",()=>{
    const {getByLabelText}=render(<App/>);
    const checkbox=getByLabelText(/not checked/);
    fireEvent.click(checkbox);
    expect(checkbox.checked).toEqual(true);
});