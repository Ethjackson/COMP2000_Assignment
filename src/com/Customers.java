import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c20c1917-78f0-46f9-b540-51a91a90f8f1")
public class Customers {
    @objid ("9a8bd70f-1350-4767-a349-5d87e53c38c5")
    public String Item;

    @objid ("3bc64baf-5752-491e-bec5-9dfafbd94e0a")
    public IPay iPay;

    @objid ("f2879a7b-f6e0-4e09-953c-ad154f53e96e")
    public void Scan_item(String Barcode) {
    }

    @objid ("6704eb8c-c58a-4222-969b-39622c8397d8")
    public void Pay_card() {
    }

    @objid ("4307fcb5-5c84-4881-bdce-82ddb5c7ad5e")
    public void Pay_cash() {
    }

}
