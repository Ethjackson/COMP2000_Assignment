import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4beae09b-9b9f-4cae-ba36-33ce95cc18c7")
public class Card_pay implements IPay {
    @objid ("ee20eaeb-9657-47f5-a02b-3cadb42b2aef")
    public String Verification_screen;

    @objid ("e6edc950-ec5a-4c9d-a655-4968f3f5ad0d")
    public String Bank;

    @objid ("29c71d9f-68f9-4073-ae68-19459545b126")
    public String Message_from_bank;

    @objid ("c828de1f-79c4-47c8-a4e8-b29dc68f5f85")
    public Receipt receipt;

    @objid ("ffc8d2e3-a3ff-4977-8c1b-931ca2f2c1b2")
    public void Accept_or_deny_payment() {
    }

    @objid ("abfe5f4e-e632-45da-90ae-9950f78efa11")
    public void Pay() {
    }

}
