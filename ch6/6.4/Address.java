public class Address {
    private final String detail;
    private final String postCode;

    public  Address() {
        this.detail = "";
        this.postCode = "";
    }

    public Address(String detail, String postCode){
        this.detail = detail;
        this.postCode = postCode;
    }

    // only support two getter method
    public String getDetail() {
        return detail;
    }
    public String getPostCode() {
        return postCode;
    }

    // rewrite equals method
    public boolean equals(Object object) {
        if(this==object){
            return true;
        }
        if(object!=null && object.getClass() == Address.class){
            Address ad = (Address)object;
            if(this.getDetail().equals(ad.getDetail()) && this.getPostCode().equals(ad.getPostCode())){
                return true;
            }
        }

        return false;
        
    }

    public int hashCode() {
        return detail.hashCode() + postCode.hashCode() * 31;
    }
}


