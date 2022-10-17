@Table
@Data
public class ProductEntity {

    @PrimaryKey
    private Integer id;

    private String name;
    private Integer quantity;
    private Double price;