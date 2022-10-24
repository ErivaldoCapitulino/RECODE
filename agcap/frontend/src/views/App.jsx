import React from "react";
import { BrowserRouter as Router } from "react-router-dom";
import Content from "../components/layout/Content";

const App = (props) => (
  <div className="App">
    <Router>
      <Content />
    </Router>
  </div>
);

export default App;
