public class Teacher {
    private String brans;

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "brans='" + brans + '\'' +
                '}';
    }
}
