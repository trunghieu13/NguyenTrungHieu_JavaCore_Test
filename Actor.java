public class Actor {
    private String firstname;
    private String lastname;
    private String lastupdate;
    private Integer id;

    public Actor(Integer id,String firstname,String lastname,String lastupdate)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname=lastname;
        this.lastupdate=lastupdate;
    }
    public Actor(){}

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", lastupdate='" + lastupdate + '\'' +
                '}';
    }
}
