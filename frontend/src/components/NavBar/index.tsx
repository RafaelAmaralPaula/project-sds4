import ImgDsDark from 'assets/img/ds-dark.svg';
import IconGitHub from 'assets/img/github.png';

function NavBar() {
    return (
    <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm
    navbar navbar-dark bg-dark">
        <div className="container ">
            <nav className="my-2 my-md-0 mr-md-3">
                <img src={ImgDsDark} alt="DevSuperior" width="120" />
            </nav>
            <nav className="nav justify-content-end">
                <a href="https://github.com/RafaelAmaralPaula/project-sds4" target="blank">
                    <img src={IconGitHub} alt="Icone GitHub" height="40px"/>
                </a>
            </nav>
        </div>
</div>
    );
  }
  
export default NavBar;