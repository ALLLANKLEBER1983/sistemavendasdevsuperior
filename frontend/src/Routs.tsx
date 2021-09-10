
import Dashboard from 'pages/Dashboard';
import Home from 'pages/Home';
import { BrowserRouter,Switch,Route} from 'react-router-dom';
const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home/>
                </Route>
                <Route path="/Dashboard">
                    <Dashboard/>
                </Route>
            </Switch>
        </BrowserRouter>
    );
  }
  
  export default Routes;