package dto;

public class CountryDTO {

    private Integer id;
    private String name;

    public CountryDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryDTO(String name) {
        this.name = name;
    }
}
