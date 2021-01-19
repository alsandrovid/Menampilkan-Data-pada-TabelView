package bukualamatview;

import bukualamat.BukuAlamat;
import bukualamat.model.DataPersonal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBukuAlamatController {

    @FXML
    private TableView<DataPersonal> tabelPerson;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaDepan;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamabelakang;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private Label labelNamabelakang;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelKota;

    @FXML
    private Label labelNoHp;

    private BukuAlamat KelasUtama;
    
    public ViewBukuAlamatController() {
    }
    
    @FXML
    private void initialize(){
        kolomNamaDepan.setCellValueFactory(celldata->celldata.getValue().NamaDepanProperty());
        kolomNamabelakang.setCellValueFactory(celldata->celldata.getValue().NamabelakangProperty());
    }
    
    
    
    public void setKelasUtama(BukuAlamat bukualamat){
        this.KelasUtama = bukualamat;
        
        tabelPerson.setItems(KelasUtama.getDataPersonal());
    }
    
    }
