package my.groupId;

public class Test {

    private Integer id;
    private String name;
    private Integer size;
    private String author;



    public Test(Integer id, String name, Integer size, String author) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.author = author;
    }
    public String toString()
    {
        return id + " " + name + " " + size + " " + author;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id1) {
        id = id1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
/*
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }*/
}
