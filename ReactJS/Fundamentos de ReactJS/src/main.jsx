import { StrictMode } from 'react' //Onde Importamos as propriedades do React
import { createRoot } from 'react-dom/client' // É o que converte o React na DOM Javascript
import App from './App.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
  </StrictMode>,
)
