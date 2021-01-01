import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("34c07ef2-cd96-49fe-b8c6-9f1d078f5f08")
public class Admins {
    @objid ("87b595b1-b70d-4473-8e60-1f89213d5dfa")
    public String Item_orders;

    @objid ("f5f40a9c-52fb-4186-a107-cab9c0a4cd8c")
    public String Name;

    @objid ("0cce9227-a300-4dab-870c-442422f21dd2")
    public String Password;

    @objid ("5f806b6d-861f-4bd1-bc77-3886327bda90")
    public Item_orders item_orders;

    @objid ("292d9d13-2edd-4631-ab09-c5992c5c6909")
    public void Login(String Name, String Password) {
    }

    @objid ("b773f548-69ad-4f18-a08c-e04ce774effa")
    public void Access_items() {
    }

    @objid ("97b9d22e-62ee-490c-9fd5-3de4a2bb297a")
    public void Low_item_warning() {
    }

    @objid ("9abdf796-0a31-4fcc-86ab-be194ca7d304")
    public void Order_items(String Item, int Amount) {
    }

    @objid ("cda74b5c-cc21-4013-8191-1a49c46ec216")
    public void Replenish_items_on_delivery() {
    }

}
