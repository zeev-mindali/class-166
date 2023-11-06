package simple_jave.exam_prep_2.cls;

public class Buyer {
    private String name;
    private String tel;
    private String address;
    private Payment payment;

    public Buyer(String name, String tel, String address, Payment payment) {
        setName(name);
        setTel(tel);
        setAddress(address);
        setPayment(payment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
