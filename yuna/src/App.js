import React from "react";
import "./App.css";
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons';
import Search from "./Search";
import Result from "./Result";

function App() {
  return (
    <div>
      <Router>
        <Routes>
        <Route path="/" element={<Search/>} />
        <Route path="/Result" element={<Result/>} />
        </Routes>
      </Router>
    </div>


  );
}

export default App;



